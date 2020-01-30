package edu.eci.arsw.primefinder;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrimeFinderThread extends Thread{

	
	int a,b,veces;

    public int getVeces() {
        return veces;
    }

    public void setVeces(int veces) {
        this.veces = veces;
    }
	boolean suspender;
    public boolean isSuspender() {
        return suspender;
    }

    public void setSuspender(boolean suspender) {
        this.suspender = suspender;
    }
	private List<Integer> primes=new LinkedList<Integer>();
	
	public PrimeFinderThread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
                this.veces=0;
                
                
	}

	public void run(){
                long startTime= System.currentTimeMillis();
                boolean flag =false;
		for (int i=a;i<=b;i++){	
                        synchronized(this){
                            while (isSuspender()){
                                try {
                                    wait();                                
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(PrimeFinderThread.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }

			if (isPrime(i)){                            
				primes.add(i);
				System.out.println(i);
                this.veces+=1;
			}                        
		}
		
		
	}
	
	boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public List<Integer> getPrimes() {
		return primes;
	}

    synchronized void despertar() {
        this.suspender=false;
        notify();
    }
	
	
	
	
}
