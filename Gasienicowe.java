package com.rafalmarkowski.zadanka;

public class Gasienicowe extends Pojazd {
    private int moc;
    final void uruchomiSilnik() {
        super.uruchomiSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }

    public Gasienicowe() {
    }

    public Gasienicowe(int moc) {
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }
}
