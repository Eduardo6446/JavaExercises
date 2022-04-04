import java.util.Scanner;

public class Ejercicio1{// abrir el public class
	 
	public static void main( String args[] ){// Abre metodo main
	  
	  
		Scanner entrada = new Scanner(System.in);

		int n1;
		int n2;
		int suma;
		int producto;
		int diferencia;
		int cociente;
	
		System.out.print("\nEste programa recibe dos numeros y da su producto, cociente, suma y diferencia.\n");
	
		System.out.println("Introduzca el primer entero: ");
		n1 = entrada.nextInt();
	
		System.out.println("Introduzca el segundo entero: ");
		n2 = entrada.nextInt();
	
		suma = n1 + n2;
		diferencia = n1 - n2;
		producto = n1*n2;
	  
		//si pongo el numero menor primero da 0 :u asi que hice eso
	  
		if(n1 > n2) {
			cociente = n1/n2;
		}
		else {
			cociente = n2/n1;
		}
	
		System.out.printf("\nLa suma de los numeros es: %d\n", suma);
		System.out.printf("La diferencia de los numeros es: %d\n", diferencia);
		System.out.printf("El producto de los numeros es: %d\n", producto);
		System.out.printf("El cociente de los numeros es: %d\n", cociente);

		
   }       // Cierra metodo main
 }// Cierre de public class