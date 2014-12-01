/**
 * Created by darkwawe on 08.10.2014.
 */
public class OverLoad {
    public static void main(String args[]){
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box();
        Box mybox3=new Box(7);
        Box cloneBox=new Box(mybox1);

        System.out.println("Объем mybox1= "+mybox1.volume());
        System.out.println("Объем mybox2= "+mybox2.volume());
        System.out.println("Объем mybox3= "+mybox3.volume());
        System.out.println("Объем cloneBox= "+cloneBox.volume());
    }
}
