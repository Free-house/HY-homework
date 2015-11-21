import java.util.*;

public class Collection{
    public static void main(String[] args){
//ListDemo
        //ArrayList
        List<Integer> alist =new ArrayList<Integer>();
        alist.add(new Integer(3));
        alist.add(new Integer(2));
        alist.add(new Integer(1));

        System.out.println();
        System.out.println("初始集合");
        for(Integer l :alist){System.out.print(l+"  ");}

        alist.remove(new Integer(2));

        System.out.println();
        System.out.println("删改集合");
        for(Integer l :alist){System.out.print(l+"  ");}
        //LinkedList如同ArrayList，另独有几种方法
//HashMap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"LingXiaoXueZhang");
        hm.put(2,"ZiYiXueZhang");

        System.out.println();
        System.out.println("错误集合");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

        hm.put(1, "LingXiaoXueJie");
        System.out.println("正确集合");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

    }}