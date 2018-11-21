package com.unievangelica.progwebback.dominio.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {
}
