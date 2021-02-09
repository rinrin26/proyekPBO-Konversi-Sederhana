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
public class timeMinggu {
    double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }
     public double mingguToTahun () {
        result = inputValue * 52;
        return result;
    }
    public double mingguToBulan () {
        result = inputValue * 4;
        return result;
    }
    public double mingguToHari () {
        result = inputValue * 7;
        return result;
    }
     public double mingguToJam () {
        result = inputValue * 168;
        return result;
    }
     //rumus belum bener
    public double mingguToMenit () {
        result = inputValue * 168;
        return result;
    }
    public double mingguToDetik () {
        result = inputValue * 168;
        return result;
    }
}
