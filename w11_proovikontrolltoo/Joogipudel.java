public class Joogipudel {
    String nimetus;


    static double maht;
    double mass;
    double hind;
    double taara_maksumus;
    Jook jook;

    public Joogipudel(Jook jook, double maht, double mass, double taara_maksumus) {
        this.jook = jook;
        Joogipudel.maht = maht;
        this.mass = mass;
        this.taara_maksumus = taara_maksumus;
    }

    public double getMass() {
        if (jook != null) {
            mass += maht * jook.erikaal;
        }
        return mass;

    }

    public double getPrice() {

        hind = (taara_maksumus / 100) + maht / 1000 * jook.omahind / 100;
        return hind;
    }

    public static double getVolume() {
        return maht;
    }
}
