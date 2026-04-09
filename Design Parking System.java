public class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println("Add big car (1): " + parkingSystem.addCar(1));        
        System.out.println("Add medium car (2): " + parkingSystem.addCar(2));     
        System.out.println("Add small car (3): " + parkingSystem.addCar(3));      
        System.out.println("Add big car (1) again: " + parkingSystem.addCar(1));  
        System.out.println("Add medium car (2) again: " + parkingSystem.addCar(2)); 
    }
}
