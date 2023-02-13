public class LengthOfLastWord {

    public static void main(String[] args)
    {
        String input = "     My  Name is         Komal and My sister Name             is";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int ans = lengthOfLastWord.findLength(input);
        System.out.println("The length of last word is :- " + ans );
    }
    public int findLength(String a)
    {
        int length = 0;
        String trimString = a.trim();
        for (int i = 0; i < trimString.length(); i++)
        {
            if (trimString.charAt(i) == ' ') {
                length = 0;
            }
            else
            {
                length++;
            }
        }
        return length;
    }
}
