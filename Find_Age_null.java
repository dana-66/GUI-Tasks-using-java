
package Gui_Tasks;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Find_Age_null {
    public static void main(String[]args){
        
        JFrame base = new JFrame();
        JPanel t = new JPanel();
        t.setLayout(null);
        t.setBackground(Color.WHITE);
        
        JLabel age = new JLabel("age : ");
//        age.setBackground(Color.yellow);
        base.getContentPane().add(age);
        
        base.setResizable(false);
        base.setTitle("Find Age");
        base.setBounds(650,500,600,150);
        base.setVisible(true);
    }
}
