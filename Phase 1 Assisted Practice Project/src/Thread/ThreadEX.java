package Thread;
public class ThreadEX extends Thread {  
	public void run(){
		System.out.println("Hii User!");
	}
	public static void main(String[] args) {
		ThreadEX dc=new ThreadEX();
		dc.start();
	}
}
