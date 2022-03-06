package DataModels;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom {

    private List<Monomial> poli = new ArrayList<>();

    public Polinom(Polinom pol1) {
        this.poli=sortPoli(pol1.getPoli());
    }
    public Polinom() {
        super();
    }

    public void addToList(Monomial mono) {
        this.poli.add(mono);
    }

    public void removeFromList(Monomial pozitie) {
        this.poli.remove(pozitie);
    }

    public List<Monomial> getPoli() {
        return poli;
    }

    public void setPoli(List<Monomial> poli) {
        this.poli = sortPoli(poli);
    }

    public List<Monomial> sortPoli(List<Monomial> poli){
        poli.sort(Comparator.comparingInt(Monomial::getGrad).reversed());
        return poli;
    }

    public static void verifPoli(String poli) throws Exception {
        String cor = "459+678-x^0123";
        int merge;
        if(!poli.isEmpty()){
            for (int i = 0; i < poli.length(); i++) {
                merge = 0;
                for(int k=0;k<cor.length();k++){
                    if (poli.charAt(i) == cor.charAt(k) || poli.charAt(i) == '.') {
                        merge = 1;
                        break;
                    }
                }
                if (merge == 0)
                    throw new Exception("Nu e polinom");
            }

        }else{
            throw new Exception("Empty");
        }


    }

    public static String transformarePoliCoefPutere(String polinom) {
        StringBuilder res = new StringBuilder(polinom);
        int k = polinom.length() - 1;
        int nr=0;
        try{
            Double.parseDouble(polinom);
            res.insert(polinom.length(), "x^0");
            polinom = res.toString();
        }catch (Exception e){
            if (k > 1) {
                while (Character.isDigit(polinom.charAt(k))) {
                    k--;
                    nr++;
                }
                if (polinom.charAt(k) == '-' || polinom.charAt(k) == '+')
                    k++;
                if (Character.isDigit(polinom.charAt(k))) {
                    res.insert(k + nr, "x^0");
                    polinom = res.toString();
                }
            }else if((k==0 && Character.isDigit(polinom.charAt(k)))  ){
                res.insert(k + 1, "x^0");
                polinom = res.toString();
            }
        }
        polinom = transformare2(polinom, res);
       if(isDouble(polinom.substring(polinom.length()-4,polinom.length()-1)))
           polinom=polinom+"x^0";
        return polinom;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String transformare2(String polinom, StringBuilder res) {
        for (int i = 0; i < polinom.length(); i++) {
            if (polinom.charAt(i) == 'x' & i == 0) {
                res.insert(i, '1');
                polinom = res.toString();
            }
            if (i > 0 && (polinom.charAt(i - 1) == '+' || polinom.charAt(i - 1) == '-') && !Character.isDigit(polinom.charAt(i))) {
                res.insert(i, '1');
                polinom = res.toString();
            }
            if ((i == polinom.length() - 1 && polinom.charAt(i) == 'x')) {
                res.insert(i + 1, "^1");
                polinom = res.toString();
            } else if (polinom.charAt(i) == 'x' && polinom.charAt(i + 1) != '^') {
                res.insert(i + 1, "^1");
                polinom = res.toString();
            }
        }
        return polinom;
    }


    public static List<Integer> findPutere(String polinom) {
       List<Integer> pow=new ArrayList<Integer>();
        final Pattern pattern=Pattern.compile("(-?\\d+)|\\^(-?\\d+)");
        final Matcher matcher=pattern.matcher(polinom);
        while(matcher.find()){
            if(matcher.group(2)!=null)
            pow.add(Integer.parseInt(matcher.group(2)));
        }

        return pow;
    }


    public static List<Double> findCoeficient(String polinom) {
        List<Double> coef=new ArrayList<Double>();
        final Pattern pattern=Pattern.compile("(-?(\\d*\\.?\\d+))|\\^(-?\\d+)");
        final Matcher matcher=pattern.matcher(polinom);
        while(matcher.find()){
            if(matcher.group(1)!=null)
                coef.add(Double.parseDouble(matcher.group(1)));
        }
        return coef;
    }

    public static Polinom makePoli(List<Double> coef,List<Integer>pow){
        Monomial res;
        Polinom poli1=new Polinom();
        for(int m=0;m<pow.size();m++){
            res=new Monomial(coef.get(m),pow.get(m));
            poli1.addToList(res);
        }
        return poli1;

    }

    public static Polinom createPolinom(String poli){
        List<Double> coef;
        List<Integer> pow;
        String res="";
        Polinom poli1;
        res=Polinom.transformarePoliCoefPutere(poli);
        coef=Polinom.findCoeficient(res);
        pow=Polinom.findPutere(res);
        poli1=Polinom.makePoli(coef,pow);
        return poli1;
    }

    @Override
    public String toString() {
        StringBuilder poli= new StringBuilder();
        for( Monomial mon:this.poli ){
            if(mon.getCoeficient()!=0){
                if(mon.getCoeficient()>0){
                    poli.append("+").append(mon.getCoeficient()).append("x^").append(mon.getGrad());
                }
                else{
                    poli.append(mon.getCoeficient()).append("x^").append(mon.getGrad());
                }
            }
        }
        if(poli.length()!=0 && poli.charAt(0)=='+')
        poli = new StringBuilder(poli.substring(1));

        if (poli.isEmpty()) {
            return "0";
        }else{
            return poli.toString();
        }
    }

}
