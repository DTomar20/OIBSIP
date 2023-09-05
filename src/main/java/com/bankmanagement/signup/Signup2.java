package com.bankmanagement.signup;
import com.bankmanagement.connection.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel additionaldetails,religion,category,income,education,occupation,pan,aadhar,
    	scitizen,eaccount,l11,l12,l13;
    JButton b;
    long random;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3;
    JComboBox rel,cat,inco,c4,c5;
    String formno;
    Signup2(String formno){
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Bank Management/icons/logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l14 = new JLabel(i3);
//        l14.setBounds(150, 0, 100, 100);
//        add(l14);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionaldetails = new JLabel("Page 2: Additonal Details");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetails.setBounds(280,30,600,40);
        add(additionaldetails);
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        religion.setBounds(100,120,100,30);
        add(religion);
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        rel = new JComboBox(religion);
        rel.setBackground(Color.WHITE);
        rel.setFont(new Font("Raleway", Font.BOLD, 14));
        rel.setBounds(350,120,320,30);
        add(rel);
        
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(100,170,100,30);
        add(category);
        
        String category[] = {"General","OBC","SC","ST","Other"};
        cat = new JComboBox(category);
        cat.setBackground(Color.WHITE);
        cat.setFont(new Font("Raleway", Font.BOLD, 14));
        cat.setBounds(350,170,320,30);
        add(cat);
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100,220,100,30);
        add(income);
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        inco = new JComboBox(income);
        inco.setBackground(Color.WHITE);
        inco.setFont(new Font("Raleway", Font.BOLD, 14));
        inco.setBounds(350,220,320,30);
        add(inco);
        
        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        education.setBounds(100,270,150,30);
        add(education);
        
        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100,290,150,30);
        add(l11);
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(350,270,320,30);
        add(c4);
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        occupation.setBounds(100,340,150,30);
        add(occupation);
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(350,340,320,30);
        add(c5);
        
        pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(100,390,150,30);
        add(pan);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(350,390,320,30);
        add(t1);
        
        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        aadhar.setBounds(100,440,180,30);
        add(aadhar);
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(350,440,320,30);
        add(t2);
        
        scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Raleway", Font.BOLD, 18));
        scitizen.setBounds(100,490,150,30);
        add(scitizen);
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(460,490,100,30);
        add(r2);
        
        eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway", Font.BOLD, 18));
        eaccount.setBounds(100,540,180,30);
        add(eaccount);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(460,540,100,30);
        add(r4);
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        l12.setBounds(700,10,60,30);
        add(l12);
        
        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        l13.setBounds(760,10,60,30);
        add(l13);
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBounds(570,640,100,30);
        add(b);
        
        b.addActionListener(this);
        
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    	String formno = "" + random;
        String religion = (String)rel.getSelectedItem(); 
        String category = (String)cat.getSelectedItem();
        String income = (String)inco.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+religion+"','"+category
                		+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+
                		"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
        }catch(Exception ex){
             ex.printStackTrace();
        }
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
