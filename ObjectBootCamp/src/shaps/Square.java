package shaps;

import exceptions.NonPositiveInputException;

/*
    JOB-
        -perform tasks related to its fields
 */
public class Square extends Rectangle{
    private double side;

    private Square(double side) {
        super(side,side);
    }
    public static Square create(double side) throws Exception {
        if(side <= 0)
            throw new NonPositiveInputException("side must be non zero positive numbers");
        return new Square(side);
    }
}
