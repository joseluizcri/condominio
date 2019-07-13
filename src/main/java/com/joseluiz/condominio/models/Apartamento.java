package com.joseluiz.condominio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "APARTAMENTOS")
@SequenceGenerator(name = "apartamento_seq", allocationSize = 1,
        sequenceName = "APARTAMENTO_SEQ")
public class Apartamento implements Entidade {

    @Id
    @Column(name = "I_APARTAMENTOS")
    @GeneratedValue(generator = "apartamento_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "O campo apartamento não pode ser nulo")
    @Size(max = 10, message = "O campo apartamento deve ter no máximo {max} caracteres")
    @Column(name = "DS_APARTAMENTO", length = 20)
    private String apartamento;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "moradores_apartamentos",
            joinColumns = @JoinColumn(name = "i_pessoas"),
            inverseJoinColumns = @JoinColumn(name = "i_apartamentos"))
    @JsonIgnoreProperties("apartamentos")
    private List<Pessoa> moradores;
}
