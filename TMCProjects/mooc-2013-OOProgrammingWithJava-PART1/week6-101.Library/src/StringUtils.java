public class StringUtils {

    public static boolean included(String word, String searched) {
        String newWord = word.toLowerCase().trim();
        String newSearch = searched.toLowerCase().trim();

        if (newWord.contains(newSearch)) {
            return true;
        } else {
            return false;
        }
    }
}
