package com.unievangelica.progwebback.dominio.funcionario;

import com.unievangelica.progwebback.dominio.funcionario.Funcionario;
import com.unievangelica.progwebback.dominio.funcionario.FuncionarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControlador {

    @Autowired
    private FuncionarioServico funcionarioServico;

    @PostMapping
    public ResponseEntity<?> salvar(@Validated @RequestBody Funcionario funcionario){
        return
                new ResponseEntity(funcionarioServico.salvar(funcionario), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> alterar(@Validated @RequestBody Funcionario funcionario){
        return new ResponseEntity(funcionarioServico.salvar(funcionario), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{funcionarioId}")
    public ResponseEntity<?> excluir(@PathVariable Long funcionarioId) {
        return new ResponseEntity(funcionarioServico.excluir(funcionarioId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() {
        return new ResponseEntity(funcionarioServico.buscarTodos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{funcionarioId}")
    public ResponseEntity<?> findById(@PathVariable Long funcionarioId) {
        return new ResponseEntity(funcionarioServico.buscarPeloId(funcionarioId), HttpStatus.OK);
    }



}