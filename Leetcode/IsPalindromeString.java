/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters,it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/
public class IsPalindromeString {
    public static boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        char startChar;
        char endChar;
        while(start < end)  {
            startChar = s.charAt(start);
            endChar = s.charAt(end);
            if(!Character.isLetterOrDigit(startChar)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endChar)){
                end--;
            }
            else if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)){
                return false;
            }
            else  {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Too hot to hoot.";
        if( isPalindrome(str))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not" + " " +
                    "palindrome");
    }
}
