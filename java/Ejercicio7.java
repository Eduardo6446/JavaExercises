
public class Ejercicio7 {
	public static void main(String[]args) {
		
		for ( int i = 1; i <= 20; i++ )
		  {   // Abre for
		  
			long factor = 1;
			int numero = i;

		  // Este ciclo while calcula el factorial
			while ( 0 < numero )
			{        // Abre while
				factor *= numero--;
			}        // Cierra while

			System.out.printf("\nEl factorial de %d es: %d\n", i, factor );


		  }   // Cierra for

	}    
}
