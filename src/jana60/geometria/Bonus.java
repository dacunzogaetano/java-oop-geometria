package jana60.geometria;

import java.util.Scanner;

public class Bonus {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rettangolo uno = new Rettangolo();
		int areamagg = 0;
		
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Inserisci la base del " + (i) + " rettangolo: ");
			uno.base = scan.nextInt();
			System.out.print("Inserisci l'altezza del " + (i) + " rettangolo: ");
			uno.altezza = scan.nextInt();
			
			if (uno.area() > areamagg) {
				areamagg = uno.area();
			} 
		}
		
		
		
		
		scan.close();
		
		System.out.println("L'area del rettangolo più grande è " + areamagg);
	}
	
	

}
