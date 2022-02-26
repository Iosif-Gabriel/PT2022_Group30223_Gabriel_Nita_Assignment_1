import java.util.ArrayList;
import java.util.List;

public class Polinom {

    private List<Monomial> poli=new ArrayList<>();

    public void addToList(Monomial mono){
        this.poli.add(mono);
    }

    public void removeFromList(int pozitie){
        this.poli.remove(pozitie);
    }

    public List<Monomial> getPoli() {
        return poli;
    }

    public void setPoli(List<Monomial> poli) {
        this.poli = poli;
    }
}
