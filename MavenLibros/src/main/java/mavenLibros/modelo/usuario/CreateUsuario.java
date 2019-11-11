package mavenLibros.modelo.usuario;

import javax.persistence.EntityManager;

import mavenLibros.negocio.UsuarioBean;
import mavenLibros.util.ConnectionEntityManager;

public class CreateUsuario {

	public void create(UsuarioBean usuario) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
	}
}
