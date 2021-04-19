package hongbao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Leader one = new Leader("群主",10000);

        MemberIn a = new MemberIn("A",0);
        MemberIn b = new MemberIn("B",0);
        MemberIn c = new MemberIn("C",0);

        one.show(); //10000
        a.show();   //0
        b.show();   //0
        c.show();   //0
        System.out.println("=====");
        ArrayList<Integer> redList = one.sendPackage(2000,3);
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);
        one.show(); //8000
        a.show();   //666   随机获取
        b.show();   //668
        c.show();   //666

    }
}
