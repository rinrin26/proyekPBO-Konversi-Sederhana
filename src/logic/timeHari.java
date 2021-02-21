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
public class timeHari {
     double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }
    
    public double HariToJam () {
        result = inputValue * 24;
        return result;
    }
    public double HariToMenit () {
        result = inputValue * 1440;
        return result;
    }
    public double HariToDetik () {
        result = inputValue * 86400;
        return result;
    }
    public double HariToBulan () {
        result = inputValue / 30;
        return result;
    }
    public double HariToTahun () {
        result = inputValue / 365;
        return result;
    }
    public double HariToMinggu1 () {
        result = inputValue / 7;
        return result;
    }
    
}
