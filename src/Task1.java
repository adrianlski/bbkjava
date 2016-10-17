public class Task1 {
    public static void main(String[] args) {
        String word = "abcdefg";
        System.out.println("Word: " + word );
        System.out.println("Word reversed: " + reverse(word));
    }

    private static String reverse(String word) {
        if (word.length() == 1) {
            return word;
        }

        char first = word.charAt(0);
        String rest = word.substring(1);

        String result = reverse(rest);
        return result += first;
    }

}
