/*
    job
        -Perform tasks which involves length and breadth
*/

public class Rectangle {
    private double length;
    private double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth){
        if(length <= 0 || breadth <= 0)
            throw new IllegalArgumentException();
        return new Rectangle(length,breadth);

    }

    public double calculateArea(){
        return length*breadth;
    }

    public double calculatePerimeter(){
        return 2 * ( length + breadth );
    }
}
