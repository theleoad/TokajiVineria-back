package com.unievangelica.progwebback.dominio.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorServico {

    @Autowired
    private FornecedorRepositorio fornecedorRepositorio;


    public Fornecedor salvar(Fornecedor fornecedor){
        return fornecedorRepositorio.save(fornecedor);
    }

    public boolean excluir(Long fornecedorId){
        Fornecedor fornecedorBusca = fornecedorRepositorio.getOne(fornecedorId);
        if( fornecedorBusca != null ){
            fornecedorRepositorio.delete(fornecedorBusca);
            return true;
        }
        else {
            return false;
        }
    }

    public Fornecedor buscarPeloId(Long fornecedorId){
        return fornecedorRepositorio.getOne(fornecedorId);
    }

    public List<Fornecedor> buscarTodos(){
        return fornecedorRepositorio.findAll();
    }

}
