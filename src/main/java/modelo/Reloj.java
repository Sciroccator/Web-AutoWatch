package modelo;

public class Reloj {
	
	private int id;
	private String marca;
	private String modelo;
	private String mecanismo;
	private Dial dial;
	private Bisel bisel;
	private Agujas agujas;
	private Caja caja;
	private Brazalete brazalete;
	
	
	public Reloj() {
		
	}


	public Reloj(String marca, String modelo, String mecanismo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.mecanismo = mecanismo;
	}


	public Reloj(int id, String marca, String modelo, String mecanismo) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.mecanismo = mecanismo;
	}


	public Reloj(String marca, String modelo, String mecanismo, Dial dial, Bisel bisel, Agujas agujas, Caja caja,
			Brazalete brazalete) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.mecanismo = mecanismo;
		this.dial = dial;
		this.bisel = bisel;
		this.agujas = agujas;
		this.caja = caja;
		this.brazalete = brazalete;
	}


	public Reloj(int id, String marca, String modelo, String mecanismo, Dial dial, Bisel bisel, Agujas agujas,
			Caja caja, Brazalete brazalete) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.mecanismo = mecanismo;
		this.dial = dial;
		this.bisel = bisel;
		this.agujas = agujas;
		this.caja = caja;
		this.brazalete = brazalete;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMecanismo() {
		return mecanismo;
	}


	public void setMecanismo(String mecanismo) {
		this.mecanismo = mecanismo;
	}


	public Dial getDial() {
		return dial;
	}


	public void setDial(Dial dial) {
		this.dial = dial;
	}


	public Bisel getBisel() {
		return bisel;
	}


	public void setBisel(Bisel bisel) {
		this.bisel = bisel;
	}


	public Agujas getAgujas() {
		return agujas;
	}


	public void setAgujas(Agujas agujas) {
		this.agujas = agujas;
	}


	public Caja getCaja() {
		return caja;
	}


	public void setCaja(Caja caja) {
		this.caja = caja;
	}


	public Brazalete getBrazalete() {
		return brazalete;
	}


	public void setBrazalete(Brazalete brazalete) {
		this.brazalete = brazalete;
	}


	@Override
	public String toString() {
		return "Reloj [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", mecanismo=" + mecanismo + ", dial="
				+ dial + ", bisel=" + bisel + ", agujas=" + agujas + ", caja=" + caja + ", brazalete=" + brazalete
				+ "]";
	}
	
		

}
