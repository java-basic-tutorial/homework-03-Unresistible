package com.softserveinc.task03;

import com.softserveinc.task02.City;

public class Main {
    public static void main(String[] args) {
        // TODO: Uncomment code bellow after the class Country have been created

        City kyiv = new City("Kyiv", "Kyivska", "Ukraine", 2_884_000);
        Country ukraine = new Country("Ukraine", "Eurasia", "UA", kyiv);

        City dnipro = new City("Dnipro", "Dnipropetrovskaya", "Ukraine", 966_400);
        City lviv = new City("Lviv", "Lvivska", "Ukraine", 721_301);

        ukraine.addCity(dnipro);
        ukraine.addCity(lviv);

        System.out.println(kyiv);
    }
}
