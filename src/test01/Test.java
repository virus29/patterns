package test01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list= new ArrayList<>();
        Set<String> set;
        Queue<String> queue;
        Map<String, String> map;
/*
//Collection
        collection.add("one"); //добавление
        collection.add("two");
        System.out.println(collection.size()); //размер массива
        Iterator<String> iterator = collection.iterator();
        //Цикл для просмотра содержимого
        for (String s : collection) {
            System.out.println(s);
        }
        // цикл который используется предыдущим циклом, но им напрямую пользоваться неправильно
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(collection.contains("one")); //содержит ли этот объект
        collection.remove("one");//удаление
        System.out.println(collection.size());
*/
//Интерфейсы List, Set, Queue экстендятся от Collection

        list.add("zero");
        list.add("one");
        list.add("two");
        System.out.println(list.get(0));//поиск по номеру элемент

    }
}
