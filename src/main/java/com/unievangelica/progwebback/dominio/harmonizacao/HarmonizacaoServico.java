package com.unievangelica.progwebback.dominio.harmonizacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarmonizacaoServico {

    @Autowired
    private HarmonizacaoRepositorio harmonizacaoRepositorio;


    public Harmonizacao salvar(Harmonizacao harmonizacao){
        return harmonizacaoRepositorio.save(harmonizacao);
    }

    public boolean excluir(Long harmonizacaoId){
        Harmonizacao harmonizacaoBusca = harmonizacaoRepositorio.getOne(harmonizacaoId);
        if( harmonizacaoBusca != null ){
            harmonizacaoRepositorio.delete(harmonizacaoBusca);
            return true;
        }
        else {
            return false;
        }
    }

    public Harmonizacao buscarPeloId(Long harmonizacaoId){
        return harmonizacaoRepositorio.getOne(harmonizacaoId);
    }

    public List<Harmonizacao> buscarTodos(){
        return harmonizacaoRepositorio.findAll();
    }

}
