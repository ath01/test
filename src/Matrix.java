/**
 * Created by darkwawe on 07.10.2014.
 */
public class Matrix {
    public static void main(String args[]) {
        int m[]={1,2,3,4,5,6,7,8,9};
        int i,j;
        for (i=0;i<9;i++){
                for (j=0;j<9;j++)
                    System.out.print(m[i]*m[j]+" ");
                System.out.println();
        }
    }
    }