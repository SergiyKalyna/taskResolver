public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    public String str;

    private Singleton() {
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
