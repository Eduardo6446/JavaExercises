import java.util.Scanner;

public class PruebaFactura{
	public static void main (String[]args)
	{
		String numeroPieza = null;
		String descripcionPieza = null;
		int cantidadPieza = 0;
		double precioPieza = 0.0;
		
		Factura fact = new Factura(numeroPieza,descripcionPieza, cantidadPieza, precioPieza, precioPieza);
		
		char respuesta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("---------------BIENVENIDO---------------");
		
		do {
			System.out.println("ingrese el numero de pieza: ");
			numeroPieza = entrada.next();
			
			System.out.println("ingrese la descripcion de la pieza: ");
			descripcionPieza = entrada.next();
			
			System.out.println("ingrese la cantidad: ");
			cantidadPieza = entrada.nextInt();
			
			System.out.println("ingrese el precio de pieza: ");
			precioPieza = entrada.nextDouble();
			
			fact.obtenerMontoFactura(cantidadPieza, precioPieza);
			
			System.out.println("Desea ingresar otro producto?");
			respuesta = entrada.next().charAt(0);
			
		}while(respuesta == 's');
		
		System.out.println("EL precio total es de: " + fact.montoFactura);
		
		
	
	}
}