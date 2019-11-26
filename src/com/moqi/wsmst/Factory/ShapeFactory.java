package com.moqi.wsmst.Factory;

import com.moqi.wsmst.Circle;
import com.moqi.wsmst.Rectangle;
import com.moqi.wsmst.Square;
import com.moqi.wsmst.service.AbstractFactory;
import com.moqi.wsmst.service.Color;
import com.moqi.wsmst.service.Shape;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
