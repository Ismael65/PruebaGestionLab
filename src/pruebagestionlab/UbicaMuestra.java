/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagestionlab;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;


/**
 *
 * @author ismael
 */
public class UbicaMuestra extends javax.swing.JFrame {
        //private JComboBox comboEstado = new JComboBox();
    
    /**
     * Creates new form UbicaMuestra
     */
    public UbicaMuestra() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_a_1.png")).getImage());
        
        
    }
    
public String[] comboEstado(String comboEstado){
    String[] comboMunicipio = new String[29]; 
      
        if (comboEstado.equals("Amazonas")){
              comboMunicipio[0]="Alto Orinoco";
               comboMunicipio[1]="Atabapo";
               comboMunicipio[2]="Atures";
               comboMunicipio[3]="Autana";
               comboMunicipio[4]="Maroa";
               comboMunicipio[5]="Manapiare";
               comboMunicipio[6]="Río Negro";
        }
        if (comboEstado.equals("Anzoátegui")){
               comboMunicipio[0]="Anaco";
               comboMunicipio[1]="Aragua";
               comboMunicipio[2]="Fernando Peñalver";
               comboMunicipio[3]="Francisco del Carmen Carvajal";
               comboMunicipio[4]="Francisco de Miranda";
               comboMunicipio[5]="Guanta";
               comboMunicipio[6]="Independencia";
               comboMunicipio[7]="Juan Antonio Sotillo";
               comboMunicipio[8]="Juan Manuel Cajigal";
               comboMunicipio[9]="José Gregorio Monagas";
               comboMunicipio[10]="Libertad";
               comboMunicipio[11]="Manuel Ezequil Bruzual";
               comboMunicipio[12]="Pedro María Fréites";
               comboMunicipio[13]="Píritu";
               comboMunicipio[14]="San José de Guanipa";
               comboMunicipio[15]="San Juan de Capistrano";
               comboMunicipio[16]="Santa Ana";
               comboMunicipio[17]="Simón Bolívar";
               comboMunicipio[18]="Simón Rodríguez";
               comboMunicipio[19]="Sir Arthur Mc Gregor";
               comboMunicipio[20]="Diego Bautista Urbaneja";
              
        }
         if (comboEstado.equals("Apure")){
               comboMunicipio[0]="Achaguas";
               comboMunicipio[1]="Biruaca";
               comboMunicipio[2]="Muñoz";
               comboMunicipio[3]="Páez";
               comboMunicipio[4]="Pedro Camejo";
               comboMunicipio[5]="Rómulo Gallegos";
               comboMunicipio[6]="San Fernando";
               
        }
        if (comboEstado.equals("Aragua")){
              comboMunicipio[0]="Bolívar";
               comboMunicipio[1]="Camatagua";
               comboMunicipio[2]="Giraldot";
               comboMunicipio[3]="José Ángel Lamas";
               comboMunicipio[4]="José Félix Ribas";
               comboMunicipio[5]="José Rafael Revenga";
               comboMunicipio[6]="Libertador";
               comboMunicipio[7]="Mario Briceño Iragorry";
               comboMunicipio[8]="San Casimiro";
               comboMunicipio[9]="San Sebastián";
               comboMunicipio[10]="Santiago Mariño";
               comboMunicipio[11]="Santos Michelena";
               comboMunicipio[12]="Sucre";
               comboMunicipio[13]="Tovar";
               comboMunicipio[14]="Urdaneta";
               comboMunicipio[15]="Zamora";
               comboMunicipio[16]="Francisco Linares Alcántara";
               comboMunicipio[17]="Ocumare de la Costa de Oro";
        }
        if (comboEstado.equals("Barinas")){
               comboMunicipio[0]="Alberto Arvelo Torrealba";
               comboMunicipio[1]="Antonio José de Sucre";
               comboMunicipio[2]="Arismendi";
               comboMunicipio[3]="Barinas";
               comboMunicipio[4]="Bolívar";
               comboMunicipio[5]="Cruz Paredez";
               comboMunicipio[6]="Ezequil Zamora";
               comboMunicipio[7]="Obispo";
               comboMunicipio[8]="Pedraza";
               comboMunicipio[9]="Rojas";
               comboMunicipio[10]="Sosa";
               comboMunicipio[11]="Andrés Eloy Blanco";
        }
        if (comboEstado.equals("Bolívar")){
               comboMunicipio[0]="Caroní";
               comboMunicipio[1]="Cedeño";
               comboMunicipio[2]="El Callao";
               comboMunicipio[3]="Gran Sabana";
               comboMunicipio[4]="Heres";
               comboMunicipio[5]="Piar";
               comboMunicipio[6]="Angostura";
               comboMunicipio[7]="Roscio";
               comboMunicipio[8]="Sifontes";
               comboMunicipio[9]="Sucre";
               comboMunicipio[10]="Padre Pedro Chien";
        }
        if (comboEstado.equals("Carabobo")){
               comboMunicipio[0]="Bejuma";
               comboMunicipio[1]="Carlos Aruelo";
               comboMunicipio[2]="Diego Ibarra";
               comboMunicipio[3]="Guacara";
               comboMunicipio[4]="Juan José Mora";
               comboMunicipio[5]="Libertador";
               comboMunicipio[6]="Guayos";
               comboMunicipio[7]="Miranda";
               comboMunicipio[8]="Montalbán";
               comboMunicipio[9]="Naguanagua";
               comboMunicipio[10]="Puerto Cabello";
               comboMunicipio[11]="San Diego";
               comboMunicipio[12]="San Joaquín";
               comboMunicipio[13]="Valencia";
        }
        if (comboEstado.equals("Cojedes")){
               comboMunicipio[0]="Anzoátegui";
               comboMunicipio[1]="Tinaquillo";
               comboMunicipio[2]="Girardot";
               comboMunicipio[3]="Lima Blanco";
               comboMunicipio[4]="Pao de San Juan Bautista";
               comboMunicipio[5]="Ricaute";
               comboMunicipio[6]="Rómulo Gallegos";
               comboMunicipio[7]="Ezequil Zamora";
               comboMunicipio[8]="Tinaco";
        }
        if (comboEstado.equals("Delta Amacuro")){
               comboMunicipio[0]="Antonio Díaz";
               comboMunicipio[1]="Casacoima";
               comboMunicipio[2]="Pedernales";
               comboMunicipio[3]="Tucupita";
        }
        if (comboEstado.equals("Distrito Capital")){
               comboMunicipio[0]="Libertador";
        }
        if (comboEstado.equals("Falcón")){
               comboMunicipio[0]="Acosta";
               comboMunicipio[1]="Bolívar";
               comboMunicipio[2]="Buchivacoa";
               comboMunicipio[3]="Cacique Manaure";
               comboMunicipio[4]="Carirubana";
               comboMunicipio[5]="Colina";
               comboMunicipio[6]="Dabajuro";
               comboMunicipio[7]="Democracia";
               comboMunicipio[8]="Falcón";
               comboMunicipio[9]="Federación";
               comboMunicipio[10]="Jacura";
               comboMunicipio[11]="Los Tanques";
               comboMunicipio[12]="Mauroa";
               comboMunicipio[13]="Miranda";
               comboMunicipio[14]="Monseñor Iturriza";
               comboMunicipio[15]="Palmasola";
               comboMunicipio[16]="Petit";
               comboMunicipio[17]="Píritu";
               comboMunicipio[18]="San Francisco";
               comboMunicipio[19]="Silva";
               comboMunicipio[20]="Sucre";
               comboMunicipio[21]="Tocópero";
               comboMunicipio[22]="Unión";
               comboMunicipio[23]="Urumaco";
               comboMunicipio[24]="Zamora";
        }
        if (comboEstado.equals("Guárico")){
              comboMunicipio[0]="Camaguán";
               comboMunicipio[1]="Chaguaramas";
               comboMunicipio[2]="El Socorro";
               comboMunicipio[3]="San Gerónimo de Guayabal";
               comboMunicipio[4]="Leonardo Infantes";
               comboMunicipio[5]="Las Mercedes";
               comboMunicipio[6]="Julián Mellado";
               comboMunicipio[7]="Francisco de Miranda";
               comboMunicipio[8]="José Tadeo Monagas";
               comboMunicipio[9]="Ortiz";
               comboMunicipio[10]="José Félix Ribas";
               comboMunicipio[11]="Juan Germán Roscio";
               comboMunicipio[12]="San José de Guaribe";
               comboMunicipio[13]="Santa María de Ipire";
               comboMunicipio[14]="Pedro Zaraza";
        }
        if (comboEstado.equals("Lara")){
               comboMunicipio[0]="Andrés Eloy Blanco";
               comboMunicipio[1]="Crespo";
               comboMunicipio[2]="Irribarren";
               comboMunicipio[3]="Jiménez";
               comboMunicipio[4]="Morán";
               comboMunicipio[5]="Palavecino";
               comboMunicipio[6]="Simón Planas";
               comboMunicipio[7]="Torres";
               comboMunicipio[8]="Urdaneta";
        }
        if (comboEstado.equals("Mérida")){
               comboMunicipio[0]="Alberto Adriani";
               comboMunicipio[1]="Andrés Bello";
               comboMunicipio[2]="Antonio Pinto Salinas";
               comboMunicipio[3]="Aricagua";
               comboMunicipio[4]="Arzobispo Chacón";
               comboMunicipio[5]="Campo Elías";
               comboMunicipio[6]="Caracciolo Parra Olmedo";
               comboMunicipio[7]="Cardenal Quintero";
               comboMunicipio[8]="Guaraque";
               comboMunicipio[9]="Julio César Salas";
               comboMunicipio[10]="Justo Briceño";
               comboMunicipio[11]="Libertador";
               comboMunicipio[12]="Miranda";
               comboMunicipio[13]="Obíspo Ramos de Lora";
               comboMunicipio[14]="Padre Noguera";
               comboMunicipio[15]="Pueblo Llano";
               comboMunicipio[16]="Rangel";
               comboMunicipio[17]="Rivas Dávila";
               comboMunicipio[18]="Santos Marquina";
               comboMunicipio[19]="Sucre";
               comboMunicipio[20]="Tovar";
               comboMunicipio[21]="Tulio Febres Cordero";
               comboMunicipio[22]="Zea ";
        }
        if (comboEstado.equals("Miranda")){
               comboMunicipio[0]="Acevedo";
               comboMunicipio[1]="Andrés Bello";
               comboMunicipio[2]="Baruta";
               comboMunicipio[3]="Brión";
               comboMunicipio[4]="Buroz";
               comboMunicipio[5]="Carrizal";
               comboMunicipio[6]="Chacao";
               comboMunicipio[7]="Cristóbal Rojas";
               comboMunicipio[8]="El Hatillo";
               comboMunicipio[9]="Guaicapuro";
               comboMunicipio[10]="Independencia";
               comboMunicipio[11]="Lander";
               comboMunicipio[12]="Los Salias";
               comboMunicipio[13]="Páez";
               comboMunicipio[14]="Paz Castillo";
               comboMunicipio[15]="Pedro Gual";
               comboMunicipio[16]="Plaza";
               comboMunicipio[17]="Simón Bolívar";
               comboMunicipio[18]="Sucre";
               comboMunicipio[19]="Urdaneta";
               comboMunicipio[20]="Zamora";
        }
        if (comboEstado.equals("Monagas")){
              comboMunicipio[0]="Acosta";
               comboMunicipio[1]="Aguasay";
               comboMunicipio[2]="Bolívar";
               comboMunicipio[3]="Caripe";
               comboMunicipio[4]="Cedeño";
               comboMunicipio[5]="Ezequil Zamora";
               comboMunicipio[6]="Libertador";
               comboMunicipio[7]="Maturín";
               comboMunicipio[8]="Piar";
               comboMunicipio[9]="Punceres";
               comboMunicipio[10]="Santa Bárbara";
               comboMunicipio[11]="Sotillo";
               comboMunicipio[12]="Uracoa";
       }
       if (comboEstado.equals("Nueva Esparta")){
               comboMunicipio[0]="Antolín del Campo";
               comboMunicipio[1]="Arismendi";
               comboMunicipio[2]="Díaz";
               comboMunicipio[3]="García";
               comboMunicipio[4]="Gómez";
               comboMunicipio[5]="Maneiro";
               comboMunicipio[6]="Marcano";
               comboMunicipio[7]="Mariño";
               comboMunicipio[8]="Península de Macanao";
               comboMunicipio[9]="Tubores";
               comboMunicipio[10]="Villalba";
        }
       if (comboEstado.equals("Portuguesa")){
              comboMunicipio[0]="Agua Blanca";
               comboMunicipio[1]="Araure";
               comboMunicipio[2]="Esteller";
               comboMunicipio[3]="Guanare";
               comboMunicipio[4]="Guamarito";
               comboMunicipio[5]="Monseñor José Vicente de Unda";
               comboMunicipio[6]="Ospino";
               comboMunicipio[7]="Páez";
               comboMunicipio[8]="Papelón";
               comboMunicipio[9]="San Genaro de Boconoito";
               comboMunicipio[10]="San Rafael de Onoto";
               comboMunicipio[11]="Santa Rosalía";
               comboMunicipio[12]="Sucre";
               comboMunicipio[13]="Turén";

        }
       if (comboEstado.equals("Sucre")){
               comboMunicipio[0]="Andrés Eloy Blanco";
               comboMunicipio[1]="Andrés Mata";
               comboMunicipio[2]="Arismendi";
               comboMunicipio[3]="Benítez";
               comboMunicipio[4]="Bermúdez";
               comboMunicipio[5]="Bolívar";
               comboMunicipio[6]="Cajigal";
               comboMunicipio[7]="Cruz Salmerón Acosta";
               comboMunicipio[8]="Libertador";
               comboMunicipio[9]="Mariño";
               comboMunicipio[10]="Mejía";
               comboMunicipio[11]="Montes";
               comboMunicipio[12]="Ribero";
               comboMunicipio[13]="Sucre";
               comboMunicipio[14]="Valdez";
        }
       if (comboEstado.equals("Táchira")){
               comboMunicipio[0]="Andrés Bello";
               comboMunicipio[1]="Antonio Rómulo Costa";
               comboMunicipio[2]="Ayacucho";
               comboMunicipio[3]="Bolívar";
               comboMunicipio[4]="Cárdenas";
               comboMunicipio[5]="Córdoba";
               comboMunicipio[6]="Fernández Feo";
               comboMunicipio[7]="Francisco de Miranda";
               comboMunicipio[8]="García de Hevia";
               comboMunicipio[9]="Guásimo";
               comboMunicipio[10]="Independencia";
               comboMunicipio[11]="Jáuregui";
               comboMunicipio[12]="José María Vargas";
               comboMunicipio[13]="Junín";
               comboMunicipio[14]="Libertad";
               comboMunicipio[15]="Libertador";
               comboMunicipio[16]="Lobatera";
               comboMunicipio[17]="Michelena";
               comboMunicipio[18]="Panamericano";
               comboMunicipio[19]="Pedro María Ureña";
               comboMunicipio[20]="Rafael Urdaneta";
               comboMunicipio[21]="Samuel Darío Maldonado";
               comboMunicipio[22]="San Cristóbal";
               comboMunicipio[23]="Seboruco";
               comboMunicipio[24]="Simón Rodríguez";
               comboMunicipio[25]="Sucre";
               comboMunicipio[26]="Torbes";
               comboMunicipio[27]="Uribante";
               comboMunicipio[28]="San Judas Tadeo";
        }
       if (comboEstado.equals("Trujillo")){
               comboMunicipio[0]="Andrés Bello";
               comboMunicipio[1]="Boconó";
               comboMunicipio[2]="Bolívar";
               comboMunicipio[3]="Candelaria";
               comboMunicipio[4]="Carache";
               comboMunicipio[5]="Escuque";
               comboMunicipio[6]="José Felipe Márquez Cañizales";
               comboMunicipio[7]="Juan Vicente Campo Elías";
               comboMunicipio[8]="La Ceiba";
               comboMunicipio[9]="Miranda";
               comboMunicipio[10]="Monte Carmelo";
               comboMunicipio[11]="Motatán";
               comboMunicipio[12]="Pampán";
               comboMunicipio[13]="Pampanito";
               comboMunicipio[14]="Rafael Rangel";
               comboMunicipio[15]="San Rafael de Carvajal";
               comboMunicipio[16]="Sucre";
               comboMunicipio[17]="Trujillo";
               comboMunicipio[18]="Urdaneta";
               comboMunicipio[19]="Valera";
        }
       if (comboEstado.equals("Vargas")){
               comboMunicipio[0]="Vargas";
        }
        if (comboEstado.equals("Yaracuy")){
               comboMunicipio[0]="Arístidez Bastidas";
               comboMunicipio[1]="Bolívar";
               comboMunicipio[2]="Bruzual";
               comboMunicipio[3]="Cocorote";
               comboMunicipio[4]="Independencia";
               comboMunicipio[5]="José Antonio Páez";
               comboMunicipio[6]="La Trinidad";
               comboMunicipio[7]="Manuel Monge";
               comboMunicipio[8]="Nirgua";
               comboMunicipio[9]="Peña";
               comboMunicipio[10]="San Felipe";
               comboMunicipio[11]="Sucre";
               comboMunicipio[12]="Urachiche";
               comboMunicipio[13]="Veroes";
        }
        if (comboEstado.equals("Zulia")){
               comboMunicipio[0]="Almirante Padilla";
               comboMunicipio[1]="Baralt";
               comboMunicipio[2]="Cabimas";
               comboMunicipio[3]="Catatumbo";
               comboMunicipio[4]="Colón";
               comboMunicipio[5]="Francisco Javier Pulgar";
               comboMunicipio[6]="Jesús Enrique Lossada";
               comboMunicipio[7]="Jesús María Semprún";
               comboMunicipio[8]="La Cañada de Urdaneta";
               comboMunicipio[9]="Lagunillas";
               comboMunicipio[10]="Machiques de Perijá";
               comboMunicipio[11]="Mara";
               comboMunicipio[12]="Maracaibo";
               comboMunicipio[13]="Miranda";
               comboMunicipio[14]="Indígena Bolivariano Guajira";
               comboMunicipio[15]="Rosario de Perijá";
               comboMunicipio[16]="San Francisco";
               comboMunicipio[17]="Santa Rita";
               comboMunicipio[18]="Simón Bolívar";
               comboMunicipio[19]="Sucre";
               comboMunicipio[20]="Valmore Rodríguez";
        }
        
    return comboMunicipio;
 } 

