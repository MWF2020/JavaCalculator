package JAVA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculatorv1 {

    private JFrame frmJixiis;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Calculatorv1 window = new Calculatorv1();
                    window.frmJixiis.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculatorv1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJixiis = new JFrame();
		frmJixiis.setResizable(false);
		frmJixiis.getContentPane().setBackground(new Color(112, 128, 144));
		frmJixiis.getContentPane().setForeground(new Color(220, 20, 60));
		frmJixiis.setTitle("JI-30XIIS");
		frmJixiis.setBounds(100, 100, 485, 559);
		frmJixiis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJixiis.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Jacky Instruments  JI-30XIIS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(65, 10, 389, 29);
		frmJixiis.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(10, 49, 457, 58);
		frmJixiis.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSquare = new JButton("\u221A");
		btnSquare.setEnabled(false);
		btnSquare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSquare.setForeground(new Color(0, 0, 0));
		btnSquare.setBackground(new Color(240, 248, 255));
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSquare.setBounds(22, 140, 74, 45);
		frmJixiis.getContentPane().add(btnSquare);

		JButton btnExpo = new JButton("1/x");
		btnExpo.setEnabled(false);
		btnExpo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnExpo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExpo.setBounds(22, 191, 74, 45);
		frmJixiis.getContentPane().add(btnExpo);

		JButton btnXY = new JButton("x^y");
		btnXY.setEnabled(false);
		btnXY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x^y";
			}
		});
		btnXY.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnXY.setBounds(22, 246, 74, 45);
		frmJixiis.getContentPane().add(btnXY);

		JButton btnNY = new JButton("x^3");
		btnNY.setEnabled(false);
		btnNY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNY.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNY.setBounds(22, 301, 74, 45);
		frmJixiis.getContentPane().add(btnNY);

		JButton btnNX = new JButton("x^2");
		btnNX.setEnabled(false);
		btnNX.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNX.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNX.setBounds(22, 351, 74, 45);
		frmJixiis.getContentPane().add(btnNX);

		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {

					fact = fact * a;

					a--;

				}
				textField.setText("");
				textField.setText(textField.getText() + fact);

			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnN.setBounds(22, 406, 74, 45);
		frmJixiis.getContentPane().add(btnN);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPlusMinus.setBounds(22, 461, 87, 45);
		frmJixiis.getContentPane().add(btnPlusMinus);

		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnEx.setForeground(new Color(0, 0, 0));
		btnEx.setBackground(new Color(240, 248, 255));
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEx.setBounds(273, 245, 74, 45);
		frmJixiis.getContentPane().add(btnEx);

		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLog.setBounds(189, 247, 74, 45);
		frmJixiis.getContentPane().add(btnLog);

		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPercent.setBounds(105, 246, 74, 45);
		frmJixiis.getContentPane().add(btnPercent);

		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBounds(105, 301, 74, 45);
		frmJixiis.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setBounds(105, 351, 74, 45);
		frmJixiis.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.setBounds(105, 406, 74, 45);
		frmJixiis.getContentPane().add(btn1);

		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSin.setForeground(new Color(0, 0, 0));
		btnSin.setBackground(new Color(240, 248, 255));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSin.setBounds(189, 140, 74, 45);
		frmJixiis.getContentPane().add(btnSin);

		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClear.setBounds(393, 136, 74, 45);
		frmJixiis.getContentPane().add(btnClear);

		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(240, 248, 255));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBounds(189, 301, 74, 45);
		frmJixiis.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBounds(189, 351, 74, 45);
		frmJixiis.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.setBounds(189, 406, 74, 45);
		frmJixiis.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn0.setBounds(115, 461, 148, 45);
		frmJixiis.getContentPane().add(btn0);

		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCos.setForeground(new Color(0, 0, 0));
		btnCos.setBackground(new Color(240, 248, 255));
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCos.setBounds(273, 140, 74, 45);
		frmJixiis.getContentPane().add(btnCos);

		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;

				if (textField.getText().length() > 0) {

					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					Backspace = str.toString();
					textField.setText(Backspace);

				}

			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 30));
		btnBackspace.setBounds(393, 187, 74, 45);
		frmJixiis.getContentPane().add(btnBackspace);

		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBounds(273, 301, 74, 45);
		frmJixiis.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBounds(273, 351, 74, 45);
		frmJixiis.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBounds(273, 406, 74, 45);
		frmJixiis.getContentPane().add(btn3);

		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDot.setBounds(273, 461, 74, 45);
		frmJixiis.getContentPane().add(btnDot);

		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTan.setBounds(105, 140, 74, 45);
		frmJixiis.getContentPane().add(btnTan);

		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAdd.setBounds(393, 246, 74, 45);
		frmJixiis.getContentPane().add(btnAdd);

		JButton btnSubtract = new JButton("-");
		btnSubtract.setEnabled(false);
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";

			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSubtract.setBounds(393, 301, 74, 45);
		frmJixiis.getContentPane().add(btnSubtract);

		JButton btnMultiply = new JButton("*");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";

			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMultiply.setBounds(393, 351, 74, 45);
		frmJixiis.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";

			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDivide.setBounds(393, 406, 74, 45);
		frmJixiis.getContentPane().add(btnDivide);

		JButton btnEquals = new JButton("=");
		btnEquals.setEnabled(false);
		btnEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {

					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

				else if (operation == "-") {

					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {

					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {

					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {

					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "x^y") {

					double resultt = 1;
					for (int i = 0; i < second; i++) {
						resultt = first * resultt;
					}

					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}

			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnEquals.setBounds(373, 461, 94, 45);
		frmJixiis.getContentPane().add(btnEquals);

		JButton btnSinh = new JButton("sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSinh.setBounds(189, 191, 74, 45);
		frmJixiis.getContentPane().add(btnSinh);

		JButton btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCosh.setBounds(273, 192, 74, 45);
		frmJixiis.getContentPane().add(btnCosh);

		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnTanh.setBounds(106, 192, 74, 45);
		frmJixiis.getContentPane().add(btnTanh);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);

				btnDot.setEnabled(true);
				btnPercent.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSubtract.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnEquals.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackspace.setEnabled(true);

				btnTan.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTanh.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnLog.setEnabled(true);
				btnEx.setEnabled(true);
				btnSquare.setEnabled(true);
				btnExpo.setEnabled(true);
				btnXY.setEnabled(true);

				btnNX.setEnabled(true);
				btnNY.setEnabled(true);
				btnN.setEnabled(true);

				btnPlusMinus.setEnabled(true);

				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(112, 128, 144));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		rdbtnNewRadioButton.setBounds(6, 109, 58, 21);
		frmJixiis.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);

				btnDot.setEnabled(false);
				btnPercent.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSubtract.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnEquals.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackspace.setEnabled(false);

				btnTan.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTanh.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnLog.setEnabled(false);
				btnEx.setEnabled(false);
				btnSquare.setEnabled(false);
				btnExpo.setEnabled(false);
				btnXY.setEnabled(false);

				btnNX.setEnabled(false);
				btnNY.setEnabled(false);
				btnN.setEnabled(false);

				btnPlusMinus.setEnabled(false);

				textField.setEnabled(false);

			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setForeground(new Color(0, 0, 0));
		rdbtnOff.setBackground(new Color(112, 128, 144));
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		rdbtnOff.setBounds(76, 109, 58, 21);
		frmJixiis.getContentPane().add(rdbtnOff);
	}
}
