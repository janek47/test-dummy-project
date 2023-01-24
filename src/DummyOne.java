public class DummyOne {

    public String reverseWithLoop (String word) {
        String result = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);

        }
        return result;
    }

    public static void main(String[] args) {
        DummyOne dummyOne = new DummyOne();

        System.out.println(dummyOne.reverseWithLoop("Kevin Lee"));
    }

}
