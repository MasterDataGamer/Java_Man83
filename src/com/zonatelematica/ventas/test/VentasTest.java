package com.zonatelematica.ventas.test;

import com.zonatelematica.ventas.*;

public class VentasTest {

	public static void main(String[] args) {
		Productos producto_1 = new Productos("Camisa", 200.00);
		Productos producto_2 = new Productos("Pantalon", 400.00);
		Productos producto_3 = new Productos("Blusa", 120.00);
		Productos producto_4 = new Productos("Zapatos", 350.00);
		 
		Orden orden_1 = new Orden();
		orden_1.agregarProductos(producto_1);
		orden_1.agregarProductos(producto_2);
		orden_1.mostrarOrden();
		
		Orden orden_2 = new Orden();
		orden_2.agregarProductos(producto_3);
		orden_2.agregarProductos(producto_4);
		orden_2.mostrarOrden();
		

	}

}
