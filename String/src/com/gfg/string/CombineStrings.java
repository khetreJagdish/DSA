package com.gfg.string;
public class CombineStrings {
    public static String combine(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Initialize a StringBuilder to efficiently build the combined string
        StringBuilder str3Builder = new StringBuilder();

        // Step 3: SET I = 0.
        int i = 0;

        // Steps 4-6: Copy characters from STR1 to STR3
        while (i <= len1 - 1) {
            // Step 5: STR3[I] = STR1[I].
            str3Builder.append(str1.charAt(i));

            // Step 6: SET I = I + 1.
            i++;
        }

        // Step 7: SET J = 0.
        int j = 0;

        // Steps 8-11: Combine characters from STR2 with STR3
        while (i <= (len1 + len2 - 1)) {
            // Step 9: STR3[I] = STR2[J].
            str3Builder.append(str2.charAt(j));

            // Step 10: J = J + 1.
            j++;

            // Step 11: I = I + 1.
            i++;
        }

        // Step 12: Exit. Return the combined string.
        return str3Builder.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "HelloWorld";
        String str2 = "ThisisProgram";
        String result = combine(str1, str2);
        System.out.println("Combined String: " + result);
    }
}
