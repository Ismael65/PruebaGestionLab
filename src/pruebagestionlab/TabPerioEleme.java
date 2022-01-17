
package pruebagestionlab;

import javax.swing.DefaultListModel;

public class TabPerioEleme extends javax.swing.JFrame {
        
       public static DefaultListModel elemento = new DefaultListModel();
       public static DefaultListModel elementoFinal = new DefaultListModel();
        public static DefaultListModel elementoE = new DefaultListModel();
        
    
    public TabPerioEleme() {
        initComponents();
        //setIconImage(createImageIcon("logo_Ingeomin_").getImage());
        
        elemento = new DefaultListModel();
        elementoFinal = new DefaultListModel();
        elementoE = new DefaultListModel();
        
        listaSeleccion.setModel(elemento); 
        
        
    }

    TabPerioEleme(DefaultListModel elementoE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        txtF_Mo = new javax.swing.JTextField();
        txtF_Ni = new javax.swing.JTextField();
        txtF_Ti = new javax.swing.JTextField();
        txtF_Cd = new javax.swing.JTextField();
        txtF_Rh = new javax.swing.JTextField();
        txtF_Mn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtF_Nb = new javax.swing.JTextField();
        txtF_Hs = new javax.swing.JTextField();
        txtF_W = new javax.swing.JTextField();
        txtF_Pt = new javax.swing.JTextField();
        txtF_Hf = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_Elemento = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFinal = new javax.swing.JList<>();
        txtF_Ag = new javax.swing.JTextField();
        txtF_Sg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtF_Rf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSeleccion = new javax.swing.JList<>();
        txtF_Hg = new javax.swing.JTextField();
        txtF_Re = new javax.swing.JTextField();
        txtF_Fe = new javax.swing.JTextField();
        txtF_Ta = new javax.swing.JTextField();
        txtF_Db = new javax.swing.JTextField();
        txtF_Cn = new javax.swing.JTextField();
        txtF_Au = new javax.swing.JTextField();
        txtF_Cu = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        txtF_Ds = new javax.swing.JTextField();
        txtF_Ru = new javax.swing.JTextField();
        txtF_Pd = new javax.swing.JTextField();
        txtF_Lu = new javax.swing.JTextField();
        txtF_Zn = new javax.swing.JTextField();
        txtF_Tc = new javax.swing.JTextField();
        txtF_Y = new javax.swing.JTextField();
        txtF_Zr = new javax.swing.JTextField();
        txtF_Lr = new javax.swing.JTextField();
        txtF_Ir = new javax.swing.JTextField();
        txtF_V = new javax.swing.JTextField();
        txtF_Mt = new javax.swing.JTextField();
        txtF_Bh = new javax.swing.JTextField();
        txtF_Rg = new javax.swing.JTextField();
        txtF_Sc = new javax.swing.JTextField();
        txtF_Cr = new javax.swing.JTextField();
        txtF_Co = new javax.swing.JTextField();
        txtF_Os = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(660, 450));
        getContentPane().setLayout(null);

