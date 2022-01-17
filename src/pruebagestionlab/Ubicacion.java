
package pruebagestionlab;

//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
//import javax.swing.WindowConstants;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class Ubicacion extends JFrame {

       private final JLabel labelTituloPrincipal;
    private final JLabel labelEstado;

        private final JLabel labelMunicipio;
        private JComboBox comboEstado, comboMunicipio;
        
        public static void main(String args[]) {
        
        Ubicacion construccion = new Ubicacion();
        construccion.setBounds(0, 0, 600, 300);
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);
    }


    public Ubicacion() {
      
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
        //add(comboMunicipio);
        
        //v.getContentPane().add(comboEstado);
        //v.getContentPane().add(comboMunicipio);
        //v.pack();
        //v.setVisible(true);
        //v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
      labelTituloPrincipal = new JLabel("Gestión de Laboratorio");  
      labelTituloPrincipal.setBounds(5, 5,200,25);
      labelTituloPrincipal.setFont(new Font("Andale Mono", 1, 15));
      labelTituloPrincipal.setForeground(new Color(255, 0, 0));
      add(labelTituloPrincipal);

      labelEstado = new JLabel("Estado");
      labelEstado.setBounds(80,40,150,25);
      labelEstado.setFont(new Font("Andale Mono", 1, 12));
      labelEstado.setForeground(new Color(255, 0, 0));
      add(labelEstado);

    comboEstado = new JComboBox();
    //comboEstado.setBounds(80,60,150,25);
    comboEstado.setBackground(new java.awt.Color(224,224,224));
    comboEstado.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboEstado.setForeground(new java.awt.Color(255,0,0));
    
    labelMunicipio = new JLabel("Municipio");
      labelMunicipio.setBounds(240,40, 150, 25);
      labelMunicipio.setFont(new Font("Andale Mono", 1, 12));
      labelMunicipio.setForeground(new Color(255, 0, 0));
      add(labelMunicipio);

    comboMunicipio = new JComboBox();
    //comboMunicipio.setBounds(240,60,150,25);
    comboMunicipio.setBackground(new java.awt.Color(224,224,224));
    comboMunicipio.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboMunicipio.setForeground(new java.awt.Color(255,0,0));
    
    }
    
    public void rellenaComboEstado(){
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
     add(comboMunicipio);
       comboMunicipio.removeAllItems();
        if (seleccionEnComboEstado.equals("Amazonas")){
               //comboMunicipio.addItem("");
               comboMunicipio.addItem("Alto Orinoco");
               comboMunicipio.addItem("Atabapo");
               comboMunicipio.addItem("Atures");
               comboMunicipio.addItem("Autana");
               comboMunicipio.addItem("Maroa");
               comboMunicipio.addItem("Manapiare");
               comboMunicipio.addItem("Río Negro");
        }else  if (seleccionEnComboEstado.equals("Anzoátegui")){
               //comboMunicipio.addItem("");
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
        }else if (seleccionEnComboEstado.equals("Apure")){
               //comboMunicipio.addItem("");
               comboMunicipio.addItem("Achaguas");
               comboMunicipio.addItem("Biruaca");
               comboMunicipio.addItem("Muñoz");
               comboMunicipio.addItem("Páez");
               comboMunicipio.addItem("Pedro Camejo");
               comboMunicipio.addItem("Rómulo Gallegos");
               comboMunicipio.addItem("San Fernando");
               comboMunicipio.addItem("Santa Ana");
               comboMunicipio.addItem("Simón Bolívar");
               comboMunicipio.addItem("Sir Arthur Mc Gregor");
               comboMunicipio.addItem("Diego Bautista Urbaneja");
        }else if (seleccionEnComboEstado.equals("Aragua")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Camatagua");
               comboMunicipio.addItem("Giraldot");
               comboMunicipio.addItem("José Ángel Lamas");
               comboMunicipio.addItem("José Félix Ribas");
               comboMunicipio.addItem("José Rafael Revenga");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Mario Briceño Iragorry");
               comboMunicipio.addItem("San Casimiro");
               comboMunicipio.addItem("San Sebastián");
               comboMunicipio.addItem("Santiago Mariño");
               comboMunicipio.addItem("Santos Michelena");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Tovar");
               comboMunicipio.addItem("Urdaneta");
               comboMunicipio.addItem("Zamora");
               comboMunicipio.addItem("Francisco Linares Alcántara");
               comboMunicipio.addItem("Ocumare de la Costa de Oro");
        }else if (seleccionEnComboEstado.equals("Barinas")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Alberto Arvelo Torrealba");
               comboMunicipio.addItem("Antonio José de Sucre");
               comboMunicipio.addItem("Arismendi");
               comboMunicipio.addItem("Barinas");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Cruz Paredez");
               comboMunicipio.addItem("Ezequil Zamora");
               comboMunicipio.addItem("Obispo");
               comboMunicipio.addItem("Pedraza");
               comboMunicipio.addItem("Rojas");
               comboMunicipio.addItem("Sosa");
               comboMunicipio.addItem("Andrés Eloy Blanco");
        }else if (seleccionEnComboEstado.equals("Bolívar")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Caroní");
               comboMunicipio.addItem("Cedeño");
               comboMunicipio.addItem("El Callao");
               comboMunicipio.addItem("Gran Sabana");
               comboMunicipio.addItem("Heres");
               comboMunicipio.addItem("Piar");
               comboMunicipio.addItem("Angostura");
               comboMunicipio.addItem("Roscio");
               comboMunicipio.addItem("Sifontes");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Padre Pedro Chien");
        }else if (seleccionEnComboEstado.equals("Carabobo")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Bejuma");
               comboMunicipio.addItem("Carlos Aruelo");
               comboMunicipio.addItem("Diego Ibarra");
               comboMunicipio.addItem("Guacara");
               comboMunicipio.addItem("Juan José Mora");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Guayos");
               comboMunicipio.addItem("Miranda");
               comboMunicipio.addItem("Montalbán");
               comboMunicipio.addItem("Naguanagua");
               comboMunicipio.addItem("Puerto Cabello");
               comboMunicipio.addItem("San Diego");
               comboMunicipio.addItem("San Joaquín");
               comboMunicipio.addItem("Valencia");
        }else if (seleccionEnComboEstado.equals("Cojedes")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Anzoátegui");
               comboMunicipio.addItem("Tinaquillo");
               comboMunicipio.addItem("Girardot");
               comboMunicipio.addItem("Lima Blanco");
               comboMunicipio.addItem("Pao de San Juan Bautista");
               comboMunicipio.addItem("Ricaute");
               comboMunicipio.addItem("Rómulo Gallegos");
               comboMunicipio.addItem("Ezequil Zamora");
               comboMunicipio.addItem("Tinaco");
        }else if (seleccionEnComboEstado.equals("Delta Amacuro")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Antonio Díaz");
               comboMunicipio.addItem("Casacoima");
               comboMunicipio.addItem("Pedernales");
               comboMunicipio.addItem("Tucupita");
        }else  if (seleccionEnComboEstado.equals("Distrito Capital")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Libertador");
        }else  if (seleccionEnComboEstado.equals("Falcón")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Acosta");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Buchivacoa");
               comboMunicipio.addItem("Cacique Manaure");
               comboMunicipio.addItem("Carirubana");
               comboMunicipio.addItem("Colina");
               comboMunicipio.addItem("Dabajuro");
               comboMunicipio.addItem("Democracia");
               comboMunicipio.addItem("Falcón");
               comboMunicipio.addItem("Federación");
               comboMunicipio.addItem("Jacura");
               comboMunicipio.addItem("Los Tanques");
               comboMunicipio.addItem("Mauroa");
               comboMunicipio.addItem("Miranda");
               comboMunicipio.addItem("Monseñor Iturriza");
               comboMunicipio.addItem("Palmasola");
               comboMunicipio.addItem("Petit");
               comboMunicipio.addItem("Píritu");
               comboMunicipio.addItem("San Francisco");
               comboMunicipio.addItem("Silva");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Tocópero");
               comboMunicipio.addItem("Unión");
               comboMunicipio.addItem("Urumaco");
               comboMunicipio.addItem("Zamora");
        }else  if (seleccionEnComboEstado.equals("Guárico")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Camaguán");
               comboMunicipio.addItem("Chaguaramas");
               comboMunicipio.addItem("El Socorro");
               comboMunicipio.addItem("San Gerónimo de Guayabal");
               comboMunicipio.addItem("Leonardo Infantes");
               comboMunicipio.addItem("Las Mercedes");
               comboMunicipio.addItem("Julián Mellado");
               comboMunicipio.addItem("Francisco de Miranda");
               comboMunicipio.addItem("José Tadeo Monagas");
               comboMunicipio.addItem("Ortiz");
               comboMunicipio.addItem("José Félix Ribas");
               comboMunicipio.addItem("Juan Germán Roscio");
               comboMunicipio.addItem("San José de Guaribe");
               comboMunicipio.addItem("Santa María de Ipire");
               comboMunicipio.addItem("Pedro Zaraza");
        }else if (seleccionEnComboEstado.equals("Lara")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Andrés Eloy Blanco");
               comboMunicipio.addItem("Crespo");
               comboMunicipio.addItem("Irribarren");
               comboMunicipio.addItem("Jiménez");
               comboMunicipio.addItem("Morán");
               comboMunicipio.addItem("Palavecino");
               comboMunicipio.addItem("Simón Planas");
               comboMunicipio.addItem("Torres");
               comboMunicipio.addItem("Urdaneta");
        }else if (seleccionEnComboEstado.equals("Mérida")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Alberto Adriani");
               comboMunicipio.addItem("Andrés Bello");
               comboMunicipio.addItem("Antonio Pinto Salinas");
               comboMunicipio.addItem("Aricagua");
               comboMunicipio.addItem("Arzobispo Chacón");
               comboMunicipio.addItem("Campo Elías");
               comboMunicipio.addItem("Caracciolo Parra Olmedo");
               comboMunicipio.addItem("Cardenal Quintero");
               comboMunicipio.addItem("Guaraque");
               comboMunicipio.addItem("Julio César Salas");
               comboMunicipio.addItem("Justo Briceño");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Miranda");
               comboMunicipio.addItem("Obíspo Ramos de Lora");
               comboMunicipio.addItem("Padre Noguera");
               comboMunicipio.addItem("Pueblo Llano");
               comboMunicipio.addItem("Rangel");
               comboMunicipio.addItem("Rivas Dávila");
               comboMunicipio.addItem("Santos Marquina");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Tovar");
               comboMunicipio.addItem("Tulio Febres Cordero");
               comboMunicipio.addItem("Zea ");
        }else if (seleccionEnComboEstado.equals("Miranda")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Acevedo");
               comboMunicipio.addItem("Andrés Bello");
               comboMunicipio.addItem("Baruta");
               comboMunicipio.addItem("Brión");
               comboMunicipio.addItem("Buroz");
               comboMunicipio.addItem("Carrizal");
               comboMunicipio.addItem("Chacao");
               comboMunicipio.addItem("Cristóbal Rojas");
               comboMunicipio.addItem("El Hatillo");
               comboMunicipio.addItem("Guaicapuro");
               comboMunicipio.addItem("Independencia");
               comboMunicipio.addItem("Lander");
               comboMunicipio.addItem("Los Salias");
               comboMunicipio.addItem("Páez");
               comboMunicipio.addItem("Paz Castillo");
               comboMunicipio.addItem("Pedro Gual");
               comboMunicipio.addItem("Plaza");
               comboMunicipio.addItem("Simón Bolívar");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Urdaneta");
               comboMunicipio.addItem("Zamora");
        }else if (seleccionEnComboEstado.equals("Monagas")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Acosta");
               comboMunicipio.addItem("Aguasay");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Caripe");
               comboMunicipio.addItem("Cedeño");
               comboMunicipio.addItem("Ezequil Zamora");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Maturín");
               comboMunicipio.addItem("Piar");
               comboMunicipio.addItem("Punceres");
               comboMunicipio.addItem("Santa Bárbara");
               comboMunicipio.addItem("Sotillo");
               comboMunicipio.addItem("Uracoa");
       }else if (seleccionEnComboEstado.equals("Nueva Esparta")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Antolín del Campo");
               comboMunicipio.addItem("Arismendi");
               comboMunicipio.addItem("Díaz");
               comboMunicipio.addItem("García");
               comboMunicipio.addItem("Gómez");
               comboMunicipio.addItem("Maneiro");
               comboMunicipio.addItem("Marcano");
               comboMunicipio.addItem("Mariño");
               comboMunicipio.addItem("Península de Macanao");
               comboMunicipio.addItem("Tubores");
               comboMunicipio.addItem("Villalba");
        }else  if (seleccionEnComboEstado.equals("Portuguesa")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Agua Blanca");
               comboMunicipio.addItem("Araure");
               comboMunicipio.addItem("Esteller");
               comboMunicipio.addItem("Guanare");
               comboMunicipio.addItem("Guamarito");
               comboMunicipio.addItem("Monseñor José Vicente de Unda");
               comboMunicipio.addItem("Ospino");
               comboMunicipio.addItem("Páez");
               comboMunicipio.addItem("Papelón");
               comboMunicipio.addItem("San Genaro de Boconoito");
               comboMunicipio.addItem("San Rafael de Onoto");
               comboMunicipio.addItem("Santa Rosalía");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Turén");

        }else if (seleccionEnComboEstado.equals("Sucre")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Andrés Eloy Blanco");
               comboMunicipio.addItem("Andrés Mata");
               comboMunicipio.addItem("Arismendi");
               comboMunicipio.addItem("Benítez");
               comboMunicipio.addItem("Bermúdez");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Cajigal");
               comboMunicipio.addItem("Cruz Salmerón Acosta");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Mariño");
               comboMunicipio.addItem("Mejía");
               comboMunicipio.addItem("Montes");
               comboMunicipio.addItem("Ribero");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Valdez");
        }else if (seleccionEnComboEstado.equals("Táchira")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Andrés Bello");
               comboMunicipio.addItem("Antonio Rómulo Costa");
               comboMunicipio.addItem("Ayacucho");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Cárdenas");
               comboMunicipio.addItem("Córdoba");
               comboMunicipio.addItem("Fernández Feo");
               comboMunicipio.addItem("Francisco de Miranda");
               comboMunicipio.addItem("García de Hevia");
               comboMunicipio.addItem("Guásimo");
               comboMunicipio.addItem("Independencia");
               comboMunicipio.addItem("Jáuregui");
               comboMunicipio.addItem("José María Vargas");
               comboMunicipio.addItem("Junín");
               comboMunicipio.addItem("Libertad");
               comboMunicipio.addItem("Libertador");
               comboMunicipio.addItem("Lobatera");
               comboMunicipio.addItem("Michelena");
               comboMunicipio.addItem("Panamericano");
               comboMunicipio.addItem("Pedro María Ureña");
               comboMunicipio.addItem("Rafael Urdaneta");
               comboMunicipio.addItem("Samuel Darío Maldonado");
               comboMunicipio.addItem("San Cristóbal");
               comboMunicipio.addItem("Seboruco");
               comboMunicipio.addItem("Simón Rodríguez");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Torbes");
               comboMunicipio.addItem("Uribante");
               comboMunicipio.addItem("San Judas Tadeo");
        }else if (seleccionEnComboEstado.equals("Trujillo")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Andrés Bello");
               comboMunicipio.addItem("Boconó");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Candelaria");
               comboMunicipio.addItem("Carache");
               comboMunicipio.addItem("Escuque");
               comboMunicipio.addItem("José Felipe Márquez Cañizales");
               comboMunicipio.addItem("Juan Vicente Campo Elías");
               comboMunicipio.addItem("La Ceiba");
               comboMunicipio.addItem("Miranda");
               comboMunicipio.addItem("Monte Carmelo");
               comboMunicipio.addItem("Motatán");
               comboMunicipio.addItem("Pampán");
               comboMunicipio.addItem("Pampanito");
               comboMunicipio.addItem("Rafael Rangel");
               comboMunicipio.addItem("San Rafael de Carvajal");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Trujillo");
               comboMunicipio.addItem("Urdaneta");
               comboMunicipio.addItem("Valera");
        }else if (seleccionEnComboEstado.equals("Yaracuy")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Arístidez Bastidas");
               comboMunicipio.addItem("Bolívar");
               comboMunicipio.addItem("Bruzual");
               comboMunicipio.addItem("Cocorote");
               comboMunicipio.addItem("Independencia");
               comboMunicipio.addItem("José Antonio Páez");
               comboMunicipio.addItem("La Trinidad");
               comboMunicipio.addItem("Manuel Monge");
               comboMunicipio.addItem("Nirgua");
               comboMunicipio.addItem("Peña");
               comboMunicipio.addItem("San Felipe");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Urachiche");
               comboMunicipio.addItem("Veroes");
        }else if (seleccionEnComboEstado.equals("Zulia")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Almirante Padilla");
               comboMunicipio.addItem("Baralt");
               comboMunicipio.addItem("Cabimas");
               comboMunicipio.addItem("Catatumbo");
               comboMunicipio.addItem("Colón");
               comboMunicipio.addItem("Francisco Javier Pulgar");
               comboMunicipio.addItem("Jesús Enrique Lossada");
               comboMunicipio.addItem("Jesús María Semprún");
               comboMunicipio.addItem("La Cañada de Urdaneta");
               comboMunicipio.addItem("Lagunillas");
               comboMunicipio.addItem("Machiques de Perijá");
               comboMunicipio.addItem("Mara");
               comboMunicipio.addItem("Maracaibo");
               comboMunicipio.addItem("Miranda");
               comboMunicipio.addItem("Indígena Bolivariano Guajira");
               comboMunicipio.addItem("Rosario de Perijá");
               comboMunicipio.addItem("San Francisco");
               comboMunicipio.addItem("Santa Rita");
               comboMunicipio.addItem("Simón Bolívar");
               comboMunicipio.addItem("Sucre");
               comboMunicipio.addItem("Valmore Rodríguez");
        }else if (seleccionEnComboEstado.equals("Vargas")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("Vargas");
        }
    }
public static class seleccionEnComboEstado {

        public seleccionEnComboEstado() {
        }
    }    

/* MUNICIPIOS DE

        if(Estado.equals("")){
               comboMunicipio.addItem("");
               comboMunicipio.addItem("");
               comboMunicipio.addItem("");
               comboMunicipio.addItem("");
               comboMunicipio.addItem("");
               comboMunicipio.addItem("");
        }
*/
   
}
