package Book;

public class DuplicatesWithNoBuffer {

    public static String removeDuplicates(String word) {
        if (word == null || word.length() < 2) {
            return word;
        }

        int pos = 1; // possible position of duplicate character
        char[] characters = word.toCharArray();

        for (int i = 1; i < word.length(); i++) {
            int j;
            for (j = 0; j < pos; j++) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == pos) {
                characters[pos] = characters[i];
                ++pos;
            } else {
                characters[pos] = 0;
                ++pos;
            }
        }

        return toUniqueString(characters);
    }

    public static String toUniqueString(char[] letters) {
        StringBuilder sb = new StringBuilder(letters.length);
        for (char c : letters) {
            if (c != 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="abcaa";
        char[]c=str.toCharArray();
        System.out.println(removeDuplicates(str));
    }
}
