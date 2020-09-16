package cap.curso.jpa.business.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cap.curso.jpa.business.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	
	
	@Query(" from Usuario u order by u.usuario")
	public Iterable<Usuario> getOrdenados();
}
