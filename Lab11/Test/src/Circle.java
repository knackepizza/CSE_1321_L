public class Circle {
    double radius;


    public Circle(double inputRadius) {
        this.radius = inputRadius;
    }

    double getRadius() {
        return this.radius;
    }

    
    double getArea() {
        return (3.14 * (this.radius * this.radius));
    }
    
    double getPerimeter() {
        return (2 * (3.14 * this.radius));
    }

    void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public String toString() {
        return "The circle has radius " + this.radius;
    }
    public static void main(String[] args) {
        // AFTER EVERY METHOD CALL???
        Circle c1 = new Circle(1);

        System.out.println("Print radius: ");
        System.out.println("\tThe radius is " + c1.getRadius() + ".\n");
        System.out.println(c1.toString());

        System.out.println("Print area: ");
        System.out.println("\tThe area is " + c1.getArea() + ".\n");
        System.out.println(c1.toString());
        
        System.out.println("Print perimeter: ");
        System.out.println("\tThe perimeter is " + c1.getPerimeter() + ".\n");
        System.out.println(c1.toString());

        System.out.println("Set radius to 10 and print the object: ");
        // Setting the radius to 10
        c1.setRadius(10);
        System.out.println(c1.toString());
        System.out.println("\tThe circle has radius " + c1.getRadius() + ".\n");
        System.out.println(c1.toString());

        System.out.println("Print area: ");
        System.out.println("\tThe area is " + c1.getArea() + ".\n");
        System.out.println(c1.toString());

        System.out.println("Print perimeter: ");
        System.out.println("\tThe perimeter is " + c1.getPerimeter() + ".\n");
        System.out.println(c1.toString());        
    }
}