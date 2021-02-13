
package gui;

import java.awt.Color;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        //tamaño de ventana
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        //ventana sincambiar tamaño false/true
        frame.setResizable(true);
        //color de vetana deafult/ rgb/ hexadecimal
        frame.getContentPane().setBackground(Color.blue);
        //frame.getContentPane().setBackground(new Color(28,26,198));
        //frame.getContentPane().setBackground(new Color(0x1AC3C6));
    }
}
