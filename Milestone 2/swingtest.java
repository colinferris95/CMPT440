import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.*;

import java.util.Timer;
import java.util.TimerTask;

public class swingtest extends JFrame
					   {
	
	
	Color textColor1 = new Color(0, 204, 153);; //default green 0, 204, 153
	Color textColor2 = new Color(204, 0, 0); //default red
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingtest frame = new swingtest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public swingtest() {
		getContentPane().setLayout(null);
		
		
		
		final JTextPane textArea = new JTextPane();
		
		
	
		
			
		
		
		
		textArea.setBounds(0, 0, 609, 406);
		getContentPane().add(textArea);
		

		/*
		Timer t = new Timer( );
		t.scheduleAtFixedRate(new TimerTask() {
		
		   
		    public void run() {
		    	DFA tester = new DFA();
				System.out.println(tester.process(textArea.getText()));
				if (tester.process(textArea.getText()) == false){
					textArea.setFont(new Font("Serif", Font.PLAIN, 14));
					textArea.setForeground(new Color(0xe63900));
					
				}
				
		    }
		}, 1000,5000);
		*/
		
		
		JButton btnWillItBlend = new JButton("Will it blend?");
		btnWillItBlend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DFA tester = new DFA();
				
				boolean processResult = tester.process(textArea.getText());
				System.out.println(processResult);
				
				if (processResult){
					
					textArea.setFont(new Font("Serif", Font.PLAIN, 14));
					textArea.setForeground(textColor1);// green
					
					
				}
				else{
					textArea.setFont(new Font("Serif", Font.PLAIN, 14));
					textArea.setForeground(textColor2); //red
					
				}
				
				
				
			}
			
		});
		
		
		btnWillItBlend.setBounds(343, 417, 210, 23);
		getContentPane().add(btnWillItBlend);
		
		JButton open = new JButton("Open");
		open.setBounds(24, 417, 89, 23);
		getContentPane().add(open);
		
		JButton save = new JButton("Save");
		save.setBounds(136, 417, 89, 23);
		getContentPane().add(save);
		
		String[] colorSchemes = { "Color1" , "Color2", "Color3" };
		
		JComboBox comboBox = new JComboBox(colorSchemes);
		comboBox.setBounds(246, 417, 63, 20);
		getContentPane().add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 JComboBox cb = (JComboBox)arg0.getSource();
			     String colorChoice = (String)cb.getSelectedItem();
			     
			     Color myGreen = new Color (0, 204, 153);
			     
			     Color myWhite = new Color(255, 255, 255);
			     
			     Color myPink = new Color(255,204,204);
			     
			     Color myDark = new Color (0,51,102);
			     
			     Color myPurple = new Color (102,102,255);
			     
			     Color myBlue = new Color (0, 102, 255);
			     
			     
			     if (colorChoice == "Color1"){
			    	 textArea.setBackground(myWhite);
			    	 textColor1 = myGreen;
			    	 DFA tester = new DFA();
						
						boolean processResult = tester.process(textArea.getText());
						System.out.println(processResult);
						
						if (processResult){
							
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor1);// green
							
							
						}
						else{
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor2); //red
							
						}
			    	 
			     }
				 
			     if (colorChoice == "Color2"){
			    	 textArea.setBackground(myPink);
			    	 textColor1 = myBlue;
			    	 DFA tester = new DFA();
						
						boolean processResult = tester.process(textArea.getText());
						System.out.println(processResult);
						
						if (processResult){
							
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor1);// green
							
							
						}
						else{
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor2); //red
							
						}
			    	 
			     }
			     
			     if (colorChoice == "Color3"){
			    	 textArea.setBackground(myDark);
			    	 textColor1 = myWhite;
			    	 
			    	 DFA tester = new DFA();
						
						boolean processResult = tester.process(textArea.getText());
						System.out.println(processResult);
						
						if (processResult){
							
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor1);// green
							
							
						}
						else{
							textArea.setFont(new Font("Serif", Font.PLAIN, 14));
							textArea.setForeground(textColor2); //red
							
						}
			     }
			     
			 }
			
		});
		
		
		
       

        save.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent arg0) {
            	//JFileChooser saveFile = new JFileChooser();
            	
            	//saveFile.showOpenDialog(null);
            	
            	String saveName= JOptionPane.showInputDialog("Save File As... ");
            	System.out.println(saveName);
            	FileWriter pw;
				try {
					pw = new FileWriter (saveName);
					textArea.write(pw);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
            }  
        }
        );
        

        open.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser openFile = new JFileChooser();
                
                openFile.showOpenDialog(null);
                if (openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                	  System.out.println("getCurrentDirectory(): " + openFile.getCurrentDirectory());
                	  System.out.println("getSelectedFile() : " + openFile.getSelectedFile());
                	} else {
                	  System.out.println("No Selection ");
                	}
                
                
                try {
                	FileReader readFile = new FileReader(openFile.getSelectedFile());
                    BufferedReader leer = new BufferedReader(readFile);  
                    textArea.read(leer, null);
					leer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               
                
            }
        });

		
		
        
		
		
	}
}


