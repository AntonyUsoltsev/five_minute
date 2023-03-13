package org.example;

import java.util.*;

public class CollectionUtils {

    private CollectionUtils() {
    }

    /**
     * Creates a reverse iterator.
     * <br/>
     * Note that after calling this method original iterator is invalidated.
     */
    public static <T> Iterator<T> reverse(Iterator<T> iterator) {
        LinkedList<T> list = new LinkedList<>();
        while (iterator.hasNext()) {
            list.addFirst(iterator.next());
        }
        return list.iterator();
        //  return null;
    }

    /**
     * Creates a reverse list iterator.
     * <br/>
     * This is a version of a {@link #reverse(Iterator)} with less memory consumption.
     * <br/>
     * Note that after calling this method original iterator is invalidated.
     */
    public static <T> Iterator<T> listReverse(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        Collections.reverse(list);
        return list.iterator();
        // return null;
    }

    /**
     * Creates an iterator that runs given iterators sequentially.
     * <br/>
     * It is expected that original iterators are not used after this method has been called.
     */
    @SafeVarargs
    public static <T> Iterator<T> append(Iterator<T> first, Iterator<T>... rest) {
        while (first.hasNext()) {
            System.out.println(first.next());
        }
        for (int i = 0; i < rest.length; i++) {
            while (rest[i].hasNext()) {
                System.out.println(rest[i].next());
            }
        }
        return null;
    }

    /*
    Написать метод zip, который принимает на вход две коллекции и конвертер, на выходе дает новую коллекцию с
    преобразованными элементами.
    Если коллекции разной длины, то кидает исключение IllegalArgumentException.
    Пример:
    Collection<Integer> result = zip(List.of(1, 2, 3), List.of(3, 4, 5), (i, j) -> i * j);
    for (Integer i : result) {
      System.out.println(result);
    }
    Вывод:
    3
    8
    15
    Подсказка: java.util.function для ковертера
     */
}