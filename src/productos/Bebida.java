package productos;

public class Bebida  extends Producto{
	
	Double litro;

	
	public Double obtenerCapacidadLitro() {
		// TODO Auto-generated method stub
		return this.litro;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " /// Litros: " +this.litro + " /// Precio: $" +this.getPrecio();
	}

	public void setLitro(Double litro) {
		this.litro = litro;
	}

	
	

	
	
}
