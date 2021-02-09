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
public class timeMenit {

    double result;
    double inputValue;

    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }

    public double menitToJam() {
        result = inputValue * 60;
        return result;
    }

    public double menitToDetik() {
        result = inputValue * 60;
        return result;
    }

    public double menitToHari() {
        result = inputValue * 1440;
        return result;
    }

    public double menitToMinggu() {
        result = inputValue * 10080;
        return result;
    }

    public double menitToBulan() {
        result = inputValue * 40320;
        return result;
    }

    public double menitToTahun() {
        result = inputValue * 483840;
        return result;
    }

}
