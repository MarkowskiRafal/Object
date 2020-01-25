package com.rafalmarkowski.zadanka;

 /* private class Pojazd { */
 /* protected class Pojazd {*/
 /* class Pojazd { */

    public class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private int masa;
    void uruchomiSilnik() {
        System.out.println("Silnik uruchomiono");
    }

    public Pojazd() {
    }

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, int masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }


    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
}
