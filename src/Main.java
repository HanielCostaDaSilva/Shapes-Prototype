import model.*;

public class Main {
    public static void main(String[] args) {
        // Testando clonagem de Rectangle
        Rectangle rect1 = new Rectangle(10.5, 20.6);
        Rectangle rect2 = rect1.clone();
        
        System.out.println("Retângulo original: " + rect1.getX() + ", " + rect1.getY());
        System.out.println("Clonagem do Retângulo: " + rect2.getX() + ", " + rect2.getY());

        // Alterando valores no objeto clonado (Rectangle)
        rect2.setX(30.0);
        rect2.setY(40.0);
        System.out.println("Após alterar o clone do Retângulo: " + rect2.getX() + ", " + rect2.getY());
        System.out.println("Retângulo original após alteração no clone: " + rect1.getX() + ", " + rect1.getY());

        // Testando clonagem de Circle
        Circle circle1 = new Circle(12);
        Circle circle2 = circle1.clone();
        
        System.out.println("\nCírculo original: " + circle1.getX() + ", " + circle1.getY());
        System.out.println("Clonagem do Círculo: " + circle2.getX() + ", " + circle2.getY());

        // Alterando valores no objeto clonado (Circle)
        circle2.setX(100.0);
        circle2.setY(200.0);
        System.out.println("Após alterar o clone do Círculo: " + circle2.getX() + ", " + circle2.getY());
        System.out.println("Círculo original após alteração no clone: " + circle1.getX() + ", " + circle1.getY());

        // Testando clonagem de Triangle
        Triangle triangle1 = new Triangle(9, 6);
        Triangle triangle2 = triangle1.clone();
        
        System.out.println("\nTriângulo original: " + triangle1.getX() + ", " + triangle1.getY());
        System.out.println("Clonagem do Triângulo: " + triangle2.getX() + ", " + triangle2.getY());

        // Alterando valores no objeto clonado (Triangle)
        triangle2.setX(50.0);
        triangle2.setY(60.0);
        System.out.println("Após alterar o clone do Triângulo: " + triangle2.getX() + ", " + triangle2.getY());
        System.out.println("Triângulo original após alteração no clone: " + triangle1.getX() + ", " + triangle1.getY());
    }
}
