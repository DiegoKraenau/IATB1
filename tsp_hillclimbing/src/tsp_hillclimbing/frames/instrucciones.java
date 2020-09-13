package tsp_hillclimbing.frames;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class instrucciones extends JFrame {

	private JPanel contentPane;
	static instrucciones frame = new instrucciones();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public class Imagen extends javax.swing.JPanel {
		 
		public Imagen() {
		this.setSize(300, 400); //se selecciona el tamaño del panel
		}
		 
		//Se crea un método cuyo parámetro debe ser un objeto Graphics
		 
		public void paint(Graphics grafico) {
		Dimension height = getSize();
		 
		//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
		 
		ImageIcon Img = new ImageIcon(getClass().getResource("/HISbC.png")); 
		 
		//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
		 
		grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
		 
		setOpaque(false);
		super.paintComponent(grafico);
		}
		}
public instrucciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		this.setLocationRelativeTo(null);
		menu menuForm = new menu();
		
		
		JLabel lblNewLabel = new JLabel("Instrucciones");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				menuForm.setVisible(true);
			}
		});
		
		JLabel regla1 = new JLabel("1. Ingresar el n\u00FAmero de ciudades");
		regla1.setFont(new Font("Arial", Font.PLAIN , 18));
		
		JLabel lblIngresarLos = new JLabel("2. Ingresar los nombres de las respectivas ciudades");
		lblIngresarLos.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblIngresarLa = new JLabel("3. Ingresar la latitud");
		lblIngresarLa.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblIngresar = new JLabel("4. Ingresar la longitud");
		lblIngresar.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblCalcular = new JLabel("5. Calcular");
		lblCalcular.setFont(new Font("Arial", Font.PLAIN, 18));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(87)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCalcular, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIngresarLa, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(regla1, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIngresar, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIngresarLos, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(301)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(283)
							.addComponent(lblNewLabel)))
					.addContainerGap(180, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel)
					.addGap(40)
					.addComponent(regla1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblIngresarLos, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblIngresarLa, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblIngresar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblCalcular, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
