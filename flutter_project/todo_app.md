#### 1. Todo 개요

1. 백엔드 api 설계 및 구현
2. flutter에서 api 연동 테스트
3. flutter ui기본구조작성 - list, add, update, delete

<br/>
<br/>
<br/>

---

#### 1. 백엔드 api 설계 및 구현
1. spring boot 프로젝트 (jpa, spring-dev, web, mysql, lombok)
2. model - entity, repository
3. service
4. controller
5. rest api postman 테스트

#### 2. flutter에서 api 연동 테스트
■ 프로젝트 만들기
1. ctrl + shift + p
2. Flutter : New Project

■ 애뮬레이터 실행
1. ctrl + shift + p
2. Flutter:Launch Emulator

```bash
flutter devices
flutter run -d chrome
```

#### 3. flutter ui기본구조작성 - list, add, update, delete

##### 1. 구조확인

lib/
├── model/todo.dart
│   └── todo.dart
├── pages/todo_page.dart
│   └── todo_page.dart
├── services/todo_service.dart
│   └── todo_service.dart
├── main.dart

##### 2. http 패키지추가
> pubspec.yaml

```yaml
dependencies :
  flutter:
    sdk: flutter
  http: ^0.13.6
```

2. 다운로드
```bash
flutter pub get
```

3. model/todo.dart
```dart
class Todo{
  final int id;
  final String title;
  final bool completed;
  //required 반드시 값 필요함.
  Todo({ required this.id, required this.title, required this.completed });

  factory Todo.fromJson( Map<String, dynamic> json ) {  
  // json 데이터를 Dart 객체로 변환로 변환해주는 팩토리 생성자
    return Todo(
      id: json['id'],
      title: json['title'],
      completed: json['completed'],
    );
  }
}
```

4. services/todo_service.dart
```dart
import 'package:http/http.dart' as http; // http 연결
import 'dart:convert';  // 인코딩 및 json 디코딩
import '../model/todo.dart'; // todo 모델클래스

Future<List<Todo>> fetchTodos() async { // 비동기 - List<Todo>
  final response =
    await http.get(Uri.parse("http://192.168.40.109:8080/api/todos")); // 비동기처리

  if (response.statusCode == 200) {
    final decoded = utf8.decode(response.bodyBytes);
    List<dynamic> jsonData = json.decode(decoded);
    return jsonData.map((item) => Todo.fromJson(item)).toList(); // json
  } else {
    throw Exception("API 호출실패: ${response.statusCode}");
  }
}
```

5. main.dart
```dart
import 'package:flutter/material.dart';
import 'services/todo_service.dart'; // rest api 서비스
import 'model/todo.dart'; // 모델클래스

//1. 앱시작점
void main() {
  runApp(MyApp());
}

//2. 앱의 최상단 위젯구성
class MyApp extends StatelessWidget { //StatelessWidget - 앱의 동적상태 반영
  @override
  Widget build(BuildContext context) {
    return MaterialApp(  // MaterialApp - 디자인적용
      home: TodoTestPage(), // * 내가 만든 앱 호출 - 할일 목록 표시
    );
  }
}

//3. 상태를 갖는 페이지 - 할일의 목록표시
class TodoTestPage extends StatefulWidget { 
  // StatefulWidget: UI를 동적으로 변경(화면, 상태)
  // _TodoTestPageState
  @override
  _TodoTestPageState createState() => _TodoTestPageState(); // _private 처리
} // createState()

//4. 상태관리클래스 - loadTodos()로 데이터 불러온 후 setState로 UI갱신
class _TodoTestPageState extends State<TodoTestPage> {
  List<Todo> todos = [];

  @override
  void initState() {
    super.initState();
    loadTodos();
  }

  //////////////////////////////////////
  void loadTodos() async {
    final result = await fetchTodos(); //#### service에서 호출
    setState(() {  // 화면에 다시 렌더링
      todos = result;
    });
  }

  ///////////////////////////////////////
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('TODO 테스트')),
      body: ListView.builder(
        itemCount: todos.length,
        itemBuilder: (context, index) {
          final todo = todos[index];
          return ListTile(
            title: Text(todo.title),
            subtitle: Text('완료 여부: ${todo.completed}'),
          );
        },
      ),
    );
  }
}
```

##### 3. 전체리스트

lib/
├── model/todo.dart
│   └── todo.dart
├── pages/todo_page.dart
│   └── todo_page.dart
├── services/todo_service.dart
│   └── todo_service.dart
├── main.dart