import java.util.Arrays;
import java.util.Collections;

public class Projeto2 {
    public static void main (String[] args){
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_arrays2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Array 1 - Ordenada: " + Arrays.toString(my_array1));
        System.out.println("Array 1 - Original: " + Arrays.toString(my_arrays2));
        Arrays.sort(my_arrays2);
        System.out.println("Array 1 - Ordenada: " + Arrays.toString(my_arrays2));
    }
}