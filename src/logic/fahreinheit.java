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
public class fahreinheit {

    double result;
    double inputNumber;

    public void setInput(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public double toReamur() {
        //°Ré = (°F − 32) / 2,25
        //re=4/9(f-32)
        return ((inputNumber - 32) / 2.25);
    }

    public double toKelvin() {
        //K = (°F + 459,67) / 1,8
        //k=5/9(f-32)+273.15
        return ((inputNumber + 459.67) / 1.8);
    }

    public double toCelcius() {
        //°C = (°F − 32) / 1,8
        //c=5/9(f-32)
        return ((inputNumber - 32) / 1.8);
    }
}
