package com.mpq.modelagemconceitual.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpq.modelagemconceitual.domain.Cliente;
import com.mpq.modelagemconceitual.repositories.ClienteRepository;
import com.mpq.modelagemconceitual.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}
	}
