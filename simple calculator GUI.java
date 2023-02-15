package Gui_Tasks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {
    public static void main(String[] args) {
        JFrame base = new JFrame("Test");
        base.setLayout(new BorderLayout());
        JPanel a = new JPanel();
        a.setLayout(new GridLayout(4,2,1,20));
//        a.setSize(50,50);
        //for the first row
        JLabel num1 = new JLabel("Number 1 ");
        a.add(num1);
        JTextField t1 = new JTextField();
//        t1.setColumns(1);
        a.add(t1);
        // for the sec row
        JLabel num2 = new JLabel("Number 2 ");
        a.add(num2);
        JTextField t2 = new JTextField();
//        t2.setColumns(3);
        a.add(t2);
        //for the third row 
        JLabel op = new JLabel("Operation ");
        a.add(op);
        String operations[] = {"+","-","*","/","%"};
        JComboBox choice = new JComboBox(operations);
        a.add(choice);
        //for the fourth row 
        JLabel results = new JLabel("Results ");
        a.add(results);
        JTextField t4 = new JTextField();
//        t4.setColumns(3);
        a.add(t4);
        
        //the second panel which containes the button 
        JPanel b = new JPanel();
        b.setLayout(new FlowLayout(1));
        JButton compute = new JButton("Compute");
        compute.setPreferredSize(new Dimension(250, 30));
        b.add(compute);
        
        //adding the panels to the frame
        base.add(a,BorderLayout.NORTH);
        base.add(b,BorderLayout.SOUTH);
        base.setVisible(true);
        base.setBounds(650,450,650,250);
    }
    
}
