import java.util.*;

/**
 * Created by Free-House on 2015/11/21.
 */

public class Collection{
	public static void main(String[] args){
//ListDemo
        //ArrayList
        List<Integer> alist =new ArrayList<Integer>();
        alist.add(new Integer(3));
        alist.add(new Integer(2));
        alist.add(new Integer(1));

        System.out.println("List");
        System.out.println("��ʼ����");
        for(Integer l :alist){System.out.print(l+"  ");}

        alist.remove(new Integer(2));

        System.out.println();
        System.out.println("ɾ�ļ���");
        for(Integer l :alist){System.out.print(l+"  ");}

	System.out.println();
	System.out.println("����");
	System.out.println(alist.indexOf(new Integer(2) ));
	System.out.println("��ȡ");
	System.out.println(alist.get(new Integer(1) ));
        //LinkedListΪ�������м��ַ���
//HashMap
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"LingXiaoXueZhang");
        hm.put(2,"ZiYiXueZhang");

        System.out.println();
	System.out.println("HashMap");
        System.out.println("���󼯺�");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

        hm.put(1, "LingXiaoXueJie");
        System.out.println("��ȷ����");
        for(Integer i :hm.keySet()){System.out.println(hm.get(i)+"  ");}

    }}