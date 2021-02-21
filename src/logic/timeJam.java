/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 *@author rinrin karmila
 */
public class timeJam {
    double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }
     public double JamToHari () {
        result = inputValue / 24;
        return result;
    }
    public double JamToDetik () {
        result = inputValue * 3600;
        return result;
    }
    public double JamToMenit () {
        result = inputValue * 60;
        return result;
    }
    //belum bener
    public double JamToMinggu () {
        result = inputValue / 168;
        return result;
    }
    public double JamToBulan () {
        result = inputValue / 720;
        return result;
    }
    public double JamToTahun () {
        result = inputValue / 8640;
        return result;
    }
    
}
