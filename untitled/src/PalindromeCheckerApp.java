public class PalindromeCheckerApp {
    public static void main(String[] args) {
                System.out.println("Welcome to the Palindrome Checker Management System");
                System.out.println("Version : 1.0");
                System.out.println("System initialized successfully.");

                String input = "madam";
                boolean isPalindrome = true;

                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Word: " + input);
                if (isPalindrome) {
                    System.out.println("Result: It is a palindrome.");
                } else {
                    System.out.println("Result: It is not a palindrome.");
                }
            }
        }