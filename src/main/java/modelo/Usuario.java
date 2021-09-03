package modelo;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private String telefono;
	private String direccion;
	private String provincia;
	private String pais;
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String apellidos, String email, String password, String telefono, String direccion,
			String provincia, String pais) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.direccion = direccion;
		this.provincia = provincia;
		this.pais = pais;
	}
	public Usuario(int id, String nombre, String apellidos, String email, String password, String telefono,
			String direccion, String provincia, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.direccion = direccion;
		this.provincia = provincia;
		this.pais = pais;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ ", password=" + password + ", telefono=" + telefono + ", direccion=" + direccion + ", provincia="
				+ provincia + ", pais=" + pais + "]";
	}
	

}
