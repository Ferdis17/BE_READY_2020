package design_pattern;

public class SingletonPattern {

    private SingletonPattern(){}

    private static class SingletonHolder{
        private static final SingletonPattern singletonInstance = new SingletonPattern();
    }

    public static SingletonPattern getInstance(){
        return SingletonHolder.singletonInstance;
    }
}
