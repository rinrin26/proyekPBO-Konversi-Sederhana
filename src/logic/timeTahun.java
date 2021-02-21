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
public class timeTahun {

    double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }

    public double tahunToBulan() {
        result = inputValue * 12;
        return result;
    }

    public double tahunTominggu() {
        result = inputValue * 52;
        return result;
    }

    public double tahunToHari() {
        result = inputValue * 365;
        return result;
    }

    public double tahunToJam() {
        result = inputValue * 8760;
        return result;
    }

    public double tahunToDetik() {
        result = inputValue * 31536000;
        return result;
    }

    public double tahunToMenit() {
        result = inputValue * 525600;
        return result;
    }

}
