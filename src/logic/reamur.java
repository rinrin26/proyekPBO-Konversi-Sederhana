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
public class reamur {

    double result;
    double inputNumber;

    public void setInput(int inputNumber) {
        this.inputNumber = inputNumber;
    }

   public double toFahrenheit() {
        //°F = °Ré × 2,25 + 32
        //f= 9/4*r+32
        return (inputNumber * 2.25 + 32);
    }

    public double toKelvin() {
        //K = °Ré / 0,8 + 273,15
        //5/4*r+273.15
        
        return (inputNumber / 0.8 + 237.15);
    }

    public double toCelcius() {
        //°C = °Ré / 0,8
        //c=5/4*r
        return (inputNumber / 0.8);
    }

}
