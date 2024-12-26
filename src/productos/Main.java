package productos;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Producto> productos = LectorProductos.cargarProductos();
		LectorProductos.imprimirProducto(productos);
		LectorProductos.masCaro(productos);
		LectorProductos.masbarato(productos);
	}

}
