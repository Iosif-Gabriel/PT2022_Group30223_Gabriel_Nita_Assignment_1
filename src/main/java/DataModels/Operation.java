package DataModels;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    public Polinom addition(Polinom pol1, Polinom pol2) {
        Polinom rezultat = new Polinom(pol1);
        List<Monomial> lmon1 = new ArrayList<>(pol1.getPoli());
        List<Monomial> lmon2 = new ArrayList<>(pol2.getPoli());
        for (Monomial mon1 : pol1.getPoli()) {
            for (Monomial mon2 : lmon2) {
                if (mon1.getGrad() == mon2.getGrad()) {
                    Monomial res = new Monomial(mon1.getCoeficient() + mon2.getCoeficient(), mon1.getGrad());
                    lmon1.remove(mon1);
                    lmon1.add(res);
                    break;
                }
            }
        }
        for (Monomial mon2 : lmon2) {
            int ok = 1;
            for (Monomial mon1 : lmon1) {
                if (mon1.getGrad() == mon2.getGrad()) {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) {
                Monomial res = new Monomial(mon2.getCoeficient(), mon2.getGrad());
                lmon1.add(res);
            }
        }
        rezultat.setPoli(lmon1);
        return rezultat;
    }


    public Polinom subtraction(Polinom pol1, Polinom pol2) {
        Polinom rezultat = new Polinom(pol1);
        List<Monomial> lmon1 = new ArrayList<>(pol1.getPoli());
        List<Monomial> lmon2 = new ArrayList<>(pol2.getPoli());
        for (Monomial mon1 : pol1.getPoli()) {
            for (Monomial mon2 : lmon2) {
                if (mon1.getGrad() == mon2.getGrad()) {
                    Monomial res = new Monomial(mon1.getCoeficient() - mon2.getCoeficient(), mon1.getGrad());
                    lmon1.remove(mon1);
                    lmon1.add(res);
                    break;
                }
            }
        }
        for (Monomial mon2 : lmon2) {
            int ok = 1;
            for (Monomial mon1 : lmon1) {
                if (mon1.getGrad() == mon2.getGrad()) {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) {
                Monomial res = new Monomial((-mon2.getCoeficient()), mon2.getGrad());
                lmon1.add(res);
            }
        }
        rezultat.setPoli(lmon1);
        return rezultat;
    }

    public  Polinom integration(Polinom poli) {
        for (Monomial mon : poli.getPoli()) {
            mon.setGrad(mon.getGrad() + 1);
            double res = mon.getCoeficient() / mon.getGrad();
            mon.setCoeficient(Double.parseDouble(new DecimalFormat("00.00").format(res)));
        }
        return poli;
    }

    public Polinom derivation(Polinom p1) {
        for (Monomial mon : p1.getPoli()) {
            if (mon.getCoeficient() > 0) {
                mon.setCoeficient(mon.getGrad() * mon.getCoeficient());
                mon.setGrad(mon.getGrad() - 1);
            } else {
                mon.setCoeficient(0);
            }
        }
        return p1;
    }

    public Polinom multiplication(Polinom pol1, Polinom pol2) {
        Polinom rezultat = new Polinom();
        List<Monomial> lmon1 = new ArrayList<>(pol1.getPoli());
        List<Monomial> lmon2 = new ArrayList<>(pol2.getPoli());
        List<Monomial> rez = new ArrayList<>();
        for (Monomial mon1 : lmon1) {
            for (Monomial mon2 : lmon2) {
                Monomial res = new Monomial(mon1.getCoeficient() * mon2.getCoeficient(), mon1.getGrad() + mon2.getGrad());
                rez.add(res);
            }
        }

        for (int i = 0; i < rez.size(); i++) {
            for (int j = i + 1; j < rez.size(); j++) {
                if (rez.get(i).getGrad() == rez.get(j).getGrad()) {
                    rez.get(j).setCoeficient(rez.get(i).getCoeficient() + rez.get(j).getCoeficient());
                    rez.remove(rez.get(i));
                }
            }
        }
        rezultat.setPoli(rez);
        return rezultat;
    }

    public void division(Polinom pol1, Polinom pol2, Polinom cat, Polinom rest) {
        Polinom p1 = new Polinom();
        Polinom re = new Polinom();
        Operation op = new Operation();
        while (pol1.getPoli().size()!=0&&!(pol1.getPoli().get(0).getGrad()<pol2.getPoli().get(0).getGrad())) {
            List<Double> coef = new ArrayList<>();
            List<Integer> pow = new ArrayList<>();
            coef.add(pol1.getPoli().get(0).getCoeficient() / pol2.getPoli().get(0).getCoeficient());
            pow.add(pol1.getPoli().get(0).getGrad() - pol2.getPoli().get(0).getGrad());
            re = Polinom.makePoli(coef, pow);
            cat.addToList(re.getPoli().get(0));
            re=op.multiplication(re,pol2);
            pol1=op.subtraction(pol1,re);
            pol1.removeFromList(pol1.getPoli().get(0));
        }
        if(pol1.getPoli().size()!=0){
            for(Monomial min1:pol1.getPoli()){
                rest.addToList(min1);
            }
        }else{
            rest.addToList(new Monomial(0,0));
        }
    }

}

