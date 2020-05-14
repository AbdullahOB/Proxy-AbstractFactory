package AbstractFactroryPackage;

import javax.swing.*;

public class Run {


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new GUI().panel1);
        frame.setVisible(true);
    }
}



