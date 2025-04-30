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
      int bdy;
      int bdm;
      int bdd;
      String bd;
      var students = s.getStudents();

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
            while (true) {
              System.out.print("Podać rok urodzenia studenta: ");
              bdy = in.nextInt();
              if (bdy <= 3000 && bdy >= 1) {
                break;
              }
              System.out.println("Niewłaściwy rok urodzenia!");
            }
            while (true) {
              System.out.print("Podać miesiąc urodzenia studenta: ");
              bdm = in.nextInt();
              if (bdm <= 12 && bdm >= 1) {
                break;
              }
              System.out.println("Niewłaściwy miesiąc urodzenia!");
            }
            while (true) {
              System.out.print("Podać dzień urodzenia studenta: ");
              bdd = in.nextInt();
              if (bdd <= 31 && bdd >= 1) {
                break;
              }
              System.out.println("Niewłaściwy dzień urodzenia!");
            }
            bd = Integer.toString(bdy) + "." + Integer.toString(bdm) + "." + Integer.toString(bdd);

            s.addStudent(new Student(name, surname, age, bd));
            break;
          case 2:
            students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            System.out.print("Podać imię studenta do wyszukania: ");
            name = in.next();
            students = s.getStudents();
            for (Student current : students) {
              if (current.GetName().equals(name)) {
                System.out.println(current.ToString());
              }
            }
            break;
          case 0:
            System.exit(0);
        }

      }

    } catch (IOException e) {

    }
  }
}