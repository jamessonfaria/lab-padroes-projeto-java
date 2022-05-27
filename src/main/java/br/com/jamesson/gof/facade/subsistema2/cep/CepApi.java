package br.com.jamesson.gof.facade.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String getCidade(String cep){
        return "Recife";
    }

    public String getEstado(String cep){
        return "PE";
    }

}
