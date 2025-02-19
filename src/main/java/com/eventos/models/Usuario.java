package com.eventos.models;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;

    @Column(unique = true)
    private String cpf;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    private String perfil;

    @Column(name = "is_verificado")
    private Boolean isVerificado;

    public Usuario() {}

    public Usuario(Long id, String nome, String email, String senha, String cpf, Date dataNascimento, String perfil, Boolean isVerificado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.perfil = perfil;
        this.isVerificado = isVerificado;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
