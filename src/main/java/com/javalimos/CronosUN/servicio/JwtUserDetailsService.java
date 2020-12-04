package com.javalimos.CronosUN.servicio;

import com.javalimos.CronosUN.modelo.Usuario;
import com.javalimos.CronosUN.repositorio.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Usuario userOption = repository.findByCorreo(correo);
        if (!repository.existsByCorreo(correo)) {
            throw new UsernameNotFoundException("Usuario no encontrado con correo: " + correo);
        }
        Usuario usuario = userOption;
        System.out.println(usuario);
        return new org.springframework.security.core.userdetails.User(usuario.getCorreo(),
                usuario.getClave(), new ArrayList<>());
    }
    public Integer cargarIdUsuario (String correo){
        if(repository.existsByCorreo(correo)){
            Usuario usuario = repository.findByCorreo(correo);
            return usuario.getId();
        }
        return 0;
    }

}
