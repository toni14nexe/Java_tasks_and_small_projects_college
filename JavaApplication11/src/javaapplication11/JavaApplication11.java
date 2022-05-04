package javaapplication11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaApplication11 implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel naslov;
    JTextArea ta;
    JButton tipka;
      
      
    
    public static void main(String[] args) {
        JavaApplication11 calc=new JavaApplication11();
    }
    
    
    
    JavaApplication11(){
        
        frame = new JFrame("KALKULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLayout(null);
        
        panel.add(naslov);
        naslov.setBounds(150, 25, 200, 50);
        panel.add(ta);
        panel.add(tipka);
        
        frame.setVisible(true);
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    
    
}
