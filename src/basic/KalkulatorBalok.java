/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import basic.ruang.Balok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class KalkulatorBalok extends JFrame implements ActionListener{
    JLabel lTitle, lPanjang, lLebar, lTinggi, lHasil, lLuas, lKeliling, lVolume, lBalok, lLuasPermukaan;
    JTextField tfPanjang, tfLebar, tfTinggi;
    JButton btnHitung, btnReset;
    
    public KalkulatorBalok(String title){
        super(title);
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        lTitle = new JLabel(title);
        lPanjang = new JLabel("Panjang");
        lTinggi = new JLabel("Tinggi");
        lLebar = new JLabel("Lebar");
        lHasil = new JLabel("Hasil : ");
        lLuas = new JLabel();
        lKeliling = new JLabel();
        lVolume = new JLabel();
        lLuasPermukaan = new JLabel();
        
        tfPanjang = new JTextField();
        tfLebar = new JTextField();
        tfTinggi = new JTextField();
        
        btnHitung = new JButton("HITUNG");
        btnReset = new JButton("RESET");
        
        
        add(lTitle);
        add(lPanjang);
        add(lLebar);
        add(lTinggi);
        add(lHasil);
        add(lLuas);
        add(lKeliling);
        add(lVolume);
        add(lLuasPermukaan);
        add(tfPanjang);
        add(tfLebar);
        add(tfTinggi);
        add(btnHitung);
        add(btnReset);
        
        lTitle.setBounds(100, 15, 200, 20);
        lPanjang.setBounds(25, 40, 50, 20);
        lLebar.setBounds(25, 70, 50, 20);
        lTinggi.setBounds(25, 100, 50, 20);
        
        tfPanjang.setBounds(100, 40, 200, 20);
        tfLebar.setBounds(100, 70, 200, 20);
        tfTinggi.setBounds(100, 100, 200, 20);
        
        lHasil.setBounds(60, 130, 50, 20);
        
        lLuas.setBounds(25, 160, 300, 20);
        lKeliling.setBounds(25, 190, 300, 20);
        lVolume.setBounds(25, 220, 300, 20);
        lLuasPermukaan.setBounds(25, 250, 300, 20);
        
        btnHitung.setBounds(50, 290, 100, 20);
        btnReset.setBounds(200, 290, 100, 20);
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double panjang, lebar, tinggi;
        if (ae.getSource() == btnHitung){
            if (!tfPanjang.getText().trim().isEmpty() || !tfLebar.getText().trim().isEmpty() || !tfTinggi.getText().trim().isEmpty()){
                try{
                    panjang = Double.parseDouble(tfPanjang.getText().trim());
                    lebar = Double.parseDouble(tfLebar.getText().trim());
                    tinggi = Double.parseDouble(tfTinggi.getText().trim());
                    hitung(panjang, lebar, tinggi);
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(this, "Please Check Your Input", "Message", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Input Your Number", "Message", JOptionPane.ERROR_MESSAGE);
            }
        } else if (ae.getSource() == btnReset){
            tfPanjang.setText("");
            tfLebar.setText("");
            tfTinggi.setText("");
            lVolume.setText("");
            lLuas.setText("");
            lKeliling.setText("");
            lLuasPermukaan.setText("");
        }
    }

    public void hitung(double panjang, double lebar, double tinggi){
        Balok balok = new Balok(panjang, lebar, tinggi);
        lLuas.setText           ("Luas                        :   " + String.valueOf(balok.luas()));
        lKeliling.setText       ("Keliling                    :   " + String.valueOf(balok.keliling()));
        lVolume.setText         ("Volume                   :   " + String.valueOf(balok.volume()));
        lLuasPermukaan.setText  ("Luas Permukaan :   " + String.valueOf(balok.luasPermukaan()));
    }
}
