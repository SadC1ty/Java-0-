package Demo07;

import java.util.Objects;

/*
    Objects的静态方法
    public static <T> T requireNonNull(T obj): 查看指定对象是否为null;
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object o) {
        Objects.requireNonNull(o);
        Objects.requireNonNull(0,"传递对象为null");
    }

}
