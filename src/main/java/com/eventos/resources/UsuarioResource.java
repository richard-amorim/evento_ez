package com.eventos.resources;

import com.eventos.dtos.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/usuarios")
public class UsuarioResource {

        @RequestMapping("/")
        public String getUsuarios() {
            return "testar retornos dos usuarios";
        }

        @PostMapping ("/")
        public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
            return ResponseEntity.ok(usuarioDTO);
        }

}