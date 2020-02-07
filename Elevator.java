



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

    this.currFloor = 1;
    this.grndFloor = 1;

    this.status = false;
    this.dirOfTravel = true;
  }

  /**
   * public String - Returns the current name of the elevator
   *
   * @return (String) Name of the elevator
   */
  public String getName() {
    return this.name;
  }

  /**
   * public void - Sets a new name for an elevator
   *
   * @param String newName The new name
   */
  public void setName(String newName){
    this.name = newName;
  }

  /**
   * public void - Moves the elevator UP one floor
   */
  public void travelUp() {
    this.currFloor++;
  }

  /**
   * public void - Moves the elevator DOWN one floor
   */
  public void travelDown() {
    this.currFloor--;
  }

  /**
   * public int - Returns the floor that the elevator is currently on
   *
   * @return (int) The current floor
   */
  public int getCurrFloor() {
    return this.currFloor;
  }

  /**
   * public void - Moves the elevator to the ground floor
   */
  public void reset() {
    this.currFloor = this.grndFloor;
  }

  /**
   * public void - Set the minimum floor an elevator can travel too
   *
   * @param int newGrndFloor The new ground floor
   */
  public void setGrndFloor(int newGrndFloor) {
    this.grndFloor = newGrndFloor;
  }

  /**
   * public void - Set the maximum floor an elevator can travel too
   *
   * @param int newCeilingFloor The new ceiling
   */
  public void setCeilingFloor(int newCeilingFloor) {
    this.ceiling = newCeilingFloor;
  }

  /**
   * public boolean - Returns the status of the elevator. True = active; False = inactive
   *
   * @return (boolean) The status of the elevator
   */
  public boolean getStatus() {
    return this.status;
  }

  /**
   * public void - Set the status of an elevator
   *
   * @param boolean newStatus The new status of the elevator
   */
  public void setStatus(boolean newStatus) {
    this.status = newStatus;
  }

  /**
   * public void - Flips the status of an elevator
   */
  public void flipStatus() {
    if (this.status == false) {
      this.status = true;
    }
    else {
      this.status = false;
    }
  }

//Last line before end of class }
}
