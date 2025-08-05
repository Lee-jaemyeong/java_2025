import 'package:flutter/material.dart';
import '../services/todo_service.dart'; // 처리
import '../model/todo.dart'; // model

//1. Todo
class TodoPage extends StatefulWidget {
  const TodoPage({Key? key}) : super(key:key);

  @override
  _TodoPageState createState() => _TodoPageState();
}

//2. 상태관리 클래스
class _TodoPageState extends State<TodoPage> {
  List<Todo> todos = [];
  bool isLoading = true;
  final TextEditingController _textController = TextEditingController();

  @override
  void initState() {
    super.initState();
    loadTodos();
  }

  ////////////////////////////////////// list
  void loadTodos() async {
    try{
      final result = await fetchTodos(); //#### service에서 호출
      setState(() {  // 화면에 다시 렌더링
        todos = result;
        isLoading = false;
      });
    } catch (e){
      print("할 일 불러오기 실패: $e");
      setState(() => isLoading = false);
    }
  }
  /////////////////////////////////////// post - create
  // 글쓰면 리스트에 즉시반영
  void _addTodo() async {
    final title = _textController.text.trim();
    if (title.isEmpty) return;

    final tempTodo = Todo(id: 0, title: title, completed: false);

    setState(() {
      todos.insert(0 , tempTodo); // 리스트 맨 위에 반영
      _textController.clear(); // 입력초기화
    });    
    try{
      await addTodoToService(title);
      loadTodos();
    } catch (e) { 
      print("추가 오류: $e"); 
    }
  }
  //////////////////////////////////////// delete
  void _deleteTodoConfirm(int id) async {
    showDialog(context: context, builder: (context) => AlertDialog(
      title : const Text("정말 삭제하시겠습니까? "),
      content : const Text("삭제하면 되돌릴 수 없습니다."),
      actions : [
        TextButton(
          child:const Text("취소"), 
          onPressed: () => Navigator.pop(context),
        ),
        TextButton(
          child: const Text("삭제"), 
          onPressed: () async {
            Navigator.pop(context);
                try{
                  await deleteTodo(id); // 서버에서 삭제요청
                  loadTodos(); // 목록 새로 불러오기
                } catch (e) {
                  print("삭제 오류: $e");
                }
        })
      ]
    ),);
  }
  //////////////////////////////////////// update
  void _toggleComplete(Todo todo) async {
    try{
      final updated = todo.copyWith(completed: !todo.completed);
      await updateTodoOnService(updated);
      loadTodos();
    } catch (e) {
      print("업데이트 오류: $e");
    }
  }

  ///////////////////////////////////////
  @override
  Widget build(BuildContext context) {
    return Scaffold( // 기본 앱 구조를 제공 - Scaffold
      appBar: AppBar(title: Text('TODO 테스트')), // 상단앱바, 페이지제목표시
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Row(children: [
              Expanded(child: TextField(
                controller : _textController,
                decoration : const InputDecoration(
                  hintText: '할 일을 입력하세요'),
              )),
              ElevatedButton(onPressed: _addTodo, child: const Text('추가'))
            ],
          )),
          Expanded( // 남은 공간 전부 차지할께
            child: isLoading
            ? const Center(child:CircularProgressIndicator()) // 로딩인디케이터
            : ListView.builder(
              itemCount: todos.length,
              itemBuilder: (context, index) {
                final todo = todos[index];
                return ListTile(
                  leading: Checkbox(value: todo.completed,
                            onChanged: (_) =>_toggleComplete(todo),),
                  title: Text(
                    todo.title,
                    style:TextStyle(
                          decoration: todo.completed
                          ? TextDecoration.lineThrough 
                          : null)),
                  trailing: Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      IconButton(
                        icon: 
                          const Icon(Icons.delete, color: Colors.red),
                        onPressed: () => _deleteTodoConfirm(todo.id),
                      )
                    ],
                  )
                );
              },
            ),
          ),
        ])
    );
  }
}