public String[] comboParroquiaA(String comboParroquiaA){
        String[] comboParroquia = new String[110];
           //comboMunicipio.equals     
        if (comboMunicipio.equals("Alto Orinoco")) { // Amazonas
            comboParroquia[0] = "Huachamacare";
            comboParroquia[1] = "Marawara";
            comboParroquia[2] = "Mavaca";
            comboParroquia[3] = "Sierra Parima";
        }
                if(comboMunicipio.equals("Atabapo")){
                      comboParroquia[0] ="Ucata";
                      comboParroquia[1] ="Yapacana";
                      comboParroquia[2] ="Caname";
                }
                if(comboMunicipio.equals("Atures")){
                      comboParroquia[0] ="Fernando Girón Tovar";
                      comboParroquia[1] ="Luis Alberto Gómez";
                      comboParroquia[2] ="Parhueña";
                      comboParroquia[3] ="Plantanillal";
                }
                if(comboMunicipio.equals("Autana")){
                      comboParroquia[0] ="Samariapo";
                      comboParroquia[1] ="Sipapo";
                      comboParroquia[2] ="Munduapo";
                      comboParroquia[3] ="Guayapo";
                }
                if(comboMunicipio.equals("Maroa")){
                      comboParroquia[0] ="Victorino";
                      comboParroquia[1] ="Comunidad";
                }
                if(comboMunicipio.equals("Manapiare")){
                      comboParroquia[0] ="Alto Ventuari";
                      comboParroquia[1] ="Medio Ventuari";
                      comboParroquia[2] ="Bajo Ventuari";
                }
                if(comboMunicipio.equals("Río Negro")){
                      comboParroquia[0] ="Solano";
                      comboParroquia[1] ="Casiquiare";
                      comboParroquia[2] ="Cocuy";
                }
                if(comboMunicipio.equals("Anaco")){ // Anzoategui
                      comboParroquia[0] ="Anaco";
                      comboParroquia[1] ="San Joaquín";
                      comboParroquia[2] ="Buena Vista";
                }
                if(comboMunicipio.equals("Aragua")){
                      comboParroquia[0] ="Aragua";
                      comboParroquia[1] ="Cachipo";
                }
                if(comboMunicipio.equals("Fernando Peñalver")){
                      comboParroquia[0] ="Fernando Peñalver";
                      comboParroquia[1] ="San Miguel";
                      comboParroquia[2] ="Sucre";
                }
                if(comboMunicipio.equals("Francisco del Carmen Carvajal")){
                      comboParroquia[0] ="Francisco del Carmen Carvajal";
                      comboParroquia[1] ="Santa Barbara";
                }
                if(comboMunicipio.equals("Francisco de Miranda")){
                      comboParroquia[0] ="Francisco de Miranda";
                      comboParroquia[1] ="Atapirire";
                      comboParroquia[2] ="Boca del Pao";
                      comboParroquia[3] ="El Pao";
                      comboParroquia[4] ="Mucura";
                }
                if(comboMunicipio.equals("Guanta")){
                      comboParroquia[0] ="Guanta";
                      comboParroquia[1] ="Chorderon";
                }
                if(comboMunicipio.equals("Independencia")){
                      comboParroquia[0] ="Independencia";
                      comboParroquia[1] ="Mamo";
                }
                if(comboMunicipio.equals("Juan Antonio Sotillo")){
                      comboParroquia[0] ="Puerto La Cruz";
                      comboParroquia[1] ="Pozuelos";
                }
                if(comboMunicipio.equals("Juan Manuel Cajigal")){
                      comboParroquia[0] ="Juan Manuel Cajigal";
                      comboParroquia[1] ="San Pablo";
                }
                if(comboMunicipio.equals("José Gregorio Monagas")){
                      comboParroquia[0] ="José Gregorio Monagas";
                      comboParroquia[1] ="Piar";
                      comboParroquia[2] ="San Diego de Cabrutica";
                      comboParroquia[3] ="Santa Clara";
                      comboParroquia[4] ="Uverito";
                      comboParroquia[5] ="Zuata";
                }
                if(comboMunicipio.equals("Libertad")){
                      comboParroquia[0] ="Libertad";
                      comboParroquia[1] ="El Carito";
                      comboParroquia[2] ="Santa Inés";
                }
                if(comboMunicipio.equals("Manuel Ezequil Bruzual")){
                      comboParroquia[0] ="Manuel Ezequil Bruzual";
                      comboParroquia[1] ="Guanape";
                      comboParroquia[2] ="Sabana de Uchire";
                }
                if(comboMunicipio.equals("Pedro María Fréites")){
                      comboParroquia[0] ="Pedro María Fréites";
                      comboParroquia[1] ="Libertador";
                      comboParroquia[2] ="Santa Rosa";
                      comboParroquia[3] ="Úrica";
                }
                if(comboMunicipio.equals("Píritu")){
                      comboParroquia[0] ="Píritu";
                      comboParroquia[1] ="San Francisco";
                }
                if(comboMunicipio.equals("San José de Guanipa")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("San Juan de Capistrano")){
                      comboParroquia[0] ="San Juan de Capistrano";
                      comboParroquia[1] ="Boca de Chavez";
                }
                if(comboMunicipio.equals("Santa Ana")){
                      comboParroquia[0] ="Santa Ana";
                      comboParroquia[1] ="Pueblo Nuevo";
                }
                if(comboMunicipio.equals("Simón Bolívar")){
                      comboParroquia[0] ="El Carmen";
                      comboParroquia[1] ="San Cristóbal";
                      comboParroquia[2] ="Bergantin";
                      comboParroquia[3] ="Caigua";
                      comboParroquia[4] ="El Pilar";
                      comboParroquia[5] ="Naricual";
                }
                if(comboMunicipio.equals("Simón Rodríguez")){
                      comboParroquia[0] ="Edmundo Barrios";
                      comboParroquia[1] ="Miguel Otero Silva";
                }
                if(comboMunicipio.equals("Sir Arthur Mc Gregor")){
                      comboParroquia[0] ="Sir Arthur Mc Gregor";
                      comboParroquia[1] ="Tomas Alfaro Calatrava";
                }
                if(comboMunicipio.equals("Diego Bautista Urbaneja")){
                      comboParroquia[0] ="Diego Bautista Urbaneja";
                      comboParroquia[1] ="El Morro";
                }
                if(comboMunicipio.equals("Achaguas")){ // Apure
                      comboParroquia[0] ="Achaguas";
                      comboParroquia[1] ="Apurito";
                      comboParroquia[2] ="El Yagual";
                      comboParroquia[3] ="Guachara";
                      comboParroquia[4] ="Mucurita";
                      comboParroquia[5] ="Queseras del Medio";
                }
                if(comboMunicipio.equals("Biruaca")){
                     comboParroquia[0] ="Biruca";
                }
                if(comboMunicipio.equals("Muñoz")){
                      comboParroquia[0] ="Bruzual";
                      comboParroquia[1] ="Mantecal";
                      comboParroquia[2] ="Quintero";
                      comboParroquia[3] ="Rincón Hondo";
                      comboParroquia[4] ="San Vicente";
                }
                if(comboMunicipio.equals("Páez")){
                      comboParroquia[0] ="Guasdalito";
                      comboParroquia[1] ="Aramendi";
                      comboParroquia[2] ="El Amparo";
                      comboParroquia[3] ="San Camilo";
                      comboParroquia[4] ="Urdaneta";
                } 
                if(comboMunicipio.equals("Pedro Camejo")){
                      comboParroquia[0] ="San Juan de Payara";
                      comboParroquia[1] ="Codazzi";
                      comboParroquia[2] ="Cunaviche";
                }
                if(comboMunicipio.equals("Rómulo Gallegos")){
                      comboParroquia[0] ="Elorza";
                      comboParroquia[1] ="La Trinidad";
                      comboParroquia[2] ="Peñalver";
                      comboParroquia[3] ="San Rafael de Atamaica";
                }
               /* if(comboMunicipio.equals("San Fernando")){  ****OJO ***
                      comboParroquia[0] ="San Fernando";
                      comboParroquia[1] ="El Recreo";
                }*/
                if(comboMunicipio.equals("Bolívar")){ // Aragua
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Camatagua")){
                      comboParroquia[0] ="Carmen de Cura";
                }
                if(comboMunicipio.equals("Giraldot")){
                      comboParroquia[0] ="Choroni";
                      comboParroquia[1] ="Las Delicias";
                      comboParroquia[2] ="Madre María de San José";
                      comboParroquia[3] ="Joaquín Crespo";
                      comboParroquia[4] ="Pedro José Ovalles";
                      comboParroquia[5] ="José Casanova Godoy";
                      comboParroquia[6] ="Andrés Eloy Blanco";
                      comboParroquia[7] ="Los Tacariguas";
                }
                if(comboMunicipio.equals("José Ángel Lamas")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("José Félix Ribas")){
                      comboParroquia[0] ="Juan Vicente Bolívar y Pontes";
                      comboParroquia[1] ="Castor Nieves Ríos";
                      comboParroquia[2] ="Las Guacamayas";
                      comboParroquia[3] ="Pao Zárate";
                      comboParroquia[4] ="Zuata";
                }
                if(comboMunicipio.equals("José Rafael Revenga")){
                      comboParroquia[0] ="---";
                }

                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Libertador";
                      comboParroquia[1] ="San Martín de Porres";
                }
                if(comboMunicipio.equals("Mario Briceño Iragorry")){
                      comboParroquia[0] ="Mario Briceño Iragorry";
                      comboParroquia[1] ="Caña de Azúcar";
                }
                if(comboMunicipio.equals("San Casimiro")){
                      comboParroquia[0] ="San Casimiro";
                      comboParroquia[1] ="Guiripa";
                      comboParroquia[2] ="Ollas de Caramacate";
                      comboParroquia[3] ="Valle Morin";
                }
                if(comboMunicipio.equals("San Sebastián")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Santiago Mariño")){
                      comboParroquia[0] ="Santiago Mariño";
                      comboParroquia[1] ="Arevalo Aponte";
                      comboParroquia[2] ="Chuao";
                      comboParroquia[3] ="Saman de Guere";
                      comboParroquia[4] ="Alfredo Pacheco Miranda";
                }
                if(comboMunicipio.equals("Santos Michelena")){
                      comboParroquia[0] ="Santos Michelena";
                      comboParroquia[1] ="Tiara";
               }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Bella Vista";
                }
                if(comboMunicipio.equals("Tovar")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Urdaneta")){
                      comboParroquia[0] ="Urdaneta";
                      comboParroquia[1] ="Las Peñitas";
                      comboParroquia[2] ="San Francisco de Cara";
                      comboParroquia[3] ="Taguay";
                }
                if(comboMunicipio.equals("Zamora")){
                      comboParroquia[0] ="Zamora";
                      comboParroquia[1] ="Magdaleno";
                      comboParroquia[2] ="San Francisco de Asís";
                      comboParroquia[3] ="Valle de Tucutunemo";
                      comboParroquia[4] ="Augusto Mijares";
                }
                if(comboMunicipio.equals("Francisco Linares Alcántara")){
                      comboParroquia[0] ="Francisco Linares Alcántara";
                      comboParroquia[1] ="Francisco de Miranda";
                      comboParroquia[2] ="Monseñor Feliciano González";
                }
                if(comboMunicipio.equals("Ocumare de la Costa de Oro")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Alberto Arvelo Torrealba")){ // Barinas
                      comboParroquia[0] ="Sabaneta";
                      comboParroquia[1] ="Rodríguez Domínguez";
                }
                if(comboMunicipio.equals("Antonio José de Sucre")){
                      comboParroquia[0] ="Ticoporo";
                      comboParroquia[1] ="Andrés Bello";
                      comboParroquia[2] ="Nicolás Pulido";
                }
                if(comboMunicipio.equals("Arismendi")){
                      comboParroquia[0] ="Arismendi";
                      comboParroquia[1] ="Guadarrama";
                      comboParroquia[2] ="La Unión";
                      comboParroquia[3] ="San Antonio";
                }
                if(comboMunicipio.equals("Barinas")){
                      comboParroquia[0] ="Barinas";
                      comboParroquia[1] ="Alfredo Arvelo Larriva";
                      comboParroquia[2] ="San Silvestre";
                      comboParroquia[3] ="Santa Inés";
                      comboParroquia[4] ="Santa Lucia";
                      comboParroquia[5] ="Torumo";
                      comboParroquia[6] ="El Carmen";
                      comboParroquia[7] ="Don Rómulo Betancourt";
                      comboParroquia[8] ="Corazón de Jesús";
                      comboParroquia[9] ="Ramón Ignacio Méndez";
                      comboParroquia[10] ="Alto Barinas";
                      comboParroquia[11] ="Manuel Palacios Fajardo";
                      comboParroquia[12] ="Juan Antonio Rodríguez Domínguez";
                      comboParroquia[13] ="Domingo Ortiz de Páez ";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="Barinitas";
                      comboParroquia[1] ="Altamira";
                      comboParroquia[2] ="Calderas";
                }
                if(comboMunicipio.equals("Cruz Paredez")){
                      comboParroquia[0] ="Barrancas";
                      comboParroquia[1] ="El Socorro";
                      comboParroquia[2] ="Masparrito";
                }
                if(comboMunicipio.equals("Ezequil Zamora")){
                      comboParroquia[0] ="Santa Barbara";
                      comboParroquia[1] ="José Ignacio del Pumar";
                      comboParroquia[2] ="Pedro Briceño Méndez";
                      comboParroquia[3] ="Ramón Ignacio Méndez";
                }
                if(comboMunicipio.equals("Obispo")){
                      comboParroquia[0] ="Obispo";
                      comboParroquia[1] ="El Real";
                      comboParroquia[2] ="La Luz";
                      comboParroquia[3] ="Los Guasimitos";
                }
                if(comboMunicipio.equals("Pedraza")){
                      comboParroquia[0] ="Ciudad Bolívar";
                      comboParroquia[1] ="Ignacio Briceño";
                      comboParroquia[2] ="José Félix Ribas";
                      comboParroquia[3] ="Páez";
                }
                if(comboMunicipio.equals("Rojas")){
                      comboParroquia[0] ="Libertad";
                      comboParroquia[1] ="Dolores";
                      comboParroquia[2] ="Palacios Fajardo";
                      comboParroquia[3] ="Santa Rosa";
                      comboParroquia[4] ="Simón Rodríguez";
                }
                if(comboMunicipio.equals("Sosa")){
                      comboParroquia[0] ="Ciudad de Nutrias";
                      comboParroquia[1] ="El Regalo";
                      comboParroquia[2] ="Puerto de Nutrias";
                      comboParroquia[3] ="Santa Catalina";
                      comboParroquia[4] ="Simón Bolívar";
                }
                if(comboMunicipio.equals("Andrés Eloy Blanco")){
                      comboParroquia[0] ="El Cantón";
                      comboParroquia[1] ="Santa Cruz de Guacas";
                      comboParroquia[2] ="Puerto Vivas";
                }
                if(comboMunicipio.equals("Caroní")){ // Bolivar
                      comboParroquia[0] ="Cachamay";
                      comboParroquia[1] ="Chirica";
                      comboParroquia[2] ="Dalla Costa";
                      comboParroquia[3] ="Once de Abril";
                      comboParroquia[4] ="Simón Bolívar";
                      comboParroquia[5] ="Unare";
                      comboParroquia[6] ="Universidad";
                      comboParroquia[7] ="Vista al Sol";
                      comboParroquia[8] ="Pozo Verde";
                      comboParroquia[9] ="Yocoima";
                      comboParroquia[10] ="Cinco de Julio";
                }
                if(comboMunicipio.equals("Cedeño")){
                      comboParroquia[0] ="Cedeño";
                      comboParroquia[1] ="Altagracia";
                      comboParroquia[2] ="Ascensión Farreras";
                      comboParroquia[3] ="Guaniamo";
                      comboParroquia[4] ="La Urbana";
                      comboParroquia[5] ="Pijiguaos";
                }
                if(comboMunicipio.equals("El Callao")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Gran Sabana")){
                      comboParroquia[0] ="Gran Sabana";
                      comboParroquia[1] ="Ikabarú";
                }
                if(comboMunicipio.equals("Heres")){
                      comboParroquia[0] ="Agua Salada";
                      comboParroquia[1] ="Catedral";
                      comboParroquia[2] ="José Antonio Páez";
                      comboParroquia[3] ="La Sabanita";
                      comboParroquia[4] ="Marhuanta";
                      comboParroquia[5] ="Vista Hermosa";
                      comboParroquia[6] ="Orinoco";
                      comboParroquia[7] ="Panapana";
                      comboParroquia[8] ="Zea";
                }
                if(comboMunicipio.equals("Piar")){
                      comboParroquia[0] ="Piar";
                      comboParroquia[1] ="Andrés Eloy Blanco";
                      comboParroquia[2] ="Pedro Cova";
                }
                if(comboMunicipio.equals("Angostura")){
                      comboParroquia[0] ="Angostura";
                      comboParroquia[1] ="Barceloneta";
                      comboParroquia[2] ="San Francisco";
                      comboParroquia[3] ="Santa Barbara";
                }
                if(comboMunicipio.equals("Roscio")){
                      comboParroquia[0] ="";
                      comboParroquia[1] ="Roscio";
                      comboParroquia[2] ="Salom";
                }
                if(comboMunicipio.equals("Sifontes")){
                      comboParroquia[0] ="Sifontes";
                      comboParroquia[1] ="Dalla Costa";
                      comboParroquia[2] ="San Isidro";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Aripao";
                      comboParroquia[2] ="Guarataro";
                      comboParroquia[3] ="Las Majadas";
                      comboParroquia[4] ="Moitaco";
                }
                if(comboMunicipio.equals("Padre Pedro Chien")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Bejuma")){ // Carabobo
                      comboParroquia[0] ="Bejuma";
                      comboParroquia[1] ="Canoabo";
                      comboParroquia[2] ="Simón Bolívar";
                }
                if(comboMunicipio.equals("Carlos Aruelo")){
                      comboParroquia[0] ="Guigue";
                      comboParroquia[1] ="Belén";
                      comboParroquia[2] ="Tacarigua";
                }
                if(comboMunicipio.equals("Diego Ibarra")){
                      comboParroquia[0] ="Aguas Calientes";
                      comboParroquia[1] ="Mariara";
                }
                if(comboMunicipio.equals("Guacara")){
                      comboParroquia[0] ="Ciudad Alianza";
                      comboParroquia[1] ="Guacara";
                      comboParroquia[2] ="Yagua";
                }
                if(comboMunicipio.equals("Juan José Mora")){
                      comboParroquia[0] ="Morón";
                      comboParroquia[1] ="Urama";
                }
                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Tocuyito";
                      comboParroquia[1] ="Independencia";
                }
                if(comboMunicipio.equals("Guayos")){
                     comboParroquia[0] ="Los Guayos";
                }
                if(comboMunicipio.equals("Miranda")){
                      comboParroquia[0] ="Miranda";
                }
                if(comboMunicipio.equals("Montalbán")){
                      comboParroquia[0] ="Montalbán";
                }
                if(comboMunicipio.equals("Naguanagua")){
                      comboParroquia[0] ="Naguanagua";
                }
                if(comboMunicipio.equals("Puerto Cabello")){
                      comboParroquia[0] ="Bartolomé Salom";
                      comboParroquia[1] ="Democracia";
                      comboParroquia[2] ="Fraternidad";
                      comboParroquia[3] ="Goaigoaza";
                      comboParroquia[4] ="Juan José Flores";
                      comboParroquia[5] ="Unión";
                      comboParroquia[6] ="Borburata";
                      comboParroquia[7] ="Patanemo";
                }
                if(comboMunicipio.equals("San Diego")){
                      comboParroquia[0] ="San Diego";
                }
                if(comboMunicipio.equals("San Joaquín")){
                      comboParroquia[0] ="San Joaquín";
                }
                if(comboMunicipio.equals("Valencia")){
                      comboParroquia[0] ="Candelaria";
                      comboParroquia[1] ="Catedral";
                      comboParroquia[2] ="El Socorro";
                      comboParroquia[3] ="Miguel Peña";
                      comboParroquia[4] ="Rafael Urdaneta";
                      comboParroquia[5] ="San Blas";
                      comboParroquia[6] ="San José";
                      comboParroquia[7] ="Santa Rosa";
                      comboParroquia[8] ="Negro Primero";
                }
                if(comboMunicipio.equals("Anzoátegui")){ // Cojedes
                      comboParroquia[0] ="Cojedes";
                      comboParroquia[1] ="Juan de Mata Suárez";
                }
                if(comboMunicipio.equals("Tinaquillo")){
                      comboParroquia[0] ="Tinaquillo";
                }
                if(comboMunicipio.equals("Girardot")){
                      comboParroquia[0] ="El Baúl";
                      comboParroquia[1] ="Sucre";
                }
                if(comboMunicipio.equals("Lima Blanco")){
                     comboParroquia[0] ="Macapo";
                      comboParroquia[1] ="La Aguadita";
                }
                if(comboMunicipio.equals("Pao de San Juan Bautista")){
                      comboParroquia[0] ="El Pao";
                }
                if(comboMunicipio.equals("Ricaute")){
                      comboParroquia[0] ="Libertad de Cojedes";
                      comboParroquia[1] ="El Amparo";
                }
                if(comboMunicipio.equals("Rómulo Gallegos")){
                      comboParroquia[0] ="Rómulo Gallegos";
                }
                if(comboMunicipio.equals("Ezequil Zamora")){
                      comboParroquia[0] ="San Carlos de Austria";
                      comboParroquia[1] ="Juan Ángel Bravo";
                      comboParroquia[2] ="Manuel Manrique";
                }
                if(comboMunicipio.equals("Tinaco")){
                      comboParroquia[0] ="General en Jefe José Laurencio Silva";
                }
                if(comboMunicipio.equals("Antonio Díaz")){ // Delta Amacura
                      comboParroquia[0] ="Curiapo";
                      comboParroquia[1] ="Almirante Luis Brión";
                      comboParroquia[2] ="Francisco Aniceto Lugo";
                      comboParroquia[3] ="Manuel Renaud";
                      comboParroquia[4] ="Padre Barral";
                      comboParroquia[5] ="Santos de Abelgas";
                }
                if(comboMunicipio.equals("Casacoima")){
                      comboParroquia[0] ="Imataca";
                      comboParroquia[1] ="Cinco de Julio";
                      comboParroquia[2] ="Juan Bautista Arismendi";
                      comboParroquia[3] ="Manuel Piar";
                      comboParroquia[4] ="Rómulo Gallegos";
                }
                if(comboMunicipio.equals("Pedernales")){
                      comboParroquia[0] ="Luis Beltrán Prieto Figueroa";
                }
                if(comboMunicipio.equals("Tucupita")){
                      comboParroquia[0] ="San José";
                      comboParroquia[1] ="José Vidal Marcano";
                      comboParroquia[2] ="Juan Milán";
                      comboParroquia[3] ="Leonardo Ruíz Pineda";
                      comboParroquia[4] ="Mariscal Antonio José de Sucre";
                      comboParroquia[5] ="Monseñor Argimiro García";
                      comboParroquia[6] ="San Rafael";
                      comboParroquia[7] ="Virgen del Valle";
                }
                if(comboMunicipio.equals("Libertador")){ // Libertador
                      comboParroquia[0] ="Altagracia";
                      comboParroquia[1] ="Antimano";
                      comboParroquia[2] ="Candelaria";
                      comboParroquia[3] ="Caricuao";
                      comboParroquia[4] ="Catedral";
                      comboParroquia[5] ="Coche";
                      comboParroquia[6] ="El Junquito";
                      comboParroquia[7] ="El Paraiso";
                      comboParroquia[8] ="El Recreo";
                      comboParroquia[9] ="El Valle";
                      comboParroquia[10] ="La Pastora";
                      comboParroquia[11] ="La Vega";
                      comboParroquia[12] ="Macarao";
                      comboParroquia[13] ="San Agustín";
                      comboParroquia[14] ="San Bernardino";
                      comboParroquia[15] ="San José";
                      comboParroquia[16] ="San Juan";
                      comboParroquia[17] ="San Pedro";
                      comboParroquia[18] ="Santa Rosalía";
                      comboParroquia[19] ="Santa Teresa";
                      comboParroquia[20] ="Sucre";
                      comboParroquia[21] ="23 de Enero";
                }
                if(comboMunicipio.equals("Acosta")){ // Falcon
                      comboParroquia[0] ="San Juan de los Cayos";
                      comboParroquia[1] ="Capadare";
                      comboParroquia[2] ="La Pastora";
                      comboParroquia[3] ="Libertador";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="San Luis";
                      comboParroquia[1] ="Arauca";
                      comboParroquia[2] ="La Peña";
                }
                if(comboMunicipio.equals("Buchivacoa")){
                      comboParroquia[0] ="Capatárida";
                      comboParroquia[1] ="Bariro";
                      comboParroquia[2] ="Barojó";
                      comboParroquia[3] ="Guajiro";
                      comboParroquia[4] ="Seque";
                      comboParroquia[5] ="Zazárida";
                }
                if(comboMunicipio.equals("Cacique Manaure")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Carirubana")){
                      comboParroquia[0] ="Carirubana";
                      comboParroquia[1] ="Norte";
                      comboParroquia[2] ="Punta Cardón";
                      comboParroquia[3] ="Santa Ana";
                }
                if(comboMunicipio.equals("Colina")){
                      comboParroquia[0] ="La Vela de Coro";
                      comboParroquia[1] ="Acurigua";
                      comboParroquia[2] ="Guaibacoa";
                      comboParroquia[3] ="Las Calderas";
                      comboParroquia[4] ="Macoruca";
                }
                if(comboMunicipio.equals("Dabajuro")){
                      comboParroquia[0] ="---";
               }
                if(comboMunicipio.equals("Democracia")){
                      comboParroquia[0] ="Pedregal";
                      comboParroquia[1] ="Agua Clara";
                      comboParroquia[2] ="Avaria";
                      comboParroquia[3] ="Piedra Grande";
                      comboParroquia[4] ="Purureche";
                }
                if(comboMunicipio.equals("Falcón")){
                      comboParroquia[0] ="Pueblo Nuevo";
                      comboParroquia[1] ="Adicora";
                      comboParroquia[2] ="Baraived";
                      comboParroquia[3] ="Buena Vista";
                      comboParroquia[4] ="Jadacaquiva";
                      comboParroquia[5] ="Moruy";
                      comboParroquia[6] ="Adaure";
                      comboParroquia[7] ="El Hato";
                      comboParroquia[8] ="El Vinculo";
                }
                if(comboMunicipio.equals("Federación")){
                      comboParroquia[0] ="Churuguara";
                      comboParroquia[1] ="Agua Larga";
                      comboParroquia[2] ="El Pauji";
                      comboParroquia[3] ="Independencia";
                      comboParroquia[4] ="Maparari";
                }
                if(comboMunicipio.equals("Jacura")){
                      comboParroquia[0] ="Jacura";
                      comboParroquia[1] ="Agua Linda";
                      comboParroquia[2] ="Araurima";
                }
                if(comboMunicipio.equals("Los Tanques")){
                      comboParroquia[0] ="Los Tanques";
                      comboParroquia[1] ="Judibana";
                }
                if(comboMunicipio.equals("Mauroa")){
                      comboParroquia[0] ="Mene de Mauroa";
                      comboParroquia[1] ="Casigua";
                      comboParroquia[2] ="San Félix";
                }
                if(comboMunicipio.equals("Miranda")){
                      comboParroquia[0] ="San Antonio";
                      comboParroquia[1] ="San Gabriel";
                      comboParroquia[2] ="Santa Ana";
                      comboParroquia[3] ="Guzmán Guillermo";
                      comboParroquia[4] ="Mitare";
                      comboParroquia[5] ="Río Seco";
                      comboParroquia[6] ="Sabaneta";
                }
                if(comboMunicipio.equals("Monseñor Iturriza")){
                      comboParroquia[0] ="Chichiriviche";
                      comboParroquia[1] ="Boca de Tocuyo";
                      comboParroquia[2] ="Tocuyo de la Costa";
                }
                if(comboMunicipio.equals("Palmasola")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Petit")){
                      comboParroquia[0] ="Cabure";
                      comboParroquia[1] ="Colina";
                      comboParroquia[2] ="Curimagua";
                }
                if(comboMunicipio.equals("Píritu")){
                      comboParroquia[0] ="Píritu";
                      comboParroquia[1] ="San José de la Costa";
               }
                if(comboMunicipio.equals("San Francisco")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Silva")){
                      comboParroquia[0] ="Tucacas";
                      comboParroquia[1] ="Boca de Aroa";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Pecaya";
                }
                if(comboMunicipio.equals("Tocópero")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Unión")){
                      comboParroquia[0] ="Santa Cruz de Bucaral";
                      comboParroquia[1] ="El Charal";
                      comboParroquia[2] ="Las Vegas del Tuy";
                }
                if(comboMunicipio.equals("Urumaco")){
                      comboParroquia[0] ="Urumaco";
                      comboParroquia[1] ="Bruzual";
                }
                if(comboMunicipio.equals("Zamora")){
                      comboParroquia[0] ="Puerto Cumarebo";
                      comboParroquia[1] ="La Ciénega";
                      comboParroquia[2] ="La Soledad";
                      comboParroquia[3] ="Pueblo Cumarebo";
                      comboParroquia[4] ="Zazárida";
                }
                if(comboMunicipio.equals("Camaguán")){ // Guárico
                      comboParroquia[0] ="Camaguán";
                      comboParroquia[1] ="Puerto Miranda";
                      comboParroquia[2] ="Uverito";
                }
                if(comboMunicipio.equals("Chaguaramas")){
                      comboParroquia[0] ="Chaguaramas";
                }
                if(comboMunicipio.equals("El Socorro")){
                      comboParroquia[0] ="El Socorro";
                }
                if(comboMunicipio.equals("San Gerónimo de Guayabal")){
                      comboParroquia[0] ="San Gerónimo de Guayabal";
                      comboParroquia[1] ="Cazorla";
                }
                if(comboMunicipio.equals("Leonardo Infantes")){
                      comboParroquia[0] ="Valle de la Pascua";
                      comboParroquia[1] ="Espino";
                }
                if(comboMunicipio.equals("Las Mercedes")){
                      comboParroquia[0] ="Las Mercedes";
                      comboParroquia[1] ="Cabruta";
                      comboParroquia[2] ="Santa Rita de Manapire";
               }
                if(comboMunicipio.equals("Julián Mellado")){
                      comboParroquia[0] ="El Sombrero";
                      comboParroquia[1] ="Sosa";
                 }
                if(comboMunicipio.equals("Francisco de Miranda")){
                      comboParroquia[0] ="Calabozo";
                      comboParroquia[1] ="El Calvario";
                      comboParroquia[2] ="El Rastro";
                      comboParroquia[3] ="Guardatinajas";
                }
                if(comboMunicipio.equals("José Tadeo Monagas")){
                      comboParroquia[0] ="Altagracia de Orituco";
                      comboParroquia[1] ="Lezama";
                      comboParroquia[2] ="Libertad de Orituco";
                      comboParroquia[3] ="Paso Real de Macaira";
                      comboParroquia[4] ="San Francisco de Macaira";
                      comboParroquia[5] ="San Rafael de Orituco";
                      comboParroquia[6] ="Soublette";
                }
                if(comboMunicipio.equals("Ortiz")){
                      comboParroquia[0] ="Ortiz";
                      comboParroquia[1] ="San Francisco de Tiznado";
                      comboParroquia[2] ="San José de Tiznado";
                      comboParroquia[3] ="San Lorenzo de Tiznado";
                }
                if(comboMunicipio.equals("José Félix Ribas")){
                      comboParroquia[0] ="Tucupido";
                      comboParroquia[1] ="San Rafael de Laya";
                }
                if(comboMunicipio.equals("Juan Germán Roscio")){
                      comboParroquia[0] ="San Juan de los Morros";
                      comboParroquia[1] ="Cantagallo";
                      comboParroquia[2] ="Parapara";
                }
                if(comboMunicipio.equals("San José de Guaribe")){
                      comboParroquia[0] ="San José de Guaribe";
                }
                if(comboMunicipio.equals("Santa María de Ipire")){
                      comboParroquia[0] ="Santa María de Ipire";
                      comboParroquia[1] ="Altamira";
                }
                if(comboMunicipio.equals("Pedro Zaraza")){
                      comboParroquia[0] ="Zaraza";
                      comboParroquia[1] ="San José de Unare";
                }
                if(comboMunicipio.equals("Andrés Eloy Blanco")){ // Lara
                      comboParroquia[0] ="Pio Tamayo";
                      comboParroquia[1] ="Quebrada Honda de Guache";
                      comboParroquia[2] ="Yacambú";
                }
                if(comboMunicipio.equals("Crespo")){
                      comboParroquia[0] ="Fréites";
                      comboParroquia[1] ="José María Blanco";
                }
                if(comboMunicipio.equals("Irribarren")){
                      comboParroquia[0] ="Catedral";
                      comboParroquia[1] ="Concepción";
                      comboParroquia[2] ="El Crují";
                      comboParroquia[3] ="Juan de Villegas";
                      comboParroquia[4] ="Santa Rosa";
                      comboParroquia[5] ="Tamaca";
                      comboParroquia[6] ="Unión";
                      comboParroquia[7] ="Aguedo Felipe Alvarado";
                      comboParroquia[8] ="Buena Vista";
                      comboParroquia[9] ="Juárez";
                }
                if(comboMunicipio.equals("Jiménez")){
                      comboParroquia[0] ="Juan Bautista Rodríguez";
                      comboParroquia[1] ="Cuara";
                      comboParroquia[2] ="Diego Lozada";
                      comboParroquia[3] ="Paraíso de San José";
                      comboParroquia[4] ="San Miguel";
                      comboParroquia[5] ="Tintorero";
                      comboParroquia[6] ="José Bernardo Dorante";
                      comboParroquia[7] ="Coronel Mariano Peraza";
                }
                if(comboMunicipio.equals("Morán")){
                      comboParroquia[0] ="Bolívar";
                      comboParroquia[1] ="Anzoátegui";
                      comboParroquia[2] ="Guárico";
                      comboParroquia[3] ="Hilario Luna y Luna";
                      comboParroquia[4] ="Humocaro Alto";
                      comboParroquia[5] ="Humocaro Bajo";
                      comboParroquia[6] ="La Candelaria";
                      comboParroquia[7] ="Moran";
                }
                if(comboMunicipio.equals("Palavecino")){
                     comboParroquia[0] ="Cabudare";
                      comboParroquia[1] ="José Gregorio Bastidas";
                      comboParroquia[2] ="Agua Viva";
                }
                if(comboMunicipio.equals("Simón Planas")){
                      comboParroquia[0] ="Sarare";
                      comboParroquia[1] ="Buría";
                      comboParroquia[2] ="Gustavo Vegas León";
                }
                if(comboMunicipio.equals("Torres")){
                      comboParroquia[0] ="Trinidad Samuel";
                      comboParroquia[1] ="Antonio Díaz";
                      comboParroquia[2] ="Camacaro";
                      comboParroquia[3] ="Castañeda";
                      comboParroquia[4] ="Cecilio Zubillaga";
                      comboParroquia[5] ="Chiquinquirá";
                      comboParroquia[6] ="El Blanco";
                      comboParroquia[7] ="Espinoza de los Monteros";
                      comboParroquia[8] ="Lara";
                      comboParroquia[9] ="Las Mercedes";
                      comboParroquia[10] ="Manuel Morillo";
                      comboParroquia[11] ="Montaña Verde";
                      comboParroquia[12] ="Montes de Oca";
                      comboParroquia[13] ="Torres";
                      comboParroquia[14] ="Heriberto Arroyo";
                      comboParroquia[15] ="Reyes Vargas";
                      comboParroquia[16] ="Altagracia";
                }
                if(comboMunicipio.equals("Urdaneta")){
                      comboParroquia[0] ="Siquisique";
                      comboParroquia[1] ="Moroturo";
                      comboParroquia[2] ="San Miguel";
                      comboParroquia[3] ="Xaguas";
                }
                if(comboMunicipio.equals("Alberto Adriani")){ // Merida
                      comboParroquia[0] ="Presidente Betancourt";
                      comboParroquia[1] ="Presidente Páez";
                      comboParroquia[2] ="Presidente Rómulo Gallegos";
                      comboParroquia[3] ="Gabriel Picón González";
                      comboParroquia[4] ="Héctor Amable Mora";
                      comboParroquia[5] ="José Nucete Sardi";
                      comboParroquia[6] ="Pulido Méndez";
               }
                if(comboMunicipio.equals("Andrés Bello")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Antonio Pinto Salinas")){
                      comboParroquia[0] ="Antonio Pinto Salinas";
                      comboParroquia[1] ="Mesa Bolívar";
                      comboParroquia[2] ="Mesa de las Palmas";
                }
                if(comboMunicipio.equals("Aricagua")){
                      comboParroquia[0] ="Aricagua";
                      comboParroquia[1] ="San Antonio";
                }
                if(comboMunicipio.equals("Arzobispo Chacón")){
                      comboParroquia[0] ="Arzobispo Chacón";
                      comboParroquia[1] ="Capurí";
                      comboParroquia[2] ="Chacantá";
                      comboParroquia[3] ="El Molino";
                      comboParroquia[4] ="Guaimaral";
                      comboParroquia[5] ="Mucutuy";
                      comboParroquia[6] ="Mucuchachú";
                }
                if(comboMunicipio.equals("Campo Elías")){
                      comboParroquia[0] ="Fernández Peña";
                      comboParroquia[1] ="Matriz";
                      comboParroquia[2] ="Montalbán";
                      comboParroquia[3] ="Acequias";
                      comboParroquia[4] ="Jají";
                      comboParroquia[5] ="La Mesa";
                      comboParroquia[6] ="San José del Sur";
                }
                if(comboMunicipio.equals("Caracciolo Parra Olmedo")){
                      comboParroquia[0] ="Caracciolo Parra Olmedo";
                      comboParroquia[1] ="Florencio Ramírez";
                }
                if(comboMunicipio.equals("Cardenal Quintero")){
                      comboParroquia[0] ="Cardenal Quintero";
                      comboParroquia[1] ="Las Piedras";
                }
                if(comboMunicipio.equals("Guaraque")){
                      comboParroquia[0] ="Guaraque";
                      comboParroquia[1] ="Mesa de Quintero";
                      comboParroquia[2] ="Río Negro";
                }
                if(comboMunicipio.equals("Julio César Salas")){
                      comboParroquia[0] ="Julio César Salas";
                      comboParroquia[1] ="Palmira";
                }
                if(comboMunicipio.equals("Justo Briceño")){
                      comboParroquia[0] ="Justo Briceño";
                      comboParroquia[1] ="San Cristóbal de Torondoy";
                }
                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Antonio Spinetti Dini";
                      comboParroquia[1] ="Arias";
                      comboParroquia[2] ="Caraccido Parra Pérez";
                      comboParroquia[3] ="Domingo Peña";
                      comboParroquia[4] ="El Llano";
                      comboParroquia[5] ="Gonzalo Picón Febres";
                      comboParroquia[6] ="Jacinto Plaza";
                      comboParroquia[7] ="Juan Rodríguez Suárez";
                      comboParroquia[8] ="Lasso de La Vega";
                      comboParroquia[9] ="Mariano Picón Salas";
                      comboParroquia[10] ="Milla";
                      comboParroquia[11] ="Osuna Rodríguez";
                      comboParroquia[12] ="Sagrario";
                      comboParroquia[13] ="El Morro";
                      comboParroquia[14] ="Los Nevados";
                }
                if(comboMunicipio.equals("Miranda")){
                      comboParroquia[0] ="Miranda";
                      comboParroquia[1] ="Andrés Eloy Blanco";
                      comboParroquia[2] ="La Venta Piñango";
                }
                if(comboMunicipio.equals("Obíspo Ramos de Lora")){
                      comboParroquia[0] ="Obíspo Ramos de Lora";
                      comboParroquia[1] ="Eloy Paredes";
                      comboParroquia[2] ="San Rafael de Alcázar";
                }
                if(comboMunicipio.equals("Padre Noguera")){
                     comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Pueblo Llano")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Rangel")){
                      comboParroquia[0] ="Rangel";
                      comboParroquia[1] ="Cacute";
                      comboParroquia[2] ="La Toma";
                      comboParroquia[3] ="Mucurubá";
                      comboParroquia[4] ="San Rafael";
                }
                if(comboMunicipio.equals("Rivas Dávila")){
                      comboParroquia[0] ="Rivas Dávila";
                      comboParroquia[1] ="Gerónimo Maldonado";
                }
                if(comboMunicipio.equals("Santos Marquina")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Chiguará";
                      comboParroquia[2] ="Estánques";
                      comboParroquia[3] ="La Trampa";
                      comboParroquia[4] ="Pueblo Nuevo del Sur";
                      comboParroquia[5] ="San Juan";
                }
                if(comboMunicipio.equals("Tovar")){
                      comboParroquia[0] ="El Amparo";
                      comboParroquia[1] ="El Llano";
                      comboParroquia[2] ="San Francisco";
                      comboParroquia[3] ="Tovar";
                }
                if(comboMunicipio.equals("Tulio Febres Cordero")){
                      comboParroquia[0] ="Tulio Febres Cordero";
                      comboParroquia[1] ="Independencia";
                      comboParroquia[2] ="María de La Concepción Palacios Blanco";
                      comboParroquia[3] ="Santa Apolonia";
                }
                if(comboMunicipio.equals("Zea")){
                      comboParroquia[0] ="Zea";
                      comboParroquia[1] ="El Tigre";
                }
                if(comboMunicipio.equals("Acevedo")){ // Miranda
                      comboParroquia[0] ="Caucagua";
                      comboParroquia[1] ="Araguita";
                      comboParroquia[2] ="Arévalo González";
                      comboParroquia[3] ="Capaya";
                      comboParroquia[4] ="El Café";
                      comboParroquia[5] ="Marizapa";
                      comboParroquia[6] ="Panaquire";
                      comboParroquia[7] ="Ribas";
                }
                if(comboMunicipio.equals("Andrés Bello")){
                      comboParroquia[0] ="Cumbo";
                }
                if(comboMunicipio.equals("Baruta")){
                      comboParroquia[0] ="Nuestra Señora del Rosario de Baruta";
                      comboParroquia[1] ="El Cafetal";
                      comboParroquia[2] ="Las Minas de Baruta";
                }
                if(comboMunicipio.equals("Brión")){
                      comboParroquia[0] ="Higuerote";
                      comboParroquia[1] ="Curiepe";
                      comboParroquia[2] ="Tacarigua";
                }
                if(comboMunicipio.equals("Buroz")){
                      comboParroquia[0] ="Mamporal";
                }
                if(comboMunicipio.equals("Carrizal")){
                      comboParroquia[0] ="Carrizal";
                }
                if(comboMunicipio.equals("Chacao")){
                      comboParroquia[0] ="Chacao";
                }
                if(comboMunicipio.equals("Cristóbal Rojas")){
                      comboParroquia[0] ="Charallave";
                      comboParroquia[1] ="Las Brisas";
                }
                if(comboMunicipio.equals("El Hatillo")){
                      comboParroquia[0] ="El Hatillo";
                }
                if(comboMunicipio.equals("Guaicapuro")){
                      comboParroquia[0] ="Los Teques";
                      comboParroquia[1] ="Altagracia de la Montaña";
                      comboParroquia[2] ="Cecilio Acosta";
                      comboParroquia[3] ="El Jarillo";
                      comboParroquia[4] ="Paracotos";
                      comboParroquia[5] ="San Pedro";
                      comboParroquia[6] ="Tácata";
                }
                if(comboMunicipio.equals("Independencia")){
                      comboParroquia[0] ="Santa Teresa del Tuy";
                      comboParroquia[1] ="El Cartanal";
                }
                if(comboMunicipio.equals("Lander")){
                      comboParroquia[0] ="Ocumare del Tuy";
                      comboParroquia[1] ="La Democracia";
                      comboParroquia[2] ="Santa Bárbara";
                }
                if(comboMunicipio.equals("Los Salias")){
                      comboParroquia[0] ="San Antonio de Los Altos";
                }
                if(comboMunicipio.equals("Páez")){
                      comboParroquia[0] ="Río Chico";
                      comboParroquia[1] ="El Guapo";
                      comboParroquia[2] ="Tacarigua de La Laguna";
                      comboParroquia[3] ="Paparo";
                      comboParroquia[4] ="San Fernando del Guapo";
                }
                if(comboMunicipio.equals("Paz Castillo")){
                      comboParroquia[0] ="Santa Lucía";
                }
                if(comboMunicipio.equals("Pedro Gual")){
                      comboParroquia[0] ="Cúpira";
                }
                if(comboMunicipio.equals("Plaza")){
                      comboParroquia[0] ="Guarenas";
                }
                if(comboMunicipio.equals("Simón Bolívar")){
                      comboParroquia[0] ="San Francisco de Yare";
                      comboParroquia[1] ="San Antonio de Yare";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Petare";
                      comboParroquia[1] ="Caucaguita";
                      comboParroquia[2] ="Fila de Mariche";
                      comboParroquia[3] ="La Dolorita";
                      comboParroquia[4] ="Leoncio Martínez";
                }
                if(comboMunicipio.equals("Urdaneta")){
                      comboParroquia[0] ="Cúa";
                      comboParroquia[1] ="Nueva Cúa";
                }
                if(comboMunicipio.equals("Zamora")){
                      comboParroquia[0] ="Guatire";
                      comboParroquia[1] ="Bolívar";
                }
                if(comboMunicipio.equals("Acosta")){ // Monagas
                      comboParroquia[0] ="Acosta";
                      comboParroquia[1] ="San Francisco";
                }
                if(comboMunicipio.equals("Aguasay")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Caripe")){
                      comboParroquia[0] ="Caripe";
                      comboParroquia[1] ="El Guácharo";
                      comboParroquia[2] ="La Guanota";
                      comboParroquia[3] ="Sabana de Piedra";
                      comboParroquia[4] ="San Agustín";
                      comboParroquia[5] ="Teresén";
                }
                if(comboMunicipio.equals("Cedeño")){
                      comboParroquia[0] ="Cedeño";
                      comboParroquia[1] ="Areo";
                      comboParroquia[2] ="San Félix";
                      comboParroquia[3] ="Viento Fresco";
                }
                if(comboMunicipio.equals("Ezequil Zamora")){
                      comboParroquia[0] ="El Tejero";
                }
                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Libertador";
                      comboParroquia[1] ="Chaguaramas";
                      comboParroquia[2] ="Las Alhuacas";
                      comboParroquia[3] ="Tabasca";
                }
                if(comboMunicipio.equals("Maturín")){
                      comboParroquia[0] ="Maturín";
                      comboParroquia[1] ="Altos de Godos";
                      comboParroquia[2] ="Boquerón";
                      comboParroquia[3] ="Las Cocuizas";
                      comboParroquia[4] ="San Simón";
                      comboParroquia[5] ="Santa Cruz";
                      comboParroquia[6] ="El Cocozo";
                      comboParroquia[7] ="El Furrial";
                      comboParroquia[8] ="Jusepin";
                      comboParroquia[9] ="La Pica";
                      comboParroquia[10] ="San Vicente";
                }
                if(comboMunicipio.equals("Piar")){
                      comboParroquia[0] ="Piar";
                      comboParroquia[1] ="Aparicio";
                      comboParroquia[2] ="Chaguaramal";
                      comboParroquia[3] ="El Pinto";
                      comboParroquia[4] ="Guanaguana";
                      comboParroquia[5] ="La Toscana";
                      comboParroquia[6] ="Taguaya";
                }
                if(comboMunicipio.equals("Punceres")){
                      comboParroquia[0] ="Punceres";
                      comboParroquia[1] ="Chachipo";
                }
                if(comboMunicipio.equals("Santa Bárbara")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Sotillo")){
                      comboParroquia[0] ="Sotillo";
                      comboParroquia[1] ="Los Barrancos de Fajardo";
                }
                if(comboMunicipio.equals("Uracoa")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Antolín del Campo")){ // Nueva Esparta
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Arismendi")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Díaz")){
                      comboParroquia[0] ="Díaz";
                      comboParroquia[1] ="Zabala";
                }
                if(comboMunicipio.equals("García")){
                      comboParroquia[0] ="García";
                      comboParroquia[1] ="Francisco Fajardo";
                }
                if(comboMunicipio.equals("Gómez")){
                      comboParroquia[0] ="Gómez";
                      comboParroquia[1] ="Bolívar";
                      comboParroquia[2] ="Guevara";
                      comboParroquia[3] ="Matasiete";
                      comboParroquia[4] ="Sucre";
                }
                if(comboMunicipio.equals("Maneiro")){
                      comboParroquia[0] ="Maneiro";
                      comboParroquia[1] ="Aguirre";
                }
                if(comboMunicipio.equals("Marcano")){
                      comboParroquia[0] ="Marcano";
                      comboParroquia[1] ="Adrián";
                }
                if(comboMunicipio.equals("Mariño")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Península de Macanao")){
                      comboParroquia[0] ="Península de Macanao";
                      comboParroquia[1] ="San Francisco";
                }
                if(comboMunicipio.equals("Tubores")){
                      comboParroquia[0] ="Tubores";
                      comboParroquia[1] ="Los Barales";
                }
                if(comboMunicipio.equals("Villalba")){
                      comboParroquia[0] ="Villalba";
                      comboParroquia[1] ="Vicente Fuentes";
                }
                if(comboMunicipio.equals("Agua Blanca")){ // Portuguesa
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Araure")){
                      comboParroquia[0] ="Araure";
                      comboParroquia[1] ="Río Acarigua";
                }
                if(comboMunicipio.equals("Esteller")){
                      comboParroquia[0] ="Esteller";
                      comboParroquia[1] ="Uveral";
                }
                if(comboMunicipio.equals("Guanare")){
                      comboParroquia[0] ="Guanare";
                      comboParroquia[1] ="Córdoba";
                      comboParroquia[2] ="San José de La Montaña";
                      comboParroquia[3] ="San Juan de Guanaguanare";
                      comboParroquia[4] ="Virgen de La Coromoto";
                }
                if(comboMunicipio.equals("Guamarito")){
                      comboParroquia[0] ="Guamarito";
                      comboParroquia[1] ="Trinidad de La Capilla";
                      comboParroquia[2] ="Divina Pastora";
                }
                if(comboMunicipio.equals("Monseñor José Vicente de Unda")){
                      comboParroquia[0] ="Monseñor José Vicente de Unda";
                      comboParroquia[1] ="Peña Blanca";
                }
                if(comboMunicipio.equals("Ospino")){
                      comboParroquia[0] ="Ospino";
                      comboParroquia[1] ="Aparición";
                      comboParroquia[2] ="La Estación";
                }
                if(comboMunicipio.equals("Páez")){
                      comboParroquia[0] ="Páez";
                      comboParroquia[1] ="Payara";
                      comboParroquia[2] ="Pimpinela";
                      comboParroquia[3] ="Ramón Peraza";
                }
                if(comboMunicipio.equals("Papelón")){
                      comboParroquia[0] ="Papelón";
                      comboParroquia[1] ="Caño Delgadito";
                }
                if(comboMunicipio.equals("San Genaro de Boconoito")){
                      comboParroquia[0] ="San Genaro de Boconoito";
                      comboParroquia[1] ="Antolín Tovar";
                }
                if(comboMunicipio.equals("San Rafael de Onoto")){
                      comboParroquia[0] ="San Rafael de Onoto";
                      comboParroquia[1] ="Santa Fe";
                      comboParroquia[2] ="Thermo Morles";
                }
                if(comboMunicipio.equals("Santa Rosalía")){
                      comboParroquia[0] ="Santa Rosalía";
                      comboParroquia[1] ="Florida";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Concepción";
                      comboParroquia[2] ="San Rafael de Palo Alzado";
                      comboParroquia[3] ="Uvencio Antonio Velázquez";
                      comboParroquia[4] ="San José de Saguaz";
                      comboParroquia[5] ="Villa Rosa";
               }
                if(comboMunicipio.equals("Turén")){
                      comboParroquia[0] ="Turén";
                      comboParroquia[1] ="Canelones";
                      comboParroquia[2] ="Santa Cruz";
                      comboParroquia[3] ="San Isidro Labrador";
                }
                if(comboMunicipio.equals("Andrés Eloy Blanco")){ // Sucre
                      comboParroquia[0] ="Mariño";
                      comboParroquia[1] ="Rómulo Gallegos";
                }
                if(comboMunicipio.equals("Andrés Mata")){
                      comboParroquia[0] ="San José de Acerocuar";
                      comboParroquia[1] ="Tavera Acosta";
                }
                if(comboMunicipio.equals("Arismendi")){
                      comboParroquia[0] ="Río Caribe";
                      comboParroquia[1] ="Antonio José de Sucre";
                      comboParroquia[2] ="El Morro de Puerto Santo";
                      comboParroquia[3] ="Puerto Santo";
                      comboParroquia[4] ="San Juan de Las Galdonas";
                }
                if(comboMunicipio.equals("Benítez")){
                      comboParroquia[0] ="El Pilar";
                      comboParroquia[1] ="El Rincón";
                      comboParroquia[2] ="General Francisco Antonio Vázquez";
                      comboParroquia[3] ="Guaraúnos";
                      comboParroquia[4] ="Tunapuicito";
                      comboParroquia[5] ="Unión";
                }
                if(comboMunicipio.equals("Bermúdez")){
                      comboParroquia[0] ="Bolívar";
                      comboParroquia[1] ="Macarapana";
                      comboParroquia[2] ="Santa Catalina";
                      comboParroquia[3] ="Santa Rosa";
                      comboParroquia[4] ="Santa Teresa";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Cajigal")){
                      comboParroquia[0] ="Yaguaraparo";
                      comboParroquia[1] ="El Paujil";
                      comboParroquia[2] ="Libertad";
                }
                if(comboMunicipio.equals("Cruz Salmerón Acosta")){
                      comboParroquia[0] ="Araya";
                      comboParroquia[1] ="Chacopata";
                      comboParroquia[2] ="Manicure";
                }
                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Tunapuy";
                      comboParroquia[1] ="Campos Elías";
                }
                if(comboMunicipio.equals("Mariño")){
                      comboParroquia[0] ="Irapa";
                      comboParroquia[1] ="Campo Claro";
                      comboParroquia[2] ="Marabal";
                      comboParroquia[3] ="San Antonio de Irapa";
                      comboParroquia[4] ="Soro";
                }
                if(comboMunicipio.equals("Mejía")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Montes")){
                      comboParroquia[0] ="Cumanacoa";
                      comboParroquia[1] ="Arenas";
                      comboParroquia[2] ="Aricagua";
                      comboParroquia[3] ="Cocollar";
                      comboParroquia[4] ="San Fernando";
                      comboParroquia[5] ="San Lorenzo";
                }
                if(comboMunicipio.equals("Ribero")){
                      comboParroquia[0] ="Cariaco";
                      comboParroquia[1] ="Catuaro";
                      comboParroquia[2] ="Rendón";
                      comboParroquia[3] ="Santa Cruz";
                      comboParroquia[4] ="Santa María";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Altagracia";
                      comboParroquia[1] ="Ayacucho";
                      comboParroquia[2] ="Santa Inés";
                      comboParroquia[3] ="Valentín Valiente";
                      comboParroquia[4] ="San Juan";
                      comboParroquia[5] ="Raúl Leoni";
                      comboParroquia[6] ="Gran Mariscal";
                }
                if(comboMunicipio.equals("Valdez")){
                      comboParroquia[0] ="Bideau";
                      comboParroquia[1] ="Cristóbal Colón";
                      comboParroquia[2] ="Punta de Piedras";
                }
                if(comboMunicipio.equals("Andrés Bello")){ // Tachira
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Antonio Rómulo Costa")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Ayacucho")){
                      comboParroquia[0] ="Ayacucho";
                      comboParroquia[1] ="Rivas Berti";
                      comboParroquia[2] ="San Pedro del Río";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="Bolívar";
                      comboParroquia[1] ="Palotal";
                      comboParroquia[2] ="Juan Vicente Gómez";
                      comboParroquia[3] ="Isaías Medina Angarita";
                }
                if(comboMunicipio.equals("Cárdenas")){
                      comboParroquia[0] ="Cárdenas";
                      comboParroquia[1] ="Amenodoro Rangel Lamús";
                      comboParroquia[2] ="La Florida";
                }
                if(comboMunicipio.equals("Córdoba")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Fernández Feo")){
                      comboParroquia[0] ="Fernández Feo";
                      comboParroquia[1] ="Alberto Adriani";
                      comboParroquia[2] ="Santo Domingo";
                }
                if(comboMunicipio.equals("Francisco de Miranda")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("García de Hevia")){
                      comboParroquia[0] ="García de Hevia";
                      comboParroquia[1] ="Boca de Grita";
                      comboParroquia[2] ="José Antonio Páez";
                }
                if(comboMunicipio.equals("Guásimo")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Independencia")){
                      comboParroquia[0] ="Independencia";
                      comboParroquia[1] ="Juan Germán Rescio";
                      comboParroquia[2] ="Román Cádenas";
                }
                if(comboMunicipio.equals("Jáuregui")){
                      comboParroquia[0] ="Jáuregui";
                      comboParroquia[1] ="Emilio Constantino Guerrero";
                      comboParroquia[2] ="Monseñor Miguel Antonio Salas";
                }
                if(comboMunicipio.equals("José María Vargas")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Junín")){
                      comboParroquia[0] ="Junín";
                      comboParroquia[1] ="La Petrólea";
                      comboParroquia[2] ="Quinimarí";
                      comboParroquia[3] ="Bramón";
                }
                if(comboMunicipio.equals("Libertad")){
                      comboParroquia[0] ="Libertad";
                      comboParroquia[1] ="Cipriano Castro";
                      comboParroquia[2] ="Manuel Felipe Rugeles";
                }
                if(comboMunicipio.equals("Libertador")){
                      comboParroquia[0] ="Libertador";
                      comboParroquia[1] ="Don Emeterio Ochoa";
                      comboParroquia[2] ="Doradas";
                      comboParroquia[3] ="San Joaquín de Navay";
                }
                if(comboMunicipio.equals("Lobatera")){
                      comboParroquia[0] ="Lobatera";
                      comboParroquia[1] ="Constitución";
                }
                if(comboMunicipio.equals("Michelena")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Panamericano")){
                      comboParroquia[0] ="Panamericano";
                      comboParroquia[1] ="La Palmita";
                }
                if(comboMunicipio.equals("Pedro María Ureña")){
                      comboParroquia[0] ="Pedro María Ureña";
                      comboParroquia[1] ="Nueva Arcadia";
                }
                if(comboMunicipio.equals("Rafael Urdaneta")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Samuel Darío Maldonado")){
                      comboParroquia[0] ="Samuel Darío Maldonado";
                      comboParroquia[1] ="Boconó";
                      comboParroquia[2] ="Hernández";
                }
                if(comboMunicipio.equals("San Cristóbal")){
                      comboParroquia[0] ="La Concordia";
                      comboParroquia[1] ="Pedro María Morantes";
                      comboParroquia[2] ="San Juan Bautista";
                      comboParroquia[3] ="San Sebastián";
                      comboParroquia[4] ="Dr. francisco Romero Lobo";
                }
                if(comboMunicipio.equals("Seboruco")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Simón Rodríguez")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sucre";
                      comboParroquia[1] ="Eleazar López Contreras";
                      comboParroquia[2] ="San Pablo";
                }
                if(comboMunicipio.equals("Torbes")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Uribante")){
                      comboParroquia[0] ="Uribante";
                      comboParroquia[1] ="Cárdenas";
                      comboParroquia[2] ="Juan Pablo Peñaloza";
                      comboParroquia[3] ="Potosí";
                }
                if(comboMunicipio.equals("San Judas Tadeo")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Andrés Bello")){ // Trujillo
                      comboParroquia[0] ="Santa Isabel";
                      comboParroquia[1] ="Araguaney";
                      comboParroquia[2] ="El Jaguito";
                      comboParroquia[3] ="La Esperanza";
                }
                if(comboMunicipio.equals("Boconó")){
                      comboParroquia[0] ="Boconó";
                      comboParroquia[1] ="El Carmen";
                      comboParroquia[2] ="Mosquey";
                      comboParroquia[3] ="Ayacucho";
                      comboParroquia[4] ="Burbusay";
                      comboParroquia[5] ="General Rivas";
                      comboParroquia[6] ="Guaramacal";
                      comboParroquia[7] ="Vega de Guaramacal";
                      comboParroquia[8] ="Monseñor Jáuregui";
                      comboParroquia[9] ="Rafael Rangel";
                      comboParroquia[10] ="San Miguel";
                      comboParroquia[11] ="San José";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="Sabana Grande";
                      comboParroquia[1] ="Cheregue";
                      comboParroquia[2] ="Granados";
                }
                if(comboMunicipio.equals("Candelaria")){
                      comboParroquia[0] ="Chejendé";
                      comboParroquia[1] ="Arnoldo Gabaldón";
                      comboParroquia[2] ="Bolívar";
                      comboParroquia[3] ="Carrillo";
                      comboParroquia[4] ="Cegarra";
                      comboParroquia[5] ="Manuel Salvador Ulloa";
                      comboParroquia[6] ="San José";
                }
                if(comboMunicipio.equals("Carache")){
                      comboParroquia[0] ="Carache";
                      comboParroquia[1] ="Cuicas";
                      comboParroquia[2] ="La Concepción";
                      comboParroquia[3] ="Santa Cruz";
                }
                if(comboMunicipio.equals("Escuque")){
                      comboParroquia[0] ="Escuque";
                      comboParroquia[1] ="La Unión";
                      comboParroquia[2] ="Sabana Libre";
                      comboParroquia[3] ="Santa Rita";
                }
                if(comboMunicipio.equals("José Felipe Márquez Cañizales")){
                      comboParroquia[0] ="El Socorro";
                      comboParroquia[1] ="Antonio José de Sucre";
                      comboParroquia[2] ="Los Caprichos";
                }
                if(comboMunicipio.equals("Juan Vicente Campo Elías")){
                      comboParroquia[0] ="Campo Elías";
                      comboParroquia[1] ="Arnoldo Gabaldón";
                }
                if(comboMunicipio.equals("La Ceiba")){
                      comboParroquia[0] ="Santa Apolonia";
                      comboParroquia[1] ="El Progreso";
                      comboParroquia[2] ="La Ceiba";
                      comboParroquia[3] ="Tres de Febrero";
                }
                if(comboMunicipio.equals("Miranda")){
                      comboParroquia[0] ="El Dividive";
                      comboParroquia[1] ="Agua Santa";
                      comboParroquia[2] ="Agua Caliente";
                      comboParroquia[3] ="El Cenizo";
                      comboParroquia[4] ="Valerita";
                }
                if(comboMunicipio.equals("Monte Carmelo")){
                      comboParroquia[0] ="Monte Carmelo";
                      comboParroquia[1] ="Buena Vista";
                      comboParroquia[2] ="Santa María de Horcón";
                }
                if(comboMunicipio.equals("Motatán")){
                      comboParroquia[0] ="Motatán";
                      comboParroquia[1] ="El Baño";
                      comboParroquia[2] ="Jalisco";
                }
                if(comboMunicipio.equals("Pampán")){
                      comboParroquia[0] ="Pampán";
                      comboParroquia[1] ="Flor de Patria";
                      comboParroquia[2] ="La Paz";
                      comboParroquia[3] ="Santa Ana";
                }
                if(comboMunicipio.equals("Pampanito")){
                      comboParroquia[0] ="Pampanito";
                      comboParroquia[1] ="La Concepción";
                      comboParroquia[2] ="Pampanito II";
                }
                if(comboMunicipio.equals("Rafael Rangel")){
                      comboParroquia[0] ="Betijoque";
                      comboParroquia[1] ="La Pueblita";
                      comboParroquia[2] ="Los Cedros";
                      comboParroquia[3] ="José Gregorío Hernández";
                }
                if(comboMunicipio.equals("San Rafael de Carvajal")){
                      comboParroquia[0] ="Carvajal";
                      comboParroquia[1] ="Antonio Nicolás Briceño";
                      comboParroquia[2] ="Campo Alegre";
                      comboParroquia[3] ="José Leonardo Suárez";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Sabana de Mendoza";
                      comboParroquia[1] ="El Paraíso";
                      comboParroquia[2] ="Junín";
                      comboParroquia[3] ="Valmore Rodríguez";
               }
                if(comboMunicipio.equals("Trujillo")){
                      comboParroquia[0] ="Andrés Linares";
                      comboParroquia[1] ="Chiquinquirá";
                      comboParroquia[2] ="Cristóbal Mendoza";
                      comboParroquia[3] ="Cruz Carrillo";
                      comboParroquia[4] ="Matriz";
                      comboParroquia[5] ="Monseñor Carrillo";
                      comboParroquia[6] ="Tres Esquinas";
                }
                if(comboMunicipio.equals("Urdaneta")){
                      comboParroquia[0] ="La Quebrada";
                      comboParroquia[1] ="Carimbú";
                      comboParroquia[2] ="Jajó";
                      comboParroquia[3] ="La Mesa";
                      comboParroquia[4] ="Santiago";
                      comboParroquia[5] ="Tuñame";
                }
                if(comboMunicipio.equals("Valera")){
                      comboParroquia[0] ="Juan Ignacio Montilla";
                      comboParroquia[1] ="La Beatriz";
                      comboParroquia[2] ="Mercedez Díaz";
                      comboParroquia[3] ="San Luis";
                      comboParroquia[4] ="La Puerta";
                      comboParroquia[5] ="Mendoza";
                }
                if(comboMunicipio.equals("Vargas")){ // Vargas
                      comboParroquia[0] ="Caraballeda";
                      comboParroquia[1] ="Carayaca";
                      comboParroquia[2] ="Caruao";
                      comboParroquia[3] ="Catia La Mar";
                      comboParroquia[4] ="El Junko";
                      comboParroquia[5] ="La Guaira";
                      comboParroquia[6] ="Macuto";
                      comboParroquia[7] ="Maiquetía";
                      comboParroquia[8] ="Naiguatá";
                      comboParroquia[9] ="Urimare";
                      comboParroquia[10] ="Carlos Soublette";
                }
                if(comboMunicipio.equals("Arístidez Bastidas")){ // Yaracuy
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Bolívar")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Bruzual")){
                      comboParroquia[0] ="Bruzual";
                      comboParroquia[1] ="Campo Elías";
                }
                if(comboMunicipio.equals("Cocorote")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Independencia")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("José Antonio Páez")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("La Trinidad")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Manuel Monge")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Nirgua")){
                      comboParroquia[0] ="Nirgua";
                      comboParroquia[1] ="Salom";
                      comboParroquia[2] ="Temerla";
                }
                if(comboMunicipio.equals("Peña")){
                      comboParroquia[0] ="Peña";
                      comboParroquia[1] ="San Andrés";
                }
                if(comboMunicipio.equals("San Felipe")){
                      comboParroquia[0] ="San Felipe";
                      comboParroquia[1] ="Albarico";
                      comboParroquia[2] ="San Javier";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Urachiche")){
                      comboParroquia[0] ="---";
                }
                if(comboMunicipio.equals("Veroes")){
                      comboParroquia[0] ="Veroes";
                      comboParroquia[1] ="El Guayabo";
                }
                
             
                if(comboMunicipio.equals("Almirante Padilla")){ // Zulia
                      comboParroquia[0] ="Islas de Toas";
                      comboParroquia[1] ="Monagas";
                }
                if(comboMunicipio.equals("Baralt")){
                      comboParroquia[0] ="San Timoteo";
                      comboParroquia[1] ="General Urdaneta";
                      comboParroquia[2] ="Libertador";
                      comboParroquia[3] ="Manuel Guanipa Matos";
                      comboParroquia[4] ="Marcelino Briceño";
                      comboParroquia[5] ="Pueblo Nuevo";
                }
                if(comboMunicipio.equals("Cabimas")){
                      comboParroquia[0] ="Ambrosio";
                      comboParroquia[1] ="Carmen Herrera";
                      comboParroquia[2] ="Germán Ríos Linares";
                      comboParroquia[3] ="La Rosa";
                      comboParroquia[4] ="Jorge Hernández";
                      comboParroquia[5] ="San Benito";
                      comboParroquia[6] ="Arístidez Calvani";
                      comboParroquia[7] ="Punta Gorda";
                }
                if(comboMunicipio.equals("Catatumbo")){
                      comboParroquia[0] ="Encontrados";
                      comboParroquia[1] ="Udón Pérez";
                }
                if(comboMunicipio.equals("Colón")){
                      comboParroquia[0] ="San Carlos del Zulia";
                      comboParroquia[1] ="Moralito";
                      comboParroquia[2] ="Santa Bárbara";
                      comboParroquia[3] ="Santa Cruz del Zulia";
                      comboParroquia[4] ="Urribarri";
                }
                if(comboMunicipio.equals("Francisco Javier Pulgar")){
                      comboParroquia[0] ="Simón Rodríguez";
                      comboParroquia[1] ="Carlos Quevedo";
                      comboParroquia[2] ="Francisco Javier Pulgar";
                      comboParroquia[3] ="Agustín Codazzi";
                }
                if(comboMunicipio.equals("Jesús Enrique Lossada")){
                      comboParroquia[0] ="La Concepción";
                      comboParroquia[1] ="José Ramón Yepes";
                      comboParroquia[2] ="Mariano Parra León";
                      comboParroquia[3] ="San José";
                }
                if(comboMunicipio.equals("Jesús María Semprún")){
                      comboParroquia[0] ="Jesús María Semprún";
                      comboParroquia[1] ="Barí";
                }
                if(comboMunicipio.equals("La Cañada de Urdaneta")){
                      comboParroquia[0] ="Concepción";
                      comboParroquia[1] ="Andrés Bello";
                      comboParroquia[2] ="Chiquinquirá";
                      comboParroquia[3] ="El Carmelo";
                      comboParroquia[4] ="Potrerito";
                }
                if(comboMunicipio.equals("Lagunillas")){
                      comboParroquia[0] ="Alonso de Ojeda";
                      comboParroquia[1] ="Libertad";
                      comboParroquia[2] ="Campo Lara";
                      comboParroquia[3] ="Eleazar López Contreras";
                      comboParroquia[4] ="Venezuela";
                      comboParroquia[5] ="El Daño";
                }
                if(comboMunicipio.equals("Machiques de Perijá")){
                      comboParroquia[0] ="Libertad";
                      comboParroquia[1] ="Bartolomé de Las Casas";
                      comboParroquia[2] ="Río Negro";
                      comboParroquia[3] ="San José de Perijá";
                }
                if(comboMunicipio.equals("Mara")){
                      comboParroquia[0] ="San Rafael";
                      comboParroquia[1] ="La Sierrita";
                      comboParroquia[2] ="Las Parcelas";
                      comboParroquia[3] ="Luis de Vicente";
                      comboParroquia[4] ="Monseñor Marcos Sergio Godoy";
                      comboParroquia[5] ="Ricaute";
                      comboParroquia[6] ="Tamare";
                }
                if(comboMunicipio.equals("Maracaibo")){
                      comboParroquia[0] ="Antonio Borjas Romero";
                      comboParroquia[1] ="Bolívar";
                      comboParroquia[2] ="Cacique Mara";
                      comboParroquia[3] ="Caracciolo Parra Pérez";
                      comboParroquia[4] ="Cecilio Acosta";
                      comboParroquia[5] ="Cristo de Aranza";
                      comboParroquia[6] ="Coquivacoa";
                      comboParroquia[7] ="Chiquinquirá";
                      comboParroquia[8] ="Francisco Eugenio Bustamante";
                      comboParroquia[9] ="Idelfonso Vázquez";
                      comboParroquia[10] ="Juana de Ávila";
                      comboParroquia[11] ="Luis Hurtado Higuera";
                      comboParroquia[12] ="Manuel Dagnino";
                      comboParroquia[13] ="Olegario Villalobos";
                      comboParroquia[14] ="Raúl Leoni";
                      comboParroquia[15] ="Santa Lucía";
                      comboParroquia[16] ="Venancio Pulgar";
                      comboParroquia[17] ="San Isidro";
                }
                if(comboMunicipio.equals("Miranda")){
                      comboParroquia[0] ="Altagracia";
                      comboParroquia[1] ="Ana María Campos";
                      comboParroquia[2] ="Faría";
                      comboParroquia[3] ="San Antonio";
                      comboParroquia[4] ="San José";
                      comboParroquia[5] ="José Antonio Chavez";
                }
                if(comboMunicipio.equals("Indígena Bolivariano Guajira")){
                      comboParroquia[0] ="Sinamaica";
                      comboParroquia[1] ="Alta Guajira";
                      comboParroquia[2] ="Elías Sánchez Rubio";
                      comboParroquia[3] ="Guajira";
                }
                if(comboMunicipio.equals("Rosario de Perijá")){
                      comboParroquia[0] ="El Rosario";
                      comboParroquia[1] ="Donal García";
                      comboParroquia[2] ="Sixto Zambrano";
                }
                if(comboMunicipio.equals("San Francisco")){
                      comboParroquia[0] ="San Francisco";
                      comboParroquia[1] ="El Bajo";
                      comboParroquia[2] ="Domitila Flores";
                      comboParroquia[3] ="Francisco Ochoa";
                      comboParroquia[4] ="Los Cortijos";
                      comboParroquia[5] ="Marcial Hernández";
                      comboParroquia[6] ="José Domingo Rus";
                }
                if(comboMunicipio.equals("Santa Rita")){
                      comboParroquia[0] ="Pedro Lucas Urribarri";
                }
                if(comboMunicipio.equals("Simón Bolívar")){
                      comboParroquia[0] ="Manuel Manrique";
                      comboParroquia[1] ="Rafael María Baralt";
                      comboParroquia[2] ="Rafael Urdaneta";
                }
                if(comboMunicipio.equals("Sucre")){
                      comboParroquia[0] ="Bobure";
                      comboParroquia[1] ="El Batey";
                      comboParroquia[2] ="Gibraltar";
                      comboParroquia[3] ="Heras";
                      comboParroquia[4] ="Monseñor Arturo Celestino Alvares";
                      comboParroquia[5] ="Rómulo Gallegos";
                }
                if(comboMunicipio.equals("Valmore Rodríguez")){
                      comboParroquia[0] ="La Victoria";
                      comboParroquia[1] ="Rafael Urdaneta";
                      comboParroquia[2] ="Raúl Cuenca";
                }
                
     return comboParroquia;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEstado = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        comboMunicipio = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboParroquia = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstado.setText("Estado");
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 61, -1, -1));

        lblMunicipio.setText("Municipio");
        getContentPane().add(lblMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 61, -1, -1));

        comboMunicipio.setSelectedItem(comboMunicipio.getSelectedItem());
        comboMunicipio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMunicipioItemStateChanged(evt);
            }
        });
        comboMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMunicipioActionPerformed(evt);
            }
        });
        getContentPane().add(comboMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 82, 155, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guárico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia", " ", " " }));
        comboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadoItemStateChanged(evt);
            }
        });
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        jLabel1.setText("Parroquia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        comboParroquia.setSelectedItem(comboParroquia.getSelectedItem());
        getContentPane().add(comboParroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Fondo_1090_698.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void comboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadoItemStateChanged
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                if (this.comboEstado.getSelectedIndex() > 0) {
                      this.comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(this.comboEstado(this.comboEstado.getSelectedItem().toString())));
                 }
         }
    }//GEN-LAST:event_comboEstadoItemStateChanged

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void comboMunicipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMunicipioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //if (this.comboMunicipio.getSelectedIndex() > 0) {
                        //this.comboParroquia.setModel(new javax.swing.DefaultComboBoxModel<>(this.comboMunicipio(this.comboMunicipio.getSelectedItem().toString())));
            //}

        }
    }//GEN-LAST:event_comboMunicipioItemStateChanged

    private void comboMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMunicipioActionPerformed
                
    }//GEN-LAST:event_comboMunicipioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
           

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbicaMuestra().setVisible(true);
                new UbicaMuestra().setResizable(false);
            new UbicaMuestra().setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboMunicipio;
    private javax.swing.JComboBox<String> comboParroquia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMunicipio;
    // End of variables declaration//GEN-END:variables

    private static class comboMunicipio{

        public comboMunicipio(String toString) {
        }
    }

private static class comboParroquia {

        public comboParroquia(String toString) {
        }
    }
    
                
    
}
