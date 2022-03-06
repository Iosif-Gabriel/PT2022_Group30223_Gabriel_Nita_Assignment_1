import DataModels.Operation;
import DataModels.Polinom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void test(){
        String pol1="2x^3";
        String pol2="x^3+x^2";
        Polinom polinom1= Polinom.createPolinom(pol1);
        Polinom polinom2=Polinom.createPolinom(pol2);
        String rez="2.0x^6+2.0x^5";
        Operation op=new Operation();
        Assertions.assertTrue(op.multiplication(polinom1,polinom2).toString().equals(rez));
    }
}
