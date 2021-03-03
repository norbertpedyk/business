package pl.sdacademy.podstawy.loading;

public class LoadingExample {
    public static final int STATIC_FIELD = MainLoading.staticField();
    public static final int STATIC_FIELD_INITIALIZER;

    static {
        STATIC_FIELD_INITIALIZER = MainLoading.staticInitializer();
    }

    private final int objectField = MainLoading.objectField();


    private final int objectInitializer;

    {
        objectInitializer = MainLoading.objectInitializer();
    }
    private int firstConstructor;
    private int secondConstructor;
    public LoadingExample() {
        this(1);
        firstConstructor = MainLoading.firstConstructor();
    }

    public LoadingExample(int x){
        secondConstructor = MainLoading.secondConstructor();
    }

}