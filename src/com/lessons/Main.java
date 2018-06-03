package com.lessons;

public class Main {

    public static void main(String[] args) {


        for(Season season: Season.values()){
            System.out.println(season + ":");
            for(Months month: Months.values()){
                if(season.toString()==month.getSeason())
                    System.out.println(month);
            }
        }




    }
}

