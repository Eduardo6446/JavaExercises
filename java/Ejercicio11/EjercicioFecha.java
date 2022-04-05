

import java.util.Date;
public class EjercicioFecha {
	private int mes;
	private int dia;
	private int a�o;
	
	
	public EjercicioFecha() {
		
	}
	
	public EjercicioFecha (int mes, int dia, int a�o) {
		this.mes = mes;
		this.dia = dia;
		this.a�o = a�o;
		
	}

	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public int getA�o() {
		return a�o;
	}
	
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	public void mostrarFecha() {
		
		System.out.print( "\nFecha seleccionada: " );
        System.out.print(getDia() + "/" + getMes() + "/" + getA�o());
        
		
	}
	
	@Override
	public String toString() {
		return dia + "\n" + mes + "\n" + a�o + "\n";
	}
}
