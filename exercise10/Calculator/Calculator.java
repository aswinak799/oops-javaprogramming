import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
		JFrame jf ;
		JLabel displayLabel;
		JButton sevenButton;
		JButton eightButton;
		JButton nineButton;
		JButton fourButton;
		JButton fiveButton;
		JButton sixButton;
		JButton oneButton;
		JButton twoButton;
		JButton threeButton;
		JButton dotButton;
		JButton zeroButton;
		JButton equalButton;
		JButton divButton;
		JButton mulButton;
		JButton minusButton;
		JButton plusButton;
		JButton clearButton,bckButton;
		boolean isClicked;
		String oldvalue;
		int opt;

		
		public Calculator() {
			jf =  new JFrame("Calc");
			jf.setLayout(null);
			jf.setSize(600, 600);
			jf.setLocation(300, 100);
			jf.setVisible(true);
			
			displayLabel=new JLabel();
			displayLabel.setFont(new Font("Calibri", Font.BOLD, 25));

			displayLabel.setBounds(30, 50, 540, 40);
			displayLabel.setBackground(Color.gray);
			displayLabel.setForeground(Color.white);
			displayLabel.setOpaque(true);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);

			jf.add(displayLabel);
			sevenButton=new JButton("7");
			sevenButton.setBounds(30, 130, 80, 80);
			sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
			jf.add(sevenButton);
			sevenButton.addActionListener(this);
			
			
			eightButton=new JButton("8");
			eightButton.setBounds(130, 130, 80, 80);
			jf.add(eightButton);
			eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
			eightButton.addActionListener(this);
			
			nineButton=new JButton("9");
			nineButton.setBounds(240, 130, 80, 80);
			jf.add(nineButton);
			nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
			nineButton.addActionListener(this);
			
			
			fourButton=new JButton("4");
			fourButton.setBounds(30, 230, 80, 80);
			jf.add(fourButton);
			fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
			fourButton.addActionListener(this);
			
			
			
			fiveButton=new JButton("5");
			fiveButton.setBounds(130, 230, 80, 80);
			jf.add(fiveButton);
			fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
			fiveButton.addActionListener(this);

			sixButton=new JButton("6");
			sixButton.setBounds(240, 230, 80, 80);
			jf.add(sixButton);
			sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
			sixButton.addActionListener(this);
			
			
			
			oneButton=new JButton("1");
			oneButton.setBounds(30, 330, 80, 80);
			jf.add(oneButton);
			oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
			oneButton.addActionListener(this);
			
			
			
			twoButton=new JButton("2");
			twoButton.setBounds(130, 330, 80, 80);
			jf.add(twoButton);
			twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
			twoButton.addActionListener(this);

			threeButton=new JButton("3");
			threeButton.setBounds(240, 330, 80, 80);
			jf.add(threeButton);
			threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
			threeButton.addActionListener(this);
			
			
			dotButton=new JButton(".");
			dotButton.setBounds(30, 430, 80, 80);
			jf.add(dotButton);
			dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
			dotButton.addActionListener(this);
			
			
			
			zeroButton=new JButton("0");
			zeroButton.setBounds(130, 430, 80, 80);
			jf.add(zeroButton);
			zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
			zeroButton.addActionListener(this);

			equalButton=new JButton("=");
			equalButton.setBounds(240, 430, 80, 80);
			jf.add(equalButton);
			equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
			equalButton.addActionListener(this);
			
			
			
			
			divButton=new JButton("/");
			divButton.setBounds(340, 130, 80, 80);
			jf.add(divButton);
			divButton.setFont(new Font("Arial", Font.PLAIN, 40));
			divButton.addActionListener(this);

			
			mulButton=new JButton("x");
			mulButton.setBounds(340, 230, 80, 80);
			jf.add(mulButton);
			mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
			mulButton.addActionListener(this);
			
			minusButton=new JButton("-");
			minusButton.setBounds(340, 330, 80, 80);
			jf.add(minusButton);
			minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
			minusButton.addActionListener(this);
			
			plusButton=new JButton("+");
			plusButton.setBounds(340, 430, 80, 80);
			jf.add(plusButton);
			plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
			plusButton.addActionListener(this);
			
			
			clearButton=new JButton("c");
			clearButton.setBounds(440, 330, 80, 180);
			jf.add(clearButton);
			clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
			clearButton.addActionListener(this);
			
			
			bckButton=new JButton("b");
			bckButton.setBounds(440, 130, 80, 180);
			jf.add(bckButton);
			bckButton.setFont(new Font("Arial", Font.PLAIN, 40));
			bckButton.addActionListener(this);

			
			
			


			
			jf.add(displayLabel);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		
		
		
		
		
		
		
		public static void main(String[] args) {
			new Calculator();
			
		}







		@Override
		public void actionPerformed(ActionEvent e) {
			//String str="";
			
			if(e.getSource()==sevenButton) {
				if(isClicked) {
					displayLabel.setText("7");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"7");
				}
			}
			else if(e.getSource()==eightButton) {
				if(isClicked) {
					
					displayLabel.setText("8");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"8");
				}
			}
			else if(e.getSource()==nineButton) {
				if(isClicked) {
					
					displayLabel.setText("9");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"9");
				}

			}
			else if(e.getSource()==fourButton) {
				if(isClicked) {
					
					displayLabel.setText("4");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"4");
				}

			}
			else if(e.getSource()==fiveButton) {
				if(isClicked) {
					
					displayLabel.setText("5");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"5");
				}

			}
			else if(e.getSource()==sixButton) {
				if(isClicked) {
					
					displayLabel.setText("6");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"6");
				}

			}
			else if(e.getSource()==oneButton) {
				if(isClicked) {
					
					displayLabel.setText("1");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"1");
				}

			}
			else if(e.getSource()==twoButton) {
				if(isClicked) {
					
					displayLabel.setText("2");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"2");
				}

			}
			else if(e.getSource()==threeButton) {
				if(isClicked) {
					
					displayLabel.setText("3");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"3");
				}

			}
			if(e.getSource()==zeroButton) {
				if(isClicked) {
					
					displayLabel.setText("0");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"0");
				}

			}
			else if(e.getSource()==dotButton) {
				if(isClicked) {
					
					displayLabel.setText(".");
					isClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+".");
				}

			}
			else if(e.getSource()==clearButton) {
				displayLabel.setText("");
			}
			
			else if(e.getSource()==bckButton) {
				String bck =displayLabel.getText();
				int len =bck.length();
				displayLabel.setText(bck.substring(0, len-1));
				
			}

			
			
			
			
			
			if(e.getSource()==divButton) {
				oldvalue=displayLabel.getText();

				isClicked=true;
				opt=1;
			}
			else if(e.getSource()==mulButton) {
				oldvalue=displayLabel.getText();

				isClicked=true;
				opt=2;
			}
			else if(e.getSource()==minusButton) {
				oldvalue=displayLabel.getText();

				isClicked=true;
				opt=3;
			}
			else if(e.getSource()==plusButton) {
				oldvalue=displayLabel.getText();
				isClicked=true;
			
				opt=4;

			}

			
			
			
			
			if(e.getSource()==equalButton) {
				String newvalue=displayLabel.getText();
				float oldfloat=Float.parseFloat(oldvalue);
				float newfloat=Float.parseFloat(newvalue);
				float result=0;
				if(opt==1) {
				
					result=oldfloat/newfloat;
				}
				else if(opt==2) {
					result=oldfloat*newfloat;

					
				}
				else if(opt==3) {
					result=oldfloat-newfloat;

					
				}

				else if(opt==4) {
					result=oldfloat+newfloat;

					
				}
				
				
				//displayLabel.setText(String.valueOf(result));
				displayLabel.setText(result+"");

			}



			
		}

}
