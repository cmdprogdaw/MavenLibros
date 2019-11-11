package mavenLibros.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ejemplar-usuario")
public class EjemplarUsuarioBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long codigo;
	
	@Column
	private String fecha_prestamo;
	
	@Column
	private String fecha_devolucion;
	
	
}
