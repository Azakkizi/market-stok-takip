import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class EkleCikar extends javax.swing.JFrame {

    public EkleCikar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cesitL = new javax.swing.JLabel();
        cesitCB = new javax.swing.JComboBox<>();
        urunAdiL = new javax.swing.JLabel();
        urunAdiF = new javax.swing.JTextField();
        stokL = new javax.swing.JLabel();
        stokSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        ekleb = new javax.swing.JButton();
        stokguncelleb = new javax.swing.JButton();
        listeguncelleb = new javax.swing.JButton();
        kaldirb = new javax.swing.JButton();
        gerib = new javax.swing.JButton();
        urunCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ekle / Çıkar");
        setResizable(false);

        cesitL.setText("Eklemek istediğiniz ürün çeşidi:");

        cesitCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Çeşit seçiniz", "Katı Gıda", "Sıvı Gıda", "Temizlik Ürünü", "Kişisel Bakım Ürünü" }));
        cesitCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cesitCBActionPerformed(evt);
            }
        });

        urunAdiL.setText("Ürün adı:");

        stokL.setText("Stok adedi:");

        stokSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        liste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(liste);

        ekleb.setText("Ürünü ekle");
        ekleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklebActionPerformed(evt);
            }
        });

        stokguncelleb.setText("Stok güncelle");
        stokguncelleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokguncellebActionPerformed(evt);
            }
        });

        listeguncelleb.setText("Listeyi güncelle");
        listeguncelleb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeguncellebActionPerformed(evt);
            }
        });

        kaldirb.setText("Ürünü kaldır");
        kaldirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaldirbActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cesitL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cesitCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urunAdiL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urunAdiF))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ekleb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(urunCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listeguncelleb, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gerib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokguncelleb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(kaldirb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stokL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stokSpinner)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cesitL)
                    .addComponent(cesitCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunAdiL)
                    .addComponent(urunAdiF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokL)
                    .addComponent(stokSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekleb)
                    .addComponent(stokguncelleb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaldirb)
                    .addComponent(urunCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerib)
                    .addComponent(listeguncelleb))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cesitCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cesitCBActionPerformed
        switch (cesitCB.getSelectedIndex()) {
            case 0:
                //önce combocox'taki diğer ürünleri temizleme
                urunCB.removeAllItems();
                String bos = "";
                DefaultListModel dlm = new DefaultListModel();
                dlm.addElement(bos);
                liste.setModel(dlm);
                break;
            case 1:
                //önce combocox'taki diğer ürünleri temizleme
                urunCB.removeAllItems();
                Baglanti bkg = new Baglanti();
                PreparedStatement pskg;
                ResultSet rskg;
                DefaultListModel dlmkg = new DefaultListModel();
                try {
                    bkg.baglan();
                    pskg = bkg.c.prepareStatement("SELECT * FROM KATIGIDA");
                    rskg = pskg.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rskg.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rskg.getString("KGADI") + "(" + rskg.getString("KGSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmkg.addElement(urun);
                        //Ürünleri combobox'a ekleme
                        urunCB.addItem(rskg.getString("KGADI"));
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmkg);
                    //Bağlantıyı kesme
                    bkg.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                //önce combocox'taki diğer ürünleri temizleme
                urunCB.removeAllItems();
                Baglanti bsg = new Baglanti();
                PreparedStatement pssg;
                ResultSet rssg;
                DefaultListModel dlmsg = new DefaultListModel();
                try {
                    bsg.baglan();
                    pssg = bsg.c.prepareStatement("SELECT * FROM SIVIGIDA");
                    rssg = pssg.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rssg.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rssg.getString("SGADI") + "(" + rssg.getString("SGSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmsg.addElement(urun);
                        //Ürünleri combobox'a ekleme
                        urunCB.addItem(rssg.getString("SGADI"));
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmsg);
                    //Bağlantıyı kesme
                    bsg.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                //önce combocox'taki diğer ürünleri temizleme
                urunCB.removeAllItems();
                Baglanti bt = new Baglanti();
                PreparedStatement pst;
                ResultSet rst;
                DefaultListModel dlmt = new DefaultListModel();
                try {
                    bt.baglan();
                    pst = bt.c.prepareStatement("SELECT * FROM TEMIZLIK");
                    rst = pst.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rst.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rst.getString("TADI") + "(" + rst.getString("TSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmt.addElement(urun);
                        //Ürünleri combobox'a ekleme
                        urunCB.addItem(rst.getString("TADI"));
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmt);
                    //Bağlantıyı kesme
                    bt.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                //önce combocox'taki diğer ürünleri temizleme
                urunCB.removeAllItems();
                Baglanti bb = new Baglanti();
                PreparedStatement psb;
                ResultSet rsb;
                DefaultListModel dlmb = new DefaultListModel();
                try {
                    bb.baglan();
                    psb = bb.c.prepareStatement("SELECT * FROM BAKIM");
                    rsb = psb.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rsb.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rsb.getString("BADI") + "(" + rsb.getString("BSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmb.addElement(urun);
                        //Ürünleri combobox'a ekleme
                        urunCB.addItem(rsb.getString("BADI"));
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmb);
                    //Bağlantıyı kesme
                    bb.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
            default:
                break;
        }
    }//GEN-LAST:event_cesitCBActionPerformed

    private void eklebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklebActionPerformed
//        if (stokF.getText().equals("")) {
//            stokF.setText("0");
//            JOptionPane.showMessageDialog(this, "Stok adedi girmediniz. Stok adedi \"0\" olarak atanmıştır.");
//        }
        if (urunAdiF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen ürün adını boş bırakmayın!");
        }
        else {
            String urunAdi = urunAdiF.getText();
            Baglanti b = new Baglanti();
            PreparedStatement ps1;
            ResultSet rs;
            switch (cesitCB.getSelectedIndex()) {
                case 0: //çeşit seçiniz seçili ise
                    JOptionPane.showMessageDialog(this, "Lütfen ürün çeşidi seçiniz!");
                    break;
                case 1: //katı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM KATIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("KGADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Eklemek istediğiniz ürün listede mevcut. Lütfen güncelle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün yoksa yeni ürünü ekler
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    ps2 = b.c.prepareStatement("INSERT INTO KATIGIDA(KGADI,KGSTOK) VALUES (?,?)");
                                    //ilk sütun(0. sütun) id numarası olacağı için değerleri yerleştirmeye 1. sütundan başlarız
                                    ps2.setString(1, urunAdi);
                                    ps2.setInt(2, stok);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün eklendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece tamsayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 2: //sıvı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT SGADI FROM SIVIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("SGADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Eklemek istediğiniz ürün listede mevcut. Lütfen güncelle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün yoksa sürekli yeni ürün eklemeye devam eder
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    ps2 = b.c.prepareStatement("INSERT INTO KATIGIDA(SGADI,SGSTOK) VALUES (?,?)");
                                    //ilk sütun(0. sütun) id numarası olacağı için değerleri yerleştirmeye 1. sütundan başlarız
                                    ps2.setString(1, urunAdi);
                                    ps2.setInt(2, stok);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün eklendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece sayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 3: //temizlik seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT TADI FROM TEMIZLIK");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("TADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Eklemek istediğiniz ürün listede mevcut. Lütfen güncelle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün yoksa sürekli yeni ürün eklemeye devam eder
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    ps2 = b.c.prepareStatement("INSERT INTO TEMIZLIK(TADI,TSTOK) VALUES (?,?)");
                                    //ilk sütun(0. sütun) id numarası olacağı için değerleri yerleştirmeye 1. sütundan başlarız
                                    ps2.setString(1, urunAdi);
                                    ps2.setInt(2, stok);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün eklendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece sayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 4: //bakım seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT BADI FROM BAKIM");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("BADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Eklemek istediğiniz ürün listede mevcut. Lütfen güncelle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün yoksa sürekli yeni ürün eklemeye devam eder
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    ps2 = b.c.prepareStatement("INSERT INTO BAKIM(BADI,BSTOK) VALUES (?,?)");
                                    //ilk sütun(0. sütun) id numarası olacağı için değerleri yerleştirmeye 1. sütundan başlarız
                                    ps2.setString(1, urunAdi);
                                    ps2.setInt(2, stok);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün eklendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece sayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                default:
                    break;
            }
        }
    }//GEN-LAST:event_eklebActionPerformed

    private void stokguncellebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokguncellebActionPerformed
//        if (stokF.getText().equals("")) {
//            stokF.setText("0");
//            JOptionPane.showMessageDialog(this, "Stok adedi girmediniz. Stok adedi \"0\" olarak atanmıştır.");
//        }
        if (urunAdiF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen ürün adını boş bırakmayın!");
        }
        else {
            String urunAdi = urunAdiF.getText();
            Baglanti b = new Baglanti();
            PreparedStatement ps1;
            ResultSet rs;
            switch (cesitCB.getSelectedIndex()) {
                case 0: //çeşit seçiniz seçili ise
                    JOptionPane.showMessageDialog(this, "Lütfen ürün çeşidi seçiniz!");
                    break;
                case 1: //katı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM KATIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("KGADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (!urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Güncellemek istediğiniz ürün listede mevcut değil. Lütfen ürün ekle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün varsa günceller
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    //ürünün adıyla veritabanında stok güncellemesi yapma
                                    ps2 = b.c.prepareStatement("UPDATE KATIGIDA SET KGSTOK = ? WHERE KGADI = ?;");
                                    ps2.setInt(1, stok);
                                    ps2.setString(2, urunAdi);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün stoğu güncellendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece tamsayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 2: //sıvı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM SIVIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("SGADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (!urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Güncellemek istediğiniz ürün listede mevcut değil. Lütfen ürün ekle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün varsa günceller
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    //ürünün adıyla veritabanında stok güncellemesi yapma
                                    ps2 = b.c.prepareStatement("UPDATE SIVIGIDA SET SGSTOK = ? WHERE SGADI = ?;");
                                    ps2.setInt(1, stok);
                                    ps2.setString(2, urunAdi);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün stoğu güncellendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece tamsayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 3: //temizlik seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM TEMIZLIK");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("TADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (!urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Güncellemek istediğiniz ürün listede mevcut değil. Lütfen ürün ekle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün varsa günceller
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    //ürünün adıyla veritabanında stok güncellemesi yapma
                                    ps2 = b.c.prepareStatement("UPDATE TEMIZLIK SET TSTOK = ? WHERE TADI = ?;");
                                    ps2.setInt(1, stok);
                                    ps2.setString(2, urunAdi);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün stoğu güncellendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece tamsayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 4: //bakım seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM BAKIM");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            String varolan = rs.getString("BADI");
                            //ürünün veritabanında olup olmadığını kontrol etme
                            if (!urunAdi.equals(varolan)) {
                                JOptionPane.showMessageDialog(this, "Güncellemek istediğiniz ürün listede mevcut değil. Lütfen ürün ekle butonuna tıklayın.");
                                break;
                            } else { //eğer ürün varsa günceller
                                try {
                                    //stok sayısını girilen string değerinden integer'a çevirme
                                    //int stok = Integer.parseInt(stokF.getText());
                                    int stok = (Integer) (stokSpinner.getValue());
                                    PreparedStatement ps2;
                                    //ürünün adıyla veritabanında stok güncellemesi yapma
                                    ps2 = b.c.prepareStatement("UPDATE BAKIM SET BSTOK = ? WHERE BADI = ?;");
                                    ps2.setInt(1, stok);
                                    ps2.setString(2, urunAdi);
                                    ps2.executeUpdate();
                                    b.baglantiKes();
                                    JOptionPane.showMessageDialog(this, "Ürün stoğu güncellendi. Lütfen listeyi güncelleyiniz.");
                                    urunAdiF.setText("");
                                    //stokF.setText("");
                                    stokSpinner.setValue(0);
                                    break;
                                } catch (NumberFormatException e) { //eğer stok adedine integer dışında bir değer girilirse
                                    JOptionPane.showMessageDialog(this, "Stok adedine sadece tamsayı giriniz!");
                                    break;
                                }
                            }
                        }
                        break;
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                default:
                    break;
            }
        }
    }//GEN-LAST:event_stokguncellebActionPerformed

    private void listeguncellebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeguncellebActionPerformed
        switch (cesitCB.getSelectedIndex()) {
            case 1:
                Baglanti bkg = new Baglanti();
                PreparedStatement pskg;
                ResultSet rskg;
                DefaultListModel dlmkg = new DefaultListModel();
                try {
                    bkg.baglan();
                    pskg = bkg.c.prepareStatement("SELECT * FROM KATIGIDA");
                    rskg = pskg.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rskg.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rskg.getString("KGADI") + "(" + rskg.getString("KGSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmkg.addElement(urun);
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmkg);
                    //Bağlantıyı kesme
                    bkg.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                Baglanti bsg = new Baglanti();
                PreparedStatement pssg;
                ResultSet rssg;
                DefaultListModel dlmsg = new DefaultListModel();
                try {
                    bsg.baglan();
                    pssg = bsg.c.prepareStatement("SELECT * FROM SIVIGIDA");
                    rssg = pssg.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rssg.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rssg.getString("SGADI") + "(" + rssg.getString("SGSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmsg.addElement(urun);
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmsg);
                    //Bağlantıyı kesme
                    bsg.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3:
                Baglanti bt = new Baglanti();
                PreparedStatement pst;
                ResultSet rst;
                DefaultListModel dlmt = new DefaultListModel();
                try {
                    bt.baglan();
                    pst = bt.c.prepareStatement("SELECT * FROM TEMIZLIK");
                    rst = pst.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rst.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rst.getString("TADI") + "(" + rst.getString("TSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmt.addElement(urun);
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmt);
                    //Bağlantıyı kesme
                    bt.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                Baglanti bb = new Baglanti();
                PreparedStatement psb;
                ResultSet rsb;
                DefaultListModel dlmb = new DefaultListModel();
                try {
                    bb.baglan();
                    psb = bb.c.prepareStatement("SELECT * FROM BAKIM");
                    rsb = psb.executeQuery();
                    //Result Set satırlarının okunma döngüsü
                    while (rsb.next()) {
                        //Ürünleri bir string'de ürün adedi yanında parantez içinde yazacak şekilde tutma
                        String urun = rsb.getString("BADI") + "(" + rsb.getString("BSTOK") + ")";
                        //Ürünü listeye ekleme
                        dlmb.addElement(urun);
                    }
                    //Ürünler listesini liste'ye ekleme
                    liste.setModel(dlmb);
                    //Bağlantıyı kesme
                    bb.baglantiKes();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                }
            case 0:
            default:
                break;
        }
    }//GEN-LAST:event_listeguncellebActionPerformed

    private void geribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geribActionPerformed
        dispose();
        Marketim m = new Marketim();
        m.setVisible(true);
    }//GEN-LAST:event_geribActionPerformed

    private void kaldirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaldirbActionPerformed
        if (urunCB.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Lütfen ürün seçiniz!");
        }
        else {
            String urunAdi = urunCB.getSelectedItem().toString();
            Baglanti b = new Baglanti();
            PreparedStatement ps1;
            ResultSet rs;
            switch (cesitCB.getSelectedIndex()) {
                case 0: //çeşit seçiniz seçili ise
                    JOptionPane.showMessageDialog(this, "Lütfen ürün çeşidi seçiniz!");
                    break;
                case 1: //katı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM KATIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            PreparedStatement ps2;
                            //ürünün adıyla ürünü veritabanından kaldırma
                            ps2 = b.c.prepareStatement("DELETE FROM KATIGIDA WHERE KGADI = ?;");
                            ps2.setString(1, urunAdi);
                            ps2.executeUpdate();
                            b.baglantiKes();
                            JOptionPane.showMessageDialog(this, "Ürün kaldırıldı. Lütfen listeyi güncelleyiniz.");
                            break;
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 2: //sıvı gıda seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM SIVIGIDA");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            PreparedStatement ps2;
                            //ürünün adıyla ürünü veritabanından kaldırma
                            ps2 = b.c.prepareStatement("DELETE FROM SIVIGIDA WHERE SGADI = ?;");
                            ps2.setString(1, urunAdi);
                            ps2.executeUpdate();
                            b.baglantiKes();
                            JOptionPane.showMessageDialog(this, "Ürün kaldırıldı. Lütfen listeyi güncelleyiniz.");
                            break;
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 3: //temizlik seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM TEMIZLIK");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            PreparedStatement ps2;
                            //ürünün adıyla ürünü veritabanından kaldırma
                            ps2 = b.c.prepareStatement("DELETE FROM TEMIZLIK WHERE TADI = ?;");
                            ps2.setString(1, urunAdi);
                            ps2.executeUpdate();
                            b.baglantiKes();
                            JOptionPane.showMessageDialog(this, "Ürün kaldırıldı. Lütfen listeyi güncelleyiniz.");
                            break;
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 4: //bakım seçili ise
                    try {
                        b.baglan();
                        ps1 = b.c.prepareStatement("SELECT * FROM BAKIM");
                        rs = ps1.executeQuery();
                        while (rs.next()) {
                            PreparedStatement ps2;
                            //ürünün adıyla ürünü veritabanından kaldırma
                            ps2 = b.c.prepareStatement("DELETE FROM BAKIM WHERE BADI = ?;");
                            ps2.setString(1, urunAdi);
                            ps2.executeUpdate();
                            b.baglantiKes();
                            JOptionPane.showMessageDialog(this, "Ürün kaldırıldı. Lütfen listeyi güncelleyiniz.");
                            break;
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(EkleCikar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                default:
                    break;
            }
        }
    }//GEN-LAST:event_kaldirbActionPerformed

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
            java.util.logging.Logger.getLogger(EkleCikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EkleCikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EkleCikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EkleCikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EkleCikar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cesitCB;
    private javax.swing.JLabel cesitL;
    private javax.swing.JButton ekleb;
    private javax.swing.JButton gerib;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kaldirb;
    private javax.swing.JList<String> liste;
    private javax.swing.JButton listeguncelleb;
    private javax.swing.JLabel stokL;
    private javax.swing.JSpinner stokSpinner;
    private javax.swing.JButton stokguncelleb;
    private javax.swing.JTextField urunAdiF;
    private javax.swing.JLabel urunAdiL;
    private javax.swing.JComboBox<String> urunCB;
    // End of variables declaration//GEN-END:variables
}
