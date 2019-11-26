package com.moqi.wsmst.producer;

import com.moqi.wsmst.Factory.ColorFactory;
import com.moqi.wsmst.Factory.ShapeFactory;
import com.moqi.wsmst.service.AbstractFactory;

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
