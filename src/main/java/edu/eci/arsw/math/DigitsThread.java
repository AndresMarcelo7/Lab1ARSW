/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

/**
 *
 * @author andres.marcelo
 */
public class DigitsThread implements Runnable{
    int firstDigit;
    int lastDigit;
    int totalDigits;
    byte[] rta;
    public DigitsThread(int a, int b){
        this.firstDigit=a;
        this.lastDigit=b;
    }

    @Override
    public void run() {
        rta = PiDigits.getDigits(firstDigit,lastDigit);
    }

    public byte[] getRta() {
        return rta;
    }
    
    
    
    
}
