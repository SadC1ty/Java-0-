package hongbao;

import java.util.ArrayList;

public class Leader extends Member{
    public Leader(){
    }

    public Leader(String name,int money){
        super(name,money);
    }

    public ArrayList<Integer> sendPackage(int totalMoney,int count){
        //首先需要一个集合，用于存储红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();
        //群主的余额
        int leftMoney = super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redlist;//返回空集合
        }
        //重设余额
        super.setMoney(leftMoney-totalMoney);

        //发红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;   //余数

        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last = avg+mod;
        redlist.add(last);
        return redlist;
    }
}
