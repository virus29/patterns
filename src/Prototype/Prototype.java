package Prototype;
/*
Клонирует выдернутые объекты из бызы в кэш
 */
public class Prototype implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {

    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
