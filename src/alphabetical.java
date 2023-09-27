/*
    Part of init week 2 technical prep:
    You are given a string and you want to find the first character not in alphabetical order
 */

public class alphabetical {

    public static void main(String[] args) {
        String s = "abcdedhjk";

        System.out.println(isItAlphabetical(s));

    }

    public static char isItAlphabetical(String s) {
        char current;
        char next;

        s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {
            current = s.charAt(i);
            next = s.charAt(i + 1);

            if (current > next) {
                return current;
            }
        }

        throw new IllegalArgumentException("This string is in alphabetical order.");
    }
}
