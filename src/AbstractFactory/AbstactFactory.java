package AbstractFactory;

/**
 * Шаблон "Фабрика Фабрик"
 */
public class AbstactFactory {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactoryPattern().createFactory("AbstractFactory.Car");
        Factory tankFactory = new AbstractFactoryPattern().createFactory("AbstractFactory.Tank");
        Car toyota = carFactory.createCar("AbstractFactory.Toyota");
        Car audi = carFactory.createCar("AbstractFactory.Audi");
        toyota.drive();
        audi.drive();
        Tank t51 = tankFactory.createTank("AbstractFactory.T51");
        Tank t52 = tankFactory.createTank("AbstractFactory.T52");
        t51.drive();
        t52.drive();
    }
}
interface Car {
    void drive();
}
class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive AbstractFactory.Toyota");
    }
}
class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive AbstractFactory.Audi");
    }
}
class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        switch (typeOfCar) {
            case "AbstractFactory.Toyota" : return new Toyota();
            case "AbstractFactory.Audi" : return new Audi();
            default: return null;
        }
    }
    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

interface Tank{
    void drive();
}
class T51 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive AbstractFactory.T51");
    }
}
class T52 implements Tank {
    @Override
    public void drive() {
        System.out.println("drive AbstractFactory.T52");
    }
}
class TankFactory implements Factory{
    public Tank createTank(String typeOfTank){
        switch (typeOfTank) {
            case "AbstractFactory.T51" : return new T51();
            case "AbstractFactory.T52" : return new T52();
            default: return null;
        }
    }
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}

interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class AbstractFactoryPattern {
    Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "AbstractFactory.Car" : return new CarFactory();
            case "AbstractFactory.Tank" : return new TankFactory();
            default: return null;
        }
    }
}