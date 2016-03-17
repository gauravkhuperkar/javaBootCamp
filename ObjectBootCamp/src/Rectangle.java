/*
    job
        -Perform tasks which involves with its fields.
*/

public class Rectangle {
    private double length;
    private double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth) throws Exception {
        if(length <= 0 || breadth <= 0)
            throw new Exception("Illegeal length or breadth");
        return new Rectangle(length,breadth);
    }

    public double calculateArea(){
        return length*breadth;
    }

    public double calculatePerimeter(){
        return 2 * ( length + breadth );
    }
}
