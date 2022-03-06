import DataModels.Operation;
import DataModels.Polinom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {
    @Test
    public void test(){
        String pol1="2x^3+2x^2+2";
        String pol2="x^3+x^2+1";
        Polinom polinom1= Polinom.createPolinom(pol1);
        Polinom polinom2=Polinom.createPolinom(pol2);
        String rez="1.0x^3+1.0x^2+1.0x^0";
        Operation op=new Operation();
        Assertions.assertTrue(op.subtraction(polinom1,polinom2).toString().equals(rez));
    }
}
