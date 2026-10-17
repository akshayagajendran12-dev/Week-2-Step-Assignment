import java.util.Scanner;

public class LibraryISBNNormalizerValidator {

    public static String normalizeAndValidateISBN(String rawCode) {
        String code = rawCode.trim();

        if (code.length() < 3) {
            return "Invalid: code must contain at least 3 characters";
        }

        code = code.substring(0, 3).toUpperCase()
                + code.substring(3);

        if (code.length() != 13) {
            return "Invalid: code must contain exactly 13 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: remaining 10 characters must be digits";
            }
        }

        return "Valid ISBN-style code: " + code;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN-style code: ");
        String code = sc.nextLine();

        System.out.println(normalizeAndValidateISBN(code));

        sc.close();
    }
}
