/*
 * Bennie
 * NetPay.java
 * This program calculates the net pay for an employee
 * February 27,2018
 */
package netpay;

/**
 *
 * @author huangsiwen
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        double n,w,i,t;
        h=40;
        w=5.00;
        i=2.00;
        t=0.22;
        n=(h*w-i)-t*(h*w-i);
        
        System.out.println("Net Pay is "+n+" dollars");
    }
    
}
