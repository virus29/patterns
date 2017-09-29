package FactoryMethod;
/*
Паттерн предостовляющий интерфейс для создание самого себя
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Person person = Person.create();
    }
}

class Person {
    private Person() {}
    public static Person create() {
        return new Person();
    }
}