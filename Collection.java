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
        System.out.println("��ʼ����");
        for(Integer l :alist){System.out.print(l+"  ");}

        alist.remove(new Integer(2));

        System.out.println();
        System.out.println("ɾ�ļ���");
        for(Integer l :alist){System.out.print(l+"  ");}
        //LinkedList��ͬArrayList������м��ַ���
//HashMap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"LingXiaoXueZhang");
        hm.put(2,"ZiYiXueZhang");

        System.out.println();
        System.out.println("���󼯺�");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

        hm.put(1, "LingXiaoXueJie");
        System.out.println("��ȷ����");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

    }}