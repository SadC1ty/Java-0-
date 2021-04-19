package Demo04;

import java.util.HashSet;

/*
    Set集合不允许存储重复元素的原理
 */
public class Demo03HashSet {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> hashSet = new HashSet<>();

        String s1 = new String("abc");
        String s2 = new String("abc");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("重地");
        hashSet.add("通话");
        hashSet.add("abc");
        System.out.println(hashSet);//[重地, 通话, abc]
    }
}
