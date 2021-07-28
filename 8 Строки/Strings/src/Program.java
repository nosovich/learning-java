import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        1) Вырезать подстроку из строки, начиная с первого вхождения символа(А)
//        до последнего вхождения сивола(B).

        String myString = "What a wonderful day!";
        char first = 'a';
        char second = 'y';
        myString = getSubstring(myString, first, second);
        System.out.println(myString);
        System.out.println();


//        2) Заменить все вхождения символа, стоящего в позиции (3),
//        на сивол, стоящий в позиции (0).

        String originalString = "Two tiny tigers take two taxis to town";
        String newString = originalString.replace(originalString.charAt(3), originalString.charAt(0));
        System.out.println(originalString);
        System.out.println("After replacing chars: " + newString);
        System.out.println();

//        3)В исходном файле находятся слова, каждое слово на новой строке.
//        После запуска программы должен создаться файл, который будет содержать в себе
//        только палиндромы.

        String sadStory = String.join("\n",
                "Tot",
                "Bob",
                "always",
                "dreamed",
                "of",
                "a",
                "pup",
                "but",
                "dad",
                "with",
                "mom",
                "did",
                "sis");
        System.out.println(sadStory);
        String palindrome = getPalindromes(sadStory);
        System.out.println(palindrome);
        System.out.println();

//        4)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов.
//        Если в предложении присутствует слово-палиндром, то не имеет значение, какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        Пишем все в ООП стиле.
//        Создаём класс TextFormater, в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет, есть ли в строке слово-палиндром.
//        Если есть, возвращает true, если нет  - false.
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл.

        String eathSong = String.join("\n",
                "What about sunrise?",
                "What about rain?",
                "What about all the things",
                "That you said we were to gain?",
                "What about killing fields?",
                "Is there a time?",
                "What about all the things",
                "That you said was yours and mine?",
                "Did you ever stop to notice",
                "All the blood we've shed before?",
                "Did you ever stop to notice",
                "This crying Earth, these weeping shores?",
                "Ah-ah-ah-ah-ah",
                "Ooh-ooh-ooh-ooh-ooh",
                "Ah-ah-ah-ah-ah",
                "Ooh-ooh-ooh-ooh-ooh",
                "What have we done to the world?",
                "Look what we've done.",
                "What about all the peace",
                "That you pledge your only son?",
                "What about flowering fields?",
                "Is there a time?",
                "What about all the dreams",
                "That you said was yours and mine?",
                "Did you ever stop to notice",
                "All the children dead from war?",
                "Did you ever stop to notice",
                "This crying Earth, these weeping shores?");

        String[] sentences = eathSong.split("\\.\n|\\?\n");
        ArrayList<String> eathSongArr = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            if (TextFormater.palindromeCheck(sentences[i])) {
                eathSongArr.add(sentences[i]);
            } else if (TextFormater.getWordsNumber(sentences[i]) >= 3 && TextFormater.getWordsNumber(sentences[i]) < 5) {
                eathSongArr.add(sentences[i]);
            }
        }
        String newEathSong = "";
        for (int i = 0; i < eathSongArr.size(); i++) {
            newEathSong += eathSongArr.get(i) + "\n";
        }
        System.out.println(newEathSong);
    }

    public static String getSubstring(String string, char first, char second) {
        String message = "There is no char %c in the string %s";
        if (string.indexOf(first) == -1 && string.lastIndexOf(second) == -1) {
            System.out.println("There is no such chars in the string " + string);
        } else if (string.indexOf(first) == -1) {
            System.out.printf(message, first, string);
        } else if (string.lastIndexOf(second) == -1) {
            System.out.printf(message, second, string);
        } else {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.delete(string.indexOf(first), string.lastIndexOf(second));
            string = stringBuilder.toString();
        }
        return string;
    }

    public static String getPalindromes(String originalString) {
        String[] originalWords = originalString.split("\n");
        String[] invertedWords = new String[originalWords.length];
        for (int i = 0; i < originalWords.length; i++) {
            invertedWords[i] = new StringBuilder(originalWords[i]).reverse().toString();
        }
        ArrayList<String> palindromeWords = new ArrayList<>();
        for (int i = 0; i < originalWords.length; i++) {
            if (originalWords[i].equalsIgnoreCase(invertedWords[i])) {
                palindromeWords.add(originalWords[i]);
            }
        }
        System.out.println();
        String palindromeString = "";
        for (int i = 0; i < palindromeWords.size(); i++) {
            palindromeString += palindromeWords.get(i) + "\n";
        }
        return palindromeString;
    }
}


