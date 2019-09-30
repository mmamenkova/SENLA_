package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String p = reader.readLine();
        reader.close();
        List<String> list = searchPalindromes.searchPalindromes(p);
        for (String l : list) {
            System.out.println(l);
        }
    }

}
