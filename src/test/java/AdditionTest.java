import DataModels.Operation;
import DataModels.Polinom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class AdditionTest {
    @Test
    public void Addition(){
        String pol1="x^3+2x^2+2";
        String pol2="x^3+x^2+1";
        Polinom polinom1= Polinom.createPolinom(pol1);
        Polinom polinom2=Polinom.createPolinom(pol2);
        String rez="2.0x^3+3.0x^2+3.0x^0";
        Operation op=new Operation();
        Assertions.assertTrue(op.addition(polinom1,polinom2).toString().equals(rez));
    }
}
