/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import logic.timeBulan;
import logic.timeDetik;
import logic.timeHari;
import logic.timeJam;
import logic.timeMenit;
import logic.timeMinggu;
import logic.timeTahun;

/**
 *
 * @author rinrin karmila
 */
public class time extends javax.swing.JInternalFrame {

    /**
     *  @author rinrin karmila
     */
 String number;
 double hari,detik,menit,jam,bulan,tahun,minggu;
 String outputHari,outputDetik,outputMenit,outputJam,outputBulan,outputMinggu,outputTahun;

    public time() {
         super("Kalkulator Konversi sederhana");
        
        initComponents();
        number="";
    }
    

    public void getNumber(javax.swing.JButton button){
        number += button.getText(); //Mengambil nilai dari button dan diubah ke tipe string dan ditampung divariabel number
        txtInput.setText(number); //Merubah nilai data ke string agar dapat ditampilkan di hasil 
    }
    void konversiHari () {
        timeHari convertHari = new timeHari();
        convertHari.setInput(number);
        String getValue = txtInput.getText();
        hari = Double.parseDouble(getValue);
        jam = convertHari.HariToJam();//celcius*0.8+32;
        menit = convertHari.HariToMenit() ;
        detik = convertHari.HariToDetik();
        minggu = convertHari.HariToMinggu();
        bulan=convertHari.HariToBulan();
        tahun= convertHari.HariToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
        //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
        
    }
    void konversiMenit () {
        timeMenit convertMenit = new timeMenit();
        convertMenit.setInput(number);
        String getValue = txtInput.getText();
        hari = convertMenit.menitToHari();
        jam = convertMenit.menitToJam();//celcius*0.8+32;
        menit =  Double.parseDouble(getValue);//celcius*0.8;
        detik = convertMenit.menitToDetik();
        minggu = convertMenit.menitToMinggu();
        bulan= convertMenit.menitToBulan();
        tahun= convertMenit.menitToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    void konversiDetik () {
        timeDetik convertDetik = new timeDetik();
        convertDetik.setInput(number);
         String getValue = txtInput.getText();
        hari = convertDetik.DetikToHari();
        jam = convertDetik.DetikToJam();
        menit =  convertDetik.DetikToMenit();
        detik = Double.parseDouble(getValue);
        minggu = convertDetik.DetikToMinggu();
        bulan= convertDetik.DetikToBulan();
        tahun=convertDetik.DetikToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    void konversiJam () {
        timeJam convertJam = new timeJam();
        convertJam.setInput(number);
         String getValue = txtInput.getText();
        hari = convertJam.JamToHari();
        jam = Double.parseDouble(getValue);
        menit =  convertJam.JamToMenit();
        detik = convertJam.JamToDetik();
        minggu = convertJam.JamToMinggu();
        bulan= convertJam.JamToBulan();
        tahun=convertJam.JamToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    void konversiTahun (){
        timeTahun convertTahun = new timeTahun();
        convertTahun.setInput(number);
     String getValue = txtInput.getText();
        hari = convertTahun.tahunToHari();
        jam = convertTahun.tahunToJam();
        menit = convertTahun.tahunToMenit();
        detik = convertTahun.tahunToDetik();
        minggu =convertTahun.tahunTominggu();
        bulan=convertTahun.tahunToBulan();
        tahun=Double.parseDouble(getValue);

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    void konversiBulan () {
        timeBulan convertBulan = new timeBulan();
        convertBulan.setInput(number);
       String getValue = txtInput.getText();
        hari = convertBulan.bulanToHari();
        jam = convertBulan.bulanToJam();
        menit =  convertBulan.bulanToMenit() ;//celcius*0.8;
        detik = convertBulan.bulanToDetik();
        minggu = convertBulan.bulanToMinggu();
        bulan=Double.parseDouble(getValue);
        tahun=convertBulan.bulanToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    void konversiMinggu () {
        timeMinggu convertMinggu = new timeMinggu();
        convertMinggu.setInput(number);
       String getValue = txtInput.getText();
        hari = convertMinggu.mingguToHari();
        jam = convertMinggu.mingguToJam();
        menit = convertMinggu.mingguToMenit() ;
        detik = convertMinggu.mingguToDetik();
        minggu =Double.parseDouble(getValue);;
        bulan=convertMinggu.mingguToBulan();
        tahun=convertMinggu.mingguToTahun();

         //=========== result hari =================
        outputHari= Double.toString(hari);
        txtHari.setText(outputHari);
         //=========== result jam =================
        outputJam= Double.toString(jam);
        txtJam.setText(outputJam);
        //=========== result menit =================
        outputMenit = Double.toString(menit);
        txtMenit.setText(outputMenit);
        //=========== result detik =================
        outputDetik = Double.toString(detik);
        txtSecond.setText(outputDetik);
        //=========== result tahun =================
        outputTahun = Double.toString(tahun);
        txtTahun.setText(outputTahun);
        //=========== result bulan =================
        outputBulan = Double.toString(bulan);
        txtBulan.setText(outputBulan);
        //=========== result minggu =================
        outputMinggu = Double.toString(bulan);
        txtMinggu.setText(outputMinggu);
         //============readonly===========
        txtHari.setEditable(false);
        txtJam.setEditable(false);
        txtMenit.setEditable(false);
        txtSecond.setEditable(false);
        txtBulan.setEditable(false);
        txtTahun.setEditable(false);
        txtMinggu.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Btnsatu = new javax.swing.JButton();
        Btndua = new javax.swing.JButton();
        Btntiga = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnTitik = new javax.swing.JButton();
        BtnEqual = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSecond = new javax.swing.JTextField();
        txtMenit = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        txtJam = new javax.swing.JTextField();
        txtHari = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        txtBulan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMinggu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdDetik = new javax.swing.JRadioButton();
        rdMenit = new javax.swing.JRadioButton();
        rdJam = new javax.swing.JRadioButton();
        rdHari = new javax.swing.JRadioButton();
        rdBulan = new javax.swing.JRadioButton();
        rdTahun = new javax.swing.JRadioButton();
        rdMinggu = new javax.swing.JRadioButton();
        btnInfo = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(240, 149, 221));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Btnsatu.setText("1");
        Btnsatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsatuActionPerformed(evt);
            }
        });

        Btndua.setText("2");
        Btndua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnduaActionPerformed(evt);
            }
        });

        Btntiga.setText("3");
        Btntiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntigaActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        BtnTitik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnTitik.setText(".");
        BtnTitik.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTitik.setMargin(new java.awt.Insets(3, 14, 3, 14));
        BtnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTitikActionPerformed(evt);
            }
        });

        BtnEqual.setText("=");
        BtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualActionPerformed(evt);
            }
        });

        BtnClear.setText("clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Btnsatu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btndua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnsatu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btndua, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel2.setText("Input Value");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Pilih Konversi");

        txtSecond.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecondActionPerformed(evt);
            }
        });

        txtMenit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Title.setFont(new java.awt.Font("Sitka Heading", 3, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 51));
        Title.setText("Time");

        txtJam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });

        txtHari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHariActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Second");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Menit");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Jam");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Hari");

        txtTahun.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtBulan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBulanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Bulan");

        txtMinggu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Minggu");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/time hijau.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Tahun");

        txtInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        radioGroup.add(rdDetik);
        rdDetik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdDetik.setText(" Detik");

        radioGroup.add(rdMenit);
        rdMenit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdMenit.setText(" Menit");

        radioGroup.add(rdJam);
        rdJam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdJam.setText(" Jam");

        radioGroup.add(rdHari);
        rdHari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdHari.setText(" Hari");

        radioGroup.add(rdBulan);
        rdBulan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdBulan.setText(" Bulan");

        radioGroup.add(rdTahun);
        rdTahun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdTahun.setText(" Tahun");

        radioGroup.add(rdMinggu);
        rdMinggu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdMinggu.setText(" Minggu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdDetik)
                        .addGap(18, 18, 18)
                        .addComponent(rdTahun))
                    .addComponent(rdHari)
                    .addComponent(rdBulan)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdMenit)
                            .addComponent(rdJam))
                        .addGap(18, 18, 18)
                        .addComponent(rdMinggu)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdDetik)
                    .addComponent(rdTahun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMenit)
                    .addComponent(rdMinggu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdJam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdHari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBulan)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtInput)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSecond, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtMenit)
                            .addComponent(txtJam)
                            .addComponent(txtHari)
                            .addComponent(txtBulan)
                            .addComponent(txtMinggu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTahun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(Title)
                        .addGap(247, 247, 247))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Title)
                            .addComponent(jLabel3))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBulan, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMenit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(93, 93, 93))
        );

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/circled-i (1).png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 869, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnsatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsatuActionPerformed
        getNumber(Btnsatu);
    }//GEN-LAST:event_BtnsatuActionPerformed

    private void BtnduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnduaActionPerformed
        getNumber(Btndua);
    }//GEN-LAST:event_BtnduaActionPerformed

    private void BtntigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntigaActionPerformed
        getNumber(Btntiga);
    }//GEN-LAST:event_BtntigaActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        getNumber(Btn4);
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        getNumber(Btn5);
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        getNumber(Btn6);
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        getNumber(Btn7);
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        getNumber(Btn8);
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        getNumber(Btn9);
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTitikActionPerformed
        getNumber(BtnTitik);
    }//GEN-LAST:event_BtnTitikActionPerformed

    private void BtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualActionPerformed
        if (rdHari.isSelected()) {
            konversiHari();
        } else if (rdJam.isSelected()) {
            konversiJam();
        } else if (rdMenit.isSelected()) {
            konversiMenit();
        } else if (rdDetik.isSelected()) {
            konversiDetik();
        } else if (rdBulan.isSelected()) {
            konversiBulan();
        } else if (rdMinggu.isSelected()) {
            konversiMinggu();
        } else {
            konversiTahun();
        }
       
    }//GEN-LAST:event_BtnEqualActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        //Untuk hapus nilai data
        number ="";
        txtInput.setText("0");
        txtHari.setText("0");
        txtJam.setText("0");
        txtMenit.setText("0");
        txtMinggu.setText("0");
        txtTahun.setText("0");
        txtBulan.setText("0");
        txtSecond.setText("0");
    }//GEN-LAST:event_BtnClearActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        getNumber(Btn0);       // TODO add your handling code here:
    }//GEN-LAST:event_Btn0ActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

    private void txtHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHariActionPerformed

    private void txtSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecondActionPerformed

    private void txtBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBulanActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        
//        JOptionPane.showMessageDialog(null," Program ini dibuat oleh \n Nama: Rinrin Karmila \n");
    }//GEN-LAST:event_btnInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnEqual;
    private javax.swing.JButton BtnTitik;
    private javax.swing.JButton Btndua;
    private javax.swing.JButton Btnsatu;
    private javax.swing.JButton Btntiga;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnInfo;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JRadioButton rdBulan;
    private javax.swing.JRadioButton rdDetik;
    private javax.swing.JRadioButton rdHari;
    private javax.swing.JRadioButton rdJam;
    private javax.swing.JRadioButton rdMenit;
    private javax.swing.JRadioButton rdMinggu;
    private javax.swing.JRadioButton rdTahun;
    private javax.swing.JTextField txtBulan;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtMenit;
    private javax.swing.JTextField txtMinggu;
    private javax.swing.JTextField txtSecond;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
