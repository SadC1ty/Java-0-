import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> dis = new ArrayList<>();
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            dis.add(num);
        }
        print(dis,N);
    }

    public static void print(List<Integer> list,int n){
        int dis = n-1;
        List<Integer> count = new ArrayList<>();
        int dis_t=1;
        int i_i=0;
        method(list,dis,i_i,dis_t,count);
        int temp = count.get(0);
        for(int i :count){
            temp = Math.min(temp,i);
        }
        System.out.println(temp);
    }
    public static int method(List<Integer> list,int dis,int i,int dis_t,List<Integer> count){
        for(;i<list.size();i++){
            if(list.get(i)>=dis){
                dis_t++;
                count.add(dis_t);
                dis_t=1;
            }
            else{
                dis-=list.get(i);
                int j = i+1;
                return method(list,dis,j,dis_t,count);
            }
        }
        return 0;
    }
}