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

	
	
	@OneToMany(mappedBy="usuario")
	private List<SacarBean> sacar_usuario = new ArrayList<SacarBean>();
	
	public void addSacarUsuario(SacarBean sacar) {
		
		if(!sacar_usuario.contains(sacar)) {
			
			sacar_usuario.add(sacar);
			sacar.setUsuario(this);
		}
	}
	

	

	public List<SacarBean> getSacar_usuario() {
		return sacar_usuario;
	}

	public void setSacar_usuario(List<SacarBean> sacar_usuario) {
		this.sacar_usuario = sacar_usuario;
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
