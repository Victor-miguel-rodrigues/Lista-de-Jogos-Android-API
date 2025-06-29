package com.br.jogos.lista_de_jogos.controller;

import com.br.jogos.lista_de_jogos.dto.JogosAndroidDTO;
import com.br.jogos.lista_de_jogos.dto.JogosAndroidSaveDTO;
import com.br.jogos.lista_de_jogos.model.entitys.JogosAndroidEntity;
import com.br.jogos.lista_de_jogos.model.repositry.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ListaJogosAndroid {

    @Autowired
    private JogosRepository repository;


    @GetMapping
    public List<JogosAndroidDTO> buscarTodos() {

        return repository.findAll().stream()
                .map(JogosAndroidDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping("{genero}")
    public List<JogosAndroidDTO> buscar(@PathVariable String genero){
        return repository.BuscarPorGenero(genero).stream()
                .map(JogosAndroidDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/avaliação")
    public List<JogosAndroidDTO> ordenandoAvaliacao(){
        return repository.ordenarAvaliacao().stream()
                .map(JogosAndroidDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping("/salvar")
    public void saveGame(@RequestBody JogosAndroidSaveDTO dados){
        repository.save(new JogosAndroidEntity(dados));
    }

}
