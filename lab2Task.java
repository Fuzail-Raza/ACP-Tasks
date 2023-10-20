
//----------Q1

class Car{

    private int year;
    private String make,model;

    Car(){
        year=0;
        make="";
        model="";
    }

    Car(String make,int year,String model){

        this.make=make;
        this.year=year;
        this.model=model;

    }

    void display(){

        System.out.println("Make : " + make);
        System.out.println("Year : " + year);
        System.out.println("Model : " + model);

    }

}


//----------Q2

class Shape{
    
    void calculateArea(){
        System.out.println("Calculate Area of Shape");
        
    }



}


class Circle extends Shape{

    private double radius;

    Circle(){
        radius=0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    
    void calculateArea(){

        System.out.println("Calculate Area of Circle" + " : " + ( 3.14* radius * radius));

    }


}

class Rectangle extends Shape{
    
    private double width;
    private double height;

    Rectangle(){
        width=0;
        height=0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea(){
        
        System.out.println("Calculate Area of Rectangle" + ": " + width * height);
        

    }


}


//----------Q3

class Person{

    private String name;
    private int age;

    Person(){

        name="";
        age=0;

    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name=name;
    }

    void setAge(int age){
        this.age=age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


//----------Q4

class Room{
    public double area;
    public String color;

    Room(){
        area=0;
        color="";
    }

    Room(double area,String color){
        this.area=area;
        this.color=color;
    }
}


class House{

    public Room rooms;

    House(){
        rooms=new Room();
    }

    House(float area,String color){
        rooms=new Room(area,color);
    }

}





public class lab2Task {
    public static void main(String[] args) {


        //--Q1
        // Car c1=new Car("Honda",2012,"VXR");
        // c1.display();    

        //--Q2
        Shape s1=new Shape();
        Circle c1=new Circle(21);
        Rectangle r1=new Rectangle(31,32);
        r1.calculateArea();
        c1.calculateArea();
        s1.calculateArea();

        //--Q3
        // Person p1=new Person();
        // p1.setName("Fuzail");
        // p1.setAge(20);
        // System.out.println("Name : " + p1.getName());
        // System.out.println("Age : " + p1.getAge());

        //--Q4
        // House h1=new House(100,"Red");
        // System.out.println("Area : " + h1.rooms.area);
        // System.out.println("Color : " + h1.rooms.color);


    }
}
