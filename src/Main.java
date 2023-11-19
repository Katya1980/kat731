import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int a = scanner.nextInt();

        int count = a;
        int[] temp = new int[a];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = random.nextInt(0, 100);
            System.out.print(temp[i] + "  ");
        }
        System.out.println();

        for (var i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i] + "  ");
        }
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
            }
        }
        System.out.println();
        System.out.println("минимальное значение   " + min);

        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        System.out.println();
        System.out.println("максимальное значение   " + max);

        int indexmax = 0;
        int indexmin = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > temp[indexmax]) {
                indexmax = i;
            } else if (temp[i] < temp[indexmin]) {
                indexmin = i;

            }

        }
        System.out.println(indexmax + " " + indexmin);

        int zero = 0;
        for (int e : temp) {
            if (e == 0) zero++;
            else {
                System.out.println("Элементов  0 нет");
            }
        }
        System.out.println(zero);


        for (int i = 0; i < temp.length / 2; i++) {
            int arr = temp[i];
            temp[i] = temp[temp.length - i - 1];
            temp[temp.length - i - 1] = arr;
        }
        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < temp.length; i++) {
            if (i > 0) {
                if (temp[i - 1] >= temp[i]) {
                    System.out.println("Не возрастающая последовательность");
                    break;
                }
            }
            if (i == temp.length - 1)
                System.out.println("Последовательность возрастающая");

        }


    }

}




