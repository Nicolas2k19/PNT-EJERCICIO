package productos;

public class Shampo extends Producto {
	
	
	private Integer contenido;

	public Integer getContenido() {
		// TODO Auto-generated method stub
		return this.contenido;
	}
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " /// Contenido: "+ this.contenido +"ml /// Precio: $" +this.getPrecio(); 
	}
	
	public void setContenido(Integer contenido) {
		this.contenido = contenido;
	}
	
	
	
}
