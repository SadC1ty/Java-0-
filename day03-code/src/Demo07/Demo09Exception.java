package Demo07;

import java.util.ArrayList;
import java.util.List;

/*
    异常的注意事项
 */
public class Demo09Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获该如何处理:
                1.多个异常分别处理
                2.多个异常一次捕获,多次处理
                3.多个异常一次捕获,一次处理
         */
        //1.多个异常分别处理
//        try{
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        try {
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        //2.多个异常一次捕获,多次处理
//        try {
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//            List<Integer> list = new ArrayList<>();
//            list.add(1);
//            list.add(2);
//            list.add(3);
//            System.out.println(list.get(3));//IndexOutOfBoundsException
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        } catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        /*
            一个try多个catch注意事项:
                catch里边定义的异常变量,如果有子父类关系,子类的异常变量必须写在上边否则就会报错
         */
        //3.多个异常一次捕获,一次处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch(Exception e){
            System.out.println(e);
        }
        //运行时异常被抛出可以不处理,既不捕获也不声明抛出
        //默认给虚拟机处理,终止程序,什么时候不抛出运行时异常了再来继续执行程序
    }
}
