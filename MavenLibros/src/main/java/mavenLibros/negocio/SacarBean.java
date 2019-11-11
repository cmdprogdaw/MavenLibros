package mavenLibros.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ejemplar_usuario")
public class SacarBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long sacar;
	
	@Column
	private String fecha_prestamo;
	
	@Column
	private String fecha_devolucion;

	
	
	@ManyToOne
	@JoinColumn(name="FK_ejemplar")
	private EjemplarBean ejemplar;
	
	
	@ManyToOne
	@JoinColumn(name="FK_usuario")
	private UsuarioBean usuario;
	
	

	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public EjemplarBean getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(EjemplarBean ejemplar) {
		this.ejemplar = ejemplar;
	}

	public long getSacar() {
		return sacar;
	}

	public void setSacar(long sacar) {
		this.sacar = sacar;
	}

	public String getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(String fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public String getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(String fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}
	
	
	
	
}
