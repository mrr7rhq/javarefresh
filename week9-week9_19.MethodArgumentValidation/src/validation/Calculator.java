package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if(fromInteger<0)
            throw new IllegalArgumentException("The argument has to be positive.");
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        
        if(setSize <0 || setSize<subsetSize)
            throw new IllegalArgumentException("setSize should be positive and subsetSize should be smaller than setSize "
                    + "be ");

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
