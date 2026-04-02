package strings;

public class StringMethods {
    public static void main(String[] args){

        // String Length
        String name = "Milan";
        System.out.println("The length of string is  " + name.length());


        // toUpperCase() and  toLowerCase()
        String text = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
        System.out.println("Text in Upper Case : " + text.toUpperCase());
        System.out.println("Text in Lower Case :" + text.toLowerCase());




        // indexOf() method is used for locate a character in a string
        String sentence = "I Love Nepal ";
        System.out.println("Searched Text is at  " + sentence.indexOf("Nepal"));
    }


}
