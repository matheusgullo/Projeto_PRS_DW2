package br.edu.ifsp.arq.projeto.appwebparoquia.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import br.edu.ifsp.arq.projeto.appwebparoquia.model.DiaSemana;
import br.edu.ifsp.arq.projeto.appwebparoquia.model.Missa;
import br.edu.ifsp.arq.projeto.appwebparoquia.repository.MissaRepository;

@RestController
//@RequestMapping("/index")
public class MissaResource {

	@Autowired
	private MissaRepository missaRepository;
	
	public List<Missa> listar(){
		return missaRepository.findAll();
	}
	
	public ResponseEntity<Missa> buscarPeloDia(@PathVariable String dia){
		Optional<Missa> missa = missaRepository.findById(dia);
		if(missa.isPresent()) {
			return ResponseEntity.ok(missa.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
}
