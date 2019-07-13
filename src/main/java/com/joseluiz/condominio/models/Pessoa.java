package com.joseluiz.condominio.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "PESSOAS")
@SequenceGenerator(name = "pessoa_seq", allocationSize = 1,
        sequenceName = "PESSOA_SEQ")
public class Pessoa implements Entidade {

    @Id
    @Column(name = "I_PESSOAS")
    @GeneratedValue(generator = "pessoa_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "O campo documento não pode ser nulo")
    @Size(min = 11, max = 20, message = "Documento deve ter entre {min} e {max} caracteres")
    @Column(name = "NR_DOCUMENTO", length = 20)
    private String documento;

    @NotNull(message = "O campo nome não pode ser nulo")
    @Size(min = 10, max = 80, message = "Nome deve ter entre {min} e {max} caracteres")
    @Column(name = "NM_NOME", length = 20)
    private String nome;

    @Size(min = 10, max = 11, message = "Telefone deve ter entre {min} e {max} caracteres")
    @Column(name = "NR_TELEFONE", length = 20)
    private String telefone;

    @Email(message = "O campo e-mail deve ser uma e-mail válido")
    @Column(name = "DS_EMAIL", length = 120)
    private String email;

}
