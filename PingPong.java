package Pagina123;

public class PingPong {
	public static void main(String args[]){
		Thread thr1 = new Thread(new Racchetta ("ping"));
		thr1.start();
		
		Thread thr2 = new Thread(new Racchetta("pong"));
		thr2.start();
	}
}
