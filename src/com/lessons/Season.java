package com.lessons;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String ruName;

    Season(String ruName){
        this.ruName = ruName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

