package mavenLibros.modelo.autor;

import javax.persistence.EntityManager;

import mavenLibros.negocio.AutorBean;
import mavenLibros.util.ConnectionEntityManager;

public class CreateAutor {

	public void create(AutorBean autor) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
	}
}
