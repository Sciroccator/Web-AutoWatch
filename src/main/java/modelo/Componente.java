package modelo;

public class Componente {
	
	
	private String color;
	private String modelo;
	private String imagen;
	private double precio;
	private int stock;
	public Componente() {
	
	}
	public Componente(String color, String modelo, String imagen, double precio ,int stock) {
	
		this.color = color;
		this.modelo = modelo;
		this.imagen = imagen;
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Componente [color=" + color + ", modelo=" + modelo + ", imagen=" + imagen + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
}
