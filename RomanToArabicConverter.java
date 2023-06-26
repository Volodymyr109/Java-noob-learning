package threads;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {
    private static final Map<Character, Integer> ROMAN_NUMERALS = new HashMap<>();

    static {
        ROMAN_NUMERALS.put('I', 1);
        ROMAN_NUMERALS.put('V', 5);
        ROMAN_NUMERALS.put('X', 10);
        ROMAN_NUMERALS.put('L', 50);
        ROMAN_NUMERALS.put('C', 100);
        ROMAN_NUMERALS.put('D', 500);
        ROMAN_NUMERALS.put('M', 1000);
    }

    public static int convertRomanToArabic(String romanNumber) {
        int arabicNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            int currentDigit = ROMAN_NUMERALS.get(romanNumber.charAt(i));

            if (i + 1 < romanNumber.length()) {
                int nextDigit = ROMAN_NUMERALS.get(romanNumber.charAt(i + 1));

                if (currentDigit < nextDigit) {
                    arabicNumber -= currentDigit;
                } else {
                    arabicNumber += currentDigit;
                }
            } else {
                arabicNumber += currentDigit;
            }
        }

        return arabicNumber;
    }

    public static void main(String[] args) {
        String romanNumber = "IX";
        int arabicNumber = convertRomanToArabic(romanNumber);
        System.out.println("Arabic number: " + arabicNumber);
    }
}