        txtF_Mo.setEditable(false);
        txtF_Mo.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mo.setText("Mo");
        txtF_Mo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MoMouseClicked(evt);
            }
        });

        txtF_Ni.setEditable(false);
        txtF_Ni.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ni.setText("Ni");
        txtF_Ni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NiMouseClicked(evt);
            }
        });

        txtF_Ti.setEditable(false);
        txtF_Ti.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ti.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ti.setText("Ti");
        txtF_Ti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TiMouseClicked(evt);
            }
        });

        txtF_Cd.setEditable(false);
        txtF_Cd.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cd.setText("Cd");
        txtF_Cd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CdMouseClicked(evt);
            }
        });

        txtF_Rh.setEditable(false);
        txtF_Rh.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rh.setText("Rh");
        txtF_Rh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RhMouseClicked(evt);
            }
        });

        txtF_Mn.setEditable(false);
        txtF_Mn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mn.setText("Mn");
        txtF_Mn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_MnMouseClicked(evt);
            }
        });

        jLabel2.setText("ListaFinal");

        jLabel3.setText("Texto de Area");

        txtF_Nb.setEditable(false);
        txtF_Nb.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Nb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Nb.setText("Nb");
        txtF_Nb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_NbMouseClicked(evt);
            }
        });

        txtF_Hs.setEditable(false);
        txtF_Hs.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hs.setText("Hs");

        txtF_W.setEditable(false);
        txtF_W.setBackground(new java.awt.Color(153, 153, 153));
        txtF_W.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_W.setText("W");

        txtF_Pt.setEditable(false);
        txtF_Pt.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Pt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pt.setText("Pt");

        txtF_Hf.setEditable(false);
        txtF_Hf.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hf.setText("Hf");

        txtA_Elemento.setColumns(20);
        txtA_Elemento.setRows(5);
        jScrollPane3.setViewportView(txtA_Elemento);

        listaFinal.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        listaFinal.setVisibleRowCount(6);
        jScrollPane2.setViewportView(listaFinal);

        txtF_Ag.setEditable(false);
        txtF_Ag.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ag.setText("Ag");
        txtF_Ag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_AgMouseClicked(evt);
            }
        });

        txtF_Sg.setEditable(false);
        txtF_Sg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Sg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sg.setText("Sg");

        jLabel1.setText("Lista Seleccion");

        txtF_Rf.setEditable(false);
        txtF_Rf.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rf.setText("Rf");

        listaSeleccion.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        listaSeleccion.setVisibleRowCount(6);
        jScrollPane1.setViewportView(listaSeleccion);

        txtF_Hg.setEditable(false);
        txtF_Hg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Hg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Hg.setText("Hg");

        txtF_Re.setEditable(false);
        txtF_Re.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Re.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Re.setText("Re");

        txtF_Fe.setEditable(false);
        txtF_Fe.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Fe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Fe.setText("Fe");
        txtF_Fe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_FeMouseClicked(evt);
            }
        });

        txtF_Ta.setEditable(false);
        txtF_Ta.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ta.setText("Ta");

        txtF_Db.setEditable(false);
        txtF_Db.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Db.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Db.setText("Db");

        txtF_Cn.setEditable(false);
        txtF_Cn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cn.setText("Cn");

        txtF_Au.setEditable(false);
        txtF_Au.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Au.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Au.setText("Au");

        txtF_Cu.setEditable(false);
        txtF_Cu.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cu.setText("Cu");
        txtF_Cu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CuMouseClicked(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtF_Ds.setEditable(false);
        txtF_Ds.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ds.setText("Ds");

        txtF_Ru.setEditable(false);
        txtF_Ru.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ru.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ru.setText("Ru");
        txtF_Ru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_RuMouseClicked(evt);
            }
        });

        txtF_Pd.setEditable(false);
        txtF_Pd.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Pd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Pd.setText("Pd");
        txtF_Pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_PdMouseClicked(evt);
            }
        });

        txtF_Lu.setEditable(false);
        txtF_Lu.setBackground(java.awt.Color.pink);
        txtF_Lu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Lu.setText("Lu");

        txtF_Zn.setEditable(false);
        txtF_Zn.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Zn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Zn.setText("Zn");
        txtF_Zn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ZnMouseClicked(evt);
            }
        });

        txtF_Tc.setEditable(false);
        txtF_Tc.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Tc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Tc.setText("Tc");
        txtF_Tc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_TcMouseClicked(evt);
            }
        });

        txtF_Y.setEditable(false);
        txtF_Y.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Y.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Y.setText("Y");
        txtF_Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_YMouseClicked(evt);
            }
        });

        txtF_Zr.setEditable(false);
        txtF_Zr.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Zr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Zr.setText("Zr");
        txtF_Zr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ZrMouseClicked(evt);
            }
        });

        txtF_Lr.setEditable(false);
        txtF_Lr.setBackground(java.awt.Color.magenta);
        txtF_Lr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Lr.setText("Lr");

        txtF_Ir.setEditable(false);
        txtF_Ir.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Ir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Ir.setText("Ir");

        txtF_V.setEditable(false);
        txtF_V.setBackground(new java.awt.Color(153, 153, 153));
        txtF_V.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_V.setText("V");
        txtF_V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_VMouseClicked(evt);
            }
        });

        txtF_Mt.setEditable(false);
        txtF_Mt.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Mt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Mt.setText("Mt");

        txtF_Bh.setEditable(false);
        txtF_Bh.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Bh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Bh.setText("Bh");

        txtF_Rg.setEditable(false);
        txtF_Rg.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Rg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Rg.setText("Rg");

        txtF_Sc.setEditable(false);
        txtF_Sc.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Sc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Sc.setText("Sc");
        txtF_Sc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_ScMouseClicked(evt);
            }
        });

        txtF_Cr.setEditable(false);
        txtF_Cr.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Cr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Cr.setText("Cr");
        txtF_Cr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CrMouseClicked(evt);
            }
        });

        txtF_Co.setEditable(false);
        txtF_Co.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Co.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Co.setText("Co");
        txtF_Co.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF_CoMouseClicked(evt);
            }
        });

        txtF_Os.setEditable(false);
        txtF_Os.setBackground(new java.awt.Color(153, 153, 153));
        txtF_Os.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtF_Os.setText("Os");

        escritorio.setLayer(txtF_Mo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ti, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Cd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Rh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Mn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Nb, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Hs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_W, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Pt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Hf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ag, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Sg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Rf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Hg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Re, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Fe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Db, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Cn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Au, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Cu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ds, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ru, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Pd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Lu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Zn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Tc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Y, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Zr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Lr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Ir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_V, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Mt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Bh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Rg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Sc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Cr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Co, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtF_Os, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(txtF_Sc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_V, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Cr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Mn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Fe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Co, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Cu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Zn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(txtF_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Zr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Nb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Mo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Tc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Rh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Pd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Cd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(txtF_Lu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Hf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_W, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Os, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Pt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Au, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Hg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(txtF_Lr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Rf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Db, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Sg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtF_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtF_Hs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Mt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Ds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtF_Bh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF_Sc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_V, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Cr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Mn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Fe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Co, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Cu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Zn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Zr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Nb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Mo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Tc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Rh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Pd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Cd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF_Lu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Hf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_W, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Os, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Pt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Au, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Hg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF_Lr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Rf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Db, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Sg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Hs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Mt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Ds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_Bh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(escritorio);
        escritorio.setBounds(0, 0, 990, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtF_ScMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ScMouseClicked
        String mensaje = "Sc, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_ScMouseClicked

    private void txtF_TiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TiMouseClicked
        String mensaje = "Ti, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_TiMouseClicked

    private void txtF_VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_VMouseClicked
        String mensaje = "V, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_VMouseClicked

    private void txtF_CrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CrMouseClicked
        String mensaje = "Cr, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_CrMouseClicked

    private void txtF_MnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MnMouseClicked
        String mensaje = "Mn, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_MnMouseClicked

    private void txtF_FeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_FeMouseClicked
        String mensaje = "Fe, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_FeMouseClicked

    private void txtF_CoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CoMouseClicked
        String mensaje = "Co, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_CoMouseClicked

    private void txtF_NiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NiMouseClicked
        String mensaje = "Ni, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_NiMouseClicked

    private void txtF_CuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CuMouseClicked
        String mensaje = "Cu, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_CuMouseClicked

    private void txtF_ZnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ZnMouseClicked
        String mensaje = "Zn, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_ZnMouseClicked

    private void txtF_YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_YMouseClicked
        String mensaje = "Y, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_YMouseClicked

    private void txtF_ZrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_ZrMouseClicked
        String mensaje = "Zr, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_ZrMouseClicked

    private void txtF_NbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_NbMouseClicked
        String mensaje = "Nb, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_NbMouseClicked

    private void txtF_MoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_MoMouseClicked
        String mensaje = "Mo, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_MoMouseClicked

    private void txtF_TcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_TcMouseClicked
        String mensaje = "Tc, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_TcMouseClicked

    private void txtF_RuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RuMouseClicked
        String mensaje = "Ru, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_RuMouseClicked

    private void txtF_RhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_RhMouseClicked
        String mensaje = "Rh, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_RhMouseClicked

    private void txtF_PdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_PdMouseClicked
        String mensaje = "Pd, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_PdMouseClicked

    private void txtF_AgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_AgMouseClicked
        String mensaje = "Ag, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
       txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_AgMouseClicked

    private void txtF_CdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF_CdMouseClicked
        String mensaje = "Cd, ";
        elemento.addElement(mensaje);
        elementoE.addElement(mensaje);
        listaSeleccion.setModel(elemento);
        txtA_Elemento.setText(mensaje);
    }//GEN-LAST:event_txtF_CdMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        //Cliente_Muestra ventana = new Cliente_Muestra();        
        //tabPerioElementoSeleccion tPES = new tabPerioElementoSeleccion();
        //escritorio.add(tPES);
        //tPES.show();
        //tPES.setVisible(true);
        
        elemento.addElement(elementoE);
        //elemento.getListDataListeners();
        listaSeleccion.setModel(elemento);
        //elementoE = elemento;
        
        
        this.setVisible(true);
        
        
        //ventana.setVisible(true);
        //ventana.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabPerioEleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabPerioEleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabPerioEleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabPerioEleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new TabPerioEleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaFinal;
    private javax.swing.JList<String> listaSeleccion;
    private javax.swing.JTextArea txtA_Elemento;
    private javax.swing.JTextField txtF_Ag;
    private javax.swing.JTextField txtF_Au;
    private javax.swing.JTextField txtF_Bh;
    private javax.swing.JTextField txtF_Cd;
    private javax.swing.JTextField txtF_Cn;
    private javax.swing.JTextField txtF_Co;
    private javax.swing.JTextField txtF_Cr;
    private javax.swing.JTextField txtF_Cu;
    private javax.swing.JTextField txtF_Db;
    private javax.swing.JTextField txtF_Ds;
    private javax.swing.JTextField txtF_Fe;
    private javax.swing.JTextField txtF_Hf;
    private javax.swing.JTextField txtF_Hg;
    private javax.swing.JTextField txtF_Hs;
    private javax.swing.JTextField txtF_Ir;
    private javax.swing.JTextField txtF_Lr;
    private javax.swing.JTextField txtF_Lu;
    private javax.swing.JTextField txtF_Mn;
    private javax.swing.JTextField txtF_Mo;
    private javax.swing.JTextField txtF_Mt;
    private javax.swing.JTextField txtF_Nb;
    private javax.swing.JTextField txtF_Ni;
    private javax.swing.JTextField txtF_Os;
    private javax.swing.JTextField txtF_Pd;
    private javax.swing.JTextField txtF_Pt;
    private javax.swing.JTextField txtF_Re;
    private javax.swing.JTextField txtF_Rf;
    private javax.swing.JTextField txtF_Rg;
    private javax.swing.JTextField txtF_Rh;
    private javax.swing.JTextField txtF_Ru;
    private javax.swing.JTextField txtF_Sc;
    private javax.swing.JTextField txtF_Sg;
    private javax.swing.JTextField txtF_Ta;
    private javax.swing.JTextField txtF_Tc;
    private javax.swing.JTextField txtF_Ti;
    private javax.swing.JTextField txtF_V;
    private javax.swing.JTextField txtF_W;
    private javax.swing.JTextField txtF_Y;
    private javax.swing.JTextField txtF_Zn;
    private javax.swing.JTextField txtF_Zr;
    // End of variables declaration//GEN-END:variables


}
