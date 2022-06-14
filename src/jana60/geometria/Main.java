package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Rettangolo uno = new Rettangolo();
		
		
		
		System.out.println("Inserisci la base del rettangolo: ");
		uno.base = scan.nextInt();
		System.out.println("Inserisci l'altezza del rettangolo: ");
		uno.altezza = scan.nextInt();
		
		
		
		System.out.println("L'area del rettangolo è " + uno.area() + ", mentre il perimetro è " + uno.perimetro());
		scan.close();
	}

}
