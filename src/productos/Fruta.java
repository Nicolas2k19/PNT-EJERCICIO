package productos;

public class Fruta extends Producto {
	
	private String unidadDeVenta;

	public String unidadDeVenta() {
		// TODO Auto-generated method stub
		return this.unidadDeVenta;
	}
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " /// Precio: $" +this.getPrecio()+ " /// Unidad de venta: "+ this.unidadDeVenta; 
	}
	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	
	
	
}
