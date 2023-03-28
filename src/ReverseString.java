public class ReverseString {
    public static void main(String[] args) {
        String reverse = reverseString("It Is Just Me?");
        System.out.println(reverse);
    }

    public static String reverseString(String s) {
        char[] letters = new char[s.length()];

        // take the last character and put in first var letters
        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }

        // add every char to a String
        StringBuilder reverse = new StringBuilder();
        for (char letter : letters) {
            reverse.append(letter);
        }

        return reverse.toString();
    }

}
