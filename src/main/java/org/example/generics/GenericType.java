package org.example.generics;

public class GenericType<T> {

    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericType<String> stringExample = new GenericType<>("john wick");
        System.out.println(stringExample.get());
        GenericType<Integer> intExample = new GenericType<>(10);
        System.out.println(intExample.get());


    }
}
