public class ReverseString {
    public static void main(String[] args) {
        String reverse = reverseString("It Is Just Me?");
        System.out.println(reverse);
        String reverseNew = reverseStringNew("ha ha ha");
        System.out.println(reverseNew);
        String reverseSimple = reverseStringSimple("inidnA araiT - hadnI asareM");
        System.out.println(reverseSimple);
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

    public static String reverseStringNew(String s) {
        char[] letters = s.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            reverse.append(letters[i]);
        }
        return reverse.toString();
    }

    public static String reverseStringSimple(String s) {
        StringBuilder reverse = new StringBuilder(s);
        return reverse.reverse().toString();
    }

}
