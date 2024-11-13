package br.dev.tarcisiojunger.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.tarcisiojunger.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
