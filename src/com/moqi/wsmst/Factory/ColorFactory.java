package com.moqi.wsmst.Factory;

import com.moqi.wsmst.Blue;
import com.moqi.wsmst.Green;
import com.moqi.wsmst.Red;
import com.moqi.wsmst.service.AbstractFactory;
import com.moqi.wsmst.service.Color;
import com.moqi.wsmst.service.Shape;

public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }



    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
