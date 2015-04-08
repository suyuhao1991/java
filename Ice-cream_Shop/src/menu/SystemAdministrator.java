package menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import main.Main;
import decorator.NewDecorator;
import decorator.NewFlavor;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SystemAdministrator extends JFrame {

	/* variable declaration*/
	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	private JLabel lblName;
	public JRadioButton rdbtnFlavor;
	private JLabel lblPrice;
	public JRadioButton rdbtnNewRadioButton;
	public JButton btnAdd;
	private JButton btnCancel;
	public ButtonGroup rdbtngroup;
	public String name;
	public int price;

	/**
	 * Create the frame.
	 */
	public SystemAdministrator() {
		setType(Type.POPUP);
		contentPane = new JPanel();
		setBounds(5, 5, 358, 207);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblName = new JLabel("Name:");
		lblName.setName("Name:");
		lblName.setBounds(0, 1, 110, 67);
		contentPane.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setName("textField_1");
		textField_1.setBounds(97, 20, 110, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		rdbtnFlavor = new JRadioButton("Flavor");
		rdbtnFlavor.setName("rdbtnFlavor");
		rdbtnFlavor.setBounds(232, 0, 110, 67);
		contentPane.add(rdbtnFlavor);
		rdbtnFlavor.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setName("Price:");
		lblPrice.setBounds(0, 43, 110, 67);
		contentPane.add(lblPrice);
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField_1.setName("textField");
		textField.setBounds(97, 60, 110, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("Decorator");
		rdbtnNewRadioButton.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton.setBounds(232, 40, 110, 67);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		rdbtngroup = new ButtonGroup();  
        rdbtngroup.add(rdbtnFlavor);  
        rdbtngroup.add(rdbtnNewRadioButton); 
		
		btnAdd = new JButton("Add");
		btnAdd.setName("Add");
		btnAdd.setBounds(34, 122, 110, 35);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textField_1.getText();
				price = Integer.parseInt(textField.getText());
				if(rdbtnFlavor.isSelected() == true){
					if(Main.frame.flavor_position>=28){
						JOptionPane.showMessageDialog(Main.frame.saframe,
								"Sorry, we can't deal with that much kinds of flavor...",
								"Max number of flavor warning",
								JOptionPane.WARNING_MESSAGE);
					}else{
						JButton nfbtn;
						nfbtn = new NewFlavor(name,price);
						GridBagConstraints gbc_nfbtn = new GridBagConstraints();
						gbc_nfbtn.fill = GridBagConstraints.BOTH;
						gbc_nfbtn.insets = new Insets(0, 0, 5, 5);
						gbc_nfbtn.gridx = 0;
						gbc_nfbtn.gridy = Main.frame.flavor_position;
						Main.frame.contentPane.add(nfbtn, gbc_nfbtn,Main.frame.decorator_position);
						Main.frame.contentPane.revalidate();
						Main.frame.contentPane.repaint();
						Main.frame.pack();
						Main.frame.flavor_position++;
						nfbtn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Main.frame.flavor_price = price;
								Main.frame.sum = Main.frame.flavor_price + Main.frame.decorator_price;
								Main.frame.lblPrice.setText(Integer.toString(Main.frame.sum));
							}
						});
						
					}
				}else{
					if(rdbtnNewRadioButton.isSelected() == true){
						if(Main.frame.decorator_position>=28){
							JOptionPane.showMessageDialog(Main.frame.saframe,
									"Sorry, we can't deal with that much kinds of decorator...",
									"Max number of decorator warning",
									JOptionPane.WARNING_MESSAGE);
						}else{
							JButton ndbtn;
							ndbtn = new NewDecorator(name,price);
							GridBagConstraints gbc_ndbtn = new GridBagConstraints();
							gbc_ndbtn.fill = GridBagConstraints.BOTH;
							gbc_ndbtn.insets = new Insets(0, 0, 5, 5);
							gbc_ndbtn.gridx = 1;
							gbc_ndbtn.gridy = Main.frame.decorator_position;
							Main.frame.contentPane.add(ndbtn, gbc_ndbtn,Main.frame.decorator_position);
							Main.frame.contentPane.revalidate();
							Main.frame.contentPane.repaint();
							Main.frame.pack();
							Main.frame.decorator_position++;
						
							ndbtn.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									Main.frame.decorator_price = price + Main.frame.decorator_price;
									Main.frame.sum = Main.frame.flavor_price + Main.frame.decorator_price;
									Main.frame.lblPrice.setText(Integer.toString(Main.frame.sum));
								}
							});
						}
					}else{
						JOptionPane.showMessageDialog(Main.frame.saframe,
								"Hi my boss, you need to tell me this is a new flavor or a new decorator!",
								"No type selected warning",
								JOptionPane.WARNING_MESSAGE);
					}
				}
				Main.frame.repaint();
			}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.setName("Cancel");
		btnCancel.setBounds(195, 122, 110, 35);
		contentPane.add(btnCancel);  
        
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
	}
}
