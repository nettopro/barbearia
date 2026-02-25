package com.nettopro.barbearia.entidade.cliente;

import com.nettopro.barbearia.entidade.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente extends BaseEntity{

    @Column(nullable = false)
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(length = 15)
    private String telefone;

    private Boolean mensalista;

}
