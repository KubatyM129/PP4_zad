public class Payment {
    
    private String title;
    private int netto;
    private int vat;

    public Payment(String name, int netto, int vat) {
        this.title = name;
        this.netto = netto;
        this.vat = vat;
    }

    public String getTitle() {
        return title;
    }

    public int getNetto() {
        return netto;
    }

    public int getVat() {
        return vat;
    }

}
