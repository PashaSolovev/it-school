package com.lessons;

public enum Months {
    JANUARY("Январь",31),
    FEBRUARY("Февраль",28),
    MARCH("Март",30),
    APRIL("Апрель",31),
    MAY("Май",31),
    JUNE("Июнь",30),
    JULY("Июль",31),
    AUGUST("Август",30),
    SEPTEMBER("Сентябрь",31),
    OCTOBER("Октябрь",30),
    NOVEMBER("Ноябрь",31),
    DECEMBER("Декабрь",31);

    private String ruName;
    private int Days;

    Months(String ruName, int days){
        this.ruName = ruName;
        this.Days = days;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getDays() {
        return Days;
    }

}

