//class Factory {
//    public static void main(String[] args) {
//        FactoryPattern factory = new FactoryPattern();
//        Car toyota = factory.create("Toyota");
//        Car audi = factory.create("Audi");
//        toyota.drive();
//        audi.drive();
//    }
//}
//interface Car{
//    void drive();
//}
//class Toyota implements Car {
//    @Override
//    public void drive() {
//        System.out.println("drive Toyota");
//    }
//}
//class Audi implements Car {
//    @Override
//    public void drive() {
//        System.out.println("drive Audi");
//    }
//}
//class FactoryPattern{
//    public Car create(String typeOfCar){
//        switch (typeOfCar) {
//            case "Toyota" : return new Toyota();
//            case "Audi" : return new Audi();
//            default: return null;
//        }
//    }
//}