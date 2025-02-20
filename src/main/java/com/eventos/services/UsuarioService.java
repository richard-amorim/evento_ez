package com.eventos.services;

import com.eventos.dtos.UsuarioDTO;
import com.eventos.models.Usuario;
import com.eventos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
         Usuario usuario = new Usuario(usuarioDTO);
         return new UsuarioDTO(usuarioRepository.save(usuario));
    }
}
