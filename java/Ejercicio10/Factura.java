public class Factura{
	String numeroPieza;
	String descripcionPieza;
	int cantidadPieza;
	double precioPieza;
	double montoFactura;
	
	public Factura(String numeroPieza, String descripcionPieza, int cantidadPieza, double precioPieza, double montoFactura) {
		this.numeroPieza = numeroPieza;
		
		this.descripcionPieza = descripcionPieza;
		
		this.cantidadPieza = cantidadPieza;
		
		if(precioPieza > 0.0) {
			this.precioPieza = precioPieza;
		}
		
	}
	
	public String getNumeroPieza() {
		return numeroPieza;
	}
	
	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;	
	}
	
	public String getDescripcionPieza() {
		return descripcionPieza;
	}
	
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}
	
	public int getCantidadPiezas() {
		return cantidadPieza;
	}
	
	public void setCantidadPieza(int cantidadPiezas) {
		this.cantidadPieza = cantidadPieza;
	}
	
	public double getPrecioPieza() {
		return precioPieza;
	}
	
	public void setPrecioPieza(double precioPieza) {
		this.precioPieza = precioPieza;
	}
	
	public double obtenerMontoFactura(int cantidadPieza, double precioPieza) {
		this.montoFactura += cantidadPieza * precioPieza;
		return this.montoFactura;
	}
	
	
}