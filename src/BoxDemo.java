/** В этом примере класс Box определяет три конструктора для
инициализации размеров параллелепипеда различными способами.
*/
class Box {
    double width;
    double heigth;
    double depth;
//конструктор, используемый при указании всех измерений
    Box(double width, double heigth, double depth) {
        this.width=width;
        this.heigth=heigth;
        this.depth=depth;
    }
//конструктор, используемый, когда ни один из параметров не указан
    Box(){
        width=-1;   //значение -1 используется для указания
        heigth=-1;  //неинициализированного
        depth=-1;   //параллелепипеда
    }
//конструктор, используемый для создания куба
    Box(double len){
        width=heigth=depth=len;
    }
//конструктор, который использует объект типа Box
    Box(Box ob){
        width=ob.width;
        heigth=ob.heigth;
        depth=ob.depth;
    }
//вычисление и возврат объема
    double volume() {
        return width * heigth * depth;
    }
}
public class BoxDemo {
    public static void main(String[]args){
        Box MyBox1=new Box(10,20,15);
        Box MyBox2=new  Box(3,6,9);
        System.out.println(MyBox1.volume());
        System.out.println(MyBox2.volume());
    }

}
