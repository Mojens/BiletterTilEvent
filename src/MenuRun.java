/**
 * @Author Mohammad Adel Murtada
 */
public class MenuRun {

  public void Run() {
    String[] menuItem = new String[10];

    menuItem[1] = "Registrer Solgt billet";
    menuItem[2] = "Se alle solgte billetter";
    menuItem[3] = "Hvilke type billetter er solgt";
    menuItem[4] = "Studiekort nummer på Studierabat billetter";
    menuItem[9] = "Luk Program";

    Menu menu = new Menu("MENU", "Vælg her ", menuItem);
    menu.printMenu();

    int choice = menu.readChoice();
    boolean checkChoice;

    do {
      switch (choice) {
        case 1:
          SolgteBilletter solgteBilletter = new SolgteBilletter();
          solgteBilletter.tilfoejSolgtBillet();
          checkChoice = true;
          break;
        case 2:
          System.out.println("You choosed 2");
          checkChoice = true;
          break;
        case 3:
          System.out.println("You choosed 3");
          checkChoice = true;
          break;
        case 4:
          checkChoice = true;
          break;

        case 9:
          System.out.println("You choosed QUIT");
          checkChoice = true;
          break;

        default:
          System.out.println("\nIt has to be between 1,2,3 or 9");
          System.out.println("Try again");
          menu.printMenu();
          choice = menu.readChoice();
          checkChoice = false;
      }
    } while (!checkChoice);
  }
}


