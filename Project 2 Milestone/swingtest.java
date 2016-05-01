import java.awt.BorderLayout;
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


public class swingtest extends JFrame
					   {
	
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
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(88, 49, 419, 327);
		getContentPane().add(textArea);
		
		JButton btnWillItBlend = new JButton("Will it blend?");
		btnWillItBlend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DFA tester = new DFA();
				System.out.println(tester.process(textArea.getText()));
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
		
		
		
       

        save.addActionListener(new ActionListener() {

            
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser saveFile = new JFileChooser();
                saveFile.showSaveDialog(null);
            }
        });
        

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


