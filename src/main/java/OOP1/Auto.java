package OOP1;

public class Auto {
    String kennzeichen;
    int tankvolumen;
    float kraftstoffverbrauch;
    int kmStandAnfang;
    int kmStandEnde;
    Auto (String kennzeichen, int tankvolumen, double kraftstoffverbrauch, int kmStandAnfang, int kmStandEnde) {
        this.kennzeichen = kennzeichen;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = (float) kraftstoffverbrauch;
        this.kmStandAnfang = kmStandAnfang;
        this.kmStandEnde = kmStandEnde;
    }
    public float tanken() {
        return (kmStandEnde - kmStandAnfang) * kraftstoffverbrauch / 100;
    }
    public int fahren() {
        return kmStandEnde - kmStandAnfang;
    }
}