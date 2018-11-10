package com.unievangelica.progwebback.dominio.harmonizacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarmonizacaoRepositorio extends JpaRepository<Harmonizacao, Long> {
}
