package AbstractFactroryPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JPanel panel1;
    private JButton Button1;
    private JTextField textField1;


    private Ogrenciler ogrenciler;
    private Ogretmen ogretmen;
    private SinifNo sinifNo;

    public void createSinif(final SinifFactory factory) {
        setOgrenciler(factory.createOgrenciler());
        setOgretmen(factory.createOgretmen());
        setSinifNo(factory.createSinifNo());

    }

    private void setOgretmen(final Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    private void setOgrenciler(final Ogrenciler ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    private void setSinifNo(final SinifNo sinifNo) {
        this.sinifNo = sinifNo;
    }

    public static class FactoryMaker{
        enum SinifAdi {
            MAT , FIZ
        }
        public static SinifFactory makeFactory(GUI.FactoryMaker.SinifAdi Adi){
            switch (Adi){
                case MAT:
                    return new MatematikSinif();
                case FIZ:
                    return new FizikSinif();
                default:
                    throw new IllegalArgumentException("");
            }
        }
    }

    public GUI() {

        Button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                var run1 = new GUI();
                String button = textField1.getText();

                if(button.equalsIgnoreCase(String.valueOf(GUI.FactoryMaker.SinifAdi.MAT)) ){
                    run1.createSinif(GUI.FactoryMaker.makeFactory(GUI.FactoryMaker.SinifAdi.MAT));
                    JOptionPane.showMessageDialog(null,   "Ogretmen : "+ run1.ogretmen.getDescription() + "\nOgrenciler : " + run1.ogrenciler.getDescription() + "\nSinif No : " + run1.sinifNo.getSinifNo());
                }
                else if (button.equalsIgnoreCase(String.valueOf(GUI.FactoryMaker.SinifAdi.FIZ))) {
                    run1.createSinif(GUI.FactoryMaker.makeFactory(GUI.FactoryMaker.SinifAdi.FIZ));
                    JOptionPane.showMessageDialog(null,   "Ogretmen : "+ run1.ogretmen.getDescription() + "\nOgrenciler : " + run1.ogrenciler.getDescription() + "\nSinif No : " + run1.sinifNo.getSinifNo());
                }
                else {
                    JOptionPane.showMessageDialog(null, "SINIF BULUNMAD!.. Lutfen Tekrar Deneyin..");
                }
            }

        });
    }
}

