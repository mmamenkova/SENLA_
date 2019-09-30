package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    НОК и НОД двух целых чисел
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();

        if (task1.Solution.isInteger(s1) && task1.Solution.isInteger(s2)) {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int gcd = gcd(n1, n2);
            int lcm = n1*n2/gcd;
            System.out.println("НОД=" + gcd);
            System.out.println("НОК=" + lcm);
        } else {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Введенная последовательность символов не является целым числом.");
            }
        }

    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}
