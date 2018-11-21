package com.unievangelica.progwebback.dominio.fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Long> {
}
