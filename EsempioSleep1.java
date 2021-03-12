package Pagina121;

public class EsempioSleep1 {
	static int tanti = 2;
	static int attesa = 200;
	private Thread padre;
	private String nome;

	public EsempioSleep1() {
		padre = Thread.currentThread();
	}

	public void run() {
		for (int i = 0; i < tanti; i++) {
			System.out.println("Nuovo thread");
			printNome();
			try {
				Thread.sleep(attesa);
			} catch (InterruptedException e) {
				return;
			}
		}
		System.err.println("\n" + getName() + " finito");
	}

	private String getName() {
		return nome;
	}

	public void printNome() {
		Thread nome = Thread.currentThread();
		if (nome == padre) {
			System.out.println("Thread padre");
		} else {
			if (nome == nome.currentThread()) // if (nome == this)
				System.out.println("Nuovo thread");
			else
				System.out.println("Thread ignoto");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new EsempioSleep1().start();
		for (int i = 0; i < tanti; ++i) {
			System.out.println("Main thread");
			Thread.sleep(attesa);
		}
	}

	private void start() {
		// TODO Auto-generated method stub

	}
}
