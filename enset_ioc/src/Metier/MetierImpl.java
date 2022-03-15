package Metier;

import dao.IDao;

public class MetierImpl implements iMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*540/Math.cos(temp*Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
