package com.company.lab1.Task10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final Day [] days = new Day[n];

        days[0] = new Day (NameOfDay.MONDAY,TypeOfWeather.STORMY,16.3,750,64);
        days[1] = new Day (NameOfDay.TUESDAY,TypeOfWeather.RAINY,18.7,850,74);
        days[2] = new Day (NameOfDay.WEDNESDAY,TypeOfWeather.CLOUDY,19.8,550,68);
        days[3] = new Day (NameOfDay.THURSDAY,TypeOfWeather.SUNNY,25.3,550,54);
        days[4] = new Day (NameOfDay.FRIDAY,TypeOfWeather.HOT,31.9,400,34);
        days[5] = new Day (NameOfDay.SATURDAY,TypeOfWeather.WARM,26.0,750,68);
        days[6] = new Day (NameOfDay.SUNDAY,TypeOfWeather.COLD,15.8,550,84);
        printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final Day [] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}



