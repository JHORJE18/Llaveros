import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
	
	//Cargamos diseños de estetica
	static ArrayList <Llave> llaves = new ArrayList <Llave>();
	static ArrayList <Cerradura> cerraduras = new ArrayList <Cerradura>();
	static estetica ds = new estetica();
	static boolean salir = false;
	
	public static void main (String[] args){
		ds.credito();
			while (!salir){
				menu();
				ds.limpiarln(25);
			}
		ds.credito();
	}
	
	public static void menu(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce lo que deseas realizar");
		System.out.println("1. Registrar Llavero / Cerradura");
		System.out.println("2. Consultar compatiblidad llavero y cerradura");
		System.out.println("3. Eliminar Llavero / Cerradura");
		System.out.println("4. Salir del programa");
		int escrito = entrada.nextInt();
		
		switch(escrito){
		case 1:
			registrar();
			break;
		case 2:
			consultar();
			break;
		case 3:
			eliminar();
			break;
		case 4:
			if (confirmar("salir del programa")){	salir = true;	}
			break;
		default:
			System.out.println("El numero introducido no es valido");
			break;
		}
	}

	public static void registrar(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Que quieres registrar?");
		System.out.println("1. Nueva llave");
		System.out.println("2. Nueva cerradura");
		System.out.println("3. Volver a atras");
		int escrito = entrada.nextInt();
		
		switch(escrito){
		case 1:
			System.out.println("¿Cuantos pines tiene la llave que quieres registrar?");
			int pines = entrada.nextInt();
			int[] llaveTEMP = new int[pines];
			//Añadimos nueva llave
			llaves.add(new Llave(pines));
			
			System.out.println("Has registrado una llave: " + llaves.get(llaves.size()-1).nombre + ", con " + llaves.get(llaves.size()-1).pines.length + " pines");
			break;
		case 2:
			System.out.println("¿Cuantos bombines tiene la cerradura que quieres registrar?");
			int bombines = entrada.nextInt();
			int[] cerraduraTEMP = new int[bombines];
			//Añadimos nueva llave
			cerraduras.add(new Cerradura(bombines));
			
			System.out.println("Has registrado una cerradura: " + cerraduras.get(cerraduras.size()-1) + ", con " + cerraduras.get(cerraduras.size()-1).bombines.length + " bombines");
			break;
		}
	}
	
	public static void consultar(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos a consultar la compatiblidad entre una llave y cerradura");
		System.out.println("Selecciona cual de estas llaves quieres comprobar");
		mostrar(1,llaves.size());
		int llaveSEL = entrada.nextInt();
		System.out.println("Selecciona cual de estas cerraduras quieres comprobar");
		mostrar(2, cerraduras.size());
		int cerraduraSEL = entrada.nextInt();
		
		//Restamos valores a valores reales
		llaveSEL--;
		cerraduraSEL--;
		
	}
	
	public static void eliminar(){
		System.out.println("Eliminando llave / cerrojo");
	}
	
	public static void mostrar(int ver, int num){
		switch (ver){
		case 1:
			//Ver llaves
			for (int i=0; i<num; i++){
				ds.limpiarln(25);
				System.out.println("Numero de llave: " + (1+i));
				System.out.println("Nombre llave: " + llaves.get(i).nombre);
				System.out.println("Nº pines: " + llaves.get(i).pines.length);
				
				//Imprimir pines
				int largo = llaves.get(i).pines.length * 4;
				ds.limpiarSM("#", largo);
				System.out.println("");
				for (int b=0; b<llaves.get(i).pines.length;b++){
					System.out.print(b+1 + " | ");
				}
				System.out.println("");
				for (int b=0; b<llaves.get(i).pines.length;b++){
					System.out.print(llaves.get(i).pines[b] + " | ");
				}
				System.out.println("");
				ds.limpiarSM("#", largo);
				System.out.println("");
			}
			ds.limpiarln(25);
			break;
		case 2:
			//Ver cerrojos
			for (int i=0; i<num; i++){
				ds.limpiarln(25);
				System.out.println("Numero de cerradura: " + (i+1));
				System.out.println("Nombre cerradura: " + cerraduras.get(i).nombre);
				System.out.println("Nº bombines: " + cerraduras.get(i).bombines.length);
				
				//Imprimir bombines
				int largo = cerraduras.get(i).bombines.length * 4;
				ds.limpiarSM("#", largo);
				System.out.println("");
				for (int b=0; b<cerraduras.get(i).bombines.length;b++){
					System.out.print(b+1 + " | ");
				}
				System.out.println("");
				for (int b=0; b<cerraduras.get(i).bombines.length;b++){
					System.out.print(cerraduras.get(i).bombines[b] + " | ");
				}
				System.out.println("");
				ds.limpiarSM("#", largo);
				System.out.println("");
			}
			ds.limpiarln(25);
			break;
		}
	}
	
	public static boolean confirmar(String mensaje){
		Scanner entrada = new Scanner(System.in);
		
		boolean valido = false;
		while (!valido){
			System.out.println("¿Estas seguro de que quieres " + mensaje + "?");
			System.out.println("1. Si, quiero " + mensaje);
			System.out.println("2. No quiero " + mensaje);
			int escrito = entrada.nextInt();
			
			if (escrito == 1){
				valido = true;
				return true;
			}	else if (escrito == 2){
				valido = true;
				return false;
			}
		}
		return valido;
	}
}
