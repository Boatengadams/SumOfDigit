// Question: How can a program calculate the sum of an integer’s digits?
package Loop;

import java.util.Scanner;

// A program which display the sum of digits of an integer read from the user.
// 108 ==> 1 + 0 + 8 = 9
public class SumOfDigit {
//    user enter
//    the value
//    now say 123
//    then sum = 123
//    mod 10=3
//    then 12left;
//    so sum = +12
//    mod 10=2
//    added to
//    the sum
//    to make
//    sum now = 3 + 2 = 5
//    then 1
//    left so
//    sum =+1mod 10=1reminder 0,
//    so sum = 5 + 1 = 6;

public static void main(String[] args) {
    System.out.print("Enter your value:");
    Scanner s = new Scanner(System.in);
    long n = Math.abs((long) s.nextInt());
    long sum = 0;
    while(n>0){
        sum += n%10 ;
        n/=10;
    }
    System.out.println("sum = " + sum);
}

}
