import java.util.ArrayList;

/**
 * @Author Mohammad Adel Murtada
 */
public class StudierabatBillet extends Billet {
  private int pris;
  private String studieID;
  ArrayList<Billet> StudierabatBillet = new ArrayList<>();

  public void setPris(int pris) {
    this.pris = pris;
  }

  public int getPris() {
    return pris;
  }
}
