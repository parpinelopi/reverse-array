import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{20, 30, 40, 50, 60};
        System.out.println("array :" + Arrays.toString(array));

        reverse(array);

        System.out.println("reversed array:" + Arrays.toString(array));

    }


    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }


    }

}
