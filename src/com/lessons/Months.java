package com.lessons;

public enum Months {
    JANUARY("Январь", "WINTER",31),
    FEBRUARY("Февраль","WINTER",28),
    MARCH("Март","SPRING",30),
    APRIL("Апрель","SPRING",31),
    MAY("Май","SPRING",31),
    JUNE("Июнь","SUMMER",30),
    JULY("Июль","SUMMER",31),
    AUGUST("Август","SUMMER",30),
    SEPTEMBER("Сентябрь","AUTUMN",31),
    OCTOBER("Октябрь","AUTUMN",30),
    NOVEMBER("Ноябрь","AUTUMN",31),
    DECEMBER("Декабрь","WINTER",31);

    private String ruName;
    private String Season;
    private int Days;

    Months(String ruName, String Season, int days){
        this.ruName = ruName;
        this.Season = Season;
        this.Days = days;
    }

    public String getSeason() {
        return Season;
    }
}

