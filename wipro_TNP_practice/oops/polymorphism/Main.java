package overriding.polymorphism;

class Fruit {
    String name;
    String taste;
    int size;

    public void eat() {
        System.out.println(name + " is " + taste);
    }
}

class Apple extends Fruit {

    public Apple() {
        name = "Apple";
        taste = "Sweet";
        size = 5;
    }

    public void eat() {
        System.out.println(name + " is " + taste);
    }
}

class Orange extends Fruit {

    public Orange() {
        name = "Orange";
        taste = "Sour";
        size = 4;
    }

    public void eat() {
        System.out.println(name + " is " + taste);
    }
}

public class Main {

    public static void main(String[] args) {

        Fruit a = new Apple();
        Fruit b = new Orange();

        a.eat();
        b.eat();
    }
}