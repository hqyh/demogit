package com.demo;
//子类没有显示调用父类构造函数，不管子类构造函数是否带参数都默认调用父类无参的构造函数，若父类没有则编译出错。
public class Child extends People{
    People father;
    public Child(String name){
        //super();
        System.out.print(3);
        this.name = name;
        //father = new People(name + ":F");
    }
    public Child(){
        System.out.print(4);
    }
    public static void main(String [] args){
        new Child("Mike");
    }
}
class People{
    String name;
    public People(){
        System.out.print(1);
    }
    public People(String name){
        System.out.print(2);
        this.name = name;
    }
}