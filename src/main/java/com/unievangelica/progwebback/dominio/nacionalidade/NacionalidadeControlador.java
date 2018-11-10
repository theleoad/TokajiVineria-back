package com.unievangelica.progwebback.dominio.nacionalidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nacionalidade")
public class NacionalidadeControlador {

    @Autowired
    private NacionalidadeServico nacionalidadeServico;

    @PostMapping
    public ResponseEntity<?> salvar(@Validated @RequestBody Nacionalidade nacionalidade){
        return new ResponseEntity(nacionalidadeServico.salvar(nacionalidade), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@Validated @RequestBody Nacionalidade nacionalidade){
        return new ResponseEntity(nacionalidadeServico.salvar(nacionalidade), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{nacionalidadeId}")
    public ResponseEntity<?> excluir(@PathVariable Long nacionalidadeId) {
        return new ResponseEntity(nacionalidadeServico.excluir(nacionalidadeId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        return new ResponseEntity(nacionalidadeServico.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{nacionalidadeId}")
    public ResponseEntity<?> findById(@PathVariable Long nacionalidadeId) {
        return new ResponseEntity(nacionalidadeServico.buscarPeloId(nacionalidadeId), HttpStatus.OK);
    }

}
