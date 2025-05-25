package com.edisoncastro.CadastroDeNinjas.Ninja.Model;

import com.edisoncastro.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tb_cadastro_de_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_ninja")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade_ninja")
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key ou chave estrangeira
    private MissoesModel missoes;

    private String corDoOlho;


}
