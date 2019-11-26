package com.moqi.Factory.producer;

import com.moqi.Factory.ColorFactory;
import com.moqi.Factory.ShapeFactory;
import com.moqi.Factory.service.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
