package DataModels;

import java.io.Serializable;

public class Monomial implements Serializable {
    private int grad;
    private double coeficient;

    public Monomial(double coeficient ,int grad ){
        this.setGrad(grad);
        this.setCoeficient(coeficient);
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(double coeficient) {
        this.coeficient = coeficient;
    }


}
