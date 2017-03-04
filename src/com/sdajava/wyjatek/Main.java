package com.sdajava.wyjatek;
import java.util.Scanner;

public class Main {
public class Odczyt{
    public void main(String[] args) {

        int tab[] = {1,2,3,4,5};
        Scanner odczyt = new Scanner(System.in);
        int index = -1;

        System.out.println("Podaj indeks tablicy ktory chcesz zobaczyc: ");
        index = odczyt.nextInt();

        try {
            System.out.println(tab[Index]);
        } catch (ArrayIndexOutOfBoundsException |IOException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length + "tresc" +e);

            e.printStackTrace();
        }

        }
    }
}
