/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author acer
 */
public class OperasiKalkulatorStandar {
   public String cetakProses;
   public double result,angka1,angka2, angka3;
   int operator = 0;
    
    public void setNumber (String input){ 
        if(!input.equals("")){
            if(operator==0){
                angka1=Double.valueOf(input);
            }else{
                angka2=Double.valueOf(input);
            }
        }
    }
    public void setOperator(int operation){
        this.operator = operation;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double hasil){
        this.result = hasil;
    }
     public void process(){
        switch (operator){ //Pernyataan dengan menggunakan switch, ekspresi operator yang di kontrol
            case 1: //Nilai yang diberikan 1
                result = angka1 + angka2; //Rumus perhitungan penjumlahan
                cetakProses=" + ";
                break; 
            case 2: //Nilai yang diberikan 2
                result = angka1 - angka2; //Rumus perhitungan pengurangan
                cetakProses=" - "; 
                break; 
            case 3: //Nilai yang diberikan 3
                result = angka1 * angka2; //Rumus perhitungan perkalian
                cetakProses=" * "; 
                break; 
            case 4: //Nilai yang diberikan 4
                result = angka1 / angka2; //Rumus perhitungan pembagian
                cetakProses=" / "; 
                break; 
                
        }
        angka3 = angka1; //Nilai result disimpan di variabel number1
        angka1 = result;
    }
    
}
