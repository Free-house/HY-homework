public class ThreadDemo extends Thread{
	public static void main(String[] args){
		ThreadDemo main = new ThreadDemo();
		Ithread it =new Ithread();
		Thread t=new Thread(it);

		//t.setPriority(Thread.MAX_PRIORITY);
		//main.setPriority(Thread.MIN_PRIORITY);

		//main.run();
		t.start();
		t.run();
	
		System.out.println("��ô�ɰ���ô������Ů��ֽ");
	}

	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println("������ѧ��");
			yield();//sleep(100)
		}
	}
}
class Ithread implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println("������ѧ��*"+i);
			Thread.yield();//sleep(100)
		}
	}
}
//ͬ���������Ǻܶ����벻����ͬ�����ѵ�Ҫ˵ѧ���Ǹ���= =),ѧ���ٿ۵�֣�ôô�գ�^3^)