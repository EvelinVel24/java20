public class SingletonOwner {
    private static SingletonOwner instance;

    private SingletonOwner() {
        // Constructor privado
    }

    public static SingletonOwner getInstance() {
        if (instance == null) {
            instance = new SingletonOwner();
        }
        return instance;
    }
}
