
package pruebagestionlab;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ComboBoxTresAnidado {//extends JFrame {

    private JComboBox combo1;

    private JComboBox combo2;
    private JComboBox combo3;

    public static void main(String[] args) {
        new PruebaCombos();
        ComboBoxTresAnidado v = new ComboBoxTresAnidado();
        //v.setVisible(true);

    }

    public ComboBoxTresAnidado() {
        JFrame v = new JFrame();
        v.getContentPane().setLayout(new FlowLayout());
        combo1 = new JComboBox();
        //combo1.setBounds(80, 60, 150, 25);
        rellenaCombo1();
        combo1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                rellenaCombo2((String) combo1.getSelectedItem());
                
                rellenaCombo3((String) combo2.getSelectedItem());
             
            }
      });
        
            

        combo2 = new JComboBox();
        //combo2.setBounds(240, 60, 150, 25);
        rellenaCombo2((String) combo1.getSelectedItem());
        
        combo3 = new JComboBox();
        //combo2.setBounds(240, 60, 150, 25);
        rellenaCombo3((String) combo2.getSelectedItem());

        v.getContentPane().add(combo1);
        v.getContentPane().add(combo2);
        v.getContentPane().add(combo3);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
    }

    private void rellenaCombo1() {
        combo1.addItem("letras");
        combo1.addItem("numeros");
    }

    private void rellenaCombo2(String seleccionEnCombo1) {
        combo2.removeAllItems();
        if (seleccionEnCombo1.equals("letras")) {
            combo2.addItem("A");
            combo2.addItem("B");
            combo2.addItem("C");
        } else if (seleccionEnCombo1.equals("numeros")) {
            combo2.addItem("1");
            combo2.addItem("2");
            combo2.addItem("3");
        }

    }
    private void rellenaCombo3(String seleccionEnCombo2) {
        combo3.removeAllItems();
        if (seleccionEnCombo2.equals("A")) {
            combo3.addItem("A.1");
            combo3.addItem("A.2");
            combo3.addItem("A.3");
        } else if (seleccionEnCombo2.equals("B")) {
            combo3.addItem("B.1");
            combo3.addItem("B.2");
            combo3.addItem("B.3");
        } else if (seleccionEnCombo2.equals("C")) {
            combo3.addItem("C.1");
            combo3.addItem("C.2");
            combo3.addItem("C.3");
        }else if (seleccionEnCombo2.equals("1")) {
            combo3.addItem("1.1");
            combo3.addItem("1.2");
            combo3.addItem("1.3");
        }else if (seleccionEnCombo2.equals("2")) {
            combo3.addItem("2.1");
            combo3.addItem("2.2");
            combo3.addItem("2.3");
        }else if (seleccionEnCombo2.equals("3")) {
            combo3.addItem("3.1");
            combo3.addItem("3.2");
            combo3.addItem("3.3");
        }
    }

    private static class PruebaCombos {

        public PruebaCombos() {
        }
    }

}

