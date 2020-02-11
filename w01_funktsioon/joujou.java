import java.util.Scanner;
//import java.util.Math.pow;

public class kehamassiindeks {

    public static void main(String[] args) {
        // loo uus muutuja mille abil lugeda sisse sisestatud infot
        Scanner loe = new Scanner(System.in);

        // double variable kuna kaal,pikkus ja kehamassiindeks võivad olla komadega
        double kaal;
        double pikkus;
        double kehamassiindeks;
        // double pikkusruudus;

        // all toimub kasutaja sisestatud info muutujasse andmine mille lõime eelnevalt
        System.out.println("Palun sisesta oma kaal(kg): ");
        kaal = loe.nextDouble();
        System.out.println("Palun sisesta oma pikkus(cm): ");
        pikkus = loe.nextDouble();

        // pikkusruudus = Math.pow(kaal, 2);
        // kehamassiindeks = kaal / pikkusruudus;

        // arvutus, et leida BMI
        kehamassiindeks = kaal / (pikkus * pikkus);

        System.out.println("Teie kehamassiindeks on: " + kehamassiindeks);

    }
}