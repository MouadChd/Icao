package Presentation;

import Metier.MetierImpl;
import dao.DaoImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("résultat :" +metier.calcul());
    }
}
