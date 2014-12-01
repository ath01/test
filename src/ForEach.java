/**
 * Created by darkwawe on 07.10.2014.
 */
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        boolean found = false;
        for (int x : nums) {
            System.out.println(x);
            sum += x;
            if (x == 5) {
                found = true;
                break;
                 }
            }
            System.out.println(sum);
            if (found) {
                System.out.println("Значение найдено!");
            }

    }
}