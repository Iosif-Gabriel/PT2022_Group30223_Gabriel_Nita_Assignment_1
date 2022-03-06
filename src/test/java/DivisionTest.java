import DataModels.Operation;
import DataModels.Polinom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    public void test()  {
        String pol1="2x^3+8x^2-6x+10";
        String pol2="x-2";
        Polinom polinom1= Polinom.createPolinom(pol1);
        Polinom polinom2=Polinom.createPolinom(pol2);
        Polinom catp=new Polinom();
        Polinom restp=new Polinom();
        String cat="2.0x^2+12.0x^1+18.0x^0";
        String rest="46.0x^0";
        Operation op=new Operation();
        op.division(polinom1,polinom2,catp,restp);
        Assertions.assertTrue(catp.toString().equals(cat));
        Assertions.assertTrue(restp.toString().equals(rest));
    }
}
