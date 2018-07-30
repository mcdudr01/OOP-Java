public class OOP{
  
  public static void main(String[] args) {

    //Simple test of accessing private attributes in a class through its public members
    Student s = new Student();
    s.setName("Bob the Encapsulator");
    System.out.println(s.getName());

    //Polymorphism example. Student extends Person and overrides walk()
    Person p = new Person();
    p.walk();
    s.walk();

  }

}