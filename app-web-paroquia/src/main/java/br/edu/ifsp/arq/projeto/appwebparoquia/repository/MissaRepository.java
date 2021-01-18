package br.edu.ifsp.arq.projeto.appwebparoquia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.arq.projeto.appwebparoquia.model.DiaSemana;
import br.edu.ifsp.arq.projeto.appwebparoquia.model.Missa;

public interface MissaRepository extends JpaRepository<Missa, String>{

}
