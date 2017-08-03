package a3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Panel;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.border.LineBorder;

//Start of Keyboard Class
public class TypingTutor implements ActionListener, KeyListener  {
	//Create frame
	private JFrame frmTypingTutor;

	/**
	 * Launch the application.
	 */
	//Start of main method
	public static void main(String[] args) {
		//EventQueue will run later when the method is called
		EventQueue.invokeLater(new Runnable() {
			//Start of run method
			public void run() {
				try {
					//Create an instance of keyboard class
					TypingTutor window = new TypingTutor();
					
					//set window visibility to true
					window.frmTypingTutor.setVisible(true);
				} catch (Exception e) {
					//Tracks error in stack
					e.printStackTrace();
				}
			}
		});
	}//End of main method

	/**
	 * Create the application.
	 */
	
	public void KeyListener(){
	
		
	}
	
	//Start of keyboard constructor
	public TypingTutor() {
		//Calls initialize method
		initialize();

	}//End of keyboard constructor

	/*Set up the keyboard listeners*/
	

	
	/**
	 * Initialize the contents of the frame.
	 */
	//Start of initialize method
	private void initialize() {
		//Create new frame
		frmTypingTutor = new JFrame();
		//Set the name of the frame
		frmTypingTutor.setTitle("Typing Tutor");
		//Set dimensions of the frame
		frmTypingTutor.setBounds(100, 100, 762, 620);
		//Exit on close
		frmTypingTutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set layout
		frmTypingTutor.getContentPane().setLayout(null);
		//Create textArea
		JTextArea textArea = new JTextArea();
		//Set Dimensions for textArea
		textArea.setBounds(20, 76, 716, 255);
		//Add textArea to frame
		frmTypingTutor.getContentPane().add(textArea);
		//Set row size
		textArea.setRows(20);
		//Set column size
		textArea.setColumns(86);
		//Create JLabel
		JLabel intructions = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed. ");
		//Set font for JLabel
		intructions.setFont(new Font("Tahoma", Font.BOLD, 11));
		//Set dimensions for JLabel
		intructions.setBounds(20, 11, 606, 42);
		//Add JLabel to frame
		frmTypingTutor.getContentPane().add(intructions);
		
		//Create second JLabel
		JLabel note = new JLabel("Note: clicking the buttons with your mouse will not perform any action.");
		//Set font and size for JLabel
		note.setFont(new Font("Tahoma", Font.BOLD, 11));
		//Set dimensions for JLabel
		note.setBounds(20, 40, 539, 27);
		//Add JLabel to frame
		frmTypingTutor.getContentPane().add(note);
		
		/*Creates a series of buttons on the keyboard
		 *Sets the dimensions 
		 *Adds the button to the frame*/
		
		JButton oneButton = new JButton("1");
		oneButton.setBounds(67, 342, 47, 48);
		frmTypingTutor.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(113, 342, 47, 48);
		frmTypingTutor.getContentPane().add(twoButton);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.setBounds(207, 342, 47, 48);
		frmTypingTutor.getContentPane().add(btnNewButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(254, 342, 47, 48);
		frmTypingTutor.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(300, 342, 47, 48);
		frmTypingTutor.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(346, 342, 47, 48);
		frmTypingTutor.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(392, 342, 47, 48);
		frmTypingTutor.getContentPane().add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(438, 342, 47, 48);
		frmTypingTutor.getContentPane().add(nineButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(483, 342, 47, 48);
		frmTypingTutor.getContentPane().add(zeroButton);
		
		JButton dashButton = new JButton("-");
		dashButton.setBounds(572, 342, 47, 48);
		frmTypingTutor.getContentPane().add(dashButton);
		
		JButton plusButton = new JButton("+");
		plusButton.setBounds(528, 342, 47, 48);
		frmTypingTutor.getContentPane().add(plusButton);
		
		JButton backspaceButton = new JButton("Backspace");
		backspaceButton.setBounds(618, 342, 120, 48);
		frmTypingTutor.getContentPane().add(backspaceButton);
		
		JButton btnTab = new JButton("Tab");
		btnTab.setBounds(20, 389, 71, 48);
		frmTypingTutor.getContentPane().add(btnTab);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(90, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnQ);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(136, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnW);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(183, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnE);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(229, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(275, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnT);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(322, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnY);
		
		JButton Ubtn = new JButton("U");
		Ubtn.setBounds(369, 389, 47, 48);
		frmTypingTutor.getContentPane().add(Ubtn);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(416, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnI);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(461, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(506, 389, 47, 48);
		frmTypingTutor.getContentPane().add(btnP);
		
		JButton leftBracketbtn = new JButton("[");
		leftBracketbtn.setBounds(552, 389, 47, 48);
		frmTypingTutor.getContentPane().add(leftBracketbtn);
		
		JButton rightBracketbtn = new JButton("]");
		rightBracketbtn.setBounds(597, 389, 47, 48);
		frmTypingTutor.getContentPane().add(rightBracketbtn);
		
		JButton button = new JButton("\\");
		button.setBounds(643, 389, 47, 48);
		frmTypingTutor.getContentPane().add(button);
		
		JButton btnCaps = new JButton("Caps");
		btnCaps.setBounds(20, 435, 71, 48);
		frmTypingTutor.getContentPane().add(btnCaps);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(90, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnA);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(136, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnS);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(183, 436, 47, 47);
		frmTypingTutor.getContentPane().add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(229, 436, 47, 47);
		frmTypingTutor.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(275, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(322, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnH);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(369, 436, 47, 47);
		frmTypingTutor.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(416, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(461, 435, 47, 48);
		frmTypingTutor.getContentPane().add(btnL);
		
		JButton colonBtn = new JButton(":");
		colonBtn.setBounds(506, 435, 47, 48);
		frmTypingTutor.getContentPane().add(colonBtn);
		
		JButton quotationBtn = new JButton("\"");
		quotationBtn.setBounds(552, 435, 47, 48);
		frmTypingTutor.getContentPane().add(quotationBtn);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(597, 435, 93, 48);
		frmTypingTutor.getContentPane().add(btnEnter);
		
		JButton btnShift = new JButton("Shift");
		btnShift.setBounds(20, 481, 94, 48);
		frmTypingTutor.getContentPane().add(btnShift);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(113, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnZ);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(160, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnX);
		
		JButton btnV = new JButton("C");
		btnV.setBounds(207, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnV);
		
		JButton btnV_1 = new JButton("V");
		btnV_1.setBounds(254, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnV_1);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(300, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnB);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(346, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnN);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(392, 481, 47, 48);
		frmTypingTutor.getContentPane().add(btnM);
		
		JButton comma = new JButton(",");
		comma.setBounds(438, 481, 47, 48);
		frmTypingTutor.getContentPane().add(comma);
		
		JButton periodBtn = new JButton(".");
		periodBtn.setBounds(483, 481, 47, 48);
		frmTypingTutor.getContentPane().add(periodBtn);
		
		JButton questionBtn = new JButton("?");
		questionBtn.setBounds(528, 481, 47, 48);
		frmTypingTutor.getContentPane().add(questionBtn);
		
		JButton upChevronBtn = new JButton("^");
		upChevronBtn.setBounds(597, 481, 47, 48);
		frmTypingTutor.getContentPane().add(upChevronBtn);
		
		JButton downChevronBtn = new JButton("v");
		downChevronBtn.setBounds(597, 527, 47, 48);
		frmTypingTutor.getContentPane().add(downChevronBtn);
		
		JButton rightChevronBtn = new JButton(">");
		rightChevronBtn.setBounds(643, 527, 47, 48);
		frmTypingTutor.getContentPane().add(rightChevronBtn);
		
		JButton leftChevronBtn = new JButton("<");
		leftChevronBtn.setBounds(552, 527, 47, 48);
		frmTypingTutor.getContentPane().add(leftChevronBtn);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(229, 527, 279, 48);
		frmTypingTutor.getContentPane().add(button_1);
		
		JButton tildaBtn = new JButton("~");
		tildaBtn.setBounds(20, 342, 47, 48);
		frmTypingTutor.getContentPane().add(tildaBtn);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(160, 342, 47, 48);
		frmTypingTutor.getContentPane().add(threeButton);
		
	}//End of initialize method


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}//End of Keyboard class
