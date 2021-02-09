/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logic.CelciusSuhu;
import logic.fahreinheit;
import logic.kelvin;
import logic.reamur;

/**
 *
 * @author rinrin karmila

 */
public class SuhuKalkulator extends javax.swing.JInternalFrame {

    /**
     * Creates new form Suhu
     */
    String inputNumber;
    //new variabel for logic
    double celcius;
    double fahreinheit;
    double reamur;
    double kelvin;
    String outputConvertCelcius;
    String outputConvertFahreinheit;
    String outputConvertReamur;
    String outputConvertKelvin;

    public SuhuKalkulator() {
        super("Kalkulator Konversi sederhana");
        initComponents();
        inputNumber = "";
    }

    public void getNumber(javax.swing.JButton button) {
        inputNumber += button.getText(); //Mengambil nilai dari button dan diubah ke tipe string dan ditampung divariabel number
        txtInput.setText(inputNumber);
    }

    private void hitungCelcius() {
        CelciusSuhu celciusText = new CelciusSuhu();
        celciusText.setInput(Integer.parseInt(inputNumber));
        String getinput = txtInput.getText();

        celcius = Double.parseDouble(getinput);
        fahreinheit = celciusText.toFahrenheit();//celcius*0.8+32;
        reamur = celciusText.toReamur();//celcius*0.8;
        kelvin = celciusText.toKelvin();

         //=========== result celcius =================
        outputConvertCelcius = Double.toString(celcius);
        resultCelcius.setText(outputConvertCelcius);
         //=========== result fahreinheit =================
        outputConvertFahreinheit = Double.toString(fahreinheit);
        resultFahreinheit.setText(outputConvertFahreinheit);
        //=========== result reamur =================
        outputConvertReamur = Double.toString(reamur);
        resultReamur.setText(outputConvertReamur);
        //=========== result kelvin =================
        outputConvertKelvin = Double.toString(kelvin);
        resultKelvin.setText(outputConvertKelvin);
         //============readonly===========
        resultCelcius.setEditable(false);
        resultFahreinheit.setEditable(false);
        resultKelvin.setEditable(false);
        resultReamur.setEditable(false);
      
    }

