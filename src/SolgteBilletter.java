import java.util.Scanner;

/**
 * @Author Mohammad Adel Murtada
 */
public class SolgteBilletter {
Scanner input = new Scanner(System.in);

  public void tilfoejSolgtBillet() {
    System.out.println("\nDu har valgt at tilføje en solgt billet: ");
    System.out.println("Vælg en af de nedenstående tal:");
    System.out.println("1. Dør Billet");
    System.out.println("2. Billet med studierabat");
    System.out.println("3. Forsalg Billet");
    System.out.println("9. Tilbage til start");
    System.out.print("Skriv her: ");
    int svar = input.nextInt();
    boolean checkAnswer = false;
    while (!input.hasNextInt()) {
      do {
        switch (svar) {
          case 1:
            checkAnswer = true;
            break;
          case 2:
            checkAnswer = true;
            break;
          case 3:
            checkAnswer = true;
            break;
          case 9:
            MenuRun menuRun = new MenuRun();
            menuRun.Run();
            checkAnswer = true;
            break;
          default:
            System.out.println("\nIt has to be between 1,2,3 or 9");
            System.out.println("Try again");
            svar = input.nextInt();
            checkAnswer = false;
        }

      } while (!checkAnswer);
    }
  }
  public void AntalSolgte(){

  }
public String hentAlleStudiekortTid(){
    return "";
}
  @Override
  public String toString() {
    return super.toString();
  }
}
