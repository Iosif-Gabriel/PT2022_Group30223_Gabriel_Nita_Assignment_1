import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCalcPol {

    private View view;

    public ControllerCalcPol(View view) {
        this.view = view;
        view.zeroListener(new ZeroListener());
    }

    class ZeroListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getButton0()) {
                view.getTextPol1().setText(view.getTextPol1().getText()+"0");
            }

        }
    }
}
