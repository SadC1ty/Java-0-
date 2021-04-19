package Demo07;
/*
    异常产生的过程解析(分析异常是怎么产生的,如何处理异常)
 */
public class Demo02Exception {
    public static void main(String[] args) {
        //创建int数组
        int[] arr = {1,2,3};
        int e = getElement(arr,3);
        /*
            访问数组中3索引,而数组没有3索引,这时候JVM就会检测出程序出现异常
            JVM会做两件事:
                1.JVM根据异常创建一个异常对象,这个异常对象包含了异常产生的(内容,原因,位置);
                2.在getElement方法中,没有异常的处理逻辑,那么JVM就会把异常抛出给main方法来处理这个异常;
            main方法接受到了这个异常对象,没有异常处理逻辑,所以抛给JVM处理
            JVM会做两件事:
                1.把异常对象,以红色字体打印在控制台;
                2.JVM会终止程序->中断处理
         */
        System.out.println(e);//ArrayIndexOutOfBoundsException数组越界异常
    }
    /*
        定义一个方法,获取指定位置数组的元素
        参数:
            int[] arr
            int index
     */
    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }
}
