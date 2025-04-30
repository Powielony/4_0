public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private String Birthdate;

  public Student(String name, String surname, int age, String birthdate) {
    Name = name;
    Surname = surname;
    Age = age;
    Birthdate = birthdate;
  }

  public String GetName() {
    return Name;
  }

  public String GetSurname() {
    return Surname;
  }

  public int GetAge() {
    return Age;
  }

  public String GetBD() {
    return Birthdate;
  }

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age) + " urodzony " + Birthdate;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 5)
      return new Student("Parse", "Error", -1, "NaN");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[4]);
  }
}