import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Calculator implements ActionListener {
	static JTextField tfnum1;
	static JTextField tfnum2;
	static JLabel output;
	
	public Calculator() {
		JFrame frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Enter number: ");
		output = new JLabel("-");
		
		tfnum1 = new JTextField(10);
		tfnum2 = new JTextField(10);
		
		JButton calBtn = new JButton("Calculate");
		calBtn.addActionListener(this);
	
		
		panel.add(label);
		panel.add(tfnum1);
		panel.add(tfnum2);
		panel.add(calBtn);
		panel.add(output);
		
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(tfnum1.getText());
		double num2 = Double.parseDouble(tfnum2.getText());
		double sum = num1 + num2;
		output.setText("Sum = " + String.valueOf(sum));
	}
}