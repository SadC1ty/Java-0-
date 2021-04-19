package Demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aBc";
        boolean ans = s1.equals(s2);    //返回false
        String s3 = null;
        //ans = s1.equals(s3);    //会报空指针异常
        /*
            使用Objects中的equals方法,可以防止空指针异常
            源码:
                public static boolean equals(Object a,Object b){
                    retrun(a==b)||(a!=null&&a.equals(b))
                }
        */
        ans = Objects.equals(s1,s3);    //返回false,不会报空指针异常
    }
}