    public void hitungFahreinheit() {
        fahreinheit convertFahreinheit = new fahreinheit();
        convertFahreinheit.setInput(Integer.parseInt(inputNumber));
        String getValueText = txtInput.getText();
        
        celcius = convertFahreinheit.toCelcius();
        fahreinheit = Double.parseDouble(getValueText);
        reamur = convertFahreinheit.toReamur();
        kelvin =  convertFahreinheit.toKelvin();
        
        //=========== result celcius =================
        outputConvertCelcius = Double.toString(celcius);
        resultCelcius.setText(outputConvertCelcius);
         //=========== result fahreinheit =================
        outputConvertFahreinheit = Double.toString(fahreinheit);
        resultFahreinheit.setText(outputConvertFahreinheit);
        //=========== result reamur =================
        outputConvertReamur = Double.toString(reamur);
        resultReamur.setText(outputConvertReamur);
        //=========== result kelvin =================
        outputConvertKelvin = Double.toString(kelvin);
        resultKelvin.setText(outputConvertKelvin);
         //============readonly===========
        resultCelcius.setEditable(false);
        resultFahreinheit.setEditable(false);
        resultKelvin.setEditable(false);
        resultReamur.setEditable(false);
    }
 public void hitungReamur() {
        reamur convertReamur = new reamur();
        convertReamur.setInput(Integer.parseInt(inputNumber));
        String getValueText = txtInput.getText();
        
         celcius = convertReamur.toCelcius();
        fahreinheit = convertReamur.toFahrenheit();
        reamur = Double.parseDouble(getValueText);
        kelvin = convertReamur.toKelvin();

          //=========== result celcius =================
        outputConvertCelcius = Double.toString(celcius);
        resultCelcius.setText(outputConvertCelcius);
         //=========== result fahreinheit =================
        outputConvertFahreinheit = Double.toString(fahreinheit);
        resultFahreinheit.setText(outputConvertFahreinheit);
        //=========== result reamur =================
        outputConvertReamur = Double.toString(reamur);
        resultReamur.setText(outputConvertReamur);
        //=========== result kelvin =================
        outputConvertKelvin = Double.toString(kelvin);
        resultKelvin.setText(outputConvertKelvin);
         //============readonly===========
        resultCelcius.setEditable(false);
        resultFahreinheit.setEditable(false);
        resultKelvin.setEditable(false);
        resultReamur.setEditable(false);
    }
  public void hitungKelvin() {
        kelvin convertKelvin = new kelvin();
        convertKelvin.setInput(Integer.parseInt(inputNumber));
        String getValueText = txtInput.getText();
        
         celcius = convertKelvin.toCelcius();
        fahreinheit = convertKelvin.toFahrenheit();
        reamur = convertKelvin.toReamur();
        kelvin = Double.parseDouble(getValueText); 

          //=========== result celcius =================
        outputConvertCelcius = Double.toString(celcius);
        resultCelcius.setText(outputConvertCelcius);
         //=========== result fahreinheit =================
        outputConvertFahreinheit = Double.toString(fahreinheit);
        resultFahreinheit.setText(outputConvertFahreinheit);
        //=========== result reamur =================
        outputConvertReamur = Double.toString(reamur);
        resultReamur.setText(outputConvertReamur);
        //=========== result kelvin =================
        outputConvertKelvin = Double.toString(kelvin);
        resultKelvin.setText(outputConvertKelvin);
         //============readonly===========
        resultCelcius.setEditable(false);
        resultFahreinheit.setEditable(false);
        resultKelvin.setEditable(false);
        resultReamur.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
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
        txtInput = new javax.swing.JTextField();
        resultCelcius = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnFahreinheit = new javax.swing.JRadioButton();
        btnReamur = new javax.swing.JRadioButton();
        btnKelvin = new javax.swing.JRadioButton();
        btnCelcius = new javax.swing.JRadioButton();
        resultReamur = new javax.swing.JTextField();
        resultFahreinheit = new javax.swing.JTextField();
        resultKelvin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 183, 231));
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

        txtInput.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        resultCelcius.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultCelciusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        jLabel1.setText("Input Suhu awal");

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel3.setText("Pilih Konversi");

        jPanel1.setBackground(new java.awt.Color(255, 125, 217));

        btnFahreinheit.setBackground(new java.awt.Color(255, 118, 208));
        buttonGroup2.add(btnFahreinheit);
        btnFahreinheit.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        btnFahreinheit.setText("Fahreinheit");

        btnReamur.setBackground(new java.awt.Color(255, 118, 225));
        buttonGroup2.add(btnReamur);
        btnReamur.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        btnReamur.setText("Reamur");

        btnKelvin.setBackground(new java.awt.Color(255, 111, 223));
        buttonGroup2.add(btnKelvin);
        btnKelvin.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        btnKelvin.setText("Kelvin");

        btnCelcius.setBackground(new java.awt.Color(255, 126, 221));
        buttonGroup2.add(btnCelcius);
        btnCelcius.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        btnCelcius.setText("Celcius");
        btnCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelciusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCelcius)
                    .addComponent(btnKelvin)
                    .addComponent(btnFahreinheit)
                    .addComponent(btnReamur))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFahreinheit)
                .addGap(18, 18, 18)
                .addComponent(btnReamur)
                .addGap(18, 18, 18)
                .addComponent(btnKelvin)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        resultReamur.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultReamurActionPerformed(evt);
            }
        });

        resultFahreinheit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultFahreinheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFahreinheitActionPerformed(evt);
            }
        });

        resultKelvin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultKelvinActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Title.setFont(new java.awt.Font("Sitka Heading", 3, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 51));
        Title.setText("Suhu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Title)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel4.setText("Celcius");

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel5.setText("Fahreinheit");

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel6.setText("Reamur");

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 0, 24)); // NOI18N
        jLabel7.setText("Kelvin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Hasil Konversi");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aset/suhuPicture.png"))); // NOI18N

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtInput)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(resultReamur, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                        .addComponent(resultCelcius))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(resultFahreinheit, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(resultKelvin)))
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resultCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultFahreinheit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resultReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(58, 58, 58))))
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
        if (btnCelcius.isSelected()) {
            hitungCelcius();
        }else if(btnFahreinheit.isSelected()){
            hitungFahreinheit();
        }else if(btnReamur.isSelected()){
            hitungReamur();
        }else {
            hitungKelvin();
        }
    }//GEN-LAST:event_BtnEqualActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        //Untuk hapus nilai data
        inputNumber = "";
        txtInput.setText("0");
        resultCelcius.setText("0");
        resultFahreinheit.setText("0");
        resultKelvin.setText("0");
        resultReamur.setText("0");
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnClearActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        getNumber(Btn0);       // TODO add your handling code here:
    }//GEN-LAST:event_Btn0ActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

    private void btnCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCelciusActionPerformed

    private void resultReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultReamurActionPerformed
        // TODO add your handling code here:
        resultReamur.setEditable(false);
    }//GEN-LAST:event_resultReamurActionPerformed

    private void resultKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultKelvinActionPerformed
        // TODO add your handling code here:
        resultKelvin.setEditable(false);
    }//GEN-LAST:event_resultKelvinActionPerformed

    private void resultCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultCelciusActionPerformed
        // TODO add your handling code here:
        resultCelcius.setEditable(false);
    }//GEN-LAST:event_resultCelciusActionPerformed

    private void resultFahreinheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFahreinheitActionPerformed
        // TODO add your handling code here:
        resultFahreinheit.setEditable(false);
    }//GEN-LAST:event_resultFahreinheitActionPerformed

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
    private javax.swing.JRadioButton btnCelcius;
    private javax.swing.JRadioButton btnFahreinheit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JRadioButton btnKelvin;
    private javax.swing.JRadioButton btnReamur;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField resultCelcius;
    private javax.swing.JTextField resultFahreinheit;
    private javax.swing.JTextField resultKelvin;
    private javax.swing.JTextField resultReamur;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}