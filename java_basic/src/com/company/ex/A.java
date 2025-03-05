package com.company.ex;

public class A {
	private String name;   
    private  int age;

    public A(){}
    public A(String name, int age){  this.name=name; this.age = age;}
    //##3-3 tostring
    @Override  public String toString(){  return  "A[name="+name+",age="+age+"]"; }
    //##3-4 setter/getter
    public String getName(){  return name; }
    public void setName(String name){ this.name=name; }
    public int    getAge(){  return age; }
    public void setAge(int age){ this.age=age; }
}
