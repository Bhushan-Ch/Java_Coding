package Abstraction.example;

public class Main {
    public static void main(String[] args) {

       // Animal a = new Animal(); // Abstract class
        Dog d = new Dog(); // Concrete / Complete

        //Animal a2 = new Dog();
        //a2.m1();
        //a2.say();
       // a2.say2();
        d.bark();
        d.say2();

    }
}
