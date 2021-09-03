package modelo;

public class Agujas extends Componente {
	
	private int id;

	public Agujas() {
		super();
	}

	public Agujas(String color,String modelo,double precio,String imagen,int stock) {
		super(color,modelo,imagen,precio,stock);
	}
	public Agujas(int id,String color,String modelo,double precio,String imagen,int stock) {
		super(color,modelo,imagen,precio,stock);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Agujas [id=" + id + "]";
	}
	
	
	

}
