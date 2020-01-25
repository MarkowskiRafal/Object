package com.rafalmarkowski.zadanka;

public class Main {

    public static void main(String[] args) {

        Osobowy firstCar = new Osobowy();
        firstCar.setRokProdukcji(2019);
        firstCar.setRodzajSilnika("elektryczny");
        firstCar.setKolor("bialy");
        firstCar.setMasa(1200);
        firstCar.setRozmiarOpony("195/70 R15");
        firstCar.setIloscOsob(4);

        Osobowy secondCar = new Osobowy();
        secondCar.setRokProdukcji(2012);
        secondCar.setRodzajSilnika("benzynowy");
        secondCar.setKolor("czerwony");
        secondCar.setMasa(1500);
        secondCar.setRozmiarOpony("185/80 R16");
        secondCar.setIloscOsob(5);

        Osobowy thirdCar = new Osobowy();
        thirdCar.setRokProdukcji(2009);
        thirdCar.setRodzajSilnika("diesel");
        thirdCar.setKolor("niebieski");
        thirdCar.setMasa(1800);
        thirdCar.setRozmiarOpony("195/80 R17");
        thirdCar.setIloscOsob(5);



    }
}
