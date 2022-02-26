import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class View extends JFrame implements FocusListener {

    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton buttonSubs;
    private JButton buttonAdd;
    private JButton button9;
    private JButton button8;
    private JButton button7;
    private JButton button6;
    private JButton buttonDot;
    private JButton buttonTimes;
    private JButton buttonDiv;
    private JButton buttonPower;
    private JButton buttonX;
    private JButton button_PolAddition;
    private JButton button_polSubs;
    private JButton buttonDell;
    private JButton buttonMultiply;
    private JButton buttonDevide;
    private JButton buttonDerivate;
    private JButton buttonIntegrate;
    private JTextField textPol1;
    private JTextField textPol2;
    private JLabel title;
    private JLabel labelJ;
    private JLabel pol1;
    private JLabel pol2;
    private JLabel labelRez;
    private JTextField previouslyFocusedTextBox= textPol1;


    public View() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 200, 312, 370);
        this.setResizable(false);
        title=new JLabel("Calculator");

        button0 = new JButton ("0");
        button1 = new JButton ("1");
        button2 = new JButton ("2");
        button3 = new JButton ("3");
        button4 = new JButton ("4");
        button5 = new JButton ("5");
        buttonSubs = new JButton ("-");
        buttonAdd = new JButton ("+");
        button9 = new JButton ("9");
        button8 = new JButton ("8");
        button7 = new JButton ("7");
        button6 = new JButton ("6");
        buttonDot = new JButton (".");
        buttonTimes = new JButton ("*");
        buttonDiv = new JButton ("/");
        buttonPower = new JButton ("^");
        buttonX = new JButton ("x");
        button_PolAddition = new JButton ("Addition");
        button_polSubs = new JButton ("Substraction");
        buttonDell = new JButton ("Delete");
        buttonMultiply = new JButton ("Multiply");
        buttonDevide = new JButton ("Divide");
        buttonDerivate = new JButton ("Derivate");
        buttonIntegrate = new JButton ("Integrate");
        textPol1 = new JTextField ();
        textPol2 = new JTextField ();
        textPol2.addFocusListener( this);
        textPol1.addFocusListener( this);
        textPol2.setFocusable(true);
        textPol2.setFocusable(true);
        labelJ = new JLabel ("Calculator");
        pol1 = new JLabel ("P1:");
        pol2 = new JLabel ("P2:");
        labelRez = new JLabel ("Rezultat:");




        setPreferredSize (new Dimension (298, 334));
        setLayout (null);

        this.add(title);
        this.add (button0);
        this.add (button1);
        this.add (button2);
        this.add (button3);
        this.add (button4);
        this.add (button5);
        this.add (buttonSubs);
        this.add (buttonAdd);
        this.add (button9);
        this.add (button8);
        this.add (button7);
        this.add (button6);
        this.add (buttonDot);
        this.add (buttonTimes);
        this.add (buttonDiv);
        this.add (buttonPower);
        this.add (buttonX);
        this.add (button_PolAddition);
        this.add (button_polSubs);
        this.add (buttonDell);
        this.add (buttonMultiply);
        this.add (buttonDevide);
        this.add (buttonDerivate);
        this.add (buttonIntegrate);
        this.add (textPol1);
        this.add (textPol2);
        this.add (labelJ);
        this.add (pol1);
        this.add (pol2);
        this.add (labelRez);


        button0.setBounds (150, 260, 50, 25);
        button1.setBounds (0, 260, 50, 25);
        button2.setBounds (50, 260, 50, 25);
        button3.setBounds (100, 260, 50, 25);
        button4.setBounds (0, 285, 50, 25);
        button5.setBounds (50, 285, 50, 25);
        buttonSubs.setBounds (150, 285, 50, 25);
        buttonAdd.setBounds (250, 260, 50, 25);
        button9.setBounds (100, 310, 50, 25);
        button8.setBounds (50, 310, 50, 25);
        button7.setBounds (0, 310, 50, 25);
        button6.setBounds (100, 285, 50, 25);
        buttonDot.setBounds (200, 310, 50, 25);
        buttonTimes.setBounds (200, 285, 50, 25);
        buttonDiv.setBounds (250, 285, 50, 25);
        buttonPower.setBounds (150, 310, 50, 25);
        buttonX.setBounds (200, 260, 50, 25);
        button_PolAddition.setBounds (0, 185, 110, 25);
        button_polSubs.setBounds (110, 185, 110, 25);
        buttonDell.setBounds (55, 160, 100, 25);
        buttonMultiply.setBounds (0, 210, 110, 25);
        buttonDevide.setBounds (110, 210, 110, 25);
        buttonDerivate.setBounds (0, 235, 110, 25);
        buttonIntegrate.setBounds (110, 235, 110, 25);
        textPol1.setBounds (25, 45, 250, 25);
        textPol2.setBounds (25, 80, 250, 25);
        labelJ.setBounds (115, -5, 100, 25);
        pol1.setBounds (5, 45, 20, 25);
        pol2.setBounds (5, 80, 20, 25);
        labelRez.setBounds (0, 110, 55, 25);

    }

    public String get1pol(){
       return this.textPol1.getText();
    }

    public String get2pol(){
        return this.textPol2.getText();
    }

    public void zeroListener(ActionListener actionListener){
         this.button0.addActionListener(actionListener);
    }

    public void oneListener(ActionListener actionListener){
        this.button1.addActionListener(actionListener);
    }

    public void twoListener(ActionListener actionListener){
        this.button2.addActionListener(actionListener);
    }

    public void threeListener(ActionListener actionListener){
        this.button3.addActionListener(actionListener);
    }

    public void forListener(ActionListener actionListener){
        this.button4.addActionListener(actionListener);
    }

    public void fiveListener(ActionListener actionListener){
        this.button5.addActionListener(actionListener);
    }

    public void sixListener(ActionListener actionListener){
        this.button6.addActionListener(actionListener);
    }

    public void sevenListener(ActionListener actionListener){
        this.button7.addActionListener(actionListener);
    }

    public void eightListener(ActionListener actionListener){
        this.button8.addActionListener(actionListener);
    }

    public void nineListener(ActionListener actionListener){
        this.button9.addActionListener(actionListener);
    }

    public void minusListener(ActionListener actionListener){
        this.buttonSubs.addActionListener(actionListener);
    }

    public void plusListener(ActionListener actionListener){
        this.buttonAdd.addActionListener(actionListener);
    }

    public void multiListener(ActionListener actionListener){
        this.buttonTimes.addActionListener(actionListener);
    }

    public void divideListener(ActionListener actionListener){
        this.buttonDiv.addActionListener(actionListener);
    }

    public void powerListener(ActionListener actionListener){
        this.buttonPower.addActionListener(actionListener);
    }

    public void dotListener(ActionListener actionListener){
        this.buttonDot.addActionListener(actionListener);
    }

    public void xListener(ActionListener actionListener){
        this.buttonX.addActionListener(actionListener);
    }

    public void addpolListener(ActionListener actionListener){
        this.button_PolAddition.addActionListener(actionListener);
    }

    public void subpolListener(ActionListener actionListener){
        this.button_polSubs.addActionListener(actionListener);
    }

    public void multypolListener(ActionListener actionListener){
        this.buttonMultiply.addActionListener(actionListener);
    }

    public void divpolListener(ActionListener actionListener){
        this.buttonDiv.addActionListener(actionListener);
    }

    public void derivListener(ActionListener actionListener){
        this.buttonDerivate.addActionListener(actionListener);
    }

    public void integrpolListener(ActionListener actionListener){
        this.buttonIntegrate.addActionListener(actionListener);
    }

    public void deleteListener(ActionListener actionListener){
        this.buttonDell.addActionListener(actionListener);
    }

    public JTextField getTextPol1() {
        return textPol1;
    }

    public JTextField getTextPol2() {
        return textPol2;
    }

    public JButton getButton0() {
        return button0;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButtonSubs() {
        return buttonSubs;
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButtonDot() {
        return buttonDot;
    }

    public JButton getButtonTimes() {
        return buttonTimes;
    }

    public JButton getButtonDiv() {
        return buttonDiv;
    }

    public JButton getButtonPower() {
        return buttonPower;
    }

    public JButton getButtonX() {
        return buttonX;
    }

    public JButton getButton_PolAddition() {
        return button_PolAddition;
    }

    public JButton getButton_polSubs() {
        return button_polSubs;
    }

    public JButton getButtonDell() {
        return buttonDell;
    }

    public JButton getButtonMultiply() {
        return buttonMultiply;
    }

    public JButton getButtonDevide() {
        return buttonDevide;
    }

    public JButton getButtonDerivate() {
        return buttonDerivate;
    }

    public JButton getButtonIntegrate() {
        return buttonIntegrate;
    }

    @Override
    public void focusGained(FocusEvent ev) {
        if(ev.getSource() instanceof JTextField) {
            previouslyFocusedTextBox = (JTextField) ev.getSource();
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    public JTextField getPreviouslyFocusedTextBox() {
        return previouslyFocusedTextBox;
    }
}
