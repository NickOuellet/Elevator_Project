public class Runner {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Elevator elevator1 = new Elevator();

    System.out.println(elevator1.getName()); //Test getName()

    System.out.println("Curr floor: " + elevator1.getCurrFloor());
    elevator1.travelUp();
    elevator1.travelUp();
    System.out.println("Curr floor: " + elevator1.getCurrFloor());
    elevator1.travelDown();
    System.out.println("Curr floor: " + elevator1.getCurrFloor());

  }
}
