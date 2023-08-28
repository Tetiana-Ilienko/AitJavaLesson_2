package Lesson_29;

//public class Truck extends Car {
//
//    private int maxLoadCapacity;
//    private int maxTankVolume;
//    private int currentLoadCapacity = 0;
//    private int currentTankVolume = 0;
//
//
//    public Truck(String model, String manufacture, int year, String colour, int maxLoadCapacity, int tankVolume) {
//        super(model, manufacture, year, colour);
//        this.maxLoadCapacity = maxLoadCapacity;
//        this.tankVolume = tankVolume;
//    }
//
//    public void load(int weight) {
//        if (weight > getRemainingCapacity) {
//            System.out.println(" This is too heavy");
//            printRemainingCapacity();
//            return;
//        }
//        currentLoadCapacity += weight;
//        System.out.println("Loading " + weight + " tons..........");
//        System.out.println("Loaded" + weight + "tons");
//        printRemainingCapacity();
//
//    }
//    private void printRemainingCapacity(){
//        System.out.println("My fuel tank is only " + getRemainingCapacity());
//    }
//    private int getRemainingCapacity(){
//        return maxLoadCapacity - currentLoadCapacity;
//    }
//
//    public void unload(int unloadingWeight) {
//        if (unloadingWeight > currentLoadCapacity) {
//            System.out.println("Not enough cargo!");
//            printRemainingCargo();
//            return;
//        }
//        if (unloadingWeight < 0){
//            System.out.println("Can`t unload negative weight");
//        }
//        currentLoadCapacity -= unloadingWeight;
//        System.out.println("Unloading " + unloadingWeight + " tons........");
//        System.out.println("Unloaded " + unloadingWeight + "tons");
//        printRemainingCargo();
//    }
//    private void printRemainingCargo(){
//        System.out.println( " Remaining cargo weight is " + currentLoadCapacity );
//    }
//    public void setCurrentFuel(int currentFuel){
//        if (currentFuel <= maxTankVolume){
//            this.currentTankVolume = currentFuel;
//        }else
//            System.out.println(" My fuel tank is only " + maxTankVolume + "liters");
//    }
//
//
//
//    @Override
//    public void move(int tankVolume) {
//        if (currentTankVolume == 0) {
//            System.out.println(" Not enough fuel");
//            return;
//        }  if (currentLoadCapacity == 0) {
//            System.out.println( " Load truck");
//            return;
//        }
//        System.out.println(" Trying......");
//        System.out.println(" Driving!");
//
//    }
//
//    @Override
//    public void stop() {
//        System.out.println(" Stopping...");
//        System.out.println("Stop!");
//
//    }
//}
