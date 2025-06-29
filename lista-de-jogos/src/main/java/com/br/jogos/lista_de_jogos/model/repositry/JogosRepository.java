package com.br.jogos.lista_de_jogos.model.repositry;


import com.br.jogos.lista_de_jogos.model.entitys.JogosAndroidEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JogosRepository extends JpaRepository<JogosAndroidEntity,Long> {

    @Query("Select u from JogosAndroidEntity u where u.genero = :genero")
    List<JogosAndroidEntity> BuscarPorGenero(@Param("genero") String genero);

    @Query("select a from JogosAndroidEntity a order by a.avaliacao desc")
    List<JogosAndroidEntity> ordenarAvaliacao();
}
