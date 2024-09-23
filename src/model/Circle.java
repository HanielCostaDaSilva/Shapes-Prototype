package model;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.setRadius(radius);
    }

    public Circle(Circle source){
        super(source);
        this.radius = source.getRadius();
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
    

    /**
     * @return double return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
        this.setX(radius);
        this.setY(radius);
    
    }

}
