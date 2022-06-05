package monster;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MonsterMain {
	
	JLabel counterLabel, perSecLabel;
	int cookieCounter;
	Font font1, font2;
	CookieHandler cHandler = new CookieHandler();

	public static void main(String[] args) {
		
		new MonsterMain();

	}
	
	public MonsterMain() {
		
		cookieCounter = 0;
		
		createFont();
		createUI();
		
	}
	public void createFont() {
		
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);
		
	}
	public void createUI() {
		
		JFrame window = new JFrame();
		window.setSize(700, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(100, 220, 200, 200);
		cookiePanel.setBackground(Color.black);
		window.add(cookiePanel);
		
		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource("monster200x200.png"));
		
		JButton cookieButton = new JButton();
		cookieButton.setBackground(Color.black);
		cookieButton.setFocusPainted(false);
		cookieButton.setBorder(null);
		cookieButton.setIcon(cookie);
		cookieButton.addActionListener(cHandler);
		cookiePanel.add(cookieButton);
		
		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(100, 100, 200, 100);
		counterPanel.setBackground(Color.black);
		counterPanel.setLayout(new GridLayout(2,1));
		window.add(counterPanel);
		
		counterLabel = new JLabel(cookieCounter + " Monsters");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);
		
		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);
		
		window.setVisible(true);
		
	}
	
	public class CookieHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			cookieCounter ++;
			counterLabel.setText(cookieCounter + " Monsters");
			
		}
	}

}

