package com.example.CadastroDeNinjas.Missoes;

import com.example.CadastroDeNinjas.Ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //    @OneToMany - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missao")
    @JsonIgnore
    private List<NinjaModel> ninja;

}
