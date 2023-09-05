package com.bankmanagement.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
	
	JLabel text,image;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	
	Transactions(String pin){
		setSize(800,600);
		setVisible(true);
		setLocation(350,200);
//		setTitle("Automated ATM Machine");
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
//		setUndecorated(true);
		
		this.pin = pin;
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Bank Management/src/"
//				+ "main/java/icons/atm.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//         image = new JLabel(i3);
//        add(image);
        
//		JLabel l2 = new JLabel(i3);
//		l2.setBounds(0, 0, 960, 900);
//		add(l2);
		
		text = new JLabel("Please Select Your Transaction");
		text.setForeground(Color.black);
		text.setFont(new Font("System", Font.BOLD, 25));
		text.setBounds(170,80,700,35);
		add(text);
		
		b1 = new JButton("DEPOSIT");
		b2 = new JButton("CASH WITHDRAWL");
		b3 = new JButton("FAST CASH");
		b4 = new JButton("MINI STATEMENT");
		b5 = new JButton("PIN CHANGE");
		b6 = new JButton("BALANCE ENQUIRY");
		b7 = new JButton("EXIT");
		
		b1.setBounds(170,160,150,35);
        add(b1);
        
        b2.setBounds(390,160,150,35);
        add(b2);
        
        b3.setBounds(170,240,150,35);
        add(b3);
        
        b4.setBounds(390,240,150,35);
        add(b4);
        
        b5.setBounds(170,320,150,35);
        add(b5);
        
        b6.setBounds(390,320,150,35);
        add(b6);
        
        b7.setBounds(290,400,150,35);
        add(b7);
		
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){ 
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
		else if(ae.getSource()==b2){ 
			setVisible(false);
			new Withdrawl(pin).setVisible(true);
		}
		else if(ae.getSource()==b3){ 
			setVisible(false);
			new FastCash(pin).setVisible(true);
		}
		else if(ae.getSource()==b4){ 
			new MiniStatement(pin).setVisible(true);
		}
		else if(ae.getSource()==b5){ 
			setVisible(false);
			new Pin(pin).setVisible(true);
		}
		else if(ae.getSource()==b6){ 
			this.setVisible(false);
			new BalanceEnquiry(pin).setVisible(true);
		}
		else if(ae.getSource()==b7){ 
			System.exit(0);
		}
	}
		
	public static void main(String[] args) {
		new Transactions("").setVisible(true);
	}
}

