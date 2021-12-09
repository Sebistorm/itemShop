package com.example.itemshop.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int colorID;
    private String colorName;
    private String hexCode;

    public Color() {
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorID=" + colorID +
                ", colorName='" + colorName + '\'' +
                ", hexCode='" + hexCode + '\'' +
                '}';
    }
}
