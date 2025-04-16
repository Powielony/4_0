/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner in = new Scanner(System.in);

      int wybor;
      String name;
      String surname;
      int age;

      while (true) {
        System.out.println();
        System.out.println("Proszę wybrać opcję");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wypisz zapisanych studentów");
        System.out.println("3. Wyszukaj studenta po imieniu");
        System.out.println("0. Zamknij program");
        System.out.print("Wybór: ");
        wybor = in.nextInt();
        System.out.println();

        switch (wybor) {
          case 1:
            System.out.print("Podać imię studenta: ");
            name = in.next();
            System.out.print("Podać nazwisko studenta: ");
            surname = in.next();
            System.out.print("Podać wiek studenta: ");
            age = in.nextInt();
            s.addStudent(new Student(name, surname, age));
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            System.out.println("Not implemented yet!");
            break;
          case 0:
            System.exit(0);
        }

      }

    } catch (IOException e) {

    }
  }
}