package Pagina124;

public class Aspettali implements Runnable {
	String mioNome;
	int tempoDormi;

	Aspettali(String chiSono, int quanto) {
		mioNome = chiSono;
		tempoDormi = quanto;
	}

	public void run() {
		try {
			System.out.println("il thread " + mioNome + " ora si sospende");
			Thread.sleep(tempoDormi);
			System.out.println("il thread " + mioNome
					+ " si sveglia e termina ");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		return;
	}
}
