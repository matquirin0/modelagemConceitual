package com.mpq.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpq.modelagemconceitual.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
