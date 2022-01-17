
package pruebagestionlab;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Personal extends javax.swing.JFrame {
    private String nombreP, apellidoP, cedulaP, tlfCelularP, tlfFijoP, correoP;
    private String estadoP, municipioP, urbanizacionP, casa_EdfP, calle_PisoP, n_AptoP;
    private String n_NominaP, cargoP, gerenciaP, divisionP, departamentoP;
    private String fecha_IngresoP, empleadoP, obreroP, contratadoP, otroP;
    private String parque_CentralP, los_TequesP, san_FelipeP, ciudad_BolivarP, otra_UbicacionP;
    
    
    
    public Personal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Logo_Ingeomin_a_1.png")).getImage());
        
        grupoEstatus.add(chcboxEmpleadoPersonal);
        grupoEstatus.add(chcboxObreroPersonal);
        grupoEstatus.add(chcboxContratadoPersonal);
        
        grupoUbicacion.add(chcboxParqueCentral);
        grupoUbicacion.add(chcboxLosTeques);
        grupoUbicacion.add(chcboxSanFelipe);
        grupoUbicacion.add(chcboxCiudadBolivar);
    }
    
    public String[] comboxEstado(String comboEstado){
    String[]comboMunicipio = new String[29]; 
      
        if (comboEstado.equalsIgnoreCase("Amazonas")){
              comboMunicipio[0]="Alto Orinoco";
               comboMunicipio[1]="Atabapo";
               comboMunicipio[2]="Atures";
               comboMunicipio[3]="Autana";
               comboMunicipio[4]="Maroa";
               comboMunicipio[5]="Manapiare";
               comboMunicipio[6]="Río Negro";
        }
        if (comboEstado.equalsIgnoreCase("Anzoátegui")){
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
         if (comboEstado.equalsIgnoreCase("Apure")){
               comboMunicipio[0]="Achaguas";
               comboMunicipio[1]="Biruaca";
               comboMunicipio[2]="Muñoz";
               comboMunicipio[3]="Páez";
               comboMunicipio[4]="Pedro Camejo";
               comboMunicipio[5]="Rómulo Gallegos";
               comboMunicipio[6]="San Fernando";
               
        }
        if (comboEstado.equalsIgnoreCase("Aragua")){
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
        if (comboEstado.equalsIgnoreCase("Barinas")){
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
        if (comboEstado.equalsIgnoreCase("Bolívar")){
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
        if (comboEstado.equalsIgnoreCase("Carabobo")){
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
        if (comboEstado.equalsIgnoreCase("Delta Amacuro")){
               comboMunicipio[0]="Antonio Díaz";
               comboMunicipio[1]="Casacoima";
               comboMunicipio[2]="Pedernales";
               comboMunicipio[3]="Tucupita";
        }
        if (comboEstado.equalsIgnoreCase("Distrito Capital")){
               comboMunicipio[0]="Libertador";
        }
        if (comboEstado.equalsIgnoreCase("Falcón")){
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
        if (comboEstado.equalsIgnoreCase("Guárico")){
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
        if (comboEstado.equalsIgnoreCase("Lara")){
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
        if (comboEstado.equalsIgnoreCase("Mérida")){
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
        if (comboEstado.equalsIgnoreCase("Miranda")){
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
        if (comboEstado.equalsIgnoreCase("Monagas")){
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
       if (comboEstado.equalsIgnoreCase("Nueva Esparta")){
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
       if (comboEstado.equalsIgnoreCase("Portuguesa")){
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
       if (comboEstado.equalsIgnoreCase("Sucre")){
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
       if (comboEstado.equalsIgnoreCase("Táchira")){
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
       if (comboEstado.equalsIgnoreCase("Trujillo")){
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
       if (comboEstado.equalsIgnoreCase("Vargas")){
               comboMunicipio[0]="Vargas";
        }
        if (comboEstado.equalsIgnoreCase("Yaracuy")){
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
        if (comboEstado.equalsIgnoreCase("Zulia")){
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstatus = new javax.swing.ButtonGroup();
        grupoUbicacion = new javax.swing.ButtonGroup();
        lblTituloDatosLaboralPersonal = new javax.swing.JLabel();
        txtNumeroNominaPersonal = new javax.swing.JTextField();
        lblNumeroNominaPersonal = new javax.swing.JLabel();
        txtApellidoPersonal = new javax.swing.JTextField();
        lblApellidoPersonal = new javax.swing.JLabel();
        lblCasaEdificioPersonal = new javax.swing.JLabel();
        txtCallePiso = new javax.swing.JTextField();
        lblCallePisoPersonal = new javax.swing.JLabel();
        txtNumApartamentoPresonal = new javax.swing.JTextField();
        lblNumApartamentoPersonal = new javax.swing.JLabel();
        lblTituloDatosPersonales = new javax.swing.JLabel();
        txtCedulaPersonal = new javax.swing.JTextField();
        lblCedulaPersonal = new javax.swing.JLabel();
        txtTelfCelularPersonal = new javax.swing.JTextField();
        lblCelularPersonal = new javax.swing.JLabel();
        txtTelfFijoPersonal = new javax.swing.JTextField();
        lblTelfFijoPersonal = new javax.swing.JLabel();
        txtCorreoPersonal = new javax.swing.JTextField();
        lblCorreoPersonal = new javax.swing.JLabel();
        lblTituloDireccionPersonal = new javax.swing.JLabel();
        comboxEstado = new javax.swing.JComboBox<>();
        lblEstadoPersonal = new javax.swing.JLabel();
        lblMunicipioPersonal = new javax.swing.JLabel();
        comboxMunicipio = new javax.swing.JComboBox<>();
        txtUrbanizacionPersonal = new javax.swing.JTextField();
        lblUrbanizacionPersonal = new javax.swing.JLabel();
        txtCasaEdificioPersonal = new javax.swing.JTextField();
        txtNombrePersonal = new javax.swing.JTextField();
        lblNombrePersonal = new javax.swing.JLabel();
        txtCargoPersonal = new javax.swing.JTextField();
        lblCargoPersonal = new javax.swing.JLabel();
        txtGerenciaPersonal = new javax.swing.JTextField();
        lblGerenciaPersonal = new javax.swing.JLabel();
        txtDepartamentoPersonal = new javax.swing.JTextField();
        lblDepartamentoPersonal = new javax.swing.JLabel();
        txtDivisionPersonal = new javax.swing.JTextField();
        lblDivisionPersonal = new javax.swing.JLabel();
        lblEstatusPersonal = new javax.swing.JLabel();
        chcboxEmpleadoPersonal = new javax.swing.JCheckBox();
        chcboxObreroPersonal = new javax.swing.JCheckBox();
        chcboxContratadoPersonal = new javax.swing.JCheckBox();
        txtOtroEstatusPersonal = new javax.swing.JTextField();
        lblOtroEstatusPersonal = new javax.swing.JLabel();
        lblUbicacionFisica = new javax.swing.JLabel();
        chcboxParqueCentral = new javax.swing.JCheckBox();
        chcboxLosTeques = new javax.swing.JCheckBox();
        chcboxSanFelipe = new javax.swing.JCheckBox();
        chcboxCiudadBolivar = new javax.swing.JCheckBox();
        lblOtraUbicacionPersonal = new javax.swing.JLabel();
        txtOtraUbicacionPersonal = new javax.swing.JTextField();
        lblDiabloPersonal = new javax.swing.JLabel();
        lblElaboradoPorPersonal = new javax.swing.JLabel();
        btnRegistrarPersonal = new javax.swing.JButton();
        btnActualizarPersonal = new javax.swing.JButton();
        btnEliminarPersonal = new javax.swing.JButton();
        lblFechaIngresoPersonal = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFondoPersonal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERSONAL");
        setPreferredSize(new java.awt.Dimension(960, 600));
        getContentPane().setLayout(null);

        lblTituloDatosLaboralPersonal.setForeground(java.awt.Color.black);
        lblTituloDatosLaboralPersonal.setText("-------------------- DATOS LABORALES -------------------- ");
        getContentPane().add(lblTituloDatosLaboralPersonal);
        lblTituloDatosLaboralPersonal.setBounds(12, 273, 343, 15);
        getContentPane().add(txtNumeroNominaPersonal);
        txtNumeroNominaPersonal.setBounds(12, 294, 101, 19);

        lblNumeroNominaPersonal.setForeground(java.awt.Color.black);
        lblNumeroNominaPersonal.setText("N# Nomina");
        getContentPane().add(lblNumeroNominaPersonal);
        lblNumeroNominaPersonal.setBounds(12, 319, 77, 15);
        getContentPane().add(txtApellidoPersonal);
        txtApellidoPersonal.setBounds(194, 33, 170, 19);

        lblApellidoPersonal.setForeground(java.awt.Color.black);
        lblApellidoPersonal.setText("Apellido");
        getContentPane().add(lblApellidoPersonal);
        lblApellidoPersonal.setBounds(194, 58, 57, 15);

        lblCasaEdificioPersonal.setForeground(java.awt.Color.black);
        lblCasaEdificioPersonal.setText("Casa / Edificio");
        getContentPane().add(lblCasaEdificioPersonal);
        lblCasaEdificioPersonal.setBounds(193, 240, 97, 15);
        getContentPane().add(txtCallePiso);
        txtCallePiso.setBounds(310, 215, 149, 19);

        lblCallePisoPersonal.setForeground(java.awt.Color.black);
        lblCallePisoPersonal.setText("Calle / Piso");
        getContentPane().add(lblCallePisoPersonal);
        lblCallePisoPersonal.setBounds(310, 240, 77, 15);
        getContentPane().add(txtNumApartamentoPresonal);
        txtNumApartamentoPresonal.setBounds(471, 215, 70, 19);

        lblNumApartamentoPersonal.setForeground(java.awt.Color.black);
        lblNumApartamentoPersonal.setText("N# / Apto.");
        getContentPane().add(lblNumApartamentoPersonal);
        lblNumApartamentoPersonal.setBounds(471, 240, 70, 15);

        lblTituloDatosPersonales.setForeground(java.awt.Color.black);
        lblTituloDatosPersonales.setText("--------------------  DATOS PERSONALES -------------------- ");
        getContentPane().add(lblTituloDatosPersonales);
        lblTituloDatosPersonales.setBounds(12, 12, 357, 15);
        getContentPane().add(txtCedulaPersonal);
        txtCedulaPersonal.setBounds(382, 33, 105, 19);

        lblCedulaPersonal.setForeground(java.awt.Color.black);
        lblCedulaPersonal.setText("Cedula");
        getContentPane().add(lblCedulaPersonal);
        lblCedulaPersonal.setBounds(382, 58, 49, 15);
        getContentPane().add(txtTelfCelularPersonal);
        txtTelfCelularPersonal.setBounds(505, 33, 170, 19);

        lblCelularPersonal.setForeground(java.awt.Color.black);
        lblCelularPersonal.setText("Telf. Celular");
        getContentPane().add(lblCelularPersonal);
        lblCelularPersonal.setBounds(505, 58, 85, 15);
        getContentPane().add(txtTelfFijoPersonal);
        txtTelfFijoPersonal.setBounds(687, 33, 170, 19);

        lblTelfFijoPersonal.setForeground(java.awt.Color.black);
        lblTelfFijoPersonal.setText("Telf. Fijo");
        getContentPane().add(lblTelfFijoPersonal);
        lblTelfFijoPersonal.setBounds(687, 58, 60, 15);
        getContentPane().add(txtCorreoPersonal);
        txtCorreoPersonal.setBounds(12, 85, 230, 19);

        lblCorreoPersonal.setForeground(java.awt.Color.black);
        lblCorreoPersonal.setText("Correo");
        getContentPane().add(lblCorreoPersonal);
        lblCorreoPersonal.setBounds(12, 110, 48, 15);

        lblTituloDireccionPersonal.setForeground(java.awt.Color.black);
        lblTituloDireccionPersonal.setText("---------- Dirección ---------- ");
        getContentPane().add(lblTituloDireccionPersonal);
        lblTituloDireccionPersonal.setBounds(12, 137, 177, 15);

        comboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas", "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Distrito Capital", "Falcón", "Guárico", "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia" }));
        comboxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboxEstadoItemStateChanged(evt);
            }
        });
        comboxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboxEstado);
        comboxEstado.setBounds(12, 158, 170, 24);

        lblEstadoPersonal.setForeground(java.awt.Color.black);
        lblEstadoPersonal.setText("Estado");
        getContentPane().add(lblEstadoPersonal);
        lblEstadoPersonal.setBounds(12, 188, 49, 15);

        lblMunicipioPersonal.setForeground(java.awt.Color.black);
        lblMunicipioPersonal.setText("Municipio");
        getContentPane().add(lblMunicipioPersonal);
        lblMunicipioPersonal.setBounds(194, 188, 67, 15);

        getContentPane().add(comboxMunicipio);
        comboxMunicipio.setBounds(194, 158, 172, 24);
        getContentPane().add(txtUrbanizacionPersonal);
        txtUrbanizacionPersonal.setBounds(12, 215, 169, 19);

        lblUrbanizacionPersonal.setForeground(java.awt.Color.black);
        lblUrbanizacionPersonal.setText("Urbanización");
        getContentPane().add(lblUrbanizacionPersonal);
        lblUrbanizacionPersonal.setBounds(12, 240, 93, 15);
        getContentPane().add(txtCasaEdificioPersonal);
        txtCasaEdificioPersonal.setBounds(193, 215, 105, 19);
        getContentPane().add(txtNombrePersonal);
        txtNombrePersonal.setBounds(12, 33, 170, 19);

        lblNombrePersonal.setForeground(java.awt.Color.black);
        lblNombrePersonal.setText("Nombre");
        getContentPane().add(lblNombrePersonal);
        lblNombrePersonal.setBounds(12, 58, 55, 15);
        getContentPane().add(txtCargoPersonal);
        txtCargoPersonal.setBounds(131, 294, 180, 19);

        lblCargoPersonal.setForeground(java.awt.Color.black);
        lblCargoPersonal.setText("Cargo");
        getContentPane().add(lblCargoPersonal);
        lblCargoPersonal.setBounds(131, 319, 42, 15);
        getContentPane().add(txtGerenciaPersonal);
        txtGerenciaPersonal.setBounds(329, 294, 180, 19);

        lblGerenciaPersonal.setForeground(java.awt.Color.black);
        lblGerenciaPersonal.setText("Gerencia");
        getContentPane().add(lblGerenciaPersonal);
        lblGerenciaPersonal.setBounds(329, 319, 63, 15);
        getContentPane().add(txtDepartamentoPersonal);
        txtDepartamentoPersonal.setBounds(725, 294, 180, 19);

        lblDepartamentoPersonal.setForeground(java.awt.Color.black);
        lblDepartamentoPersonal.setText("Departamento");
        getContentPane().add(lblDepartamentoPersonal);
        lblDepartamentoPersonal.setBounds(725, 319, 103, 15);
        getContentPane().add(txtDivisionPersonal);
        txtDivisionPersonal.setBounds(527, 294, 180, 19);

        lblDivisionPersonal.setForeground(java.awt.Color.black);
        lblDivisionPersonal.setText("División");
        getContentPane().add(lblDivisionPersonal);
        lblDivisionPersonal.setBounds(527, 319, 55, 15);

        lblEstatusPersonal.setForeground(java.awt.Color.black);
        lblEstatusPersonal.setText("---------- Estatus ----------");
        getContentPane().add(lblEstatusPersonal);
        lblEstatusPersonal.setBounds(12, 346, 162, 15);

        chcboxEmpleadoPersonal.setBackground(new java.awt.Color(117, 126, 5));
        chcboxEmpleadoPersonal.setForeground(java.awt.Color.black);
        chcboxEmpleadoPersonal.setText("Empleado");
        getContentPane().add(chcboxEmpleadoPersonal);
        chcboxEmpleadoPersonal.setBounds(260, 370, 94, 23);

        chcboxObreroPersonal.setBackground(new java.awt.Color(117, 126, 5));
        chcboxObreroPersonal.setForeground(java.awt.Color.black);
        chcboxObreroPersonal.setText("Obrero");
        getContentPane().add(chcboxObreroPersonal);
        chcboxObreroPersonal.setBounds(370, 370, 75, 23);

        chcboxContratadoPersonal.setBackground(new java.awt.Color(117, 126, 5));
        chcboxContratadoPersonal.setForeground(java.awt.Color.black);
        chcboxContratadoPersonal.setText("Contratado");
        getContentPane().add(chcboxContratadoPersonal);
        chcboxContratadoPersonal.setBounds(460, 370, 106, 23);
        getContentPane().add(txtOtroEstatusPersonal);
        txtOtroEstatusPersonal.setBounds(630, 370, 180, 19);

        lblOtroEstatusPersonal.setForeground(java.awt.Color.black);
        lblOtroEstatusPersonal.setText("Otro:");
        getContentPane().add(lblOtroEstatusPersonal);
        lblOtroEstatusPersonal.setBounds(580, 380, 37, 15);

        lblUbicacionFisica.setForeground(java.awt.Color.black);
        lblUbicacionFisica.setText("---------- Ubicación Fisica ---------- ");
        getContentPane().add(lblUbicacionFisica);
        lblUbicacionFisica.setBounds(12, 412, 224, 15);

        chcboxParqueCentral.setBackground(new java.awt.Color(117, 126, 5));
        chcboxParqueCentral.setForeground(java.awt.Color.black);
        chcboxParqueCentral.setText("Parque Central");
        getContentPane().add(chcboxParqueCentral);
        chcboxParqueCentral.setBounds(12, 445, 132, 23);

        chcboxLosTeques.setBackground(new java.awt.Color(117, 126, 5));
        chcboxLosTeques.setForeground(java.awt.Color.black);
        chcboxLosTeques.setText("Los Teques");
        getContentPane().add(chcboxLosTeques);
        chcboxLosTeques.setBounds(162, 445, 106, 23);

        chcboxSanFelipe.setBackground(new java.awt.Color(117, 126, 5));
        chcboxSanFelipe.setForeground(java.awt.Color.black);
        chcboxSanFelipe.setText("San Felipe");
        getContentPane().add(chcboxSanFelipe);
        chcboxSanFelipe.setBounds(286, 445, 99, 23);

        chcboxCiudadBolivar.setBackground(new java.awt.Color(117, 126, 5));
        chcboxCiudadBolivar.setForeground(java.awt.Color.black);
        chcboxCiudadBolivar.setText("Ciudad Bolívar");
        getContentPane().add(chcboxCiudadBolivar);
        chcboxCiudadBolivar.setBounds(403, 445, 126, 23);

        lblOtraUbicacionPersonal.setForeground(java.awt.Color.black);
        lblOtraUbicacionPersonal.setText("Otra Ubicación:");
        getContentPane().add(lblOtraUbicacionPersonal);
        lblOtraUbicacionPersonal.setBounds(547, 449, 109, 15);
        getContentPane().add(txtOtraUbicacionPersonal);
        txtOtraUbicacionPersonal.setBounds(674, 447, 180, 19);

        lblDiabloPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Diablo_a_1.png"))); // NOI18N
        getContentPane().add(lblDiabloPersonal);
        lblDiabloPersonal.setBounds(403, 527, 29, 24);

        lblElaboradoPorPersonal.setForeground(java.awt.Color.black);
        lblElaboradoPorPersonal.setText("Elaborado por: imosquerad@yahoo.com.mx");
        getContentPane().add(lblElaboradoPorPersonal);
        lblElaboradoPorPersonal.setBounds(444, 536, 306, 15);

        btnRegistrarPersonal.setForeground(java.awt.Color.black);
        btnRegistrarPersonal.setText("REGISTRAR");
        btnRegistrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarPersonal);
        btnRegistrarPersonal.setBounds(177, 486, 109, 25);

        btnActualizarPersonal.setForeground(java.awt.Color.black);
        btnActualizarPersonal.setText("ACTUALIZAR");
        getContentPane().add(btnActualizarPersonal);
        btnActualizarPersonal.setBounds(405, 486, 119, 25);

        btnEliminarPersonal.setForeground(java.awt.Color.black);
        btnEliminarPersonal.setText("ELIMINAR");
        getContentPane().add(btnEliminarPersonal);
        btnEliminarPersonal.setBounds(652, 486, 98, 25);

        lblFechaIngresoPersonal.setForeground(java.awt.Color.black);
        lblFechaIngresoPersonal.setText("Fecha de Ingreso");
        getContentPane().add(lblFechaIngresoPersonal);
        lblFechaIngresoPersonal.setBounds(130, 370, 122, 15);
        getContentPane().add(txtFechaIngreso);
        txtFechaIngreso.setBounds(10, 370, 110, 19);

        lblFondoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebagestionlab/Imagenes/Fondo_1200_700.png"))); // NOI18N
        getContentPane().add(lblFondoPersonal);
        lblFondoPersonal.setBounds(0, 0, 1070, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxEstadoActionPerformed

    private void comboxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboxEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.comboxEstado.getSelectedIndex() > 0) {
                this.comboxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(this.comboxEstado(this.comboxEstado.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_comboxEstadoItemStateChanged

    private void btnRegistrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalActionPerformed
        RegistraPersonal();
    }//GEN-LAST:event_btnRegistrarPersonalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Personal construccion = new Personal();
        construccion.setVisible(true);
        construccion.setResizable(false);
        construccion.setLocationRelativeTo(null);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPersonal;
    private javax.swing.JButton btnEliminarPersonal;
    private javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JCheckBox chcboxCiudadBolivar;
    private javax.swing.JCheckBox chcboxContratadoPersonal;
    private javax.swing.JCheckBox chcboxEmpleadoPersonal;
    private javax.swing.JCheckBox chcboxLosTeques;
    private javax.swing.JCheckBox chcboxObreroPersonal;
    private javax.swing.JCheckBox chcboxParqueCentral;
    private javax.swing.JCheckBox chcboxSanFelipe;
    private javax.swing.JComboBox<String> comboxEstado;
    private javax.swing.JComboBox<String> comboxMunicipio;
    private javax.swing.ButtonGroup grupoEstatus;
    private javax.swing.ButtonGroup grupoUbicacion;
    private javax.swing.JLabel lblApellidoPersonal;
    private javax.swing.JLabel lblCallePisoPersonal;
    private javax.swing.JLabel lblCargoPersonal;
    private javax.swing.JLabel lblCasaEdificioPersonal;
    private javax.swing.JLabel lblCedulaPersonal;
    private javax.swing.JLabel lblCelularPersonal;
    private javax.swing.JLabel lblCorreoPersonal;
    private javax.swing.JLabel lblDepartamentoPersonal;
    private javax.swing.JLabel lblDiabloPersonal;
    private javax.swing.JLabel lblDivisionPersonal;
    private javax.swing.JLabel lblElaboradoPorPersonal;
    private javax.swing.JLabel lblEstadoPersonal;
    private javax.swing.JLabel lblEstatusPersonal;
    private javax.swing.JLabel lblFechaIngresoPersonal;
    private javax.swing.JLabel lblFondoPersonal;
    private javax.swing.JLabel lblGerenciaPersonal;
    private javax.swing.JLabel lblMunicipioPersonal;
    private javax.swing.JLabel lblNombrePersonal;
    private javax.swing.JLabel lblNumApartamentoPersonal;
    private javax.swing.JLabel lblNumeroNominaPersonal;
    private javax.swing.JLabel lblOtraUbicacionPersonal;
    private javax.swing.JLabel lblOtroEstatusPersonal;
    private javax.swing.JLabel lblTelfFijoPersonal;
    private javax.swing.JLabel lblTituloDatosLaboralPersonal;
    private javax.swing.JLabel lblTituloDatosPersonales;
    private javax.swing.JLabel lblTituloDireccionPersonal;
    private javax.swing.JLabel lblUbicacionFisica;
    private javax.swing.JLabel lblUrbanizacionPersonal;
    private javax.swing.JTextField txtApellidoPersonal;
    private javax.swing.JTextField txtCallePiso;
    private javax.swing.JTextField txtCargoPersonal;
    private javax.swing.JTextField txtCasaEdificioPersonal;
    private javax.swing.JTextField txtCedulaPersonal;
    private javax.swing.JTextField txtCorreoPersonal;
    private javax.swing.JTextField txtDepartamentoPersonal;
    private javax.swing.JTextField txtDivisionPersonal;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtGerenciaPersonal;
    private javax.swing.JTextField txtNombrePersonal;
    private javax.swing.JTextField txtNumApartamentoPresonal;
    private javax.swing.JTextField txtNumeroNominaPersonal;
    private javax.swing.JTextField txtOtraUbicacionPersonal;
    private javax.swing.JTextField txtOtroEstatusPersonal;
    private javax.swing.JTextField txtTelfCelularPersonal;
    private javax.swing.JTextField txtTelfFijoPersonal;
    private javax.swing.JTextField txtUrbanizacionPersonal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the cedulaP
     */
    public String getCedulaP() {
        return cedulaP;
    }

    /**
     * @param cedulaP the cedulaP to set
     */
    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    /**
     * @return the tlfCelularP
     */
    public String getTlfCelularP() {
        return tlfCelularP;
    }

    /**
     * @param tlfCelularP the tlfCelularP to set
     */
    public void setTlfCelularP(String tlfCelularP) {
        this.tlfCelularP = tlfCelularP;
    }

    /**
     * @return the tlfFijoP
     */
    public String getTlfFijoP() {
        return tlfFijoP;
    }

    /**
     * @param tlfFijoP the tlfFijoP to set
     */
    public void setTlfFijoP(String tlfFijoP) {
        this.tlfFijoP = tlfFijoP;
    }
    


public void RegistraPersonal() {
    
// ********** DATOS PERSONALES **********     
    nombreP = txtNombrePersonal.getText().trim();
    apellidoP = txtApellidoPersonal.getText().trim();
    cedulaP = txtCedulaPersonal.getText().trim();
    tlfCelularP = txtTelfCelularPersonal.getText().trim();
    tlfFijoP = txtTelfFijoPersonal.getText().trim();
    correoP = txtCorreoPersonal.getText().trim();
// ********** DIRECCION **********  
        estadoP = comboxEstado.getSelectedItem().toString();
        //municipioP = comboxMunicipio.getSelectedItem().toString();
        urbanizacionP = txtUrbanizacionPersonal.getText().trim();
        casa_EdfP = txtCasaEdificioPersonal.getText().trim();
        calle_PisoP = txtCallePiso.getText().trim();
        n_AptoP = txtNumApartamentoPresonal.getText().trim();
// ********** DATOS LABORALES ********** 
    n_NominaP = txtNumeroNominaPersonal.getText().trim();
    cargoP = txtCargoPersonal.getText().trim();
    gerenciaP = txtGerenciaPersonal.getText().trim();
    divisionP = txtDivisionPersonal.getText().trim();
    departamentoP = txtDepartamentoPersonal.getText().trim();
// ********** ESTATUS ********** 
        fecha_IngresoP = txtFechaIngreso.getText().trim();
        empleadoP = chcboxEmpleadoPersonal.getText();
        obreroP = chcboxObreroPersonal.getText();
        contratadoP = chcboxContratadoPersonal.getText();
        otroP = txtOtroEstatusPersonal.getText().trim();
// ********** UBICACION ********** 
     parque_CentralP = chcboxParqueCentral.getText();
     los_TequesP = chcboxLosTeques.getText();
     san_FelipeP = chcboxSanFelipe.getText();
     ciudad_BolivarP = chcboxCiudadBolivar.getText();
     otra_UbicacionP = txtOtraUbicacionPersonal.getText();
    
    if (nombreP.equals("") || apellidoP.equals("") || cedulaP.equals("") || tlfCelularP.equals("") || tlfFijoP.equals("") 
                || correoP.equals("") || estadoP.equals("") || /*municipioP.equals("") ||*/ urbanizacionP.equals("")
                || casa_EdfP.equals("") || calle_PisoP.equals("") || n_AptoP.equals("")
                || n_NominaP.equals("") || cargoP.equals("") || gerenciaP.equals("") || divisionP.equals("") || departamentoP.equals("")
                || fecha_IngresoP.equals("") || empleadoP.equals("") || obreroP.equals("") || contratadoP.equals("") || otroP.equals("")
                || parque_CentralP.equals("") || los_TequesP.equals("") || san_FelipeP.equals("") || ciudad_BolivarP.equals("") 
                || otra_UbicacionP.equals("") ) {
 
                if (nombreP.equals("")) {
                  txtNombrePersonal.setBackground(Color.red);
                }
                if (apellidoP.equals("")) {
                  txtApellidoPersonal.setBackground(Color.red);
                }
                if (cedulaP.equals("")) {
                  txtCedulaPersonal.setBackground(Color.red);
                }
                if (tlfCelularP.equals("")) {
                  txtTelfCelularPersonal.setBackground(Color.red);
                }
                if (tlfFijoP.equals("")) {
                  txtTelfFijoPersonal.setBackground(Color.red);
                }
                if (correoP.equals("")) {
                  txtCorreoPersonal.setBackground(Color.red);
                } // ********** DIRECCION ********** 
                if (estadoP.equals("")) {
                  comboxEstado.setBackground(Color.red);
                }
                /*if (municipioP.equals("")) {
                  comboxMunicipio.setBackground(Color.red);
                }*/
                if (urbanizacionP.equals("")) {
                  txtUrbanizacionPersonal.setBackground(Color.red);
                }
                if (casa_EdfP.equals("")) {
                  txtCasaEdificioPersonal.setBackground(Color.red);
                }
                if (calle_PisoP.equals("")) {
                  txtCallePiso.setBackground(Color.red);
                }
                if (n_AptoP.equals("")) {
                  txtNumApartamentoPresonal.setBackground(Color.red);
                }// ********** DATOS LABORALES ********** 
                if (n_NominaP.equals("")) {
                  txtNumeroNominaPersonal.setBackground(Color.red);
                }
                if (cargoP.equals("")) {
                  txtCargoPersonal.setBackground(Color.red);
                }
                if (gerenciaP.equals("")) {
                  txtGerenciaPersonal.setBackground(Color.red);
                }
                if (divisionP.equals("")) {
                  txtDivisionPersonal.setBackground(Color.red);
                }
                if (departamentoP.equals("")) {
                  txtDepartamentoPersonal.setBackground(Color.red);
                } // ********** ESTATUS ********** 
                if (fecha_IngresoP.equals("")) {
                  txtFechaIngreso.setBackground(Color.red);
                }
                if (otroP.equals("")) {
                 txtOtroEstatusPersonal.setBackground(Color.red);
                } // ********** UBICACION ********** 
                if (parque_CentralP.equals("")) {
                  chcboxParqueCentral.setBackground(Color.red);
                }
                if (los_TequesP.equals("")) {
                  chcboxLosTeques.setBackground(Color.red);
                }
                if (san_FelipeP.equals("")) {
                  chcboxSanFelipe.setBackground(Color.red);
                }
                if (ciudad_BolivarP.equals("")) {
                  chcboxCiudadBolivar.setBackground(Color.red);
                }
                if (otra_UbicacionP.equals("")) {
                  txtOtraUbicacionPersonal.setBackground(Color.red);
                }
                
                
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            LimpiarDatosPersonales();
        }else{

    
    File archivo = new File("BasesDatos/Personal.txt");
        String linea;
        FileWriter escribir;
        try {
            escribir = new FileWriter(archivo, true);
            escribir.write(nombreP + " / " + apellidoP + " / " + cedulaP + " / " + tlfCelularP + " / " + tlfFijoP + 
                    " / " + correoP + " / " + estadoP + " / " + municipioP + " / " + urbanizacionP +
                    " / " + casa_EdfP + " / " + calle_PisoP + " / " + n_AptoP + 
                    " / " + n_NominaP + " / " + cargoP + " / " + gerenciaP + " / " + divisionP + " / " + departamentoP + 
                    " / " + fecha_IngresoP + " / " + empleadoP + " / " + obreroP + " / " + contratadoP +
                    " / " + otroP + " / " + parque_CentralP + " / " + los_TequesP + " / " + san_FelipeP + 
                    " / " + ciudad_BolivarP + " / " + otra_UbicacionP + "\r\n");
            
            
            escribir.close();

// ********** DATOS PERSONALES **********            
            txtNombrePersonal.setBackground(Color.green);
            txtApellidoPersonal.setBackground(Color.green);
            txtCedulaPersonal.setBackground(Color.green);
            txtTelfCelularPersonal.setBackground(Color.green);
            txtTelfFijoPersonal.setBackground(Color.green);
            txtCorreoPersonal.setBackground(Color.green);
// ********** DIRECCION ********** 
            comboxEstado.setBackground(Color.green);
            //comboxMunicipio.setBackground(Color.green);
            txtUrbanizacionPersonal.setBackground(Color.green);
            txtCasaEdificioPersonal.setBackground(Color.green);
            txtCallePiso.setBackground(Color.green);
            txtNumApartamentoPresonal.setBackground(Color.green);
// ********** DATOS LABORALES ********** 
            txtNumeroNominaPersonal.setBackground(Color.green);
            txtCargoPersonal.setBackground(Color.green);
            txtGerenciaPersonal.setBackground(Color.green);
            txtDivisionPersonal.setBackground(Color.green);
            txtDepartamentoPersonal.setBackground(Color.green);
// ********** ESTATUS ********** 
            txtFechaIngreso.setBackground(Color.green);
            chcboxEmpleadoPersonal.setBackground(Color.green);
            chcboxObreroPersonal.setBackground(Color.green);
            chcboxContratadoPersonal.setBackground(Color.green);
            txtOtroEstatusPersonal.setBackground(Color.green);
// ********** UBICACION ********** 
            chcboxParqueCentral.setBackground(Color.green);
            chcboxLosTeques.setBackground(Color.green);
            chcboxSanFelipe.setBackground(Color.green);
            chcboxCiudadBolivar.setBackground(Color.green);
            txtOtraUbicacionPersonal.setBackground(Color.green);            
        
            JOptionPane.showMessageDialog(null,"Datos registrados con exito");
            LimpiarDatosPersonales();
            
 // ********** DATOS PERSONALES **********
            txtNombrePersonal.setText("");
            txtApellidoPersonal.setText("");
            txtCedulaPersonal.setText("");
            txtTelfCelularPersonal.setText("");
            txtTelfFijoPersonal.setText("");
            txtCorreoPersonal.setText("");
// ********** DIRECCION ********** 
            comboxEstado.setSelectedItem("");
            //comboxMunicipio.setSelectedItem("");
            txtUrbanizacionPersonal.setText("");
            txtCasaEdificioPersonal.setText("");
            txtCallePiso.setText("");
            txtNumApartamentoPresonal.setText("");
// ********** DATOS LABORALES ********** 
            txtNumeroNominaPersonal.setText("");
            txtCargoPersonal.setText("");
            txtGerenciaPersonal.setText("");
            txtDivisionPersonal.setText("");
            txtDepartamentoPersonal.setText(""); 
// ********** ESTATUS ********** 
            txtFechaIngreso.setText("");
            chcboxEmpleadoPersonal.setText("");
            chcboxObreroPersonal.setText("");
            chcboxContratadoPersonal.setText("");
            txtOtroEstatusPersonal.setText(""); 
// ********** UBICACION ********** 
            chcboxParqueCentral.setText("");
            chcboxLosTeques.setText("");
            chcboxSanFelipe.setText("");
            chcboxCiudadBolivar.setText("");
            txtOtraUbicacionPersonal.setText("");            

            
        } catch (IOException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
}

public void LimpiarDatosPersonales() {

        txtNombrePersonal.setBackground(new Color(255,255,255));
        txtApellidoPersonal.setBackground(new Color(255,255,255));
        txtCedulaPersonal.setBackground(new Color(255,255,255));
        txtTelfCelularPersonal.setBackground(new Color(255,255,255));
        txtTelfFijoPersonal.setBackground(new Color(255,255,255));
        txtCorreoPersonal.setBackground(new Color(255,255,255));
// ********** DIRECCION **********         
            comboxEstado.setBackground(new Color(255,255,255));
            //comboxMunicipio.setBackground(new Color(255,255,255));
            txtUrbanizacionPersonal.setBackground(new Color(255,255,255));
            txtCasaEdificioPersonal.setBackground(new Color(255,255,255));
            txtCallePiso.setBackground(new Color(255,255,255));
            txtNumApartamentoPresonal.setBackground(new Color(255,255,255));
// ********** DATOS LABORALES ********** 
            txtNumeroNominaPersonal.setBackground(new Color(255,255,255));
            txtCargoPersonal.setBackground(new Color(255,255,255));
            txtGerenciaPersonal.setBackground(new Color(255,255,255));
            txtDivisionPersonal.setBackground(new Color(255,255,255));
            txtDepartamentoPersonal.setBackground(new Color(255,255,255));
// ********** ESTATUS ********** 
            txtFechaIngreso.setBackground(new Color(255,255,255));
            chcboxEmpleadoPersonal.setBackground(new Color(117,126,5));
            chcboxObreroPersonal.setBackground(new Color(117,126,5));
            chcboxContratadoPersonal.setBackground(new Color(117,126,5));
            txtOtroEstatusPersonal.setBackground(new Color(255,255,255));
// ********** UBICACION ********** 
            chcboxParqueCentral.setBackground(new Color(117,126,5));
            chcboxLosTeques.setBackground(new Color(117,126,5));
            chcboxSanFelipe.setBackground(new Color(117,126,5));
            chcboxCiudadBolivar.setBackground(new Color(117,126,5));
            txtOtraUbicacionPersonal.setBackground(new Color(255,255,255));            
}

    /**
     * @return the estadoP
     */
    public String getEstadoP() {
        return estadoP;
    }

    /**
     * @param estadoP the estadoP to set
     */
    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }

    /**
     * @return the municipioP
     */
    public String getMunicipioP() {
        return municipioP;
    }

    /**
     * @param municipioP the municipioP to set
     */
    public void setMunicipioP(String municipioP) {
        this.municipioP = municipioP;
    }

    /**
     * @return the urbanizacionP
     */
    public String getUrbanizacionP() {
        return urbanizacionP;
    }

    /**
     * @param urbanizacionP the urbanizacionP to set
     */
    public void setUrbanizacionP(String urbanizacionP) {
        this.urbanizacionP = urbanizacionP;
    }

    /**
     * @return the casa_EdfP
     */
    public String getCasa_EdfP() {
        return casa_EdfP;
    }

    /**
     * @param casa_EdfP the casa_EdfP to set
     */
    public void setCasa_EdfP(String casa_EdfP) {
        this.casa_EdfP = casa_EdfP;
    }

    /**
     * @return the calle_PisoP
     */
    public String getCalle_PisoP() {
        return calle_PisoP;
    }

    /**
     * @param calle_PisoP the calle_PisoP to set
     */
    public void setCalle_PisoP(String calle_PisoP) {
        this.calle_PisoP = calle_PisoP;
    }

    /**
     * @return the n_AptoP
     */
    public String getN_AptoP() {
        return n_AptoP;
    }

    /**
     * @param n_AptoP the n_AptoP to set
     */
    public void setN_AptoP(String n_AptoP) {
        this.n_AptoP = n_AptoP;
    }

}
