/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long x = Long.parseLong(args[0]);
        long sum1 = 0;
        long sum2 = 0;
        long y = x;
        while(y >= 1) {
            long a = y % 10;
            y = y / 10;
            y = y / 10;
            sum1 = sum1 + a;
            sum1 = sum1 % 10;
        }
        
        while(x >= 10) {
            x = x / 10;
            long b = x % 10;
            x = x / 10;
            sum2 = sum2 + b;
            sum2 = sum2 % 10;

        }
        sum2 = sum2*3;
        sum2 = sum2 % 10;
        long sum = sum1 + sum2;
        sum = sum % 10;
        System.out.println(sum);



        // WRITE YOUR CODE HERE
    }
}