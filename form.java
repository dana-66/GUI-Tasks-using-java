package Gui_Tasks;
// this represents a interface only
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test_B {
    public static void main(String[] args) {
        JFrame base = new JFrame();
        base.setLayout(new BorderLayout());
        //for the right side 
        JPanel right = new JPanel();
        right.setLayout(new GridLayout(11,2));
        JButton search = new JButton("بحث");
        JButton abs = new JButton("تفريغ");
        right.add(search); right.add(abs);
        
        JLabel pname = new JLabel("الاسم الشخصي");
        JTextField n1 = new JTextField();
        right.add(n1);right.add(pname);
        JLabel fathername = new JLabel("اسم الأب");
        JTextField n2 = new JTextField();
        right.add(n2);right.add(fathername);
        
        JLabel fname = new JLabel("اسم العائلة ");
        JTextField n3 = new JTextField();
        right.add(n3);right.add(fname);
        
        JLabel phonum = new JLabel("رقم الجوال");
        JTextField n4 = new JTextField();
        right.add(n4);right.add(phonum);
        
        JLabel ordnum = new JLabel("رقم اوريدو");
        JTextField n5 = new JTextField();
        right.add(n5);right.add(ordnum);
       
        JLabel mincount = new JLabel("(حد أدنى)عدد الدورات");
        mincount.setBackground(Color.YELLOW);
        JTextField n6 = new JTextField();
        right.add(n6);right.add(mincount);
       
        JLabel maxcount = new JLabel("(حد أقصى)عدد الدورات");
        JTextField n7 = new JTextField();
        right.add(n7);right.add(maxcount);
        
        JLabel cname = new JLabel("اسم الدورة");
        String courses[]={"جافا مبتدئ","جافا متقدم","الكترونيات","fxجافا"};
        JComboBox cList = new JComboBox(courses);
        right.add(cList);right.add(cname);
        
        JLabel degree = new JLabel("حاصل على شهادة؟");
        String deg[]={"بدون تحديد","بكالوريوس","ماستر","ثانوية عامة","دكتوراة"};
        JComboBox dList = new JComboBox(deg);
        right.add(dList);right.add(degree);
        
        JLabel fee = new JLabel("باقى عليه رسوم؟");
        String fstat[]={"بدون تحديد","متبقى","تم التسديد"};
        JComboBox fList = new JComboBox(fstat);
        right.add(fList);right.add(fee);

        
        right.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        right.add(dList,BorderLayout.EAST);
       
        
        
        base.add(right);
        base.setVisible(true);
        base.setBounds(200,300,980,700);
    }
    
}
