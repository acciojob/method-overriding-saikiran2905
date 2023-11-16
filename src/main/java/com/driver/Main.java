package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B child1 = new B();
        System.out.println(child1.meth());
        B child2 = new B();
        System.out.println(child2.meth());
    }
}