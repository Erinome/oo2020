public class Joogivaat {
    private double ruumala;
    public double kogusLiitrid;
    //public double uusKogusLiitrid;
    public int counter;

    public Joogivaat(double ruumala, double kogusLiitrid) {
        this.ruumala = ruumala;
        this.kogusLiitrid = kogusLiitrid;
    }

    // * Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus
    // liitrites.
    // Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub).
    // Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse.

    public void fillUpBottle() {
       // if (kogusLiitrid > Joogipudel.getVolume() && kogusLiitrid != 0) {
            kogusLiitrid = kogusLiitrid - Joogipudel.getVolume();
       // }
        //return uusKogusLiitrid;
    }

    public void drinkToBottles() {
       // for (double i = this.kogusLiitrid; i > Joogipudel.getVolume();  - Joogipudel.getVolume()) {
           while (this.kogusLiitrid > Joogipudel.getVolume()) {
            fillUpBottle();
            counter++;
            //System.out.println(counter);
        }
    }

    public String toString() {
        return ruumala + " " + kogusLiitrid + " " + kogusLiitrid;
    }

}