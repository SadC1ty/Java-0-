package Day09;
/*
如何知道一个父类引用的对象,本来是什么子类
格式:
对象 instanceof 类名称
这将会得到一个boolean值结果,也就是前面的对象能不能当作后面类型的实例
 */
public class Demo01Instanceof {
    public static void main(String[] args) {
        Fu obj  = new Zi();
        obj.method();

        if(obj instanceof Zi){
            Zi obj1 = (Zi) obj;
            obj1.methodZi();    //子类特有方法
        }
        if (obj instanceof Daughter){
            Daughter obj1 = (Daughter) obj;
            obj1.methodDau();
        }
    }
}
