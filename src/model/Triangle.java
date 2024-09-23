package model;

public class Triangle extends Shape {
    private double base; 
    private double height;

    
    public Triangle(double base, double height) {
        this.setBase(base); 
        this.setHeight(height);
    }

    // Construtor de cópia
    public Triangle(Triangle source) {
        super(source);
        this.base = source.base;
        this.height = source.height;
    }

    @Override
    public Triangle clone() {
        return new Triangle(this);
    }

    /**
     * @return double return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
        this.setX(base);
    }
    
    /**
     * @return double return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
        this.setY(height);
    }

}
