package com.empresa.includeimobapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.includeimobapi.domain.model.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
