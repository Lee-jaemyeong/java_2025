# 1. 함수
# 마법상자 - 어떤 것을 넣으면, 약속한 결과를 돌려주는 상자

def hi(name) :
  return f"안녕 {name}님"

print ( hi("홍길동") )

# 1-1. ex
def animal(동물) :
  if 동물 == "강아지":
    return "멍멍~"
  elif 동물 == "고양이":
    return "야옹~"
  else :
    return "무슨 동물인지...."
print(animal("강아지"))
print(animal("고양이"))
print(animal("토끼"))


# 2. 파일입출력  with(안전장치) open read(읽기) write(쓰기)
with open('fruits.txt' , 'w' , encoding='utf-8') as f :
  f.write("apple\nbanana\n")
  
with open('fruits.txt' , 'r' , encoding='utf-8') as f :
  print(f.read())