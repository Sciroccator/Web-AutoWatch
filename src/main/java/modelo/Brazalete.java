package modelo;

public class Brazalete extends Componente {
	
	private int id;
	private String material;
	public Brazalete() {
		super();
	}
	public Brazalete(String color, String modelo,double precio ,String imagen ,int stock) {
		super(color,modelo,imagen,precio,stock);
	}
	public Brazalete(int id,String color, String modelo,double precio ,String imagen ,int stock ,String material) {
		super(color,modelo,imagen,precio,stock);
		this.id= id;
		this.material = material;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Brazalete [id=" + id + ", material=" + material + "]";
	}
	
	
}
