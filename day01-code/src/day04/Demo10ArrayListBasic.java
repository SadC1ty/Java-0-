package day04;
import java.util.ArrayList;
/*
如果希望向集合ArrayList当中存储基本类型数据,必须使用基本类型的对应的包装类;

基本类型        包装类(应用类型,包装类都位于java.lang包下)
byte           Byte
short          Short
int            Integer      [特殊]
long           Long
float          Float
double         Double
char           Character    [特殊]
boolean        Boolean

备注:从JDK1.5+开始,支持自动装箱，自动拆箱;

自动装箱:基本类型-->包装类型;
自动拆箱:包装类型-->基本类型;
 */
public class Demo10ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        listNum.add(100);
        listNum.add(200);
        System.out.println(listNum);

        int num = listNum.get(1);
        System.out.println("第二位元素是:"+num);
    }
}
