public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println(s + " is a Palindrome");
        else
            System.out.println(s + " is not a Palindrome");

        s = "hello";
        rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println(s + " is a Palindrome");
        else
            System.out.println(s + " is not a Palindrome");
    }
}