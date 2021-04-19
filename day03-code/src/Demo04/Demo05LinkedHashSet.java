package Demo04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表,多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("edf");
        System.out.println(set);//无序:[abc, www, edf]

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("sadc1ty");
        linkedHashSet.add("cn");
        System.out.println(linkedHashSet);//有序:[www, sadc1ty, cn]
    }
}
