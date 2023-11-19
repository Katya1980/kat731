
import java.util.Scanner;
import java.util.Arrays;

public class Domashka {
    public static void main(String[] ags) {

        int[] arr = {9, 9, 9,};
        String string = " ";
        for (int i = 0; i < arr.length; i++) {
            string = string + arr[i];
        }
        Scanner a = new Scanner(string);
        int n = a.nextInt();
        int v = n + 1;
        String vString = Integer.toString(v);
        char[] charArray = vString.toCharArray();



        int[] count = new int[charArray.length];
        for (int j = 0; j < charArray.length; j++) {
            count[j] = Character.getNumericValue(charArray[j]);

        }
        System.out.println(Arrays.toString(count));


    }

}
