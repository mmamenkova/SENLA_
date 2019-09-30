package task5;

import java.util.ArrayList;
import java.util.List;

public class searchPalindromes {
    public static List<String> searchPalindromes(String s) {
        List<String> listPalindromes = new ArrayList<String>();
        if (s==null || s.length()<3)
            return null;
        // Odd length palindromes
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i-1, k=i+1; j>=0 && k<s.length(); j--, k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k-j+1 >=3) {
                        listPalindromes.add(s.substring(j, k+1));
                    }
                } else
                    break;
            }
        }

        // Even length palindromes
        for (int i=1; i<s.length()-1; i++) {
            for (int j=i, k=i+1; j>=0 && k<s.length(); j--, k++) {
                if (s.charAt(j) == s.charAt(k)) {
                    if (k-j+1 >=3)
                        listPalindromes.add(s.substring(j, k+1));
                } else
                    break;
            }
        }
        return listPalindromes;
    }
}
