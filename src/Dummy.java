public class Dummy {
    public String reverseString (String word){

        StringBuilder stringBuilder = new StringBuilder(word);
        String reverseWord = stringBuilder.reverse().toString();

        return reverseWord;

    }

    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        System.out.println(dummy.reverseString("Jane"));

    }


}
