import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerCalcPol {

    private View view;

    public ControllerCalcPol(View view) {
        this.view = view;
        view.zeroListener(new ZeroListener());
        view.oneListener(new OneListener());
        view.twoListener(new TwoListener());
        view.threeListener(new ThreeListener());
        view.forListener(new FourListener());
        view.fiveListener(new FiveListener());
        view.sixListener(new SixListener());
        view.sevenListener(new SevenListener());
        view.eightListener(new EightListener());
        view.nineListener(new NineListener());
        view.powerListener(new PowerListener());
        view.dotListener(new DotListener());
        view.plusListener(new PlusListener());
        view.minusListener(new MinusListener());
        view.divideListener(new DivideListener());
        view.multiListener(new MultiplyListener());
        view.xListener(new XListener());
        view.deleteListener(new DeleteListener());
    }

    class ZeroListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton0()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"0");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"0");
                }

            }

        }

    }
    class OneListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton1()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"1");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"1");
                }

            }

        }

    }

    class TwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton2()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"2");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"2");
                }

            }

        }

    }

    class ThreeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton3()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"3");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"3");
                }

            }

        }

    }

    class FourListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton4()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"4");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"4");
                }

            }

        }

    }

    class FiveListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton5()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"5");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"5");
                }

            }

        }

    }

    class SixListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton6()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"6");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"6");
                }

            }

        }

    }

    class SevenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton7()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"7");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"7");
                }

            }

        }

    }

    class EightListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton8()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"8");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"8");
                }

            }
        }
    }

    class NineListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton9()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"9");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"9");
                }

            }

        }

    }

    class PowerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonPower()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"^");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"^");
                }

            }

        }

    }

    class DotListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDot()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+".");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+".");
                }

            }
        }
    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonAdd()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"+");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"+");
                }

            }
        }
    }

    class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonSubs()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"-");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"-");
                }

            }
        }
    }

    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonTimes()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"*");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"*");
                }

            }
        }
    }

    class DivideListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDiv()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"/");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"/");
                }

            }
        }
    }

    class XListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonX()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"x");
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"x");
                }

            }
        }
    }

    class DeleteListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDell()) {

                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol1())){
                    String res=view.getTextPol1().getText().substring(0, view.getTextPol1().getText().length()-1);
                    view.getTextPol1().setText(res);
                }
                if(view.getPreviouslyFocusedTextBox().equals(view.getTextPol2())){
                    String res=view.getTextPol2().getText().substring(0, view.getTextPol2().getText().length()-1);
                    view.getTextPol2().setText(res);
                }

            }
        }
    }
}
