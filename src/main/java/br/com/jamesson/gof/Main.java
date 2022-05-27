package br.com.jamesson.gof;

public class Main {

    public static void main(String[] args) {

        SingletonLazy o1 = SingletonLazy.getInstancia();
        SingletonLazy o2 = SingletonLazy.getInstancia();
        SingletonLazy o3 = SingletonLazy.getInstancia();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        SingletonEager o11 = SingletonEager.getInstancia();
        SingletonEager o12 = SingletonEager.getInstancia();

        System.out.println(o11);
        System.out.println(o12);


    }

}
