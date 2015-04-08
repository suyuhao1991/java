package main;

import java.awt.EventQueue;

import menu.Ice_cream_menu;

public class Main {
	
	public static Ice_cream_menu frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Ice_cream_menu();
					frame.setVisible(true);
					frame.pack();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
