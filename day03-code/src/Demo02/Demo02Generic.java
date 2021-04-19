package Demo02;

public class Demo02Generic {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        Generic gc = new Generic();
        gc.setName("Object类型");

        Object s = gc.getName();
        System.out.println(s);

        Generic<String> gc1 =new Generic<>();
        gc1.setName("字符串");

        String str = gc1.getName();
        System.out.println(str);
    }
}
