/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.bidang;

/**
 *
 * @author user
 */
public class Persegi implements MenghitungBidang{
    private double panjang;
    private double lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return (2 * panjang) + (2 * lebar);
    }    
}
