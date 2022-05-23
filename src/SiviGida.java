import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class SiviGida extends javax.swing.JFrame {

    public SiviGida() throws ClassNotFoundException, SQLException {
        initComponents();
        sivitablo.setAutoCreateRowSorter(true);
        listele();
    }

    public void listele() throws ClassNotFoundException, SQLException {
        //veritabanına bağlantı kurma
        Baglanti b = new Baglanti();
        b.baglan();
        //kolon sayısını öğrenip döngüyü döndürmek için oluşturulan değişken
        int kolonsayisi;
        //SQL sorgusu için oluşturulan nesneler
        PreparedStatement ps = b.c.prepareStatement("SELECT * FROM SIVIGIDA");
        ResultSet rs = ps.executeQuery();
        //Result Set'in bilgilerini öğrenmek için oluşturulan nesne
        ResultSetMetaData rsmd = rs.getMetaData();
        //kolon sayısını Result Set Meta Data'nın kolon sayısından öğrenip eşitliyoruz
        kolonsayisi=rsmd.getColumnCount();
        //tablo üzerinde işlem yapmak için oluşturulan nesne
        DefaultTableModel dtm = (DefaultTableModel)sivitablo.getModel();
        dtm.setRowCount(0);
        //Result Set satırlarının okunma döngüsü
        while(rs.next()) {
            //Default Table Model nesnesine işlem yapabilmek için verileri önce Vector nesnesinde topluyoruz
            Vector v = new Vector();
            for (int i=1; i<=kolonsayisi; i++){
                v.add(rs.getString("SGADI"));
                v.add(rs.getString("SGSTOK"));
            }
            //Default Table Model nesnesine Vector nesnesini giriyoruz
            dtm.addRow(v);
        }
        b.baglantiKes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sivitablo = new javax.swing.JTable();
        gerib = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sıvı Gıdalar");
        setPreferredSize(new java.awt.Dimension(400, 250));
        setSize(new java.awt.Dimension(400, 250));

        sivitablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ÜRÜN", "STOK"
            }
        ));
        sivitablo.setMinimumSize(new java.awt.Dimension(30, 200));
        sivitablo.setPreferredSize(new java.awt.Dimension(380, 200));
        jScrollPane1.setViewportView(sivitablo);

        gerib.setText("Geri");
        gerib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geribActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(gerib)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gerib)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void geribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geribActionPerformed
        dispose();
        Urunler u = new Urunler();
        u.setVisible(true);
    }//GEN-LAST:event_geribActionPerformed

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
            java.util.logging.Logger.getLogger(SiviGida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiviGida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiviGida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiviGida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SiviGida().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(SiviGida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerib;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sivitablo;
    // End of variables declaration//GEN-END:variables
}
