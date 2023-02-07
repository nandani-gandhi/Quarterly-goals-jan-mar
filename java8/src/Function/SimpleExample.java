package Function;

import java.util.function.Function;

public class SimpleExample {
    public static void main(String[] args) {
        String sentence = "I Am Nandani Gandhi";
        System.out.println("Sentence :" + sentence);
        Function<String, String> function = s1->s1.replace(" ","");
        String removeSpace=function.apply(sentence);
        System.out.println("Remove Space from Sentence :"+ removeSpace);
    }

}
