import java.util.Scanner;
  
public class Ejercicio2{// Abre la clase
	
	public static void main( String args[] ){// Abre el metodo main
		
		Scanner entrada = new Scanner(System.in);
		 
		int n1;
		int n2;
		 
		System.out.println("\nIntroduzca un entero: ");
		n1 = entrada.nextInt();
		 
		System.out.println("\nIntroduzca un segundo entero: ");
		n2 = entrada.nextInt();
		 
		if ( n1 > n2 )
		System.out.printf("\nEl numero %d es mayor que %d\n", n1, n2);
		 
		if ( n2 > n1 )
		System.out.printf("\nEl numero %d es mayor que %d\n", n2, n1);
		
		else {
			System.out.printf( "Los numeros son iguales \n");
		}
		
	}// Cierra el metodo main
}//cerrar la clase