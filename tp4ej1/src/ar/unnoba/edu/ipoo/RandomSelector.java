package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector <T> {

    List<T> list;
    Random rand;

    public RandomSelector() {
        list = new ArrayList<T>();
        rand = new Random();
    }

    public void add(T element) {
        list.add(element);
    }

    public T selectNext() {
        T t = list.get(rand.nextInt(list.size() - 1));
        return t;
    }




}
