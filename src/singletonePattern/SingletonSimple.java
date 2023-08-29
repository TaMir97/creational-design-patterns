package singletonePattern;

public class SingletonSimple {
    private static SingletonSimple instance = new SingletonSimple();
    private SingletonSimple(){}

    public static SingletonSimple getInstance(){
        return instance;
    }
}
