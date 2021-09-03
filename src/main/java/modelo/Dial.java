package modelo;

public class Dial extends Componente{
	
	
	private int id;

	public Dial() {
		super();
	}

	public Dial(String color,String modelo,double precio,String imagen,int stock) {
		super(color,modelo,imagen,precio,stock);
	}

	public Dial(int id,String color,String modelo,double precio,String imagen,int stock) {
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
		return "Dial [id=" + id + "]";
	}
	
	
	
	
	
}
