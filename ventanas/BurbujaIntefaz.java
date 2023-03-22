/**************************************
 * nombre: Eletzer Jared			  *
 * 	 Galicia Cordova 				  *
 * fecha de creacion: 20/03/2023	  * 
 * fecha de modificacion: 21/03/2023  *
 * descripcion: Implementacion de 	  *
 * 	algoritmo de ordenacion burbuja   *
 *	con interfaz grafica  			  *
 **************************************/

package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import algoritmos.Burbuja;

public class BurbujaIntefaz extends JFrame implements ActionListener {

	private JLabel label;
	private JPanel panel;
	private JButton button;
	private JLabel wallpaper;
	private JTextField auxField;
	private JComboBox<String> combo;
	private ArrayList<JTextField> field;

	private int fieldX;
	
	public BurbujaIntefaz() {
		instanceComponents();
		initComponents();
		this.setVisible(true);
		this.setSize(700, 400);
		this.setTitle("Burbuja");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public void instanceComponents() {
		fieldX = 55;
		panel = new JPanel();
		button = new JButton("Ordenar");
		wallpaper = new JLabel();
		label = new JLabel("Array");
		combo = new JComboBox<String>();
		field = new ArrayList<JTextField>();
		panel.setLayout(null);
	}
	
	public void initComponents() {
		panel.removeAll();
		// Set wallpaper to label
		wallpaper.setBounds(0, 0, 700, 400);
		ImageIcon imagen = new ImageIcon("./src/images/wallpaperPrincipal.jpg");
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(wallpaper.getWidth(),
				wallpaper.getHeight(), Image.SCALE_DEFAULT));
		wallpaper.setIcon(icono);
		
		// set Properties to label
		label.setBounds(30, 30, 160, 30);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Areal", Font.BOLD, 24));
		
		// Set properties to TextField
		createTextField(1);
		
		// Set properties to combo box
		combo.setEditable(false);
		combo.addItem("1");
		combo.addItem("2");
		combo.addItem("3");
		combo.addItem("4");
		combo.addItem("5");
		combo.addItem("6");
		combo.addItem("7");
		combo.addItem("8");
		combo.addItem("9");
		combo.addItem("10");
		
		combo.setSelectedIndex(0);
		combo.addActionListener(this);
		combo.setBounds(20, 125, 70, 30);
		combo.setAlignmentX((float) 0.5);
		
        // Set properties to button
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(102,153,255));
        button.setFont(new Font("Areal", Font.BOLD, 22));
        button.addActionListener(this);
        button.setBounds(60, 175, 150, 25);
        
        // set components to panel
		panel.add(label);
		panel.add(combo);
		panel.add(button);
		panel.add(wallpaper);
		
		this.add(panel);
	}
	
	public void createTextField(int code) {

		fieldX = 55;
		for (JTextField component : field) {
			panel.remove(component);
		}
		int index = field.size();
		System.out.println("size array: " + index);
		field.clear();
		
		for (int i = 0; i < code ; i++) {
			
			auxField = new JTextField();
			auxField.setForeground(Color.WHITE);
			auxField.setHorizontalAlignment(JTextField.CENTER);
			auxField.setBackground(new Color(102,153,255));
			auxField.setFont(new Font("Areal", Font.BOLD, 22));
			auxField.setBounds(fieldX, 70, 30,  25);
			auxField.setVisible(true);
			
			fieldX += 40;
			
			field.add(auxField);
			panel.add(field.get(field.size() - 1));
			auxField = new JTextField();
//			System.out.println("field: " + field.get(index).toString());s
		}
		
//		if (panel.getComponentCount() != 0) {
//			panel.remove(wallpaper);
//		}
//		panel.add(wallpaper);
//		auxField = field
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == combo) {
			int code = (combo.getSelectedIndex() + 1);
			System.out.println("code: " + code);
		
				createTextField(code);
		}
		if (e.getSource() == button) {
			
			int index = 0;
			
			String cads[] = new String[combo.getSelectedIndex() + 1];
			int array[] = new int[cads.length];
			
			// Recolectar datos
			System.out.println("event Button");
			for (String string : cads) {
				string = field.get(index).getText().trim();
				System.out.println(string);
				if(string.equals("")) {
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
					index = 9999;
					break;
				// Comvertir datos
				} else {
					try {
						array[index] = Integer.parseInt(string);
					} catch (Exception e2) {
						index = 9999;
						JOptionPane.showInternalMessageDialog(null, "Solo debe ingresar numeros enteros");
						break;
					}
				}
				index++;
			}
			// Continue with operations
			if(index != 9999) { 
				array = Burbuja.orderArray(array);
				
				String cad;
				index = 0;
				for (int i : array) {
					cad = String.valueOf(i);
					field.get(index).setText(cad);
					index++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new BurbujaIntefaz();
	}
}
