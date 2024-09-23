package model;

public abstract class Shape implements Cloneable {
    private double x;
    private double  y;

    // Construtor padrão
    public Shape() {}

    // Construtor de cópia
    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
        }
    }

    // Método clone abstrato
    @Override
    public abstract Shape clone();

    /**
     * @return double return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return double return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }


}
