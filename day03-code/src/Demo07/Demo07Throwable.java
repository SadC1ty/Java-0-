package Demo07;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07Throwable {
    public static void readFile(String filename) throws IOException {
        /*
            如果传递的对象不是txt结尾
            那么我们就抛出IO异常对象,告知方法的调用者,文件的后缀名不对
         */
        if(!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("读取文件");
    }

    public static void main(String[] args) {
        try{
            readFile("d:\\a.tx");
        }catch(IOException e){
            //try中抛出的异常对象,catch就定义什么异常对象,用来接收这个异常对象
            //System.out.println("catch - 传递的文件后缀不是.txt");

            /*
                Throwable类中定义了3个异常处理的方法
                    String getMessage()返回此throwable的简短描述
                    String toString()返回此 throwable 的详细消息字符串
                    void printStackTrace() JVM打印异常,默认调用此方法,打印的异常信息最全面
             */
            System.out.println(e.getMessage());//文件的后缀名不对
            System.out.println(e.toString());//java.io.IOException: 文件的后缀名不对
            System.out.println(e);//java.io.IOException: 文件的后缀名不对
            e.printStackTrace();
            /*
                java.io.IOException: 文件的后缀名不对
	                at Demo07.Demo07Throwable.readFile(Demo07Throwable.java:13)
	                at Demo07.Demo07Throwable.main(Demo07Throwable.java:20)
             */
        }
        System.out.println("后续代码");
    }
}

