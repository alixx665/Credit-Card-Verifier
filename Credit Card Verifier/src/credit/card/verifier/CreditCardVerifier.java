/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit.card.verifier;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class CreditCardVerifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Credit Card Verifier");
        System.out.println("WE WILL NOT STORE YOUR CREDIT CARD NUMBER");
        System.out.println("Enter first 4 digits of credit card");
        int cardA = scan.nextInt();
        System.out.println("Enter next 4 digits of credit card");
        int cardB = scan.nextInt();
        System.out.println("Enter next 4 digits of credit card");
        int cardC = scan.nextInt();
        System.out.println("Enter last 4 digits of credit card");
        int cardD = scan.nextInt();
        CreditCard card1 = new CreditCard(cardA);
        CreditCard card2 = new CreditCard(cardB);
        CreditCard card3 = new CreditCard(cardC);
        CreditCard card4 = new CreditCard(cardD);
        int val1 = card1.algor();
        int val2 = card2.algor();
        int val3 = card3.algor();
        int val4 = card4.algor();
        int ver = val1 + val2 + val3 + val4;
        boolean check = verify(ver);
        if(check == true){
            System.out.println("Credit Card Number is Valid!");
        }
        else{
            System.out.println("Credit Card Number is NOT Valid!");
        }
    }
    public static boolean verify(int v){
        if(v % 10 == 0){
            return true;
        }
        return false;
    }
}
