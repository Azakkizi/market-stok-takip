import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Bakim extends javax.swing.JFrame {

    public Bakim() throws ClassNotFoundException, SQLException {
        initComponents();
        bakimtablo.setAutoCreateRowSorter(true);
        listele();
    }

    public void listele() throws ClassNotFoundException, SQLException {
        //veritabanına bağlantı kurma
        Baglanti b = new Baglanti();
        b.baglan();
        //kolon sayısını öğrenip döngüyü döndürmek için oluşturulan değişken
        int kolonsayisi;
        //SQL sorgusu için oluşturulan nesneler
        PreparedStatement ps = b.c.prepareStatement("SELECT * FROM BAKIM");
        ResultSet rs = ps.executeQuery();
        //Result Set'in bilgilerini öğrenmek için oluşturulan nesne
        ResultSetMetaData rsmd = rs.getMetaData();
        //kolon sayısını Result Set Meta Data'nın kolon sayısından öğrenip eşitliyoruz
        kolonsayisi=rsmd.getColumnCount();
        //tablo üzerinde işlem yapmak için oluşturulan nesne
        DefaultTableModel dtm = (DefaultTableModel)bakimtablo.getModel();
        dtm.setRowCount(0);
        //Result Set satırlarının okunma döngüsü
        while(rs.next()) {
            //Default Table Model nesnesine işlem yapabilmek için verileri önce Vector nesnesinde topluyoruz
            Vector v = new Vector();
            for (int i=1; i<=kolonsayisi; i++){
                v.add(rs.getString("BADI"));
                v.add(rs.getString("BSTOK"));
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
        bakimtablo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kişisel Bakım Ürünleri");
        setPreferredSize(new java.awt.Dimension(400, 250));
        setSize(new java.awt.Dimension(400, 250));

        bakimtablo.setModel(new javax.swing.table.DefaultTableModel(
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
        bakimtablo.setMinimumSize(new java.awt.Dimension(30, 640));
        bakimtablo.setPreferredSize(new java.awt.Dimension(380, 200));
        jScrollPane1.setViewportView(bakimtablo);

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Urunler u = new Urunler();
        u.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bakim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bakim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bakim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bakim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bakim().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Bakim.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bakimtablo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
