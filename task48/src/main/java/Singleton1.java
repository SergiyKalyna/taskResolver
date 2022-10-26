public class Singleton1 {
    private static Singleton1 INSTANCE = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton1();
        }

        return INSTANCE;
    }
}
