import java.awt.Color;
import javax.swing.JColorChooser;

public class Marketim extends javax.swing.JFrame {

    public Marketim() {
        initComponents();
    }
    //Renk değişimleri için gereken değişkenler
    public Color bgc;
    public Color textc;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marketimlabel = new javax.swing.JLabel();
        urunlerbutton = new javax.swing.JButton();
        ecbutton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        secenekler = new javax.swing.JMenu();
        cikis = new javax.swing.JMenuItem();
        gorunum = new javax.swing.JMenu();
        karanlik = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        renksec = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marketim");
        setResizable(false);

        marketimlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        marketimlabel.setText("Marketim");

        urunlerbutton.setText("Ürünler");
        urunlerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunlerbuttonActionPerformed(evt);
            }
        });

        ecbutton.setText("Ekle/Çıkar");
        ecbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecbuttonActionPerformed(evt);
            }
        });

        secenekler.setText("Seçenekler");

        cikis.setText("Çıkış Yap");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });
        secenekler.add(cikis);

        jMenuBar1.add(secenekler);

        gorunum.setText("Görünüm");

        karanlik.setText("Karanlık Mod");
        karanlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlikActionPerformed(evt);
            }
        });
        gorunum.add(karanlik);
        gorunum.add(jSeparator1);

        renksec.setText("Renk Seç");
        renksec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renksecActionPerformed(evt);
            }
        });
        gorunum.add(renksec);

        jMenuBar1.add(gorunum);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(marketimlabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(urunlerbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(ecbutton)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(marketimlabel)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunlerbutton)
                    .addComponent(ecbutton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ekle-çıkar butonuna tıklandığında
    private void ecbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecbuttonActionPerformed
        dispose(); //anasayfayı kapatır
        EkleCikar ec = new EkleCikar();
        ec.setVisible(true); //ekle/çıkar ekranını açar
    }//GEN-LAST:event_ecbuttonActionPerformed

    //ürünler butonuna tıklandığında
    private void urunlerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunlerbuttonActionPerformed
        dispose(); //anasayfayı kapatır
        Urunler urun = new Urunler();
        urun.setVisible(true); //ürünler ekranını açar
    }//GEN-LAST:event_urunlerbuttonActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        dispose(); //anasayfayı kapatır
        LoginSignup ls = new LoginSignup();
        ls.setVisible(true); //login-signup ekranını açar
    }//GEN-LAST:event_cikisActionPerformed

    private void karanlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlikActionPerformed
        if(karanlik.isSelected()) {
            getContentPane().setBackground(Color.black);
            marketimlabel.setForeground(Color.white);
        }
        else {
            getContentPane().setBackground(new java.awt.Color(240,240,240));
            marketimlabel.setForeground(Color.black);
        }
    }//GEN-LAST:event_karanlikActionPerformed

    private void renksecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renksecActionPerformed
        bgc = JColorChooser.showDialog(this, "Arkaplan rengi seçiniz", bgc);
        getContentPane().setBackground(bgc);
        
        textc = JColorChooser.showDialog(this, "Yazı rengi seçiniz", textc);
        marketimlabel.setForeground(textc);
    }//GEN-LAST:event_renksecActionPerformed

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
            java.util.logging.Logger.getLogger(Marketim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marketim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marketim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marketim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marketim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cikis;
    private javax.swing.JButton ecbutton;
    private javax.swing.JMenu gorunum;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JCheckBoxMenuItem karanlik;
    private javax.swing.JLabel marketimlabel;
    private javax.swing.JMenuItem renksec;
    private javax.swing.JMenu secenekler;
    private javax.swing.JButton urunlerbutton;
    // End of variables declaration//GEN-END:variables
}
