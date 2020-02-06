

public class Elevator {

  private int elevNum = 0; //Keeps count of the number of elevators created

  private String name;

  private int currFloor;//Current floor of the elevator
  private int ceiling;//Maximum floor that an elevator can travel too
  private int grndFloor;//Lowest floor that an elevator can travel too

  private boolean status; //Wether an elevator is active or not; default is inactive state
  private boolean dirOfTravel;//traveling up or down; true is up, false is down

  public Elevator() { //Constructor
    this.name = "elevator" + elevNum;
    elevNum ++;

    this.currFloor = 0;
    this.grndFloor = 0;

    this.status = false;
    this.dirOfTravel = true;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName){
    this.name = newName;
  }

}
