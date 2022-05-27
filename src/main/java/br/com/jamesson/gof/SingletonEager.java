package br.com.jamesson.gof;

/**
 * Singleton "Eager"
 * @author Jamesson Faria
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
