import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj liczbe:");
      int liczba = skan.nextInt();
    System.out.println("Podaj słowo:");
      String slowo = scan.nextLine();
    System.out.println("Liczba: "+ liczba);
    System.out.println("Słowo: "+ slowo);
  }
}