package assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JButton badbutton;

	/**
	 * Launch the application.

	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 30, 120, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		badbutton = new JButton("Add bad word");
		badbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		badbutton.setBounds(20, 67, 120, 23);
		//badbutton.addActionListener((ActionListener) this);
		contentPane.add(badbutton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 147, 404, 241);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == badbutton)
		{
			String badword;
			badword = textField.getText();
			FileScanner.fileScan.add(badword);
			textArea.append("the bad word added is : "+ badword);
		}
	}
	
	}


