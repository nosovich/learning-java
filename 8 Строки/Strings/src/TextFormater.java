public class TextFormater {

    public static int getWordsNumber(String string) {
        int wordsNumber = 0;
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            wordsNumber++;
        }
        return wordsNumber;
    }

    public static boolean palindromeCheck(String string) {
        boolean palindromeExist = false;
        String[] originalStringArray = string.split(" ");
        String[] invertedStringArray = new String[originalStringArray.length];
        for (int i = 0; i < originalStringArray.length; i++) {
            invertedStringArray[i] = new StringBuilder(originalStringArray[i]).reverse().toString();
            if (originalStringArray[i].equalsIgnoreCase(invertedStringArray[i])) {
                palindromeExist = true;
                break;
            }
        }
        return palindromeExist;
    }
}
