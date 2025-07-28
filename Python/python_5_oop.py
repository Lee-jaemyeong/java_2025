# 1. 클래스와 객체의 개념 및 구조
# 클래스 [설계도 - 레고블록설명서]
# 객체 [완성된 레고 - 장난감]
# 메서드 [장난감 갖고놀기]

class Dog :  #1단계
  def __init__(self,name):  # 생성자 / self 나자신
    self.name=name
    
  def bark(self):
    print(self.name + "가 멍멍!")


puppy = Dog("초코")  #2단계
puppy.bark()  #3단계

# 2. 상속
class Animal :
  def speak(self):
    print("동물이 소리를 내요.")
    
class Cat(Animal) :  # 상속
  def type(self):
    print("고양이~")
  def speak(self): # 오버라이딩
    print("야옹~")    
    
mycat = Cat()
mycat.speak()