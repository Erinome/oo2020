public abstract class Cars {
    
    String color;
    String manufacturer;
    Integer year;
    Integer price;

    public Cars(String color, String manufacturer, Integer year, Integer price) {
        this.color=color;
        this.manufacturer=manufacturer;
        this.year=year;
        this.price=price;
    }

	public void TruckDetails(String manufacturer2, Integer year2) {
        System.out.println("This car has following data: " + "\nColor: " +  color + "\nMade by: " +  manufacturer + "\nCreated in " + year + " and price being " + price + " USD");
	}

}