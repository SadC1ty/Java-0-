package Demo01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口:迭代器
    有两个常用的方法
        boolean hasNext()如果仍有元素可以迭代,则返回true
            判断集合中还有没有下一个元素,有则返回true
        E next()返回迭代的下一个元素
            取出集合中的下一个元素
        Iterator迭代器,是下一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象
        Collection接口中有方法iterator(),这个方法返回的就是迭代器的实现类对象
            Iterator<E> iterator()
                返回在此collection的元素上进行迭代的迭代器

    迭代器的使用步骤:
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> col1 = new ArrayList<>();
        col1.add("A");
        col1.add("B");
        col1.add("C");
        col1.add("D");
        col1.add("E");
        Iterator<String> it = col1.iterator();
        boolean b=true;
        String s;
        while (b= it.hasNext()){
            s= it.next();
            System.out.println(s);
        }
        //如果当b=false时依然取出元素程序会抛出异常
    }
}
