
package pruebagestionlab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ubicacion_2 extends JFrame {//implements ActionListener{

        public JLabel labelTituloPrincipal, labelEstado,labelMunicipio, labelParroquia;
        public JComboBox comboEstado, comboMunicipio, comboParroquia;
        public String Estado, Municipio;
        
public static void main(String args[]) {
        // TODO code application logic here
   Ubicacion_2 construccion = new Ubicacion_2();
   construccion.setBounds(0,0,600,300);
   construccion.setVisible(true);
   construccion.setResizable(false);
   construccion.setLocationRelativeTo(null);
}    

public Ubicacion_2() {
    setLayout(null);    
    //JFrame v = new JFrame();
        //v.getContentPane().setLayout(new FlowLayout());
        comboEstado = new JComboBox();
        comboEstado.setBounds(80, 60, 150, 25);
        rellenaComboEstado();
        comboEstado.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                rellenaComboMunicipio((String) comboEstado.getSelectedItem());
            }
     
        });

        comboMunicipio = new JComboBox();
        comboMunicipio.setBounds(240, 60, 150, 25);
        rellenaComboMunicipio((String) comboEstado.getSelectedItem());

        //add(comboEstado);
        add(comboMunicipio);
        
        //v.getContentPane().add(comboEstado);
        //v.getContentPane().add(comboMunicipio);
        //v.pack();
        //v.setVisible(true);
        //v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        

        labelTituloPrincipal = new JLabel("Gestión de Laboratorio");
        labelTituloPrincipal.setBounds(5, 5, 200, 25);
        labelTituloPrincipal.setFont(new Font("Andale Mono", 1, 15));
        labelTituloPrincipal.setForeground(new Color(255, 0, 0));
        add(labelTituloPrincipal);
        
       labelEstado = new JLabel("Estado");
        labelEstado.setBounds(80, 40, 150, 25);
        labelEstado.setFont(new Font("Andale Mono", 1, 12));
        labelEstado.setForeground(new Color(255, 0, 0));
        add(labelEstado);

// ***********  comboEstado ************        
        //comboEstado = new JComboBox();
        //comboEstado.setBounds(80, 60, 150, 25);
        comboEstado.setBackground(new java.awt.Color(224, 224, 224));
        comboEstado.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboEstado.setForeground(new java.awt.Color(255, 0, 0));
        
