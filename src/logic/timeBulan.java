/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author rinrin karmila
 */
public class timeBulan {
    
    double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }
    public double bulanToTahun() {
        result = inputValue * 12;
        return result;
    }
     public double bulanToMinggu() {
        result = inputValue * 4;
        return result;
    }
      public double bulanToHari() {
        result = inputValue * 30;
        return result;
    }
       public double bulanToJam() {
        result = inputValue * 720;
        return result;
    }
        public double bulanToMenit() {
        result = inputValue * 40320;
        return result;
    } public double bulanToDetik() {
        result = inputValue * 2419200;
        return result;
    }
    
        
}
