package shaps;/*
    job
        -Perform tasks which involves with its fields.
*/

import Exceptions.NonPositiveInputException;

public class Rectangle {
    private double length;
    private double breadth;

    protected Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth) throws Exception {
        if(length <= 0)
            throw new NonPositiveInputException("length must be non zero positive numbers");
        if(breadth <= 0)
            throw new NonPositiveInputException("breadth must be non zero positive numbers");
        return new Rectangle(length,breadth);
    }

    public double calculateArea(){
        return length*breadth;
    }

    public double calculatePerimeter(){
        return 2 * ( length + breadth );
    }
}
