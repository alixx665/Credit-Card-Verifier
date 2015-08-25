/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credit.card.verifier;

/**
 *
 * @author ali
 */
public class CreditCard {
    int cardnumber;
    public CreditCard(int c){
        cardnumber = c;
    }
    public int algor(){
        String number = String.valueOf(cardnumber);
        char[] digits = number.toCharArray();
        int a = (int)(Character.getNumericValue(digits[0])*2);
        if(a >= 10){
            String value = String.valueOf(a);
            char[] values = value.toCharArray();
            a = (int)(Character.getNumericValue(values[0]) + Character.getNumericValue(values[1]));
        }
        int b = (int)(Character.getNumericValue(digits[1]));
        int c = (int)(Character.getNumericValue(digits[2])*2);
        if(c >= 10){
            String value = String.valueOf(c);
            char[] values = value.toCharArray();
            c = (int)(Character.getNumericValue(values[0]) + Character.getNumericValue(values[1]));
        }
        int d = (int)(Character.getNumericValue(digits[3]));
        return a + b + c + d;
    }
    
}
