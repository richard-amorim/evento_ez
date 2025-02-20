package com.eventos.dtos;


import com.eventos.models.Usuario;
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

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.cpf = usuario.getCpf();
        this.perfil = usuario.getPerfil();
        this.isVerificado = usuario.getIsVerificado();
        this.dataNascimento = usuario.getDataNascimento();
    }

}
