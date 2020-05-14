package ProxyDesignPattern;

import javax.swing.*;

public class HastaneOdasiProxy implements HastaneOdasi{
     static int maxOdaKapasitesi;
     static int HastaSayisi;
    private static HastaneOdasi oda;

    public HastaneOdasiProxy (HastaneOdasi oda ){
    this.oda= oda;
    }


    public void giris (Hasta hasta){
        if(HastaSayisi < maxOdaKapasitesi){
            oda.giris(hasta);
            HastaSayisi++;
        }
        else{

            JOptionPane.showMessageDialog(null,hasta +"Odaya Girilmez, Lütfen Başka Bir Odaya Götürün ");

        }


    }
}
