package com.unievangelica.progwebback.dominio.nacionalidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadeRepositorio extends JpaRepository<Nacionalidade, Long> {
}
