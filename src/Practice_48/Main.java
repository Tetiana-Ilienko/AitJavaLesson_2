package Practice_48;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Monat");
        String monat = scanner.nextLine();
        Monaten monatEnum;
        try {
            monatEnum = Monaten.valueOf(monat.toUpperCase());
        } catch (IllegalArgumentException e){
            monatEnum = Monaten.WRONMONATEN;

            return;

        }

        switch (monatEnum){
            case JANUAR:
            case MARS:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOUBER:
            case DESEMBER:
                System.out.println("31 days in this month");
                break;
            case APRIL:
            case JUNY:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("30 days in this month");
                break;
            case FEBRUAR:
                System.out.println("Das ist Februar. Er hat 28 Tagen.");
                break;
            case WRONMONATEN:
                System.out.println("Sie enteren keinen korrecten Monat");

        }
    }
}
