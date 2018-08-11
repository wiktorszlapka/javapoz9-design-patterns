package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.Level;

public class BaseUnitFactory {

    private Level level;
    private Integer multiplier;
    public BaseUnitFactory(Level level) {
        this.level = level;
        this.multiplier = level.getMultiplier();

    }

    //fabryka na podstawie danych ma zdecydować które dane ma dać
    public BaseUnit createNewBaseUnit(String name) {
        BaseUnit unit = null;
        if ("knight".equalsIgnoreCase(name)) { //to jest odpowiedzialne za tworzenie jednostek, na ten kawałek mówi się że to fabryka bo tworzy obiekty
            unit = new BaseUnit("Knight", 100, 10 * multiplier, 10, null);
        } else if ("archer".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Archer", 50, 25 * multiplier, 5, null);
        } else if ("spearman".equalsIgnoreCase(name)) {
            unit = new BaseUnit("Spearman", 70,15 * multiplier,5,null);
        }
        return unit;
    }

    public BaseUnit createRangedUnit(String generation) {
        BaseUnit unit = null;
        if ("modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("Rifleman", 150,50,30,null);
        } else if ("not-modern".equalsIgnoreCase(generation)) {
            unit = new BaseUnit("Archer", 50,25,5,null);
        }
        return unit;
    }


}
