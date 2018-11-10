package com.unievangelica.progwebback.dominio.nacionalidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacionalidadeServico {

    @Autowired
    private NacionalidadeRepositorio nacionalidadeRepositorio;


    public Nacionalidade salvar(Nacionalidade nacionalidade){
        return nacionalidadeRepositorio.save(nacionalidade);
    }

    public boolean excluir(Long nacionalidadeId){
        Nacionalidade nacionalidadeBusca = nacionalidadeRepositorio.getOne(nacionalidadeId);
        if( nacionalidadeBusca != null ){
            nacionalidadeRepositorio.delete(nacionalidadeBusca);
            return true;
        }
        else {
            return false;
        }
    }

    public Nacionalidade buscarPeloId(Long nacionalidadeId){
        return nacionalidadeRepositorio.getOne(nacionalidadeId);
    }

    public List<Nacionalidade> buscarTodos(){
        return nacionalidadeRepositorio.findAll();
    }

}
