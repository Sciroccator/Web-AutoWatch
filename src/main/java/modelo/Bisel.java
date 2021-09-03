package modelo;

public class Bisel extends Componente{

	
	private int id;

	public Bisel() {
		super();
	}

	public Bisel(String color,String modelo,double precio,String imagen,int stock) {
		super(color,modelo,imagen,precio,stock);
	}
	
	public Bisel(int id, String color,String modelo,double precio,String imagen,int stock) {
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
		return "Bisel [id=" + id + "]";
	}
	
	
	
}
