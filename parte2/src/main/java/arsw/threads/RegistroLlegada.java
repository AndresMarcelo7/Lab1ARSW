package arsw.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class RegistroLlegada {

	private AtomicInteger ultimaPosicionAlcanzada= new AtomicInteger(1);

	private String ganador=null;
	
	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public synchronized AtomicInteger getUltimaPosicionAlcanzada() {
		return ultimaPosicionAlcanzada;
	}

	public synchronized void setUltimaPosicionAlcanzada(int ultimaPosicionAlcanzada) {
		this.ultimaPosicionAlcanzada = new AtomicInteger(ultimaPosicionAlcanzada);
	}

	public int getAndIncrement (){
		return ultimaPosicionAlcanzada.getAndIncrement();
	}
	public int getAndDecrement (){
		return ultimaPosicionAlcanzada.getAndDecrement();
	}


	
	
}
