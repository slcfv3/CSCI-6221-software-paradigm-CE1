package simple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Calculations.Minus;
import Calculations.Multiple;
import Calculations.Plus;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frontpanel1 {

	private JFrame frame;
	public static JTextField show;
	private JTextField int1;
	private JTextField int2;
	private JButton plus;
	private JButton minus;
	private JButton multiple;
	private JTextField Ans;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frontpanel1 window = new Frontpanel1();
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
	public Frontpanel1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		show = new JTextField();
		show.setBounds(39, 6, 392, 54);
		frame.getContentPane().add(show);
		show.setColumns(10);
		
		int1 = new JTextField();
		int1.setBounds(39, 94, 130, 54);
		frame.getContentPane().add(int1);
		int1.setColumns(10);
		
		int2 = new JTextField();
		int2.setBounds(272, 94, 130, 54);
		frame.getContentPane().add(int2);
		int2.setColumns(10);
		
		JLabel lblInteger = new JLabel("Integer 1");
		lblInteger.setBounds(68, 153, 61, 16);
		frame.getContentPane().add(lblInteger);
		
		JLabel lblInteger_1 = new JLabel("Integer 2");
		lblInteger_1.setBounds(311, 153, 61, 16);
		frame.getContentPane().add(lblInteger_1);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show.setText("");
				int1.setText("");
				int2.setText("");
				Ans.setText("");
			}
		});
		clear.setBounds(76, 221, 117, 29);
		frame.getContentPane().add(clear);
		
		plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plus plusObject= new Plus();
				plusObject.welcome();
				int num1, num2, ans;
				try{
					num1=Integer.parseInt(int1.getText());
					num2=Integer.parseInt(int2.getText());
					ans=num1+num2;
					Ans.setText(Integer.toString(ans));
				}catch(Exception exc){
					JOptionPane.showMessageDialog(null, "Please enter valid number!");
				}
			}
		});
		plus.setBounds(181, 94, 78, 29);
		frame.getContentPane().add(plus);
		
		minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Minus minusObject= new Minus();
				minusObject.welcome();
				int num1, num2, ans;
				try{
					num1=Integer.parseInt(int1.getText());
					num2=Integer.parseInt(int2.getText());
					ans=num1-num2;
					Ans.setText(Integer.toString(ans));
				}catch(Exception exc1){
					JOptionPane.showMessageDialog(null, "Please enter valid number!");
				}
			}
		});
		minus.setBounds(181, 124, 80, 29);
		frame.getContentPane().add(minus);
		
		multiple = new JButton("*");
		multiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multiple multipleObject= new Multiple();
				multipleObject.welcome();
				int num1, num2, ans;
				try{
					num1=Integer.parseInt(int1.getText());
					num2=Integer.parseInt(int2.getText());
					ans=num1*num2;
					Ans.setText(Integer.toString(ans));
				}catch(Exception exc2){
					JOptionPane.showMessageDialog(null, "Please enter valid number!");
				}
			}
		});
		multiple.setBounds(181, 159, 78, 29);
		frame.getContentPane().add(multiple);
		
		Ans = new JTextField();
		Ans.setBounds(239, 212, 130, 44);
		frame.getContentPane().add(Ans);
		Ans.setColumns(10);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(272, 268, 61, 16);
		frame.getContentPane().add(lblAnswer);
		
	}
}
