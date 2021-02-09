/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author rinrin karmila
 *
 */
public class CelciusSuhu {

    double result;
    double inputNumber;

    public void setInput(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public double toFahrenheit() {

        //°F = °C × 1,8 + 32
        //f = 9/5*c+32
        result = (inputNumber * 1.8 + 32);
        return result;
    }

    public double toReamur() {
        //°Ré = °C × 0,8
        //re= 4/5*c
        result = (inputNumber * 0.8);
        return result;
    }

    public double toKelvin() {
        //K = °C + 273,15
        //k=c+273.15
        result = (273.15 + inputNumber);
        return result;
    }
}
