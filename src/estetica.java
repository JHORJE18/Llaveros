
public class estetica {
	
	public void limpiarln(int lineas){
		for (int i=0; i<lineas; i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	
	public void limpiar(int lineas){
		for (int i=0; i<lineas; i++){
			System.out.print("-");
		}
	}
	
	public void credito(){
		limpiarln(25);
		
		limpiar(5);
		System.out.print("Jorge López Gil");
		limpiarln(5);
		
		limpiarln(25);
	}
}
