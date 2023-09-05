package com.bankmanagement.login;

import java.awt.event.*;
import com.bankmanagement.connection.*;
import java.sql.*;
import com.bankmanagement.signup.*;
import javax.swing.*;
import javax.swing.border.Border;

import com.bankmanagement.signup.*;

import java.awt.*;

public class Login extends JFrame implements ActionListener{

	JButton login,signup,clear;
	JTextField card;
	JPasswordField No;
	
	Login(){
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		setTitle("Automated ATM Machine");
		setLayout(null);
		Border blackline = BorderFactory.createLineBorder(Color.black);
//		
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankManagement\\src"
//				+ "\\icons\\logo.jpg"));
//		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); 
//		ImageIcon i3 = new ImageIcon(i2);
//		JLabel label = new JLabel(i3);
//		label.setBounds(70, 10, 100, 100);
//		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(240, 40, 400, 40);
		add(text);
		
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Raleway",Font.BOLD,30));
		cardno.setBounds(90, 40, 400, 200);
		add(cardno);
		
		card = new JTextField();
		card.setBounds(280, 130, 300, 30);
		card.setFont(new Font("Arial",Font.BOLD,14));
		add(card);
		
		login = new JButton("SIGN IN");
		login.setFont(new Font("Raleway",Font.BOLD,17));
		login.setBounds(250, 280, 100, 30);
		login.addActionListener(this);
		add(login);
		
		JLabel PIN = new JLabel("PIN:");
		PIN.setFont(new Font("Raleway",Font.BOLD,30));
		PIN.setBounds(90, 40, 400, 350);
		add(PIN);
		
		No = new JPasswordField();
		No.setBounds(280, 205, 300, 30);
		No.setFont(new Font("Arial",Font.BOLD,14));
		add(No);
		
		clear = new JButton("Clear");
		clear.setFont(new Font("Raleway",Font.BOLD,17));
		clear.setBounds(500, 280, 100, 30);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGN UP");
		signup.setFont(new Font("Raleway",Font.BOLD,17));
		signup.setBounds(380, 350, 100, 30);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource() == clear) {
				card.setText("");
				No.setText("");
			}
			else if(ae.getSource() == signup) {
				setVisible(false);
				new SignUpOne().setVisible(true);
			}
			else if(ae.getSource() == login){
				 Conn c1 = new Conn();
	             String cardno  = card.getText();
	             String pin  = No.getText();
	             String q  = "select * from login where cardnumber = '"+cardno+"' and pin = '"+pin+"'";

	             ResultSet rs;
	             rs = c1.s.executeQuery(q);
	             if(rs.next()){
	            	 setVisible(false);
		             new Transactions(pin).setVisible(true);
		         }else{
		             JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
	             }
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Login();
		
	}

}
