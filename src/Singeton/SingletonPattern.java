package Singeton;
/*
При необходимости создать ТОЛЬКО один объект
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.i = 5;//для примера
        System.out.println(singleton2.i);//для примера
    }
}

class Singleton {
    int i = 0;//для примера
    static Singleton singleton = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return singleton;
    }
}