/*
    JOB-
        -perform tasks related to its fields
 */
public class Square {
    private double side;

    private Square(double side) {
        this.side = side;
    }
    public static Square create(double side) throws Exception {
        if(side <= 0)
            throw new NonPositiveInputException("length and breadth must be non zero positive numbers");
        return new Square(side);
    }

    public double calculateArea() {
        return (side*side);
    }

    public double calculatePerimeter() {
        return 4*side;
    }
}
