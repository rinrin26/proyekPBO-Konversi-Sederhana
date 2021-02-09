/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author  rinrin karmila
 */
public class kelilingBangunDatar {

    double result;
    double value1, value2, value3, value4;

    public void setInput1(String inputNumber) {
        this.value1 = Double.valueOf(inputNumber);
    }
    public void setInput3(String inputNumber) {
        this.value3 = Double.valueOf(inputNumber);
    }

    public void setInput2(String inputNumber) {
        this.value2 = Double.valueOf(inputNumber);
    }

    public void setInput4(String inputNumber) {
        this.value4 = Double.valueOf(inputNumber);
    }

    public double KelilingLingkaran() {
        //K = 3.14 * d
        result = Math.PI * value1;
        return result;
    }

    public double KelilingPersegiWithKetupat() {
        //K = 4 * s persegi dan belah ketupat
        result = 4 * value1;
        return result;
    }

    public double KpersegiPanjangLayang2JajarGenjang() {
        //K = 2 * (p+L) persegi panjang
        //K = 2 * sisimiringatas + siismiringbawah
        //K = 2 * (a+b)
        result = 2 * (value1 + value2);
        return result;
    }

    public double KelilingSegitiga() {
        //K = a+b+t
        result = value1 + value2 + value3;
        return result;
    }

    public double KelilingTrapesium() {
        //K = ab + bc + cd + da => semua sisi 
        result = value1 + value2 + value3 + value4;
        return result;
    }
}
