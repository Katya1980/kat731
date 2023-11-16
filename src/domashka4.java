import java.util.Arrays;

public class domashka4 {
    public static void main(String[] args) {

        int mas[] = new int[5];
        mas[0] = 0;
        mas[1] = 6;
        mas[2] =42;
        mas[3] = 55;
        mas[4] = 87;

        for (int i = 0; i < 5; i++) {
            System.out.print(mas[i] + "  ");
        }
        System.out.println();

        for (var i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int min = mas [0];
        for (int i = 0; i < mas.length; i++ ){
            if (min> mas[i]){
                min = mas[i];
            }
        }
        System.out.println();
        System.out.println("Мин.значение  " + min);

        int max = mas [0];
        for (int i = 0; i < mas.length; i++ ){
            if (max< mas[i]){
                max = mas[i];
            }
        }
        System.out.println();
        System.out.println("Макс.значение  " +max);

        int indexmax = 0;
        int indexmin = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > mas[indexmax]) {
                indexmax = i;
            }
                 else if (mas[i]< mas [indexmin]){
                     indexmin = i;

            }

        }
        System.out.println(indexmax +" " + indexmin);

        int zero= 0;
        for (int e : mas) {
            if (e == 0)zero++;
            else {
                System.out.println("Элементов  0 нет");
            }

        }
        System.out.println(zero);

        for (int i = 0; i<mas.length/2; i++){
            int temp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++){
            if (i>0){
                if (mas[i-1] >= mas[i]){
                    System.out.println("Не возрастающая последовательность");
                    break;
                }
            }
            if (i == mas.length - 1)
            System.out.println("Последовательность возрастающая");

        }

    }
}
