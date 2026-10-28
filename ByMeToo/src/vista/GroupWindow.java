package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class GroupWindow extends javax.swing.JFrame {

    public GroupWindow() {
        initComponents();
        customInit();
    }

    private void customInit() {
        jToolBar1.add(Box.createHorizontalGlue(), 3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevoGrupo = new javax.swing.JButton();
        btnNuevaCompra = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnResumenToolbar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        panelIzquierdo = new javax.swing.JPanel();
        panelArbolGrupos = new javax.swing.JPanel();
        jScrollPaneTree = new javax.swing.JScrollPane();
        jTreeGrupos = new javax.swing.JTree();
        panelNavegacion = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelDerecho = new javax.swing.JPanel();
        panelCabecera = new javax.swing.JPanel();
        lblTituloGrupos = new javax.swing.JLabel();
        lblSubtituloGrupos = new javax.swing.JLabel();
        panelContenidoCentral = new javax.swing.JPanel();
        panelAcciones = new javax.swing.JPanel();
        btnCrearGrupoAccion = new javax.swing.JButton();
        lblUnirseCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnUnirse = new javax.swing.JButton();
        panelListadoGrupos = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableGrupos = new javax.swing.JTable();
        panelEstado = new javax.swing.JPanel();
        lblEstadoListo = new javax.swing.JLabel();
        panelEstadoDerecho = new javax.swing.JPanel();
        lblEstadoGrupos = new javax.swing.JLabel();
        lblEstadoLook = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuVer = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cómprame! — Gestor de gastos compartidos");
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(540, 27));

        btnNuevoGrupo.setText("+ Nuevo grupo");
        btnNuevoGrupo.setFocusable(false);
        btnNuevoGrupo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevoGrupo.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNuevoGrupo.setOpaque(true);
        btnNuevoGrupo.addActionListener(this::btnNuevoGrupoActionPerformed);
        jToolBar1.add(btnNuevoGrupo);

        btnNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/cart.png"))); // NOI18N
        btnNuevaCompra.setText("Nueva compra");
        btnNuevaCompra.setFocusable(false);
        btnNuevaCompra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevaCompra.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNuevaCompra.addActionListener(this::btnNuevaCompraActionPerformed);
        jToolBar1.add(btnNuevaCompra);
        jToolBar1.add(jSeparator1);

        btnResumenToolbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/chart.png"))); // NOI18N
        btnResumenToolbar.setText("Resumen");
        btnResumenToolbar.setFocusable(false);
        btnResumenToolbar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnResumenToolbar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnResumenToolbar.addActionListener(this::btnResumenToolbarActionPerformed);
        jToolBar1.add(btnResumenToolbar);

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("<html>Conectado como <b>SIARHEI LUKASHOU    </b></html>");
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(lblUsuario);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerLocation(220);

        panelIzquierdo.setLayout(new java.awt.BorderLayout());

        panelArbolGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupos"));
        panelArbolGrupos.setPreferredSize(new java.awt.Dimension(60, 200));
        panelArbolGrupos.setLayout(new java.awt.BorderLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mis Grupos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("> Piso1");
        treeNode1.add(treeNode2);
        jTreeGrupos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeGrupos.setRootVisible(false);
        jScrollPaneTree.setViewportView(jTreeGrupos);

        panelArbolGrupos.add(jScrollPaneTree, java.awt.BorderLayout.CENTER);

        panelIzquierdo.add(panelArbolGrupos, java.awt.BorderLayout.CENTER);

        panelNavegacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegación"));
        panelNavegacion.setAlignmentX(0.0F);
        panelNavegacion.setLayout(new javax.swing.BoxLayout(panelNavegacion, javax.swing.BoxLayout.Y_AXIS));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/home.png"))); // NOI18N
        jButton6.setText("Inicio");
        jButton6.setMaximumSize(new java.awt.Dimension(50000, 23));
        panelNavegacion.add(jButton6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(50000, 92));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 92));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/users.png"))); // NOI18N
        jButton7.setText("Grupos");
        jButton7.setMaximumSize(new java.awt.Dimension(5000, 23));
        jPanel1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/chart.png"))); // NOI18N
        jButton8.setText("Resumen");
        jButton8.setMaximumSize(new java.awt.Dimension(5000, 23));
        jButton8.addActionListener(this::jButton8ActionPerformed);
        jPanel1.add(jButton8);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons/user.png"))); // NOI18N
        jButton1.setText("Perfil");
        jButton1.setMaximumSize(new java.awt.Dimension(5000, 23));
        jPanel1.add(jButton1);

        panelNavegacion.add(jPanel1);

        panelIzquierdo.add(panelNavegacion, java.awt.BorderLayout.NORTH);

        jSplitPane1.setLeftComponent(panelIzquierdo);

        panelDerecho.setBackground(new java.awt.Color(245, 245, 245));
        panelDerecho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelDerecho.setMaximumSize(new java.awt.Dimension(5000000, 34));
        panelDerecho.setLayout(new java.awt.BorderLayout(0, 15));

        panelCabecera.setOpaque(false);
        panelCabecera.setLayout(new java.awt.BorderLayout());

        lblTituloGrupos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloGrupos.setText("Grupos");
        panelCabecera.add(lblTituloGrupos, java.awt.BorderLayout.WEST);

        lblSubtituloGrupos.setForeground(new java.awt.Color(102, 102, 102));
        lblSubtituloGrupos.setText("Crea o únete a un grupo de convivencia    ");
        panelCabecera.add(lblSubtituloGrupos, java.awt.BorderLayout.EAST);

        panelDerecho.add(panelCabecera, java.awt.BorderLayout.NORTH);

        panelContenidoCentral.setOpaque(false);
        panelContenidoCentral.setLayout(new java.awt.BorderLayout(0, 10));

        panelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        panelAcciones.setOpaque(false);
        panelAcciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 10));

        btnCrearGrupoAccion.setText("+ Crear grupo");
        panelAcciones.add(btnCrearGrupoAccion);

        lblUnirseCodigo.setText("Unirse con código:");
        panelAcciones.add(lblUnirseCodigo);

        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigo.setText("ABC123");
        txtCodigo.setPreferredSize(new java.awt.Dimension(120, 26));
        panelAcciones.add(txtCodigo);

        btnUnirse.setText("Unirse");
        btnUnirse.setEnabled(false);
        panelAcciones.add(btnUnirse);

        panelContenidoCentral.add(panelAcciones, java.awt.BorderLayout.NORTH);

        panelListadoGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de grupos"));
        panelListadoGrupos.setOpaque(false);
        panelListadoGrupos.setLayout(new java.awt.BorderLayout());

        jScrollPaneTabla.setToolTipText("");
        jScrollPaneTabla.setMaximumSize(new java.awt.Dimension(452, 500));
        jScrollPaneTabla.setPreferredSize(new java.awt.Dimension(452, 80));

        jTableGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"<html><b>Piso1</b></html>", "Administrador", "1", "V1EU7L", "Salir"}
            },
            new String [] {
                "Nombre", "Rol", "Miembros", "Código", ""
            }
        ));
        jTableGrupos.setRowHeight(30);
        jTableGrupos.setShowGrid(true);
        jScrollPaneTabla.setViewportView(jTableGrupos);

        panelListadoGrupos.add(jScrollPaneTabla, java.awt.BorderLayout.NORTH);

        panelContenidoCentral.add(panelListadoGrupos, java.awt.BorderLayout.CENTER);

        panelDerecho.add(panelContenidoCentral, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(panelDerecho);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

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

        menuArchivo.setText("Archivo");
        jMenuBar1.add(menuArchivo);

        menuVer.setText("Ver");
        jMenuBar1.add(menuVer);

        menuAyuda.setText("Ayuda");
        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoGrupoActionPerformed

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void btnResumenToolbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenToolbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResumenToolbarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private javax.swing.JButton btnCrearGrupoAccion;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JButton btnNuevoGrupo;
    private javax.swing.JButton btnResumenToolbar;
    private javax.swing.JButton btnUnirse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTree;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTableGrupos;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTreeGrupos;
    private javax.swing.JLabel lblEstadoGrupos;
    private javax.swing.JLabel lblEstadoListo;
    private javax.swing.JLabel lblEstadoLook;
    private javax.swing.JLabel lblSubtituloGrupos;
    private javax.swing.JLabel lblTituloGrupos;
    private javax.swing.JLabel lblUnirseCodigo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelArbolGrupos;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelContenidoCentral;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEstadoDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelListadoGrupos;
    private javax.swing.JPanel panelNavegacion;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}