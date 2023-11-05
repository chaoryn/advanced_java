//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.


public class Main {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(1.0, 2.0); //don't forget to include parameters!
        double area = rect1.getArea();
        System.out.println("Area of rectangle is: " + area);
    }
}


public class Shape {
    public double getArea(){ 
        return 0.0;
    }
}


public class Rectangle extends Shape {
    private double length; // do not forget to use the double datatype while initializing these variables!
    private double width;

    public Rectangle (double length, double width){ //set parameters
        this.length = length;
        this.width = width;
    }
    @Override //used when you are including the method from another class
    public double getArea() {
        return length * width;
    }
}
