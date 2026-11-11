package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import modell.Adatok;
import nezet.NewJFrame;

public class Vezerlo {
    private NewJFrame nezet;
    private Adatok modell;

    public Vezerlo(NewJFrame nezet, Adatok modell) {
        this.nezet = nezet;
        this.modell = modell;
        
        JTextField txt = nezet.getTxtField();
        JSpinner num = nezet.getNumSzam();
        
        txt.setText(modell.getSzoveg());
        num.setValue(modell.getSzam());
        
        /* itt adjuk meg a kattintás eseményt */
        JButton btn = nezet.getBtnDuplaz();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ertek = (int)num.getValue();
                num.setValue(ertek * 2);
                
                /* VIGYÁZAT: a modell nem frissült!!!! */
                System.out.println(modell.getSzam());
            }
        });
    }
}
