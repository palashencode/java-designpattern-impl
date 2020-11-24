package com.java.app.prototype;

import java.util.Objects;

public abstract class Ship {
    public int propellers;
    public String color;
    public int deckSpace;
    public String hullMaterial;

    public Ship(){
        
    }

    public Ship(Ship target){
        if(target != null){
            this.propellers = target.propellers;
            this.color = target.color;
            this.deckSpace = target.deckSpace;
            this.hullMaterial = target.hullMaterial;
        }
    }

    public abstract Ship clone();

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(!(obj instanceof Ship))
            return false;
        Ship other = (Ship)obj;
        return other.propellers == this.propellers 
                && other.deckSpace == this.deckSpace
                && Objects.equals(other.color, this.color)
                && Objects.equals(other.hullMaterial, this.hullMaterial);

    }

}
