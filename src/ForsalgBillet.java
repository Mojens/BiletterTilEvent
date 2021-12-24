import java.util.ArrayList;

/**
 * @Author Mohammad Adel Murtada
 */
public class ForsalgBillet extends Billet {
  private int pris;
  ArrayList<Billet> forsalgBillet = new ArrayList<>();

  public void setPris(int pris) {
    this.pris = pris;
  }

  public int getPris() {
    return pris;
  }

}
