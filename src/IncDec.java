/**
 * Created by darkwawe on 07.10.2014.
 */
public class IncDec {
    public static void main(String[]args){
        int a=1;
        int b=2;
        int c;
        int d;
        c=++b;
        d=a++;

        c++;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        int j;
        int q=1;
        int w=5;
        j=q>0 ? q++ : w++;
        System.out.println(q+" "+w);

    }
}
