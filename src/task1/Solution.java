package task1;

import sun.security.pkcs.ParsingException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Четное или нечетное, простое или составное
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        if (isInteger(s)) {
            int n = Integer.parseInt(s);
            if (n%2==0) {
                if (n>1) {
                    if (isPrimeNumber(n)) {
                        System.out.println(n + "- четное простое число");
                    } else {
                        System.out.println(n + "- четное составное число");
                    }
                } else {
                    System.out.println(n + "- четное число");
                }
            } else {
                if (n>1) {
                    if (isPrimeNumber(n)) {
                        System.out.println(n + "- нечетное простое чсило");
                    } else {
                        System.out.println(n + "- нечетное составное число");
                    }
                } else {
                    System.out.println(n + "- нечетное число");
                }
            }
        } else {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Введенная последовательность символов не является целым числом.");
            }
        }
    }

    public static boolean isInteger(String s) {
        if (s==null || s.length() == 0) {
            return false;
        }
        int i = 0;
        if (s.charAt(0) == '-') {
            if (s.length() == 1) {
                return false;
            }
            i = 1;
        }
        for (; i<s.length(); i++) {
            char c = s.charAt(i);
            if ((c < '0' || c > '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int n) {
        if (n<2)
            return false;
        double nd = Math.sqrt(n);
        for (int i=2; i<=nd; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
