package Frontpanel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Frontpanel {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frontpanel window = new Frontpanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frontpanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 6, 348, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(28, 51, 78, 81);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(118, 51, 78, 81);
		frame.getContentPane().add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.setBounds(208, 51, 78, 81);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(298, 51, 78, 81);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.setBounds(28, 134, 78, 81);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setBounds(118, 134, 78, 81);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setBounds(208, 134, 78, 81);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setBounds(298, 134, 78, 81);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(28, 227, 78, 81);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setBounds(118, 227, 78, 81);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setBounds(208, 227, 78, 81);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setBounds(298, 227, 78, 81);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.setBounds(28, 320, 78, 81);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.setBounds(118, 320, 78, 81);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setBounds(208, 320, 78, 81);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(298, 320, 78, 81);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.setBounds(28, 413, 78, 81);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.setBounds(298, 413, 78, 81);
		frame.getContentPane().add(button_16);
	}
}
