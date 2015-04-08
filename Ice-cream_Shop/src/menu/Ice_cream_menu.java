package menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ice_cream_menu extends JFrame {

	/* variable declaration*/
	public JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblDecorator;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnV;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_1;
	public JLabel lblPrice;
	public JButton btnSystem;
	public GridBagConstraints gbc_btnSystem;
	public SystemAdministrator saframe;

	public int flavor_price = 0;
	public int decorator_price = 0;
	public int sum = 0;
	public String name;
	public int price;
	public int type;
	public int flavor_position = 3;
	public int decorator_position = 3;
	

	/**
	 * Create the frame.
	 */
	public Ice_cream_menu() {
		setResizable(false);
		flavor_price = 0;
		decorator_price = 0;
		sum = 0;
		
		setTitle("Ice-cream Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{143, 143, 170, 0};
		gbl_contentPane.rowHeights = new int[]{29, 29, 29, 0, 0, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel = new JLabel("ICE-CREAM Flavor");
		lblDecorator = new JLabel("Decorator");
		btnNewButton = new JButton("New Ice-Cream");
		btnNewButton.setName("New Ice-Cream");
		btnNewButton_1 = new JButton("[Chocolate,$20]");
		btnNewButton_1.setName("[Chocolate,$20]");
		btnNewButton_2 = new JButton("[M&M, $5]");
		btnNewButton_2.setName("[M&M, $5]");
		btnV = new JButton("[Vanilla,$20]");
		btnV.setName("[Vanilla,$20]");
		btnNewButton_3 = new JButton("[Strawberry, $4]");
		btnNewButton_3.setName("[Strawberry, $4]");
		lblNewLabel_1 = new JLabel("Total:");
		lblPrice = new JLabel("0");
		lblPrice.setName("price");
		btnSystem = new JButton("System Administrator");
		btnSystem.setName("System Administrator");
		
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		
		lblDecorator.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDecorator = new GridBagConstraints();
		gbc_lblDecorator.fill = GridBagConstraints.BOTH;
		gbc_lblDecorator.insets = new Insets(0, 0, 5, 5);
		gbc_lblDecorator.gridx = 1;
		gbc_lblDecorator.gridy = 0;
		contentPane.add(lblDecorator, gbc_lblDecorator);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flavor_price = 0;
				decorator_price = 0;
				sum = flavor_price + decorator_price;
				lblPrice.setText(Integer.toString(sum));
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flavor_price = 20;
				sum = flavor_price + decorator_price;
				lblPrice.setText(Integer.toString(sum));
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decorator_price = decorator_price + 5;
				sum = flavor_price + decorator_price;
				lblPrice.setText(Integer.toString(sum));
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 1;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flavor_price = 20;
				sum = flavor_price + decorator_price;
				lblPrice.setText(Integer.toString(sum));
			}
		});
		GridBagConstraints gbc_btnV = new GridBagConstraints();
		gbc_btnV.anchor = GridBagConstraints.NORTH;
		gbc_btnV.fill = GridBagConstraints.BOTH;
		gbc_btnV.insets = new Insets(0, 0, 5, 5);
		gbc_btnV.gridx = 0;
		gbc_btnV.gridy = 2;
		contentPane.add(btnV, gbc_btnV);
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decorator_price = decorator_price + 4;
				sum = flavor_price + decorator_price;
				lblPrice.setText(Integer.toString(sum));
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 2;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrice.fill = GridBagConstraints.BOTH;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 6;
		contentPane.add(lblPrice, gbc_lblPrice);
		
		btnSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saframe = new SystemAdministrator();
				saframe.setVisible(true);
			}
		});
		gbc_btnSystem = new GridBagConstraints();
		gbc_btnSystem.fill = GridBagConstraints.BOTH;
		gbc_btnSystem.insets = new Insets(0, 0, 5, 5);
		gbc_btnSystem.gridx = 0;
		gbc_btnSystem.gridy = 28;
		contentPane.add(btnSystem, gbc_btnSystem);
		
	}
}
