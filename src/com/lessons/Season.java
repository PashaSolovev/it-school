package com.lessons;

public enum Season {
    WINTER("Зима",new Months[]{Months.DECEMBER,Months.JANUARY,Months.FEBRUARY}),
    SPRING("Весна",new Months[]{Months.MARCH,Months.APRIL,Months.MAY}),
    SUMMER("Лето",new Months[]{Months.JUNE,Months.JULY,Months.AUGUST}),
    AUTUMN("Осень",new Months[]{Months.SEPTEMBER,Months.OCTOBER,Months.NOVEMBER});

    private String ruName;
    private Months[] seasonMonths;

    Season(String ruName, Months[] months){
        this.ruName = ruName;
        this.seasonMonths = months;
    }



    public Months[] getSeasonMonths() {
        return seasonMonths;
    }
}

