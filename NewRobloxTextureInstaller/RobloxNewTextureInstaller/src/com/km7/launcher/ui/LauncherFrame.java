package com.km7.launcher.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.km7.launcher.Main;

public class LauncherFrame {
	
	public static LauncherFrame INSTANCE;
	
	Color bgc;
	Color textc;
	Color text2c;
	
	public LauncherFrame() {
		initialize();
		INSTANCE = this;
	}
	
	public LauncherFrame(Color bg, Color text, Color text2) {
		initializeWithCustomTheme(bg, text, text2);
		INSTANCE = this;
	}
	
	public JFrame frame;
	public JPanel panel;
	public JButton button;
	public JLabel label;
	
	private void initialize() {
		
		URL fontURL = null;
		try {
			fontURL = new URL("https://github.com/KM7Studios/RobloxNewTexturesArchive/raw/main/PermanentMarker-Regular.ttf");
		} catch (MalformedURLException e1) {
			
			e1.printStackTrace();
		}
		
		Font font = null;
		Font fontSm = null;
		
		try {
			font = Font.createFont(Font.TRUETYPE_FONT,fontURL.openStream()).deriveFont(Font.PLAIN,35);
			fontSm = Font.createFont(Font.TRUETYPE_FONT,fontURL.openStream()).deriveFont(Font.PLAIN, 17.5F);
		} catch (FontFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		frame = new JFrame("New Roblox Textures Installer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(760, 415, 600, 300);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setBounds(0,0,600,300);
		panel.setBackground(new Color(44, 47, 51));
		panel.repaint();
		panel.setVisible(true);
		
		label = new JLabel();
		label.setText("New Roblox Textures Installer");
		label.setForeground(new Color(114, 137, 218));
		label.setBounds(3,3,100, 100);
		label.setVisible(true);
		label.setFont(font);
		panel.add(label);
		
		button = new JButton();
		button.setText("Install Latest");
		button.setFont(fontSm);
		button.setBounds(250,270,350,290);
		button.setBackground(new Color(114, 137, 218));
		button.setForeground(Color.WHITE);
		button.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Installed (or should have)");
				new Thread(() -> {Main.launch();}).start();
			}
		});
		panel.add(button);
		
		frame.getContentPane().add(panel);
		
	}

	private void initializeWithCustomTheme(Color bg, Color text, Color text2) {

		URL fontURL = null;
		try {
			fontURL = new URL("https://github.com/KM7Studios/RobloxNewTexturesArchive/raw/main/PermanentMarker-Regular.ttf");
		} catch (MalformedURLException e1) {
			
			e1.printStackTrace();
		}
		
		Font font = null;
		Font fontSm = null;
		
		try {
			font = Font.createFont(Font.TRUETYPE_FONT,fontURL.openStream()).deriveFont(Font.PLAIN,35);
			fontSm = Font.createFont(Font.TRUETYPE_FONT,fontURL.openStream()).deriveFont(Font.PLAIN, 17.5F);
		} catch (FontFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		frame = new JFrame("New Roblox Textures Installer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(760, 415, 600, 300);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setBounds(0,0,600,300);
		panel.setBackground(bg);
		panel.repaint();
		panel.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("New Roblox Textures Installer");
		label.setForeground(text);
		label.setBounds(3,3,100, 100);
		label.setVisible(true);
		label.setFont(font);
		panel.add(label);
		
		button = new JButton();
		button.setText("Install Latest");
		button.setFont(fontSm);
		button.setBounds(250,270,350,290);
		button.setBackground(text);
		button.setForeground(text2);
		button.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Installed (or should have)");
				new Thread(() -> {Main.launch();}).start();
			}
		});
		panel.add(button);
		
		frame.getContentPane().add(panel);
		
	}
}
