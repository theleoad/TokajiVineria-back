package com.unievangelica.progwebback.dominio.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorControlador {

    @Autowired
    private FornecedorServico fornecedorServico;

    @PostMapping
    public ResponseEntity<?> salvar(@Validated @RequestBody Fornecedor fornecedor){
        return new ResponseEntity(fornecedorServico.salvar(fornecedor), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@Validated @RequestBody Fornecedor fornecedor){
        return new ResponseEntity(fornecedorServico.salvar(fornecedor), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{fornecedorId}")
    public ResponseEntity<?> excluir(@PathVariable Long fornecedorId) {
        return new ResponseEntity(fornecedorServico.excluir(fornecedorId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        return new ResponseEntity(fornecedorServico.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{fornecedorId}")
    public ResponseEntity<?> findById(@PathVariable Long fornecedorId) {
        return new ResponseEntity(fornecedorServico.buscarPeloId(fornecedorId), HttpStatus.OK);
    }

}
