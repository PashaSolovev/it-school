package com.lessons;

public class Main {

    public static void main(String[] args) {


        for(Season season: Season.values()){
            System.out.println(season + ":");
            for(Months month: season.getSeasonMonths()){
                    System.out.println( "There are " + month.getDays() + " days in " + month.toString() );
            }
        }




    }
}

