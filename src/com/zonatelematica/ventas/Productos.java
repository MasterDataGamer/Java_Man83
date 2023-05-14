package com.zonatelematica.ventas;

public class Productos {

	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;

	private Productos() {
		this.idProducto = ++Productos.contadorProductos;

	}

	public Productos(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	


}
