public class Truck extends Cars {

    public Truck(String color, String manufacturer, Integer year, Integer price) {
        super(color, manufacturer, year, price);

    }

        public void TruckDetails() {
            super.TruckDetails(manufacturer,year);
        }
       
    
}