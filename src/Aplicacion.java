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
		System.out.println("Consulatando compatiblidad");
	}
	
	public static void eliminar(){
		System.out.println("Eliminando llave / cerrojo");
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
