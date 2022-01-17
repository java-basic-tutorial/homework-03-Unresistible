package com.softserveinc.task01;

public class Main {
    public static void main(String[] args) {
        // TODO: Uncomment code bellow after the class Human have been created
        Human vajsa = new Human("Vasilij", "Pjpkin", "01/01/1987", "+38 (012) 123-45-67");
        System.out.println("vajsa = " + vajsa);
        vajsa.setPhone("+38 (032) 321-45-98");
        System.out.println("vajsa = " + vajsa);

        Human masha = new Human("Masha", "Rasputina", "01/12/1986", "+38 (021) 123-45-67");
        System.out.println("masha = " + masha);
    }
}
