/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread implements Runnable{
    int start;
    int end;
    /**
     * Constructor CountThread 
     * @param start inicio del intervalo
     * @param end   fin del intervalo
     */
    public CountThread(int start, int end){
        this.start=start;
        this.end=end;
    }
    
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    @Override
    public void run() {
        for (int i=start; i<=end;i++){
            System.out.println(i);
        }
        
    }
    
    
    
    
    
    
    
    
    
}
