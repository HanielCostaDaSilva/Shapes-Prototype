package model;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.getWidth();
        this.height = source.getHeight();
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
    

    /**
     * @return double return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return double return the height
     */
    public double getHeight() {
        return height;
    }


    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.setX(width);
        this.width = width;
    }
    
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.setY(height);
        this.height = height;
    }

}
