package one.digitalinnovation.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instanca;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instanca == null) {
            instanca = new SingletonLazy();
        }
        return instanca;
    }
}
