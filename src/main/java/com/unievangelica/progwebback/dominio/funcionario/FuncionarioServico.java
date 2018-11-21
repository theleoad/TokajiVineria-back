package com.unievangelica.progwebback.dominio.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServico {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;


    public Funcionario salvar(Funcionario funcionario){
        return funcionarioRepositorio.save(funcionario);
    }

    public boolean excluir(Long funcionarioId){
        Funcionario funcionarioBusca = funcionarioRepositorio.getOne(funcionarioId);
        if( funcionarioBusca != null ){
            funcionarioRepositorio.delete(funcionarioBusca);
            return true;
        }
        else {
            return false;
        }
    }

    public Funcionario buscarPeloId(Long funcionarioId){
        return funcionarioRepositorio.getOne(funcionarioId);
    }

    public List<Funcionario> buscarTodos(){
        return funcionarioRepositorio.findAll();
    }

}
