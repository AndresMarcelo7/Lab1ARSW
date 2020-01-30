
package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
                int ini = 0;
                long startTime= System.currentTimeMillis();
                ArrayList<PrimeFinderThread> hilos= new ArrayList<PrimeFinderThread>(); 
		for (int threads = 0; threads <=2; threads++){
                    PrimeFinderThread pft=new PrimeFinderThread(ini, ini+9999999);
                    ini += 10000000;
                    pft.start();
                    hilos.add(pft);
                    //Si se desean imprimir los numeros primos en orden desdpcumetar la linea siguiente
                    
                    //pft.join();
                }
                while(true){
                    int v=0;
                    boolean flag = true;
                    if (System.currentTimeMillis() - startTime >= 5000){
                        for (PrimeFinderThread hilo:hilos){
                            hilo.setSuspender(true);
                            v+=hilo.getVeces();
                        }                      
                        System.out.println("Numero de primos encontrados: "+Integer.toString(v));
                        System.out.println("Presione enter para continuar...");
                        Scanner entrada = new Scanner(System.in);
                        entrada.nextLine();
                        for (PrimeFinderThread hilo:hilos){
                            hilo.despertar();
                        }
                        startTime= System.currentTimeMillis();
                        for (PrimeFinderThread hilo:hilos){
                            if (hilo.isAlive()){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            break;


                        }
                    }
                }
		
		
		
	}
	
}
