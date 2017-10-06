package Adapter;
/*
Превращает не подходящий интерфейс в подходящий
оборачивает интерфейс
оборачивает - wrapper
 */
public class AdapterMain {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new Adapter(new MyTrack()));
    }
}
class Adapter implements Car {
    Track track;

    public Adapter(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}

interface Track {
    void clean();
}
class MyTrack implements Track {
    @Override
    public void clean() {
        System.out.println("Track is clean");
    }
}

interface Car {
    void wash();
}
class Audi implements Car {
    @Override
    public void wash() {
        System.out.println("wash car");
    }
}

class CarWash{
    public void washCar(Car car) {
        car.wash();
    }
}