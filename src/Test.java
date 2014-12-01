/**
 * Created by darkwawe on 21.10.2014.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception  {
        Random random=new Random();
        String s="Л";
        for (int i = 0; i < 20;i++) {
            s += (char)('а' + random.nextInt(21));
            System.out.println(s);


        }

    }
}
