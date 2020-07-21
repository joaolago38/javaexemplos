package arrays;

import java.util.Arrays;

public class HelloWorld3 {
    public static void main(String[] args) {
        String[][] deepArr = new String[][] {{"Sai", "Gopal"}, {"Pallavi", "Priya"}};
        System.out.println(Arrays.toString(deepArr));
        System.out.println(Arrays.deepToString(deepArr));
    }
}
