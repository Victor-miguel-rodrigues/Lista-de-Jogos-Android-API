package com.br.jogos.lista_de_jogos.dto;

import com.br.jogos.lista_de_jogos.model.entitys.JogosAndroidEntity;
import jakarta.persistence.Column;

public record JogosAndroidDTO(
        @Column(name = "nome")
        String nomeJogo,
        String descricao,
        String genero,
        double avaliacao


) {

    public JogosAndroidDTO(JogosAndroidEntity dados){
      this(dados.getName(), dados.getDescricao(), dados.getGenero(), dados.getAvaliacao());
    }


}
