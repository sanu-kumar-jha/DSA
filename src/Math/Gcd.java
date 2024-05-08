package Math;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter numbers");
        num1 = myObj.nextInt();
        num2 = myObj.nextInt();
        int result = findGcd(num1, num2);
        System.out.println(result);

    }

    public static int findGcd(int num1, int num2) {
        int result = Math.min(num1, num2);
        while (result != 0) {
            if (num1 % result == 0 && num2 % result == 0) {
                break;
            }
            result--;
        }

        return result;

    }
}
