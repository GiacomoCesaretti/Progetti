package Pagina123;

public class Racchetta implements Runnable {
	String pallina;

	public Racchetta(String pallina) {
		this.pallina = pallina;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(pallina);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			Thread.yield();
		}
	}

}
