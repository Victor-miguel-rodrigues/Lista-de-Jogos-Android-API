package com.br.jogos.lista_de_jogos.model.entitys;

import com.br.jogos.lista_de_jogos.dto.JogosAndroidDTO;
import com.br.jogos.lista_de_jogos.dto.JogosAndroidSaveDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "jogos_android")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JogosAndroidEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Column(columnDefinition = "TEXT")
    private  String imagem;
    @Column(name = "nome")
    private String name;
    private String descricao;
    private String genero;
    private double avaliacao;

    public JogosAndroidEntity(JogosAndroidDTO dados){
        name = dados.nomeJogo();
        descricao = dados.descricao();
        genero = dados.genero();
    }

    public JogosAndroidEntity(JogosAndroidSaveDTO dados) {
        this.name = dados.name();
        this.descricao = dados.descricao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.avaliacao = dados.avaliacao();

    }



    @Override
    public String toString() {
        return "JogosAndroidEntity{" +
                "id=" + id +
                ", imagem='" + imagem + '\'' +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", genero='" + genero + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
