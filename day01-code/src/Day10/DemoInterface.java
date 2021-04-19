package Day10;
import netscape.javascript.JSUtil;

import java.util.ArrayList;
import java.util.List;
/*
java.util.list正是ArrayList实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边接口名称,右边实现类名称,多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addName(List<String> list){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        return list;
    }
}
