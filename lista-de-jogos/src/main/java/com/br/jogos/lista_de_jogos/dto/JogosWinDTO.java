package com.br.jogos.lista_de_jogos.dto;

public record JogosWinDTO (
        Long id,
        String name,
        String descricao,
        String genero,
        double avaliacao,
        String poster
){
}
