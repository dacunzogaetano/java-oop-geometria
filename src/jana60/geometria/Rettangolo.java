package jana60.geometria;

public class Rettangolo {
	
	//attributi rettangolo
	
	int base;
	int altezza;
	
	//metodi rettangolo
	//area
	int area() {
		return base * altezza;
	}
	//perimetro
	int perimetro() {
		return (base + altezza) * 2;
	}

}
