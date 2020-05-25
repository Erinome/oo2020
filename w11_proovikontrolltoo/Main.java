public class Main {
    public static void main(String[] arg) {

        Jook limonaad = new Jook("Limpa", 25, 1);

        Joogipudel pudel = new Joogipudel(limonaad, 24, 25, 5);
        System.out.println();
        System.out.println("Joogipudel koos joogiga: " + pudel.getMass() + " grammi");
        System.out.println();
        System.out.println("Jook koos taaraga: " + pudel.getPrice() + " eurot");
        System.out.println();

        Joogivaat casket = new Joogivaat(2000.5, 110.5 );
        System.out.println(casket);
        casket.drinkToBottles();
        System.out.println(casket.kogusLiitrid);
        System.out.println(casket.counter); 


    }
}
