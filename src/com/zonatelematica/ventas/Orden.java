package com.zonatelematica.ventas;

public class Orden {

	private int idOrden;
	private Productos productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;

	public Orden() {

		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Productos[Orden.MAX_PRODUCTOS];

	}

	public void agregarProductos(Productos producto) {
		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {

			this.productos[this.contadorProductos++] = producto;

		} else {

			System.out.println("Se ha superado la cantidad maxima de productos: " + Orden.MAX_PRODUCTOS);

		}

	}

	public double calcularTotal() {

		double total = 0;
		int i = 0;
		for (i = 0; i < this.contadorProductos; i++) {
			// Productos productos = this.productos[i];
			// total += productos.getPrecio(); //total
			total += this.productos[i].getPrecio();
		}
		return total;

	}
	
	public void mostrarOrden() {
		
		System.out.println("El Id de la orden es: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("El total de la orden: $" + totalOrden);
		System.out.println("Productos de la orden: ");
		
		for(int i = 0; i < this.contadorProductos ; i++) {
			System.out.println(this.productos[i]);
				
		}
		
	}

}
