package guiCalculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuiCalculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private Double firstNum;
	private Double secondNum;
	private String operation;
	private String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCalculator window = new GuiCalculator();
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
	public GuiCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 331, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		txtDisplay.setBounds(6, 6, 320, 50);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//=========================row1===============================//
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder enterValue=new StringBuilder(txtDisplay.getText());
				if(enterValue.length()>0) {	
					enterValue.deleteCharAt(enterValue.length()-1);
				txtDisplay.setText(enterValue.toString());
				}
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.BOLD, 25));
		btnBackSpace.setBounds(6, 55, 80, 80);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=0.0;
				secondNum=0.0;
				result=null;
				operation=null;
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnClear.setBounds(86, 55, 80, 80);
		frame.getContentPane().add(btnClear);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operation="%";
				}
			}
		});
		btnMod.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnMod.setBounds(166, 55, 80, 80);
		frame.getContentPane().add(btnMod);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operation="+";
				}
			}
		});
		btnAdd.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnAdd.setBounds(246, 55, 80, 80);
		frame.getContentPane().add(btnAdd);

//=========================row2===============================//
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn7.setBounds(6, 135, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn8.setBounds(86, 135, 80, 80);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn9.setBounds(166, 135, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operation="-";
				}
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnMinus.setBounds(246, 135, 80, 80);
		frame.getContentPane().add(btnMinus);
		
	//=========================row3===============================//
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn4.setBounds(6, 215, 80, 80);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn5.setBounds(86, 215, 80, 80);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn6.setBounds(166, 215, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btnX = new JButton("*");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operation="*";
				}
			}
		});
		btnX.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnX.setBounds(246, 215, 80, 80);
		frame.getContentPane().add(btnX);
		
//=========================row4===============================//
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn1.setBounds(6, 295, 80, 80);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn2.setBounds(86, 295, 80, 80);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn3.setBounds(166, 295, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				firstNum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(null);
				operation="/";
				}
			}
		});
		btnDivide.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnDivide.setBounds(246, 295, 80, 80);
		frame.getContentPane().add(btnDivide);
		
		//=========================row5===============================//
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterValue= txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(enterValue);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btn0.setBounds(6, 375, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtDisplay.getText().contains(".")) {
				String enterValue= txtDisplay.getText()+btnDot.getText();
				txtDisplay.setText(enterValue);
				}
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnDot.setBounds(86, 375, 80, 80);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				Double plusMinus=Double.parseDouble(txtDisplay.getText());
				plusMinus=-plusMinus;
				txtDisplay.setText(String.valueOf(plusMinus));
				}
			}
		});
		btnPM.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnPM.setBounds(166, 375, 80, 80);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDisplay.getText().length()>0) {
				secondNum=Double.parseDouble(txtDisplay.getText());
				
				if(operation=="+") {
					result=String.format("%.2f",firstNum+secondNum);
					txtDisplay.setText(result);
				}
				else if(operation=="-") {
					result=String.format("%.2f",firstNum-secondNum);
					txtDisplay.setText(result);
				}
				else if(operation=="*") {
					result=String.format("%.2f",firstNum*secondNum);
					txtDisplay.setText(result);
				}
				else if(operation=="/") {
					result=String.format("%.2f",firstNum/secondNum);
					txtDisplay.setText(result);
				}
				else if(operation=="%") {
					result=String.format("%.2f",firstNum%secondNum);
					txtDisplay.setText(result);
				}
				
			  }
				
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnEqual.setBounds(246, 375, 80, 80);
		frame.getContentPane().add(btnEqual);
	}

}
