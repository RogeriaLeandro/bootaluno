package br.edu.infnet.bootaluno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.bootaluno.modelo.Aluno;
import br.edu.infnet.bootaluno.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public void salvar(Aluno aluno) {
		//aplicar as regras de negócio
		alunoRepository.save(aluno);
	}

	public List<Aluno> listAll(){
		return alunoRepository.findAll();
	}

	public Optional<Aluno> getById(Integer codigo) { // trata o objeto conforme ele é. 
		return alunoRepository.findById(codigo);
	}

	public void delete(Integer codigo) {
		alunoRepository.deleteById(codigo);
		
	}
	
	
}
