package ejerciciosOperadores;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* Los operadores lógicos se utilizan para combinar valores booleanos y nos devuelve un resultado verdadero, falso o nulo. */
	  
	 // && and (Y)
	 // || or (O)
	 // ! not || 
	
		int a = 5;
		int b = 3;
		
		System.out.println(a == b || a > b);
		
		
	//Ejercicio para ver si un número es par
		
int numEvaluar = 100;
		
		if(numEvaluar % 2 == 0) {
			System.out.println("El numero ingresado: " + numEvaluar + " es par");
		} else {
			System.out.println("El numero ingresado: " + numEvaluar + " No es par");
		}
		
	}

}
