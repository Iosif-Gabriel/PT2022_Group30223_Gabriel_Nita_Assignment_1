package Controller;

import DataModels.Operation;
import DataModels.Polinom;
import View.View;

import javax.swing.*;
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
        view.xListener(new XListener());
        view.deleteListener(new DeleteListener());
        view.addpolListener(new AdditionListener());
        view.integrpolListener(new IntegrationListener());
        view.derivListener(new DerivationListener());
        view.subpolListener(new SubtractionListener());
        view.multypolListener(new MultiplicationListener());
        view.divpolListener(new DivisonListener());
    }

    class ZeroListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton0()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"0");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"0");
                }

            }

        }

    }
    class OneListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton1()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"1");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"1");
                }

            }

        }

    }

    class TwoListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton2()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"2");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"2");
                }

            }

        }

    }

    class ThreeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton3()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"3");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"3");
                }

            }

        }

    }

    class FourListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton4()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"4");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"4");
                }

            }

        }

    }

    class FiveListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton5()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"5");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"5");
                }

            }

        }

    }

    class SixListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton6()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"6");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"6");
                }

            }

        }

    }

    class SevenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton7()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"7");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"7");
                }

            }

        }

    }

    class EightListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton8()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"8");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"8");
                }

            }
        }
    }

    class NineListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton9()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"9");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"9");
                }

            }

        }

    }

    class PowerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonPower()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"^");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"^");
                }

            }

        }

    }

    class DotListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDot()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+".");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+".");
                }

            }
        }
    }

    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonAdd()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"+");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"+");
                }

            }
        }
    }

    class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonSubs()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"-");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"-");
                }

            }
        }
    }

    class XListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonX()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    view.getTextPol1().setText(view.getTextPol1().getText()+"x");
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    view.getTextPol2().setText(view.getTextPol2().getText()+"x");
                }

            }
        }
    }

    class DeleteListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDell()) {

                if(view.getPrevFocusBox().equals(view.getTextPol1())){
                    String res=view.getTextPol1().getText().substring(0, view.getTextPol1().getText().length()-1);
                    view.getTextPol1().setText(res);
                }
                if(view.getPrevFocusBox().equals(view.getTextPol2())){
                    String res=view.getTextPol2().getText().substring(0, view.getTextPol2().getText().length()-1);
                    view.getTextPol2().setText(res);
                }

            }
        }
    }

    class AdditionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton_PolAddition()){
            String pol1=view.getTextPol1().getText();
            String pol2=view.getTextPol2().getText();
            Operation op=new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom.verifPoli(pol2);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom polinom2=new Polinom(Polinom.createPolinom(pol2));
                    Polinom addition=op.addition(polinom1,polinom2);
                    JOptionPane.showMessageDialog(null,"Adunare:"+addition);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    class SubtractionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton_polSubs()){
                String pol1=view.getTextPol1().getText();
                String pol2=view.getTextPol2().getText();
                Operation op= new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom.verifPoli(pol2);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom polinom2=new Polinom(Polinom.createPolinom(pol2));
                    Polinom subtraction=op.subtraction(polinom1,polinom2);
                    JOptionPane.showMessageDialog(null,"Scadere:"+subtraction);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    class IntegrationListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonIntegrate()){
                String pol1=view.getTextPol1().getText();
                String pol2=view.getTextPol2().getText();
                Operation op=new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom integrare= op.integration(polinom1);
                    if(!pol2.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Se integreaza doar polionomul 1");
                    }
                    JOptionPane.showMessageDialog(null,"Integrare:"+integrare);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    class DerivationListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDerivate()){
                String pol1=view.getTextPol1().getText();
                String pol2=view.getTextPol2().getText();
                Operation op=new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom derivare= op.derivation(polinom1);
                    if(!pol2.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Se deriveaza doar polionomul 1");
                    }
                    JOptionPane.showMessageDialog(null,"Derivare:"+ derivare);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    class MultiplicationListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonMultiply()){
                String pol1=view.getTextPol1().getText();
                String pol2=view.getTextPol2().getText();
                Operation op=new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom.verifPoli(pol2);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom polinom2=new Polinom(Polinom.createPolinom(pol2));
                    Polinom multiply=op.multiplication(polinom1,polinom2);
                    JOptionPane.showMessageDialog(null,"Inmultire:"+ multiply);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }

    class DivisonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButtonDevide()){
                String pol1=view.getTextPol1().getText();
                String pol2=view.getTextPol2().getText();
                Operation op=new Operation();
                try {
                    Polinom.verifPoli(pol1);
                    Polinom.verifPoli(pol2);
                    Polinom polinom1=new Polinom(Polinom.createPolinom(pol1));
                    Polinom polinom2=new Polinom(Polinom.createPolinom(pol2));
                    if (polinom1.getPoli().get(0).getGrad() < polinom2.getPoli().get(0).getGrad()) {
                        throw new Exception("Polinomul 1 trebuie sa aibe puterea mai mare");
                    }
                    Polinom cat=new Polinom();
                    Polinom rest=new Polinom();
                    op.division(polinom1,polinom2,cat,rest);
                    JOptionPane.showMessageDialog(null,"Impartire: " +"Cat:"+cat+" "+"Rest:"+rest);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }
}
