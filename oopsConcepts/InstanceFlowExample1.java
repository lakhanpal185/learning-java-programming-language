class Car {
    
    String make;
    String model;
    static int year = 2020;// if we not use static we get unknown and unknown becoz constructor called after the instance block

    {
        switch(year) {
            case 2020:
                make = "Toyota";
                model = "Camry";
                break;
            case 2021:
                make = "Honda";
                model = "Civic";
                break;
            case 2022:
                make = "Ford";
                model = "Fusion";
                break;
            default:
                make = "Unknown";
                model = "Unknown";
        }
        ++year;
    }
    
    public Car(int year) {
        this.year = year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public static void main(String[] args) {
        Car car1 = new Car(2021);
        System.out.println("Car 1 make: " + car1.getMake());
        System.out.println("Car 1 model: " + car1.getModel());
        System.out.println("Car 1 year: " + car1.getYear());
        
        Car car2 = new Car(2022);
        System.out.println("Car 2 make: " + car2.getMake());
        System.out.println("Car 2 model: " + car2.getModel());
        System.out.println("Car 2 year: " + car2.getYear());
        
        Car car3 = new Car(2023);
        System.out.println("Car 3 make: " + car3.getMake());
        System.out.println("Car 3 model: " + car3.getModel());
        System.out.println("Car 3 year: " + car3.getYear());
    }
}
// o/p is:
// Car 1 make: Toyota
// Car 1 model: Camry
// Car 1 year: 2021
// Car 2 make: Honda
// Car 2 model: Civic
// Car 2 year: 2022
// Car 3 make: Ford
// Car 3 model: Fusion
// Car 3 year: 2023