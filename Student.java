public class Student extends Person {
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public void walk(){
    System.out.println(this.name + " is walking to his next class.");
  }
}