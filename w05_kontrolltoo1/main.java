import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));          //siin loetakse sisse fail mis kaustas on
        List<Integer> numbers = new ArrayList<Integer>();                            //luuakse uus List objekt kuhu sises lähevad numbrid mis failist loetakse
        String line = null;

        // String line = br.readLine();
        int koguSumma = 0;
        while ((line = br.readLine()) != null) {                //Tsükkel jookseb läb numbrite mis failis on kasutades koma eraldajaks, muudab need intiks 
            String[] strNumbers = line.split(",");
            for (String strNumber : strNumbers) {
                numbers.add(Integer.parseInt(strNumber));
                koguSumma += Integer.parseInt(strNumber);

            }
        }
        br.close(); //sulgeme faili lugemise
        /*
         * void test (int number) { System.out.println("tere"); }
         */

        System.out.println("Arvud mida kasutatakse kalkuleerimisel: " + numbers);       
        for (int i = 0; i < numbers.size(); i++) {                                      // for tsükli abil võtame algul listi suuruse ja selle abil loeme läbi kõik numbrid,                                                                       
            System.out.println("Arvud mis meelde jäetakse on: " + numbers.get(i));      // mis on selle listi sees ja kuvame need
        }
        // System.out.println("Eelnevate numbrite summa on: " +
        // (numbers.get(0)+numbers.get(1)));
        System.out.println("Eelnevate numbrite summa on: " + sumOfNumbers(numbers));

    }

    public static int sumOfNumbers(List<Integer> list) {        // funktsioon, mis loeb iga elemendi Listi sees ja liidab need iga järgneva tüskliga ühte muutujasse ja tagastab selle
        int total = 0;
        for (int i : list) {
            total += i;
        }
        return total;
    }

}
/*
 * Kirjalik liitmine
 * 
 * Failist saadud kaks arvu sisestatakse üksteise alla, summa omakorda nende
 * alla. Lisaks eelmisele on näha, millised arvud meelde jäetakse. Lisaks
 * eelmisele võib liidetavaid arve olla suvaline arv
 */
