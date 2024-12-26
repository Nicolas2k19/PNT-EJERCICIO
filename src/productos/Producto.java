package productos;

public class Producto implements Comparable<Producto> {
	
	private Integer precio;
	private String nombre;
	
	public Integer getPrecio() {
		return precio;
	};
	
	public  void setPrecio(Integer precio) {
		this.precio = precio;
	};
	
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		 this.nombre = nombre;
	}
	
	
	
	
	
	@Override
	public int compareTo(Producto o) {
		if(this.precio> o.precio) return 1;
		if(this.precio < o.precio) return -1;
		return 0;
	}

}
