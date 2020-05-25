public class Joogipudelite_kast {

    private static double kasti_hind;
    private static double kasti_mass;
    private static int pesade_arv;

    public Joogipudelite_kast(double kasti_hind, double kasti_mass, int pesade_arv) {
        Joogipudelite_kast.kasti_hind = kasti_hind;
        Joogipudelite_kast.kasti_mass = kasti_mass;
        Joogipudelite_kast.pesade_arv = pesade_arv;
    }

    public double get_KastiHind(Joogipudel pudel){
        double uusHind = kasti_hind * (pudel.getPrice() * pesade_arv);
        return uusHind;
    }

    public double get_YhisMass(Joogipudel pudel) {
        double yhisMass = kasti_mass + (pudel.getMass() * pesade_arv);
        return yhisMass;
    }

    

}