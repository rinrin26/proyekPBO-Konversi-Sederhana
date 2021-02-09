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
public class kelvin {

    double result;
    double inputNumber;

    public void setInput(int inputNumber) {
        this.inputNumber = inputNumber;
    }
 public double toFahrenheit() {
        //°F = K × 1,8 − 459,67
        //k=9/5(k-275.15)+32
        return (inputNumber * 1.8 - 459.67);
    }

    public double toReamur() {
        //°Ré = (K − 273,15) × 0,8
        //4/5(k-375.15)
        return ((inputNumber - 273.15) * 0.8);
    }

    public double toCelcius() {
        //°C = K − 273,15
        return (inputNumber - 273.15);
    }
    }
