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
public class timeDetik {

    double result;
    double inputValue;
    public void setInput(String inputNumber) {
        this.inputValue = Double.valueOf(inputNumber);
    }

    public double DetikToJam() {
        result = inputValue / 3600;
        return result;
    }

    public double DetikToMenit() {
        result = inputValue / 60;
        return result;
    }

    public double DetikToHari() {
        result = inputValue / 86400;
        return result;
    }

    public double DetikToMinggu() {
        result = inputValue / 604800;
        return result;
    }

    public double DetikToBulan() {
        result = inputValue / 2419200;
        return result;
    }

    public double DetikToTahun() {
        result = inputValue / 29030400;
        return result;
    }

}
