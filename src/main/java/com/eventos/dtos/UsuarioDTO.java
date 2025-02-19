package com.eventos.dtos;


import lombok.Data;
import java.util.Date;
@Data
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String perfil;
    private Boolean isVerificado;
    private Date dataNascimento;

}
