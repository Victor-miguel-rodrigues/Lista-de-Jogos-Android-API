package com.br.jogos.lista_de_jogos.dto;

import jakarta.persistence.Column;

public record JogosAndroidSaveDTO(

         String name,
         String descricao,
         String genero,
         String imagem,
         double avaliacao

){
}
