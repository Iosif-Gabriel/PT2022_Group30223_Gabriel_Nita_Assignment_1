import DataModels.Operation;
import DataModels.Polinom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegrationTest {
    @Test
    public void test(){
        String pol1="2x^3+x^2+1";
        Polinom polinom1= Polinom.createPolinom(pol1);
        String rez="0.5x^4+0.33x^3+1.0x^1";
        Operation op=new Operation();
        Assertions.assertTrue(op.integration(polinom1).toString().equals(rez));
    }
}
