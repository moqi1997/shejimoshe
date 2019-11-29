package com.moqi.hash;

// equalshashcode/SpringDetector.java
// What will the weather be?

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.lang.reflect.*;

public class SpringDetector {
    public static <T extends Groundhog>
    void detectSpring(Class<T> type) {
        try {
            Constructor<T> ghog =
                    type.getConstructor(int.class);
            Map<Groundhog, Prediction> map =
                    IntStream.range(0, 10)
                            .mapToObj(i -> {
                                try {
                                    return ghog.newInstance(i);
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            })
                            .collect(Collectors.toMap(
                                    Function.identity(),
                                    gh -> new Prediction()));
            map.forEach((k, v) ->
                    System.out.println(k + ": " + v));
            Groundhog gh = ghog.newInstance(3);
            System.out.println(
                    "Looking up prediction for " + gh);
            if (map.containsKey(gh))
                System.out.println(map.get(gh));
            else
                System.out.println("Key not found: " + gh);
        } catch (NoSuchMethodException |
                IllegalAccessException |
                InvocationTargetException |
                InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        detectSpring(Groundhog.class);
    }
}
