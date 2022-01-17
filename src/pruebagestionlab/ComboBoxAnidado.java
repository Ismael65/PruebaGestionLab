package pruebagestionlab;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ComboBoxAnidado {//extends JFrame {

    private JComboBox combo1;

    private JComboBox combo2;

    public static void main(String[] args) {
        new PruebaCombos();
        ComboBoxAnidado v = new ComboBoxAnidado();
        //v.setVisible(true);

    }

    public ComboBoxAnidado() {
        JFrame v = new JFrame();
        v.getContentPane().setLayout(new FlowLayout());
        combo1 = new JComboBox();
        //combo1.setBounds(80, 60, 150, 25);
        rellenaCombo1();
        combo1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                rellenaCombo2((String) combo1.getSelectedItem());
            }

        });

        combo2 = new JComboBox();
        //combo2.setBounds(240, 60, 150, 25);
        rellenaCombo2((String) combo1.getSelectedItem());

        v.getContentPane().add(combo1);
        v.getContentPane().add(combo2);
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

    private static class PruebaCombos {

        public PruebaCombos() {
        }
    }

}
