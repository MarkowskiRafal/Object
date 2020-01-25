package com.rafalmarkowski.zadanka;

public class Kolowe extends Pojazd {
    private String rozmiarOpony;

    void uruchomiSilnik(String rodzajSilnika) {
        System.out.println("uruchomiono silnik " + rodzajSilnika);
    }

    public Kolowe() {
    }

    public Kolowe(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }
}
