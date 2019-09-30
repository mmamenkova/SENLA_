package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Сколько раз в тексте встречается введенное слово
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String line = reader.readLine().toLowerCase();
        System.out.println("Введите искомое ислово: ");
        String word = reader.readLine().toLowerCase();
        reader.close();

        int count = 0;
        String clearLine = line.replaceAll("[^A-Za-zА-Яа-я0-9\\s]", " ");
        for (String s : clearLine.split(" ")) {
            if (s.equals(word)) {
                count++;
            }
        }
        System.out.println("Количество вхождений слова \"" + word + "\" = " + count);

    }
}
