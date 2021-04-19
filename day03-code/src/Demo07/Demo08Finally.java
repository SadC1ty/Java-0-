package Demo07;

import java.io.IOException;

/*
    finally代码块
    格式:
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量,用来接受try中抛出的异常对象){
        异常处理的逻辑,异常对象之后,怎么处理异常对象
        一般在工作中,会把异常的信息记录到一个日志中
    }finally{
        无论是否出现异常,都会执行
    }
    注意:
        1.finally不能单独使用,必须和try..catch一起使用;
        2.finally一般用于资源释放(资源回收),无论是否程序出现异常,最后都要资源释放(IO)
 */
public class Demo08Finally {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("资源释放");//资源释放
        }
    }

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
}
