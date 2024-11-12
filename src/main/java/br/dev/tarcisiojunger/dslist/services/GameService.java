package br.dev.tarcisiojunger.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.tarcisiojunger.dslist.dto.GameMinDTO;
import br.dev.tarcisiojunger.dslist.entities.Game;
import br.dev.tarcisiojunger.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
}
