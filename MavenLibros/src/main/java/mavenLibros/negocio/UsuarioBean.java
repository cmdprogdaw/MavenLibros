package mavenLibros.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long cod_usuario;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private int telefono;

	
	@OneToMany
	private List<EjemplarBean> ejemplares = new ArrayList<EjemplarBean>();
	
	
	public List<EjemplarBean> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(List<EjemplarBean> ejemplares) {
		this.ejemplares = ejemplares;
	}

	public long getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(long cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
