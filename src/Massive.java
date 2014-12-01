/**
 * Created by darkwawe on 07.10.2014.
 */
public class Massive {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5]; //создаем многомерный массив из целых чисел
        int i; //объявляем переменную количественного значения первого массива (4)
        int j; //объявляем переменную количественного значения второго массива (5)
        int k = 0; ////объявляем переменную, которая отвечает за содержание ячеек

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;

            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}