import java.util.Arrays;
import java.util.Collections;

public class AlterGreaterLower{
    public static void main(String args[]) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.sort(arr, Collections.reverseOrder());

        int[] finalArr = new int[arr.length];
        for (int i = 0; i < arr.length; i += 2) {
            finalArr[i] = arr[i];
            finalArr[i + 1] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }
}
