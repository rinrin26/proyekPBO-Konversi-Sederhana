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
public class LuasBangunDatar {

    double result;
    double value1, value2,value3;

    public void setInput(String input) {
        if (!input.equals("")) {
            value1 = Double.valueOf(input);
        } else if(!"".equals(input)){
            value2 = Double.valueOf(input);
        }else if(!"".equals(input)){
            value3 = Double.valueOf(input);
        }
    }
    public void setInput1(String inputNumber) {
        this.value1 = Double.valueOf(inputNumber);
    }
    public void setInput2(String inputNumber) {
        this.value2 = Double.valueOf(inputNumber);
    }
    public void setInput3(String inputNumber) {
        this.value3 = Double.valueOf(inputNumber);
    }
    //rumus luas bangun datar
     public double LuasBangunDatar() {
        result = value1 * value2;
        return result;
       //untuk persegi = L = s * s
        // persegi panjang =  = L = p * l
        //jajargenjang = = L = s * s
    }
     public double LuasLayangKetupatSegitiga() {
        result = value1 * value2 * 0.5;
        return result;
        //L = 1/2(d1*d2) layang layang
        // L= 1/2(d1*d2) belahketuoat
         // L= 1/2(a*t) segitiga
    }
    public double LuasLingkaran() {
        //L = 3.14 * r^2 lingkaran
        result = Math.PI * Math.pow(value1, 2);
        return result;
    }
     public double LuasTrapesium() {
        //L = 1/2 * (a+b)*t
        result = 0.5 * (value1 + value2) * value3;
        return result;
    }
    
}
