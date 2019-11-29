package com.moqi.hash;

// equalshashcode/Prediction.java
// Predicting the weather
import java.util.*;
public class Prediction {
    private static Random rand = new Random(47);
    @Override
    public String toString() {
        return rand.nextBoolean() ?
                "Six more weeks of Winter!" : "Early Spring!";
    }
}
