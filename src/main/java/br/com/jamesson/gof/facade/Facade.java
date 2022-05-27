package br.com.jamesson.gof.facade;

import br.com.jamesson.gof.facade.SubSistema1.crm.CrmService;
import br.com.jamesson.gof.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().getCidade(cep);
        String estado = CepApi.getInstancia().getEstado(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }

}
