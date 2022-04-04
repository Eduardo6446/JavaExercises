import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String arg[])
	{          // Abre metodo main
		Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
		int mayor;
		int menor;
		 
		System.out.println("Introduzca el primer numero:");
		n1 = entrada.nextInt();
		  
		System.out.println("Introduzca el segundo numero:");
		n2 = entrada.nextInt();
		 
		mayor = n1;
		menor = n2;
		 
		if ( n2 > n1 )
		{          // Abre if
		mayor = n2;
		menor = n1;
		}          // Cierra if
	
		if ( 0 == mayor % menor )
		System.out.printf("\nEl numero %d es multiplo del numero %d\n", mayor, menor);
		 
		if ( 0 != mayor % menor )
		System.out.println("\nLos numeros no son multiplos.");
	 
	}     //cerramos metodo   
}
