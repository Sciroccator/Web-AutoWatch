package modelo;

public class Caja extends Componente{
	
	private int id;
	private String material;
	public Caja() {
		super();
	}
	public Caja(String color, String modelo, double precio, String imagen,int stock) {
		super(color,modelo,imagen,precio, stock);
		
	}
	public Caja(int id, String material,String color, String modelo, double precio, String imagen ,int stock) {
		super(color,modelo,imagen,precio, stock);
		this.id = id;
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
		return "Caja [id=" + id + ", material=" + material + "]";
	}
	

}
