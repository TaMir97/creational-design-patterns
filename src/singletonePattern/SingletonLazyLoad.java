package singletonePattern;

public class SingletonLazyLoad {
    private static SingletonLazyLoad instance = null;
    private SingletonLazyLoad(){
        if(instance!=null){
            throw new RuntimeException("Already exists");
        }
    }
    public static SingletonLazyLoad getInstance(){
        if(instance == null){
            instance = new SingletonLazyLoad();
        }
        return instance;
    }
}
