package mavenLibros.inicio;

import mavenLibros.negocio.AutorBean;
import mavenLibros.negocio.EjemplarBean;
import mavenLibros.negocio.LibroBean;
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
		
		king.addLibros(it);
		king.addLibros(carrie);
		
		it.addEjemplares(ej1);
		carrie.addEjemplares(ej2);
		
		
		
	}

}
