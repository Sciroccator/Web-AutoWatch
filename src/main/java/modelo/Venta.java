package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Venta {
	
	private int id ;
	private Usuario usuario;
	private Date fecha;
	private List<Componente> productos;
	private ArrayList<Reloj> relojes;
	private double precio;
	
	public Venta() {
		
	}

	public Venta(Usuario usuario, Date fecha, List<Componente> productos, ArrayList<Reloj> relojes, double precio) {
		
		this.usuario = usuario;
		this.fecha = fecha;
		this.productos = productos;
		this.relojes = relojes;
		this.precio = precio;
	}

	public Venta(int id, Usuario usuario, Date fecha, List<Componente> productos, ArrayList<Reloj> relojes, double precio) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fecha = fecha;
		this.productos = productos;
		this.relojes = relojes;
		this.precio = precio;
	}

	public Venta(Usuario usuario, Date fecha, ArrayList<Reloj> relojes, double precio) {
		
		this.usuario = usuario;
		this.fecha = fecha;
		this.relojes = relojes;
		this.precio = precio;
	}

	public Venta(int id, Usuario usuario, Date fecha, ArrayList<Reloj> relojes, double precio) {
		
		this.id = id;
		this.usuario = usuario;
		this.fecha = fecha;
		this.relojes = relojes;
		this.precio = precio;
	}

	public Venta(Usuario usuario, Date fecha, List<Componente> productos, double precio) {
		
		this.usuario = usuario;
		this.fecha = fecha;
		this.productos = productos;
		this.precio = precio;
	}

	public Venta(int id, Usuario usuario, Date fecha, List<Componente> productos, double precio) {
		
		this.id = id;
		this.usuario = usuario;
		this.fecha = fecha;
		this.productos = productos;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Componente> getProductos() {
		return productos;
	}

	public void setProductos(List<Componente> productos) {
		this.productos = productos;
	}

	public ArrayList<Reloj> getRelojes() {
		return relojes;
	}

	public void setRelojes(ArrayList<Reloj> relojes) {
		this.relojes = relojes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", usuario=" + usuario + ", fecha=" + fecha + ", productos=" + productos
				+ ", relojes=" + relojes + ", precio=" + precio + "]";
	}
	
	
	

}
