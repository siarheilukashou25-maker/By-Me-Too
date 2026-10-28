package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class GroupWindow extends javax.swing.JFrame {

    public GroupWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        panelEstado = new javax.swing.JPanel();
        lblEstadoListo = new javax.swing.JLabel();
        panelEstadoDerecho = new javax.swing.JPanel();
        lblEstadoGrupos = new javax.swing.JLabel();
        lblEstadoLook = new javax.swing.JLabel();
        sidebarPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        navTitle = new javax.swing.JLabel();
        navSeparator = new javax.swing.JSeparator();
        navInicioPanel = new javax.swing.JPanel();
        navInicio = new javax.swing.JButton();
        navGrupos = new javax.swing.JButton();
        navResumen = new javax.swing.JButton();
        navPerfil = new javax.swing.JButton();
        gruposSidePanel = new javax.swing.JPanel();
        gruposTitle = new javax.swing.JLabel();
        gruposSeparator = new javax.swing.JSeparator();
        lblGrupoPiso1 = new javax.swing.JLabel();
        toolbarPanel = new javax.swing.JPanel();
        btnNuevoGrupo = new javax.swing.JButton();
        btnNuevaCompra = new javax.swing.JButton();
        toolbarSeparator = new javax.swing.JSeparator();
        btnResumen = new javax.swing.JButton();
        lblConectado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accionesCard = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jButton3.setText("jButton3");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cómprame! — Gestor de gastos compartidos");
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(900, 600));

        panelEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        panelEstado.setLayout(new java.awt.BorderLayout());

        lblEstadoListo.setText(" Listo");
        lblEstadoListo.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 2));
        panelEstado.add(lblEstadoListo, java.awt.BorderLayout.WEST);

        panelEstadoDerecho.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        lblEstadoGrupos.setText("Grupos: 1");
        lblEstadoGrupos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEstadoDerecho.add(lblEstadoGrupos);

        lblEstadoLook.setText("Java Swing L&F");
        lblEstadoLook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEstadoDerecho.add(lblEstadoLook);

        panelEstado.add(panelEstadoDerecho, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEstado, java.awt.BorderLayout.SOUTH);

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));

        navTitle.setFont(navTitle.getFont().deriveFont(navTitle.getFont().getStyle() | java.awt.Font.BOLD));
        navTitle.setText("Navegación");
        navTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 6, 5, 6));

        navInicioPanel.setBackground(new java.awt.Color(65, 130, 220));

        navInicio.setForeground(new java.awt.Color(255, 255, 255));
        navInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/home.png"))); // NOI18N
        navInicio.setText("Inicio");
        navInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6));
        navInicio.setBorderPainted(false);
        navInicio.setContentAreaFilled(false);
        navInicio.setFocusPainted(false);
        navInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout navInicioPanelLayout = new javax.swing.GroupLayout(navInicioPanel);
        navInicioPanel.setLayout(navInicioPanelLayout);
        navInicioPanelLayout.setHorizontalGroup(
            navInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navInicioPanelLayout.setVerticalGroup(
            navInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        navGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/users.png"))); // NOI18N
        navGrupos.setText("Grupos");
        navGrupos.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6));
        navGrupos.setBorderPainted(false);
        navGrupos.setContentAreaFilled(false);
        navGrupos.setFocusPainted(false);
        navGrupos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        navResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/chart.png"))); // NOI18N
        navResumen.setText("Resumen");
        navResumen.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6));
        navResumen.setBorderPainted(false);
        navResumen.setContentAreaFilled(false);
        navResumen.setFocusPainted(false);
        navResumen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        navPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/user.png"))); // NOI18N
        navPerfil.setText("Perfil");
        navPerfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6));
        navPerfil.setBorderPainted(false);
        navPerfil.setContentAreaFilled(false);
        navPerfil.setFocusPainted(false);
        navPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navSeparator)
            .addComponent(navInicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(navTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addComponent(navTitle)
                .addGap(0, 0, 0)
                .addComponent(navSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(navInicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(navGrupos)
                .addGap(0, 0, 0)
                .addComponent(navResumen)
                .addGap(0, 0, 0)
                .addComponent(navPerfil)
                .addGap(4, 4, 4))
        );

        gruposSidePanel.setBackground(new java.awt.Color(255, 255, 255));
        gruposSidePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));

        gruposTitle.setFont(gruposTitle.getFont().deriveFont(gruposTitle.getFont().getStyle() | java.awt.Font.BOLD));
        gruposTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/folder.png"))); // NOI18N
        gruposTitle.setText("Grupos");
        gruposTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 6, 5, 6));

        lblGrupoPiso1.setText("Piso1");
        lblGrupoPiso1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 6, 3, 6));

        javax.swing.GroupLayout gruposSidePanelLayout = new javax.swing.GroupLayout(gruposSidePanel);
        gruposSidePanel.setLayout(gruposSidePanelLayout);
        gruposSidePanelLayout.setHorizontalGroup(
            gruposSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gruposTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gruposSeparator)
            .addComponent(lblGrupoPiso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gruposSidePanelLayout.setVerticalGroup(
            gruposSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gruposSidePanelLayout.createSequentialGroup()
                .addComponent(gruposTitle)
                .addGap(0, 0, 0)
                .addComponent(gruposSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblGrupoPiso1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        toolbarPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(160, 160, 160)));

        btnNuevoGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/plus.png"))); // NOI18N
        btnNuevoGrupo.setText("Nuevo grupo");

        btnNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/cart.png"))); // NOI18N
        btnNuevaCompra.setText("Nueva compra");

        toolbarSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/chart.png"))); // NOI18N
        btnResumen.setText("Resumen");

        lblConectado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConectado.setText("<html>Conectado como <b>SIARHEI LUKASHOU</b></html>");

        javax.swing.GroupLayout toolbarPanelLayout = new javax.swing.GroupLayout(toolbarPanel);
        toolbarPanel.setLayout(toolbarPanelLayout);
        toolbarPanelLayout.setHorizontalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btnNuevoGrupo)
                .addGap(3, 3, 3)
                .addComponent(btnNuevaCompra)
                .addGap(5, 5, 5)
                .addComponent(toolbarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnResumen)
                .addGap(175, 175, 175)
                .addComponent(lblConectado)
                .addContainerGap())
        );
        toolbarPanelLayout.setVerticalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNuevoGrupo)
                    .addComponent(btnNuevaCompra)
                    .addComponent(toolbarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResumen)
                    .addComponent(lblConectado))
                .addGap(2, 2, 2))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Grupos");

        accionesCard.setBackground(new java.awt.Color(252, 252, 252));
        accionesCard.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/plus.png"))); // NOI18N
        jButton1.setText("Crear grupo");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setText("Unirse con código");

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("ABC123");
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton2.setText("Unirse");

        javax.swing.GroupLayout accionesCardLayout = new javax.swing.GroupLayout(accionesCard);
        accionesCard.setLayout(accionesCardLayout);
        accionesCardLayout.setHorizontalGroup(
            accionesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accionesCardLayout.setVerticalGroup(
            accionesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accionesCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(accionesCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(34, 34, 34))
        );

        jLabel3.setText("Crea o únete a un grupo de convivencia");

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de grupos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Piso 1", "Administrador", "1", "V1EU7L", "Salir"}
            },
            new String [] {
                "Nombre", "Rol", "Miembros", "Código", ""
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(accionesCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accionesCard, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        accionesCard.getAccessibleContext().setAccessibleName("Acciones");

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gruposSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(toolbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(gruposSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        getContentPane().add(sidebarPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Ver");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GroupWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accionesCard;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JButton btnNuevoGrupo;
    private javax.swing.JButton btnResumen;
    private javax.swing.JSeparator gruposSeparator;
    private javax.swing.JPanel gruposSidePanel;
    private javax.swing.JLabel gruposTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblConectado;
    private javax.swing.JLabel lblEstadoGrupos;
    private javax.swing.JLabel lblEstadoListo;
    private javax.swing.JLabel lblEstadoLook;
    private javax.swing.JLabel lblGrupoPiso1;
    private javax.swing.JButton navGrupos;
    private javax.swing.JButton navInicio;
    private javax.swing.JPanel navInicioPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton navPerfil;
    private javax.swing.JButton navResumen;
    private javax.swing.JSeparator navSeparator;
    private javax.swing.JLabel navTitle;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEstadoDerecho;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel toolbarPanel;
    private javax.swing.JSeparator toolbarSeparator;
    // End of variables declaration//GEN-END:variables
}