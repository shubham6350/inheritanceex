package com.company;

class A{
    int i,j;
    void showij(){
        System.out.println("i and j:"+ i +" " + j);

    }

}
class B extends A{
    int k;
    void showk(){
        System.out.println("k:" + k);
    }
    void sum(){
        System.out.println("i+j+k:" + (i+j+k));
    }
}
public class Main {

    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.i=10;
        obj.j=50;
        System.out.println("contents of obj:");
        obj.showij();
        System.out.println();
        obj1.i=40;
        obj1.j=80;
        obj1.k=30;
        System.out.println("comtents of obj1:");
        obj1.showij();
        obj1.showk();
        System.out.println();
        System.out.println("sum of i ,j and k is:");
        obj1.sum();

    }
}
