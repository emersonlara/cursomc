package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

//import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	///declara de dependencia de um repository
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer Id)  {	
		Optional<Categoria> obj = repo.findById(Id);
		return obj.orElse(null);
	//--	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + Id + ", Tipo: " + Categoria.class.getName())); 
		
	}

}
