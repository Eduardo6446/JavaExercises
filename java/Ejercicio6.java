
public class Ejercicio6 {
	
	public static void main(String[]args) {
		int producto = 1;
		System.out.println("\nEste programa calcula el producto de los enteros impares del 1 al 15"); 

	    for ( int i = 1; i <= 15; i++ )
	    {           // Abre for

	        if( i % 2 != 0 )
	            producto *= i;

	    }           // Cierra for
	    
	    System.out.printf("\nEl producto es: %d\n", producto );

	}    

}
