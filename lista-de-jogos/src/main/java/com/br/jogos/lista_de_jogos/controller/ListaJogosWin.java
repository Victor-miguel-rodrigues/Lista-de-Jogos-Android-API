package com.br.jogos.lista_de_jogos.controller;

import com.br.jogos.lista_de_jogos.dto.JogosWinDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ListaJogosWin {

    @PostMapping
    public void Login(@RequestBody JogosWinDTO requicao){
        System.out.println(requicao);
    }
}
