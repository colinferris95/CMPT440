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


public class swingtest extends JFrame {
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
		
		
		
		
	}
	
	
}


