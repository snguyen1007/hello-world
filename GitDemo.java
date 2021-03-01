/*****
Name: Son Nguyen
 ******/
public class GitDemo {
    
    private double previousNumber;
    private double reverseNum;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        previousNumber = previousNumber + num;
        System.out.print("Add num to previousNumber");
        return previousNumber;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double factorialNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
        }
        
        return factorialNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        double newNumber = 1;
        reverseNum = newNumber;
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        
        return newNumber;
    }
    
}