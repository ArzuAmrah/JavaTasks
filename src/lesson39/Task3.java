package lesson39;

public class Task3 {
    public static void main(String[] args) {
        String sentence = "Hello World Java Programming";
         StringBuilder reverse =new StringBuilder();

         String[] words =sentence.split(" ");

         for(String word : words){
             String reverseWord = new StringBuilder(word).reverse().toString();
             reverse.append(reverseWord);

         }
    }
}
