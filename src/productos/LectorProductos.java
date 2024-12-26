package productos;

import java.util.ArrayList;
import java.util.List;

public class LectorProductos {
	

	/**
	 * Imprime una lista de productos en pantalla
	 * 
	 * **/
	public static void imprimirProducto(List<Producto> productos) {
		for( Producto producto : productos) {
			System.out.println(producto+"\n");
		}
		
		System.out.println("==================================================");
	}
	
	
	
	/**
	 * Carga los productos
	 * 
	 * Coca-cola zero,
	 * Coca-cola,
	 * Shampo sedal,
	 * Frutillas,
	 * 
	 * **/
	public static List<Producto> cargarProductos() {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(crearBebida(20,"Coca-Cola Zero",1.5));
		productos.add(crearBebida(18,"Coca-Cola",1.5));
		productos.add(crearShampo(19,"Shampoo Sedal",500));
		productos.add(crearFruta(64,"Frutillas ","kilo"));
		return productos;	
	}




	private static 	Producto crearBebida(Integer precio,String nombre,double litros) {
		Producto bebida = new Bebida();
		((Bebida)bebida).setPrecio(precio);
		((Bebida)bebida).setNombre(nombre);
		((Bebida)bebida).setLitro(litros);;
		return (bebida);
	}
	
	private static 	Producto crearShampo(Integer precio,String nombre,Integer contenido) {
		Producto shampo = new Shampo();
		((Shampo)shampo).setPrecio(precio);
		((Shampo)shampo).setNombre(nombre);
		((Shampo)shampo).setContenido(contenido);;
		return (shampo);
	}
	
	
	
	private static 	Producto crearFruta(Integer precio,String nombre,String unidad) {
		Producto fruta = new Fruta();
		((Fruta)fruta).setPrecio(precio);
		((Fruta)fruta).setNombre(nombre);
		((Fruta)fruta).setUnidadDeVenta(unidad);;
		return (fruta);
	}
	
	
	
	/**
	 * Devuelve el producto mas caro de una lista de producto
	 * 
	 * **/
	public static 	Producto masCaro(List<Producto> productos) {
		Producto primerProducto = productos.get(0);
		
		for( Producto producto : productos) {
			if(producto.compareTo(primerProducto) ==1) primerProducto = producto;
		}
		
		System.out.println("Producto más caro: " + primerProducto.getNombre() );
	
		return (primerProducto);
	}
	
	
	/**
	 * Devuelve el producto mas barato de una lista de producto
	 * 
	 * **/
	public static 	Producto masbarato(List<Producto> productos) {
		Producto primerProducto = productos.get(0);
		for( Producto producto : productos) {
			if(producto.compareTo(primerProducto) ==-1) primerProducto = producto;
		}
		
		System.out.println("Producto más barato: " + primerProducto.getNombre() );
	
		return (primerProducto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
