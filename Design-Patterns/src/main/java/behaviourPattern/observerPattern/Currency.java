/**
 * 
 */
package behaviourPattern.observerPattern;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yuan yuan=new Yuan();
		
		Dollar dollar=new Dollar();
		
		CurrencyConvert convert=new CurrencyConvert(yuan, dollar);
		
		Scanner sc=new Scanner(System.in);
				
		convert.convertCurrency(120.00);
		sc.close();
	}

}
