package ProxyDesignPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
    HastaneOdasiProxy oda109 = new HastaneOdasiProxy(new Oda109());
    private JTextField textField1;
    private JTextField textField2;
    JPanel panel1;
    private JButton HastalariEkle;


    public GUI() {




        HastalariEkle.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    int HastaSayisi = Integer.parseInt((textField1.getText()));
                    int MaxOdaKapasitesi = Integer.parseInt(textField2.getText());
                    HastaneOdasiProxy.maxOdaKapasitesi = MaxOdaKapasitesi;


                    for(int i =1 ; i<=HastaSayisi; i++){
                        oda109.giris(new Hasta((i) + ".Hasta "));
                    }
                }

                catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(null,"lütfen Geçerli Bir Sayi Giriniz");
                }

            }

        });
    }


}
