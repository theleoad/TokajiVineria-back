package com.unievangelica.progwebback.dominio.harmonizacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/harmonizacao")
public class HarmonizacaoControlador {

    @Autowired
    private HarmonizacaoServico harmonizacaoServico;

    @PostMapping
    public ResponseEntity<?> salvar(@Validated @RequestBody Harmonizacao harmonizacao){
        return new ResponseEntity(harmonizacaoServico.salvar(harmonizacao), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@Validated @RequestBody Harmonizacao harmonizacao){
        return new ResponseEntity(harmonizacaoServico.salvar(harmonizacao), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{harmonizacaoId}")
    public ResponseEntity<?> excluir(@PathVariable Long harmonizacaoId) {
        return new ResponseEntity(harmonizacaoServico.excluir(harmonizacaoId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        return new ResponseEntity(harmonizacaoServico.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{harmonizacaoId}")
    public ResponseEntity<?> findById(@PathVariable Long harmonizacaoId) {
        return new ResponseEntity(harmonizacaoServico.buscarPeloId(harmonizacaoId), HttpStatus.OK);
    }

}
