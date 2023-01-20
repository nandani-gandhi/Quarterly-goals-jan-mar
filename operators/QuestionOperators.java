package operators;

public class QuestionOperators {
    boolean[] array = new boolean[3];
    int count = 0;

    void set(boolean[] arr, int x)
    {
        arr[x] = true;
        count++;
    }

    void func()
    {
        if(array[0] && array[++count - 2] || array [count - 1]) {
            count++;
        }

        System.out.println("count = " + count);
    }


    public static void main(String[] args)
    {
        QuestionOperators questionOperators = new QuestionOperators();
        questionOperators.set(questionOperators.array, 0);
        questionOperators.set(questionOperators.array, 1);
        questionOperators.func();
    }
}
