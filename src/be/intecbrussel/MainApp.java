package be.intecbrussel;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner in = new java.util.Scanner(System.in);

        //OPDRACHT_2_CORRECTIE

        System.out.println("Specify your age: ");

        int age = in.nextInt();

        int lvl;

        if (age > 65) {
            lvl = 3;

        } else if (age > 45) {
            lvl = 2;

        } else if (age > 25) {
            lvl = 1;

        } else {
            lvl = 0;

        }
        switch (lvl) {
            case 0 -> System.out.println("Go home!");
            case 1 -> System.out.println("Any antecedents?");
            case 2 -> System.out.println("Let’s take your temperature first.");
            case 3 -> System.out.println("Please take this vaccine now");
        }

        //OPDRACHT_3_CORRECTIE

        System.out.println("Naar welke muziek wil je luisteren? ");
        System.out.println("Voer een getal in van 1 tot 5:");

        int song = in.nextInt();

        String song_1 = "playing song (1).mp3";
        String song_2 = "playing song (2).mp3";
        String song_3 = "playing song (3).mp3";
        String song_4 = "playing song (4).mp3";
        String song_5 = "playing song (5).mp3";
        String song_0 = "Er bestaat geen liedje op deze plaats.";

        switch (song) {
            case 1 -> System.out.println(song_1);
            case 2 -> System.out.println(song_2);
            case 3 -> System.out.println(song_3);
            case 4 -> System.out.println(song_4);
            case 5 -> System.out.println(song_5);
            default -> System.out.println(song_0);
        }

        //OPDRACHT_4_CORRECTIE

        int t = 9;
        int r = 0;

        while (r <= 9){

            if (r == 9){
                System.out.print(r);
            }
            else {
                System.out.print(t + " - " + r + " - ");
            }

            t--;
            r++;
        }

        //OPDRACHT_1_CORRECTIE

        int timeS = 1;

        do {
            timeS++;
            System.out.println("Je hebt een uur gestudeerd");
        }while (timeS < 3);

        System.out.println("Je hebt " + timeS + " uur gestudeerd");

    }
}


