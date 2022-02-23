import javax.swing.*;

public class Interfata {

    private static int HIGHT=500;
    private static int WIDTH=500;
    private static JFrame jf=new JFrame("Calculator");
    private static JLabel jl=new JLabel();
    private static JTextField jtf=new JTextField("Polinom 1");
    private static JTextField jtf2=new JTextField("Polinom 3");


    public static void main(String[] args) {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(WIDTH,HIGHT);

        jl.add(jtf);
        jl.add(jtf2);
        jf.add(jtf);
        jf.setVisible(true);
    }

}