// ************ comboMunicipio**********
        labelMunicipio = new JLabel("Municipio");
        labelMunicipio.setBounds(240, 40, 150, 25);
        labelMunicipio.setFont(new Font("Andale Mono", 1, 12));
        labelMunicipio.setForeground(new Color(255, 0, 0));
        add(labelMunicipio);

        //comboMunicipio = new JComboBox();
        //comboMunicipio.setBounds(240, 60, 150, 25);
        comboMunicipio.setBackground(new java.awt.Color(224, 224, 224));
        comboMunicipio.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboMunicipio.setForeground(new java.awt.Color(255, 0, 0));
         
         
    }


   
    
    public void rellenaComboEstado(){

// ******************** comboEstado ***********************        
        /*labelEstado = new JLabel("Estado");
        labelEstado.setBounds(80, 40, 150, 25);
        labelEstado.setFont(new Font("Andale Mono", 1, 12));
        labelEstado.setForeground(new Color(255, 0, 0));
        add(labelEstado);

        comboEstado = new JComboBox();
        comboEstado.setBounds(80, 60, 150, 25);
        comboEstado.setBackground(new java.awt.Color(224, 224, 224));
        comboEstado.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboEstado.setForeground(new java.awt.Color(255, 0, 0));
        add(comboEstado);*/
        add(comboEstado);
        comboEstado.addItem("");
        comboEstado.addItem("Amazonas");
        comboEstado.addItem("Anzoátegui");
        comboEstado.addItem("Apure");
        comboEstado.addItem("Aragua");
        comboEstado.addItem("Barinas");
        comboEstado.addItem("Bolívar");
        comboEstado.addItem("Carabobo");
        comboEstado.addItem("Cojedes");
        comboEstado.addItem("Delta Amacuro");
        comboEstado.addItem("Distrito Capital");
        comboEstado.addItem("Falcón");
        comboEstado.addItem("Guárico");
        comboEstado.addItem("Lara");
        comboEstado.addItem("Mérida");
        comboEstado.addItem("Miranda");
        comboEstado.addItem("Monagas");
        comboEstado.addItem("Nueva Esparta");
        comboEstado.addItem("Portuguesa");
        comboEstado.addItem("Sucre");
        comboEstado.addItem("Táchira");
        comboEstado.addItem("Trujillo");
        comboEstado.addItem("Vargas");
        comboEstado.addItem("Yaracuy");
        comboEstado.addItem("Zulia");
    }
    
    
    public void rellenaComboMunicipio(String seleccionEnComboEstado){
// ******************** comboMunicipio *************************       
         
        comboMunicipio.removeAllItems();
        if (seleccionEnComboEstado.equals("Amazonas")) {
            comboMunicipio.addItem("A");
            comboMunicipio.addItem("B");
            comboMunicipio.addItem("C");
        } else if (seleccionEnComboEstado.equals("Anzoátegui")) {
            comboMunicipio.addItem("1");
            comboMunicipio.addItem("2");
            comboMunicipio.addItem("3"); 
        }
         //add(comboMunicipio); 
    }

    /*  

//* MUNICIPIOS DE AMAZONAS
            comboMunicipio.addItem("");
            comboMunicipio.addItem("Alto Orinoco");
            comboMunicipio.addItem("Atabapo");
            comboMunicipio.addItem("Atures");
            comboMunicipio.addItem("Autana");
            comboMunicipio.addItem("Maroa");
            comboMunicipio.addItem("Manapiare");
            comboMunicipio.addItem("Río Negro");
            add(comboMunicipio);

//MUNICIPIOS DE ANZOÁTEGUI
            comboMunicipio.addItem("");
            comboMunicipio.addItem("Anaco");
            comboMunicipio.addItem("Aragua");
            comboMunicipio.addItem("Fernando Peñalver");
            comboMunicipio.addItem("Francisco del Carmen Carvajal");
            comboMunicipio.addItem("Francisco de Miranda");
            comboMunicipio.addItem("Guanta");
            comboMunicipio.addItem("Independencia");
            comboMunicipio.addItem("Juan Antonio Sotillo");
            comboMunicipio.addItem("Juan Manuel Cajigal");
            comboMunicipio.addItem("José Gregorio Monagas");
            add(comboMunicipio);
    }
    
    public void rellenaComboParroquia(){
// ******************** comoParroquia  ******************** ****        
        labelParroquia = new JLabel("Parroquia");
        labelParroquia.setBounds(400, 40, 150, 25);
        labelParroquia.setFont(new Font("Andale Mono", 1, 12));
        labelParroquia.setForeground(new Color(255, 0, 0));
        add(labelParroquia);

        comboParroquia = new JComboBox();
        comboParroquia.setBounds(400, 60, 150, 25);
        comboParroquia.setBackground(new java.awt.Color(224, 224, 224));
        comboParroquia.setFont(new java.awt.Font("Andale Mono", 1, 14));
        comboParroquia.setForeground(new java.awt.Color(255, 0, 0));
        add(comboParroquia);

//* PARROQUIAS Amazonas	Alto Orinoco
            comboParroquia.addItem("");
            comboParroquia.addItem("Huachamacare");
            comboParroquia.addItem("Marawara");
            comboParroquia.addItem("Mavaca");
            comboParroquia.addItem("Sierra Parima");
            add(comboParroquia);

//* PARROQUIAS Amazonas Atabapo
            comboParroquia.addItem("");
            comboParroquia.addItem("Ucata");
            comboParroquia.addItem("Yapacana");
            comboParroquia.addItem("Caname");
            add(comboParroquia);

//* PARROQUIAS Amazonas Atures
             comboParroquia.addItem("");
            comboParroquia.addItem("Fernando Girón Tovar");
            comboParroquia.addItem("Luis Alberto Gómez");
            comboParroquia.addItem("Parhueña");
            comboParroquia.addItem("Plantanillal");
            add(comboParroquia);
    }*/

    


    public static class seleccionEnComboEstado {

        public seleccionEnComboEstado() {
        }
    }
}
   
