import DataModels.Operation;
import DataModels.Polinom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DerivationTest {
    @Test
    public void test(){
        String pol1="2x^3";
        Polinom polinom1= Polinom.createPolinom(pol1);
        String rez="6.0x^2";
        Operation op=new Operation();
        Assertions.assertTrue(op.derivation(polinom1).toString().equals(rez));
    }
}
