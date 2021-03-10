package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	JButton Button = new JButton();
	JTextField binary = new JTextField(20);
	JLabel Label = new JLabel();
	JPanel pan = new JPanel();
	JFrame frame = new JFrame();
	 public void run() {
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Button.addActionListener(this);
		 pan.add(binary);
		 pan.add(Button);
		 pan.add(Label);
		 Button.setText("Convert 8 bits of ASCII to Text");
		 frame.add(pan);
		 frame.pack();
	 }
	 String convert(String input) {
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return "-";
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return "-";   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return "" + theLetter;
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return "-";
		    }
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String input = binary.getText();
		String letter = convert(input);
		Label.setText(letter);
	}
	
	}

