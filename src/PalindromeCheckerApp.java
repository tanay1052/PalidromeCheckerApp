public class PalindromeCheckerApp {

    /**
     @@ -31,15 +32,14 @@ public class PalindromeCheckerApp {
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean result = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                result = false;
                break;
            }
            System.out.println("Input text: " + input);
            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reverse += input.charAt(i);
            }

            System.out.println("Is it a Palindrome?: " + result);
            System.out.print("It it a Palindrome? : ");
            System.out.println(input.equals(reverse));
        }

    }