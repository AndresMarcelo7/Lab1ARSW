package arsw.threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Un galgo que puede correr en un carril
 *
 * @author rlopez
 *
 */
public class Galgo extends Thread {
	private int paso;
	private Carril carril;
	RegistroLlegada regl;
	boolean paused;

	public Galgo(Carril carril, String name, RegistroLlegada reg) {
		super(name);
		this.carril = carril;
		paso = 0;
		this.regl=reg;
		paused=false;
	}

	public void corra() throws InterruptedException {
		while (paso < carril.size()) {
			Thread.sleep(100);
			carril.setPasoOn(paso++);
			carril.displayPasos(paso);

			if (paso == carril.size()) {
				carril.finish();
				int ubicacion=regl.getAndIncrement();

				System.out.println("El galgo "+this.getName()+" llego en la posicion "+ubicacion);
				if (ubicacion==1){
					regl.setGanador(this.getName());
				}

			}
			synchronized (this) {
				while (paused) {
					wait();
				}
			}
		}
	}
	public synchronized void detengase(){
		paused= true;
		notifyAll();
	}
	public synchronized void alistese(){
		paused=false;
		notifyAll();
	}
	@Override
	public void run() {

		try {
			corra();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}