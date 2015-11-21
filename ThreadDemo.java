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
	
		System.out.println("这么可爱怎么可能是女孩纸");
	}

	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println("凌霄是学长");
			yield();//sleep(100)
		}
	}
}
class Ithread implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println("凌霄是学姐*"+i);
			Thread.yield();//sleep(100)
		}
	}
}
//同步锁还不是很懂，想不出共同对象（难道要说学姐是个人= =),学姐少扣点分，么么哒（^3^)