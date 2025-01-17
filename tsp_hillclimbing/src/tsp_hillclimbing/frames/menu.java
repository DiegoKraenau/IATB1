package tsp_hillclimbing.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tsp_hillclimbing.entities.Ciudad;
import tsp_hillclimbing.entities.HillClimbing;
import tsp_hillclimbing.entities.Ruta;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ArrayList<Ciudad> ciudadesIniciales=new ArrayList<Ciudad>();
	private int contadorCiudades=0;
	private int contador=1;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		this.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Setear");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 302, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -358, SpringLayout.EAST, contentPane);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 119, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -149, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 17, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 120, SpringLayout.NORTH, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hill Climbing");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 284, SpringLayout.WEST, contentPane);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de ciudades:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 49, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -7, SpringLayout.NORTH, textField);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 119, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de la Ciudad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 137, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -402, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 17, SpringLayout.SOUTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Latitud de la Ciudad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1, 19, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_1, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2_1, -321, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 20, SpringLayout.SOUTH, lblNewLabel_2_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 119, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Longitud de la Ciudad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1_1, 20, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_1_1, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2_1_1, -236, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, lblNewLabel_2_1_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, -149, SpringLayout.EAST, contentPane);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 35, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton);
		
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		contentPane.add(btnNewButton_1);
		
		JLabel lblHill = new JLabel("Ciudades");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHill, 50, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHill, 261, SpringLayout.WEST, contentPane);
		lblHill.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblHill);
		
		JLabel lblHill_1 = new JLabel("(");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHill_1, 0, SpringLayout.NORTH, lblHill);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHill_1, 6, SpringLayout.EAST, lblHill);
		lblHill_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblHill_1);
		
		JLabel lblHill_2 = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHill_2, 0, SpringLayout.NORTH, lblHill);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHill_2, 6, SpringLayout.EAST, lblHill_1);
		lblHill_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblHill_2);
		
		JLabel lblDe = new JLabel("de");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDe, 0, SpringLayout.NORTH, lblHill);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDe, 6, SpringLayout.EAST, lblHill_2);
		lblDe.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblDe);
		
		JLabel lblHill_2_1 = new JLabel("0");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHill_2_1, 0, SpringLayout.NORTH, lblHill);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHill_2_1, 6, SpringLayout.EAST, lblDe);
		lblHill_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblHill_2_1);
		
		JLabel lblHill_1_1 = new JLabel(")");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHill_1_1, 0, SpringLayout.NORTH, lblHill);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHill_1_1, 6, SpringLayout.EAST, lblHill_2_1);
		lblHill_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblHill_1_1);
		
		JTextArea textArea = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.WEST, textArea, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textArea, -18, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textArea, 0, SpringLayout.EAST, textField);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Camino mas corto:");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -122, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textArea, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, textField);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorCiudades=Integer.parseInt(textField.getText());
				System.out.println(contadorCiudades);
				lblHill_2.setText("1");
				lblHill_2_1.setText(textField.getText());
				btnNewButton.setEnabled(false);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(contador>contadorCiudades) {
					contador=contadorCiudades;
				}else {
					
				}
				contador++;
				

				lblHill_2.setText(String.valueOf(contador));
				ciudadesIniciales.add(new Ciudad(textField_1.getText(), Double.parseDouble(textField_2.getText()), Double.parseDouble(textField_3.getText())));
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				System.out.println(ciudadesIniciales.size());
				if(contador-1==contadorCiudades) {
					btnNewButton_1.setEnabled(false);
					Ruta ruta=new Ruta(ciudadesIniciales);
					System.out.print(ruta+" |    "+ruta.getDistancialTotalString());
					Ruta rutaNueva= new HillClimbing().encontrarRutaMasCorta(ruta);
					System.out.println("-----------------------");
					System.out.println(rutaNueva.getCiudades());
					System.out.println(rutaNueva.getDistanciaTotal());
					textArea.setText(rutaNueva.getCiudades()+ "Total km:"+rutaNueva.getDistanciaTotal());
				}
			}
		});
	}
}
