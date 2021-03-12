package Pagina118;

public class Priorita extends Thread {
	private String chiSono;

	public Priorita(String nome) {
		setChisei(nome);
	}

	public String getChisei() {
		return chiSono;
	}

	public void setChisei(String nome) {
		chiSono = nome;
	}

	public void run() {
		int conta = 0;
		while (conta < 5000000) {
			conta++;
			if ((conta % 1000000) == 0) {
				System.out.println("Thread #" + chiSono + ", conta = " + conta);
			}
		}
	}

	public static void main(String args[]) {
		Thread TA = new Priorita("IMPORTANTE (10)");
		Thread TB = new Priorita("poco importante");
		TA.setPriority(Thread.MAX_PRIORITY);
		TB.setPriority(Thread.MIN_PRIORITY);
		TA.start();
		TB.start();
	}
}
