//Abstraction in Java is a concept where we hide the complex implementation details of a class and only show the necessary features or behaviors to the outside world.
//It allows us to focus on what an object does rather than how it does it. 
//In Java, there are two main ways to implement abstraction:

//Abstract Classes
//Interfaces
//An abstract class in Java is a class that cannot be instantiated and can contain abstract methods as well as concrete methods. Abstract methods define the structure of a method but leave the implementation to the subclasses.


abstract class Shape {
    abstract void draw(); 
    void commonMethod() {
        System.out.println("This is a common method.");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw(); 
        rectangle.draw(); 
        circle.commonMethod(); 
        rectangle.commonMethod(); 
    }
}
