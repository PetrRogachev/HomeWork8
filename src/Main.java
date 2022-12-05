import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        array[0] = 0;
        array[98] = 0;
        for (int i = 1; i < array.length; i++) {
            if (i == 98) {
                continue;
            }
            array[i] = 10;
        }
        System.out.println(Arrays.toString(array));
    }
}