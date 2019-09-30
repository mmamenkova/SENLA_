package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
    Количество слов в предложении
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        String[] list = line.split(" ");

        for (int i=0; i<list.length; i++) {
            list[i] = Character.toUpperCase(list[i].charAt(0)) + list[i].substring(1);
        }

        Arrays.sort(list);

        System.out.println("Количество слов: " + list.length);
        for (String s: list) {
            System.out.println(s);
        }
    }

}
