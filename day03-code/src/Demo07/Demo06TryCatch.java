package Demo07;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    异常处理的第二种方式
    try...catch:自己处理异常
    格式:
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量,用来接受try中抛出的异常对象){
        异常处理的逻辑,异常对象之后,怎么处理异常对象
        一般在工作中,会把异常的信息记录到一个日志中
    }
    ...
    catch(异常类名 变量名){

    }
    注意:
        1.try中可能出现多个异常对象,那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常,那么就会执行catch中异常处理逻辑,执行完毕catch中的逻辑处理器,继续执行try..catch之后的代码
          如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 */
public class Demo06TryCatch {
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
        }catch(IOException e){//try中抛出的异常对象,catch就定义什么异常对象,用来接收这个异常对象
            System.out.println("catch - 传递的文件后缀不是.txt");
        }
        System.out.println("后续代码");
    }
}
