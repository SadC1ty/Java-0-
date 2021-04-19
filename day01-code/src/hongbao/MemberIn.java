package hongbao;

import java.util.ArrayList;
import java.util.Random;

public class MemberIn extends Member{
    public MemberIn(){

    }

    public MemberIn(String name,int money){
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包随机抽取一个
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
