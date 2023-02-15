package Gui_Tasks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Country {
    @SuppressWarnings("empty-statement")
    public static void main (String[]args){
        JFrame base = new JFrame("Country");
        base.setLayout(new BorderLayout());
        //a panel for the north section 
        JPanel a = new JPanel();
        a.setLayout(new FlowLayout());
        
        //country label
        JLabel country = new JLabel("Country ");
        a.add(country);
        //JCombobox
        String cou[] = {"Palestine","United Kingdom","France","Scotland","Greace","Japan","Russia"}; 
        JComboBox c1 = new JComboBox(cou);
        a.add(c1);
        //city label
         JLabel city = new JLabel("City ");
        a.add(city);
        //JComboBox ( city )
        String c[]= {"Gaza","London","Paris","Edinburgh","Nafplion","Tokyo","Saint" ,"Petersburg"};
        JComboBox c2 = new JComboBox(c);
        a.add(c2);
        // a panel fot the center 
        JPanel b = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton show = new JButton("Show Selection ");
        b.add(show);
        JButton exit = new JButton("Exit");
        b.add(exit);
        //adding the panels to the base
        base.add(a,BorderLayout.NORTH);
        base.add(b);
        
        base.setVisible(true);
        base.setBackground(Color.red);
        base.setBounds(250,240,350,300);
    }
    
}
