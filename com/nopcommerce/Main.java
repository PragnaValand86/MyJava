package com.nopcommerce;

public class Main {

    String name;
    int age;

    public Main(){
        System.out.println("Default Const");

    }
    public Main(int x){
        System.out.println("1 Param Const");
    }
    public Main(int x, int y){
        System.out.println("2 Param Const");
    }
    public Main(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main(10);
        Main obj3 = new Main(10,20);
        Main obj4 = new Main("Test",20);
        System.out.println(obj4.name);
    }
}
