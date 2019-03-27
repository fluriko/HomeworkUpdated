package mate.academy.hw2;

import java.io.Serializable;

// задание 2.6
public class Group implements Serializable {

    public Group() {
        this(new Triangle(), new Circle(), new Square());
    }

    public Group(Triangle triangle, Circle circle, Square square) {
        this.triangle = triangle;
        this.circle = circle;
        this.square = square;
    }

    private Triangle triangle;
    private Circle circle;
    private Square square;
    private Group group;

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Triangle: " + getTriangle() + ", Circle: " + getCircle() + ", Square: " + getSquare();
    }
}
