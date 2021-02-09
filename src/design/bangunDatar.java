/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import logic.kelilingBangunDatar;
import logic.LuasBangunDatar;


/**
 *
 * @author rinrin karmila
 */
public class bangunDatar extends javax.swing.JInternalFrame {

    /**
     * Creates new form volume
     */
    String inputValue, inputValue2, inputValue3, inputValue4;
    double value1, value2, value3, value4, hasil;
    int finalResult;

    public bangunDatar() {
        super("Kalkulator Konversi sederhana");
        initComponents();
        inputValue = "";
    }

//    volumeKonversi getLogicVolume =  new volumeKonversi();
    LuasBangunDatar lusBangunDatar = new LuasBangunDatar();
    kelilingBangunDatar k = new kelilingBangunDatar();
    ImageIcon myIcon = new ImageIcon("aset/apple-calculator.png");

    void hitungLuas() {
        int selectLuas = selectedLuas.getSelectedIndex();
        switch (selectLuas) {
            case 0:
                txtInput1.setText(" ");
                txtInput2.setText(" ");
                txtInput3.setText(" ");
                txtInput4.setText(" ");
                break;
            case 1:
                //persegi panjang
                String getPanjang = String.valueOf(txtInput1.getText());
                String getLebar = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getPanjang);
                lusBangunDatar.setInput2(getLebar);
                hasil = lusBangunDatar.LuasBangunDatar();
                String result = Double.toString(hasil);
                txtHasil.setText(result);
                break;
            case 2:
                //persegi
                String getSisi1 = String.valueOf(txtInput1.getText());
                String getSisis2 = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getSisi1);
                lusBangunDatar.setInput2(getSisis2);
                hasil = lusBangunDatar.LuasBangunDatar();
                String resultPersegi = Double.toString(hasil);
                txtHasil.setText(resultPersegi);
                break;
            case 3:
                //belah ketupat
                String getD1 = String.valueOf(txtInput1.getText());
                String getD2 = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getD1);
                lusBangunDatar.setInput2(getD2);
                hasil = lusBangunDatar.LuasLayangKetupatSegitiga();
                String resultKetupat = Double.toString(hasil);
                txtHasil.setText(resultKetupat);
                break;
            case 4:
                //jajar genjang  
                String getSisiMiring = String.valueOf(txtInput1.getText());
                String getSisiAlas = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getSisiMiring);
                lusBangunDatar.setInput2(getSisiAlas);
                hasil = lusBangunDatar.LuasBangunDatar();
                String resultJajarGenjang = Double.toString(hasil);
                txtHasil.setText(resultJajarGenjang);
                break;
            case 5:
                //Segitiga  
                String getAlas = String.valueOf(txtInput1.getText());
                String getTinggi = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getAlas);
                lusBangunDatar.setInput2(getTinggi);
                hasil = lusBangunDatar.LuasLayangKetupatSegitiga();
                String resultSegitiga = Double.toString(hasil);
                txtHasil.setText(resultSegitiga);
                break;
            case 6:
                //Strapesium  
                String getSisiSejajar1 = String.valueOf(txtInput1.getText());
                String getSisiSejajar2 = String.valueOf(txtInput2.getText());
                String getTinggiTrapsium = String.valueOf(txtInput3.getText());
                lusBangunDatar.setInput1(getSisiSejajar1);
                lusBangunDatar.setInput2(getSisiSejajar2);
                lusBangunDatar.setInput3(getTinggiTrapsium);
                hasil = lusBangunDatar.LuasTrapesium();
                String resultTravesium = Double.toString(hasil);
                txtHasil.setText(resultTravesium);
                break;
            case 7:
                //layang-layang  
                String getDiagonal1 = String.valueOf(txtInput1.getText());
                String getDiagonal2 = String.valueOf(txtInput2.getText());
                lusBangunDatar.setInput1(getDiagonal1);
                lusBangunDatar.setInput2(getDiagonal2);
                hasil = lusBangunDatar.LuasLayangKetupatSegitiga();
                String resultLayangLayang = Double.toString(hasil);
                txtHasil.setText(resultLayangLayang);
                break;
            case 8:
                //Lingkaran  
                String getJariJari = String.valueOf(txtInput1.getText());
                lusBangunDatar.setInput1(getJariJari);
                hasil = lusBangunDatar.LuasLingkaran();
                String resultLingkaran = Double.toString(hasil);
                txtHasil.setText(resultLingkaran);
                break;
            default:
        }
    }

    void hitungKeliling() {
        int selectKeliling = selectedKeliling.getSelectedIndex();
        switch (selectKeliling) {
            case 0:
                txtInput1.setText(" ");
                txtInput2.setText(" ");
                txtInput3.setText(" ");
                txtInput4.setText(" ");
                break;
            case 1:
                //peregi panjang
                String getPanjangKeliling = String.valueOf(txtInput1.getText());
                String getLebarKeliling = String.valueOf(txtInput2.getText());
                k.setInput1(getPanjangKeliling);
                k.setInput2(getLebarKeliling);
                hasil = k.KpersegiPanjangLayang2JajarGenjang();
                String resultPP = Double.toString(hasil);
                txtHasil.setText(resultPP);
                break;
            case 2:
                //persegi
                String getValueSisi = String.valueOf(txtInput1.getText());
                lusBangunDatar.setInput1(getValueSisi);
                hasil = lusBangunDatar.LuasBangunDatar();
                String resultPersegi = Double.toString(hasil);
                txtHasil.setText(resultPersegi);
                break;
            case 3:
                //belah ketupat
                String getValueSisi1 = String.valueOf(txtInput1.getText());
                lusBangunDatar.setInput1(getValueSisi1);
                hasil = k.KelilingPersegiWithKetupat();
                String resultKKetupat = Double.toString(hasil);
                txtHasil.setText(resultKKetupat);
                break;
            case 4:
                //jajar genjang  
                String getSisiMiringK = String.valueOf(txtInput1.getText());
                String getSisiAlasK = String.valueOf(txtInput2.getText());
                k.setInput1(getSisiMiringK);
                k.setInput2(getSisiAlasK);
                hasil = k.KpersegiPanjangLayang2JajarGenjang();
                String resultKJajarGenjang = Double.toString(hasil);
                txtHasil.setText(resultKJajarGenjang);
                break;
            case 5:
                //Segitiga  
                String getAlasSegitiga = String.valueOf(txtInput1.getText());
                String getSisiKiri = String.valueOf(txtInput2.getText());
                String getSisiKanan = String.valueOf(txtInput3.getText());
                k.setInput1(getAlasSegitiga);
                k.setInput2(getSisiKiri);
                k.setInput2(getSisiKanan);
                hasil = k.KelilingSegitiga();
                String resultKSegitiga = Double.toString(hasil);
                txtHasil.setText(resultKSegitiga);
                break;
            case 6:
                //Strapesium  
                String getSisiSejajar1 = String.valueOf(txtInput1.getText());
                String getSisiSejajar2 = String.valueOf(txtInput2.getText());
                String getSisiSejajar3 = String.valueOf(txtInput3.getText());
                String getSisiSejajar4 = String.valueOf(txtInput4.getText());
                k.setInput1(getSisiSejajar1);
                k.setInput2(getSisiSejajar2);
                k.setInput3(getSisiSejajar3);
                k.setInput4(getSisiSejajar4);
                hasil = k.KelilingTrapesium();
                String resultKTravesium = Double.toString(hasil);
                txtHasil.setText(resultKTravesium);
                break;
            case 7:
                //layang-layang  
                String getDiagonalK1 = String.valueOf(txtInput1.getText());
                String getDiagonalK2 = String.valueOf(txtInput2.getText());
                k.setInput1(getDiagonalK1);
                k.setInput2(getDiagonalK2);
                hasil = k.KpersegiPanjangLayang2JajarGenjang();
                String resultKLayangLayang = Double.toString(hasil);
                txtHasil.setText(resultKLayangLayang);
                break;
            case 8:
                //Lingkaran  
                String getDiameter = String.valueOf(txtInput1.getText());
                k.setInput1(getDiameter);
                hasil = k.KelilingLingkaran();
                String resultKLingkaran = Double.toString(hasil);
                txtHasil.setText(resultKLingkaran);
                break;
            default:
        }
    }

    ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        labelInput1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectedLuas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectedKeliling = new javax.swing.JComboBox<>();
        txtInput2 = new javax.swing.JTextField();
        labelInput3 = new javax.swing.JLabel();
        txtInput3 = new javax.swing.JTextField();
        labelInput2 = new javax.swing.JLabel();
        txtInput4 = new javax.swing.JTextField();
        labelInput4 = new javax.swing.JLabel();
        rumus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        btnLuas = new javax.swing.JButton();
        pictureLabel = new javax.swing.JLabel();
        btnKeliling = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        Title.setFont(new java.awt.Font("Sitka Heading", 3, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 0));
        Title.setText("Luas & Keliling");

        txtInput1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput1ActionPerformed(evt);
            }
        });

        txtHasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasilActionPerformed(evt);
            }
        });

        labelInput1.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        labelInput1.setText("Input");

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel2.setText("Rumus");

        selectedLuas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectedLuas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~ Luas Bangun Datar ~", "Persegi Panjang", "Persegi", "Belah Ketupat", "Jajar Genjang", "Segitiga", "Trapesium", "Layang-layang", "Lingkaran" }));
        selectedLuas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectedLuasItemStateChanged(evt);
            }
        });
        selectedLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedLuasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel3.setText("Jenis Bangun datar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/AnyConv.com__vol bulat.png"))); // NOI18N

        selectedKeliling.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectedKeliling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~ Keliling Bangun Datar ~", "Persegi Panjang", "Persegi", "Belah Ketupat", "Jajar Genjang", "Segitiga", "Trapesium", "Layang-layang", "Lingkaran" }));
        selectedKeliling.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectedKelilingItemStateChanged(evt);
            }
        });
        selectedKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedKelilingActionPerformed(evt);
            }
        });

        txtInput2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        labelInput3.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        labelInput3.setText("Input 3");

        txtInput3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput3ActionPerformed(evt);
            }
        });

        labelInput2.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        labelInput2.setText("Input 2");

        txtInput4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        labelInput4.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        labelInput4.setText("Input 4");

        rumus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rumus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rumusActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel6.setText("Hasil");

        BtnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnClear.setText("clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        btnLuas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuas.setText("Luas =");
        btnLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuasActionPerformed(evt);
            }
        });

        pictureLabel.setText("Picture");

        btnKeliling.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKeliling.setText("Keliling =");
        btnKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelilingActionPerformed(evt);
            }
        });

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/circled-i (1).png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(selectedLuas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedKeliling, javax.swing.GroupLayout.Alignment.LEADING, 0, 260, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rumus, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLuas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtInput3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                                .addComponent(txtInput1)
                                                .addComponent(labelInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(labelInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtInput2)
                                            .addComponent(txtInput4)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                            .addGap(10, 10, 10)
                                                            .addComponent(labelInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 9, Short.MAX_VALUE)))))))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(pictureLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title))
                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(labelInput1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelInput2)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelInput3)
                            .addComponent(labelInput4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(selectedKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(rumus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(pictureLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuasActionPerformed

        hitungLuas();
        


    }//GEN-LAST:event_btnLuasActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        //Untuk hapus nilai data
        inputValue = "";
        txtInput1.setText(" ");
        txtInput2.setText(" ");
        txtInput3.setText(" ");
        txtInput4.setText(" ");
        txtHasil.setText("0");
        selectedKeliling.setSelectedIndex(0);
        selectedLuas.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnClearActionPerformed

    private void txtInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput1ActionPerformed

    private void selectedLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedLuasActionPerformed


    }//GEN-LAST:event_selectedLuasActionPerformed

    private void txtHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasilActionPerformed

    private void selectedKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedKelilingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedKelilingActionPerformed

    private void txtInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput3ActionPerformed

    private void rumusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rumusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rumusActionPerformed

    private void selectedLuasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectedLuasItemStateChanged
        int pilihLuas = selectedLuas.getSelectedIndex();
            switch (pilihLuas) {
                case 0:
                    //change title
                    labelInput1.setText("value 1");
                    labelInput2.setText("value 2");
                    labelInput3.setText("value 3");
                    labelInput4.setText("value 4");
                    //disable textfield
                    txtInput1.setEnabled(false);
                    txtInput2.setEnabled(false);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" ");
                    rumus.setEditable(false);
                    break;
                case 1:
                    //persegiPanjang
                    labelInput1.setText(" Panjang ");
                    labelInput2.setText(" Lebar ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = P * L");
                    rumus.setEditable(false);
                    pictureLabel.setIcon(myIcon);
                    break;
                case 2:
                    //persegi
                    labelInput1.setText(" Sisi 1 ");
                    labelInput2.setText(" Sisi 2 ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = s * s");
                    rumus.setEditable(false);
                    break;
                case 3:
                    //belah ketupat
                    labelInput1.setText(" Diagonal 1 ");
                    labelInput2.setText(" Diagonal 2 ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = 1/2 * d1 * d2");
                    rumus.setEditable(false);
                    break;

                case 4:
                    //jajar genjang
                    labelInput1.setText(" Alas ");
                    labelInput2.setText(" Tinggi ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = alas * tinggi");
                    rumus.setEditable(false);
                    break;
                case 5:
                    //Segitiga
                    labelInput1.setText(" Alas ");
                    labelInput2.setText(" Tinggi ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText("L = 1/2 * alas * tinggi");
                    rumus.setEditable(false);
                    break;
                case 6:
                    //trapesium
                    labelInput1.setText(" Sisi Sejajar a ");
                    labelInput2.setText(" Sisi Sejajar b ");
                    labelInput3.setText(" Tinggi ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(true);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = 1/2*(a+b)*t ");
                    rumus.setEditable(false);
                    break;
                case 7:
                    //layang layang
                    labelInput1.setText(" Diagonal 1 ");
                    labelInput2.setText(" Diagonal2 ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(true);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = 1/2 * d1 * d2");
                    rumus.setEditable(false);
                    break;
                case 8:
                    //lingkaran
                    labelInput1.setText(" Jari-jari ");
                    labelInput2.setText(" ");
                    labelInput3.setText("  ");
                    labelInput4.setText(" ");
                    //disable textfield
                    txtInput1.setEnabled(true);
                    txtInput2.setEnabled(false);
                    txtInput3.setEnabled(false);
                    txtInput4.setEnabled(false);
                    rumus.setText(" L = phi * jari-jari ^ 2");
                    rumus.setEditable(false);
                    break;
                default:
        }
    }//GEN-LAST:event_selectedLuasItemStateChanged

    private void selectedKelilingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectedKelilingItemStateChanged
        int pilihKeliling = selectedKeliling.getSelectedIndex();
        switch (pilihKeliling) {
            case 0:
                //change title
                labelInput1.setText("value 1");
                labelInput2.setText("value 2");
                labelInput3.setText("value 3");
                labelInput4.setText("value 4");
                //disable textfield
                txtInput1.setEnabled(false);
                txtInput2.setEnabled(false);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" ");
                rumus.setEditable(false);
                break;
            case 1:
                //persegiPanjang
                labelInput1.setText(" Panjang ");
                labelInput2.setText(" Lebar ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(true);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" L = 2 * (P + L)");
                rumus.setEditable(false);
                break;
            case 2:
                //persegi
                labelInput1.setText(" Sisi  ");
                labelInput2.setText("  ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(false);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" K = 4 * s");
                rumus.setEditable(false);
                break;

            case 3:
                //belah ketupat
                labelInput1.setText(" Sisi ");
                labelInput2.setText("  ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(false);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" K = 4 * s");
                rumus.setEditable(false);
                break;
            case 4:
                //jajar genjang
                labelInput1.setText(" Sisi Bawah ");
                labelInput2.setText(" Sisi Miring ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(true);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" K = 2 * (a + b)");
                rumus.setEditable(false);
                break;
            case 5:
                //Segitiga
                labelInput1.setText(" Alas ");
                labelInput2.setText(" Sisi Kiri ");
                labelInput3.setText(" Sisi Kanan ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(true);
                txtInput3.setEnabled(true);
                txtInput4.setEnabled(false);
                rumus.setText("K = a + b + c");
                rumus.setEditable(false);
                break;
            case 6:
                //trapesium
                labelInput1.setText(" Sisi Sejajar 1 ");
                labelInput2.setText(" Sisi Sejajar 2 ");
                labelInput3.setText(" Sisi Sejajar 3 ");
                labelInput4.setText(" Sisi Sejajar 4 ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(true);
                txtInput3.setEnabled(true);
                txtInput4.setEnabled(true);
                rumus.setText(" K = AB + BC + CD + DA ");
                rumus.setEditable(false);
                break;
            case 7:
                //layang layang
                labelInput1.setText(" Sisi Miring Atas ");
                labelInput2.setText(" Sisi Miring bawah ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(true);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" K = 2 * (AB + AD)");
                rumus.setEditable(false);
                break;
            case 8:
                //lingkaran
                labelInput1.setText(" Diameter ");
                labelInput2.setText(" ");
                labelInput3.setText("  ");
                labelInput4.setText(" ");
                //disable textfield
                txtInput1.setEnabled(true);
                txtInput2.setEnabled(false);
                txtInput3.setEnabled(false);
                txtInput4.setEnabled(false);
                rumus.setText(" K = phi * diameter");
                rumus.setEditable(false);
                break;
            default:
        }
    }//GEN-LAST:event_selectedKelilingItemStateChanged

    private void btnKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelilingActionPerformed
        // TODO add your handling code here:
        hitungKeliling();
    }//GEN-LAST:event_btnKelilingActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
          
//        JOptionPane.showMessageDialog(null," Program ini dibuat oleh \n Nama: Rinrin Karmila \n");
    }//GEN-LAST:event_btnInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnKeliling;
    private javax.swing.JButton btnLuas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelInput1;
    private javax.swing.JLabel labelInput2;
    private javax.swing.JLabel labelInput3;
    private javax.swing.JLabel labelInput4;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextField rumus;
    private javax.swing.JComboBox<String> selectedKeliling;
    private javax.swing.JComboBox<String> selectedLuas;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    // End of variables declaration//GEN-END:variables

}
