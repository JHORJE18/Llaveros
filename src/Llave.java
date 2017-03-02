import java.util.Scanner;

public class Llave {
	
	//Variables
	String nombre;
	int[] pines;
	
	public Llave(int numero) {
		Scanner entrada = new Scanner(System.in);
		pines = new int[numero];
		
		System.out.println("Introduce el nombre para esta llave");
		nombre = entrada.nextLine();
		
		for (int i=0; i<pines.length; i++){
			System.out.println("Introduce el pin nº" + (i+1));
			pines[i] = entrada.nextInt();
		}
	}
}
