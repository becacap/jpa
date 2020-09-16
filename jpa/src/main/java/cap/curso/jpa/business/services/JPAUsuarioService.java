package cap.curso.jpa.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.business.entities.Usuario;
import cap.curso.jpa.business.repositories.UsuarioRepository;

@Service
public class JPAUsuarioService implements JpaUsuarioServiceInterface {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
    
    public Iterable<Usuario> getOrdenados(){
    	return usuarioRepository.getOrdenados();
    }

   
}