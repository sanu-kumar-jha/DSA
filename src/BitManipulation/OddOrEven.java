package BitManipulation;

import java.util.Scanner;

class OddOrEven {

    static boolean isEven(int n) {
        if ((n ^ 1) == (n + 1))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = scannerObject.nextInt();
        System.out.print(isEven(n) == true ? "Even"
                : "Odd");
    }
}
