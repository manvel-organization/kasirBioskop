
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manvel
 */
public class frame_kasirBioskop extends javax.swing.JFrame {
    int reguler,premier,harga,beli,total,bayar,kembali;
    /**
     * Creates new form frame_kasirBioskop
     */
    public frame_kasirBioskop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kursi = new javax.swing.JComboBox<>();
        rb_reguler = new javax.swing.JRadioButton();
        rb_premier = new javax.swing.JRadioButton();
        txt_judulFilm = new javax.swing.JTextField();
        txt_hargaTiket = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_namaCustomer = new javax.swing.JTextField();
        txt_jumlahTiket = new javax.swing.JTextField();
        txt_totalBayar = new javax.swing.JTextField();
        txt_tunai = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penjualan Tiket Bioskop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul Film");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kursi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Tiket");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Tiket");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        kursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "A", "B", "C" }));
        kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiActionPerformed(evt);
            }
        });
        jPanel1.add(kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        rb_reguler.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_reguler.setForeground(new java.awt.Color(255, 255, 255));
        rb_reguler.setText("Reguler");
        rb_reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_regulerActionPerformed(evt);
            }
        });
        jPanel1.add(rb_reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        rb_premier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_premier.setForeground(new java.awt.Color(255, 255, 255));
        rb_premier.setText("Premier");
        rb_premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_premierActionPerformed(evt);
            }
        });
        jPanel1.add(rb_premier, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        txt_judulFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_judulFilmActionPerformed(evt);
            }
        });
        jPanel1.add(txt_judulFilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, -1));

        txt_hargaTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaTiketActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hargaTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Pembeli"));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nama Customer");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Jumlah Pesanan Tiket");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total Pembayaran");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Tunai");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Kembalian");

        txt_namaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaCustomerActionPerformed(evt);
            }
        });

        txt_jumlahTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahTiketActionPerformed(evt);
            }
        });
        txt_jumlahTiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahTiketKeyReleased(evt);
            }
        });

        txt_tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tunaiActionPerformed(evt);
            }
        });
        txt_tunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tunaiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_totalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txt_jumlahTiket)
                            .addComponent(txt_namaCustomer)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txt_tunai))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_namaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_jumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 310, 210));

        btn_input.setBackground(new java.awt.Color(204, 204, 204));
        btn_input.setText("Input Data");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        btn_keluar.setBackground(new java.awt.Color(204, 204, 204));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        btn_print.setBackground(new java.awt.Color(204, 204, 204));
        btn_print.setText("Print Data");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 260, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiActionPerformed
        // TODO add your handling code here:
        //menentukan harga setiap kursi
        if(kursi.getSelectedItem().equals("Pilih Kursi"))
        {
        buttonGroup1.clearSelection();
        txt_hargaTiket.setText("");
        }
        else if(kursi.getSelectedItem().equals("A"))
        {
            reguler=50000;
            premier=100000;
        }
        else if(kursi.getSelectedItem().equals("B"))
            {
            reguler=45000;
            premier=95000;
        }
        else if(kursi.getSelectedItem().equals("C"))
            {
            reguler=40000;
            premier=90000;
        }
    }//GEN-LAST:event_kursiActionPerformed

    private void rb_regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_regulerActionPerformed
        // TODO add your handling code here:
        if(rb_reguler.isSelected())
        {
            rb_premier.setSelected(false);
            txt_hargaTiket.setText(String.valueOf(reguler));
        }
    }//GEN-LAST:event_rb_regulerActionPerformed

    private void rb_premierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_premierActionPerformed
        // TODO add your handling code here:
        if(rb_reguler.isSelected())
        {
            rb_reguler.setSelected(false);
            txt_hargaTiket.setText(String.valueOf(premier));
        }
    }//GEN-LAST:event_rb_premierActionPerformed

    private void txt_namaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaCustomerActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        int answer=JOptionPane.showConfirmDialog(null,"Anda akan keluar", "Keluar", JOptionPane.OK_OPTION);
        {
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        txt_area.setText(
        "Judul Film\t\t: "+txt_judulFilm.getText()+"\n"+
        "Nama Pembeli\t\t: "+txt_namaCustomer.getText()+"\n"+
        "Jumlah Pesanan Tiket\t: "+txt_jumlahTiket.getText()+"\n"+
        "Total Pembayaran\t: "+txt_totalBayar.getText()+"\n"+
        "Tunai Pembayaran\t: "+txt_tunai.getText()+"\n"+
        "Kembalian\t\t: "+txt_kembalian.getText()+"\n");
                 
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_jumlahTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahTiketActionPerformed
        // TODO add your handling code here:
        //menginputkan jumlah tiket dan total pembayaran
        beli=Integer.parseInt(txt_jumlahTiket.getText());
        harga=Integer.parseInt(txt_hargaTiket.getText());
        total=bayar*harga;
        txt_totalBayar.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_jumlahTiketActionPerformed

    private void txt_tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tunaiActionPerformed
        // TODO add your handling code here:
        //menginputkan jumlah tiket dan total pembayaran
        bayar=Integer.parseInt(txt_tunai.getText());
        kembali=Integer.parseInt(txt_totalBayar.getText());
        total=bayar-kembali;
        txt_kembalian.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_tunaiActionPerformed

    private void txt_jumlahTiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahTiketKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.parseInt(txt_hargaTiket.getText());
        b=Integer.parseInt(txt_jumlahTiket.getText());
        c=a*b;
        txt_totalBayar.setText(""+c);
    }//GEN-LAST:event_txt_jumlahTiketKeyReleased

    private void txt_tunaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tunaiKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.parseInt(txt_tunai.getText());
        b=Integer.parseInt(txt_totalBayar.getText());
        c=a-b;
        txt_kembalian.setText(""+c);
    }//GEN-LAST:event_txt_tunaiKeyReleased

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_hargaTiket.setText("");
        kursi.setSelectedIndex(0);
        txt_namaCustomer.setText("");
        txt_judulFilm.setText("");
        txt_totalBayar.setText("");
        txt_jumlahTiket.setText("");
        txt_tunai.setText("");
        txt_kembalian.setText("");
        txt_area.setText("");
        rb_premier.setSelected(false);
        rb_reguler.setSelected(false);
    }//GEN-LAST:event_btn_inputActionPerformed

    private void txt_hargaTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaTiketActionPerformed

    private void txt_judulFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_judulFilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_judulFilmActionPerformed

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
            java.util.logging.Logger.getLogger(frame_kasirBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_kasirBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_kasirBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_kasirBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_kasirBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_print;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kursi;
    private javax.swing.JRadioButton rb_premier;
    private javax.swing.JRadioButton rb_reguler;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_hargaTiket;
    private javax.swing.JTextField txt_judulFilm;
    private javax.swing.JTextField txt_jumlahTiket;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_namaCustomer;
    private javax.swing.JTextField txt_totalBayar;
    private javax.swing.JTextField txt_tunai;
    // End of variables declaration//GEN-END:variables
}
