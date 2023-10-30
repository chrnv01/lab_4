package ru.mirea.lab_4;

public enum Season {
    SPRING(15),
    SUMMER(25),
    AUTUMN(10),
    WINTER(-15);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void printSeasonDescription(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Мое любимое время года: Весна");
                break;
            case SUMMER:
                System.out.println("Мое любимое время года: Лето");
                break;
            case AUTUMN:
                System.out.println("Мое любимое время года: Осень");
                break;
            case WINTER:
                System.out.println("Мое любимое время года: Зима");
                break;
        }
    }
}