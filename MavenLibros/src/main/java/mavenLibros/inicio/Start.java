package mavenLibros.inicio;

import mavenLibros.modelo.autor.CreateAutor;
import mavenLibros.modelo.ejemplar.CreateEjemplar;
import mavenLibros.modelo.libro.CreateLibro;
import mavenLibros.modelo.sacar.CreateSacar;
import mavenLibros.modelo.usuario.CreateUsuario;
import mavenLibros.negocio.AutorBean;
import mavenLibros.negocio.EjemplarBean;
import mavenLibros.negocio.LibroBean;
import mavenLibros.negocio.SacarBean;
import mavenLibros.negocio.UsuarioBean;

public class Start {

	public static void main(String[] args) {

		AutorBean king = new AutorBean();
		king.setNombre("Stephen King");
		
		LibroBean it = new LibroBean();
		it.setTitulo("IT");
		it.setIsbn("23-6452-5634-352");
		it.setEditorial("Viking Press");
		it.setPaginas(200);
		
		LibroBean carrie = new LibroBean();
		carrie.setTitulo("Carrie");
		carrie.setIsbn("342-452-43133-341");
		carrie.setEditorial("Doubleday");
		carrie.setPaginas(170);
		
		EjemplarBean ej1 = new EjemplarBean();
		ej1.setLocalizacion("EEUU");
		
		EjemplarBean ej2 = new EjemplarBean();
		ej2.setLocalizacion("Alemania");
		
		UsuarioBean cris = new UsuarioBean();
		cris.setNombre("Cristina");
		cris.setDireccion("Calle Covadonga, Mieres");
		cris.setTelefono(987654321);
		
		SacarBean sacar1 = new SacarBean();
		sacar1.setFecha_prestamo("12/05/2019");
		sacar1.setFecha_devolucion("05/07/2019");
		
		
		king.addLibros(it);
		king.addLibros(carrie);
		
		it.addEjemplares(ej1);
		carrie.addEjemplares(ej2);
		
		//enlazo extraccion 1
		ej1.addSacarEjemplar(sacar1);
		cris.addSacarUsuario(sacar1);
		
		CreateAutor createAutor = new CreateAutor();
		createAutor.create(king);
		
		CreateLibro createLibro = new CreateLibro();
		createLibro.create(it);
		createLibro.create(carrie);
		
		CreateEjemplar createEjemplar = new CreateEjemplar();
		createEjemplar.create(ej1);
		createEjemplar.create(ej2);
		
		CreateUsuario createUsuario = new CreateUsuario();
		createUsuario.create(cris);
		
		CreateSacar createSacar = new CreateSacar();
		createSacar.create(sacar1);
	}

}
