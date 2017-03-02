import java.util.Scanner;

public class Cerradura {
	
	//Variables
	String nombre;
	int[] bombines;
	
	public Cerradura(int nBomb){
		Scanner entrada = new Scanner(System.in);
		bombines = new int[nBomb];
		
		System.out.println("Introduce el nombre para esta cerradura");
		nombre = entrada.nextLine();
		
		for (int i=0; i<bombines.length; i++){
			System.out.println("Introduce el bombin nº" + (i+1));
			bombines[i] = entrada.nextInt();
		}
	}

	//Getters & Seenders
	public int[] getBombines() {
		return bombines;
	}

	public void setBombines(int[] bombines) {
		this.bombines = bombines;
	}	
}
