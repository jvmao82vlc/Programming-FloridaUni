package Ventana1_Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import Ventana2_Juego.Juego;
import javax.swing.JComboBox;


public class Login extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	
	//Asignar Nombres a los campos de Texto y a los Botones//
	private JPanel contentPane;
	private JTextField nombreJText;
	private JTextField apellido1JText;
	private JTextField apellido2JText;
	private JTextField edadJText;
	private JLabel generoJText;
	private JComboBox comboBox;
	private JTextField idJText;
	private JButton boton1;
	private JTextField datosJugadorJText;

	
	//Generar Nuevo Jugador//
	Jugador jugador1 = new Jugador();
	
	
	
	public Login() {
		setForeground(Color.BLACK);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		setBackground(Color.LIGHT_GRAY);
		
				//Inicio Jugador//
				jugador1.setNombre(" ");
				jugador1.setApellido1(" ");
				jugador1.setApellido2(" ");
				jugador1.setEdad(99);
				jugador1.setGenero(" ");
				jugador1.setId(1001);
				
		
				//Propiedades Ventana//
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 321);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(32, 178, 170));
				contentPane.setBorder(new CompoundBorder(new LineBorder(null), null));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				//Con el comando setLocationRelativeTo centramos la ventana del Juego en el CENTRO de la Pantalla//
				setLocationRelativeTo(null);
				//Impedimos que la Ventana se puedad hacer m�s grande//
				setResizable(false);
	

				//ETIQUETA JUGADOR//
				JLabel EtiquetaJugador = new JLabel("JUGADOR");
				EtiquetaJugador.setHorizontalAlignment(SwingConstants.CENTER);
				EtiquetaJugador.setFont(new Font("Mongolian Baiti", Font.BOLD, 14));
				EtiquetaJugador.setBounds(91, 11, 310, 14);
				contentPane.add(EtiquetaJugador);
				
				
				
				//----------------Etiqueta NOMBRE---------------// 
				JLabel EtiquetaNombre = new JLabel("NOMBRE");
				EtiquetaNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaNombre.setBounds(10, 42, 71, 14);
				contentPane.add(EtiquetaNombre);
				//Texto para Nombre//
				nombreJText = new JTextField();
				//KEY LISTENER PARA EL NOMBRE// 
				nombreJText.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent evt) {
						//SOLO ADMITE LETRAS EN MAY�SCULAS,MIN�SCULAS Y LA TECLA SPACE, PERO NO N�MEROS//
						char c = evt.getKeyChar();
						if((c <'a' || c >'z') && (c < 'A' || c > 'Z') && (c !=KeyEvent.VK_SPACE)) evt.consume();
					}
				});
				nombreJText.setBackground(new Color(204, 255, 255));
				//Action Listener Nombre//
				nombreJText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//Presionar ENTER y pasar al siguiente texto//
						evt.setSource((char)KeyEvent.VK_ENTER);
						apellido1JText.requestFocus();
						jugador1.setNombre(nombreJText.getText());  	
					}
				});
				nombreJText.setBounds(91, 39, 310, 20);
				contentPane.add(nombreJText);
				nombreJText.setColumns(10);
				//-------------------------------------------------------------//
				
				
				
				//----------------Etiqueta APELLIDO1------------------//
				JLabel EtiquetaApellido1 = new JLabel("APELLIDO1");
				EtiquetaApellido1.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaApellido1.setBounds(10, 67, 71, 14);
				contentPane.add(EtiquetaApellido1);
				//Texto para Apellido1//
				apellido1JText = new JTextField();
				//KEY LISTENER para el APELLIDO1// 
				apellido1JText.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent evt) {
						//SOLO ADMITE LETRAS EN MAY�SCULA,MIN�SCULA Y LA TECLA SPACE, PERO NO N�MEROS//
						char c = evt.getKeyChar();
						if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c !=KeyEvent.VK_SPACE)) evt.consume();
					}
				});
				apellido1JText.setBackground(new Color(204, 255, 255));
				apellido1JText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//Presionar ENTER y pasar al siguiente texto//
						evt.setSource((char)KeyEvent.VK_ENTER);
						apellido2JText.requestFocus();
						jugador1.setApellido1(apellido1JText.getText());
					}
				});
				apellido1JText.setBounds(91, 64, 310, 20);
				contentPane.add(apellido1JText);
				apellido1JText.setColumns(10);
				//-----------------------------------------------------------//
			
				
				
				//-----------------Etiqueta APELLIDO2-----------------------//
				JLabel EtiquetaApellido2 = new JLabel("APELLIDO2");
				EtiquetaApellido2.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaApellido2.setBounds(10, 92, 71, 14);
				contentPane.add(EtiquetaApellido2);
				//Texto para APELLIDO2//
				apellido2JText = new JTextField();
				//KEY LISTENER para el APELLIDO2// 
				apellido2JText.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent evt) {
						//SOLO ADMITE LETRAS EN MAY�SCULA,MIN�SCULA Y LA TECLA SPACE, PERO NO N�MEROS//
						char c = evt.getKeyChar();
						if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c !=KeyEvent.VK_SPACE)) evt.consume();
						//else if ( Character.isWhitespace( evt.getKeyCode())) evt.consume(); (No utilizar por el momento// 
					}
				});
				apellido2JText.setBackground(new Color(204, 255, 255));
				apellido2JText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//Presionar ENTER y pasar al siguiente texto//
						evt.setSource((char)KeyEvent.VK_ENTER);
						edadJText.requestFocus();
						jugador1.setApellido2(apellido2JText.getText());
					}
				});
				apellido2JText.setBounds(91, 89, 310, 20);
				contentPane.add(apellido2JText);
				apellido2JText.setColumns(10);
				//----------------------------------------------------------------//
				
				
				
				//-----------------Etiqueta EDAD-------------------//
				JLabel EtiquetaEdad = new JLabel("EDAD");
				EtiquetaEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaEdad.setBounds(10, 117, 71, 14);
				contentPane.add(EtiquetaEdad);
				
				//Texto para Edad//
				edadJText = new JTextField();
				//KEY LISTENER PARA LA EDAD// 
				edadJText.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent evt) {
						//SOLO ADMITE N�MEROS Y NO PERMITE ESCRIBIR LETRAS//
						char c = evt.getKeyChar();
						if(c<'0' || c>'9') evt.consume();
					}
				});
				edadJText.setBackground(new Color(204, 255, 255));
				edadJText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//Presionar ENTER y pasar al siguiente texto//
						evt.setSource((char)KeyEvent.VK_ENTER);
						idJText.requestFocus();
						
						//Limita la Edad hasta 2 d�gitos//
						if(jugador1.isNumeric(edadJText.getText())==true){
						jugador1.setEdad(Integer.parseInt(edadJText.getText()));
						}else{ 
							jugador1.setEdad(99);
						}
					}
				});
				edadJText.setBounds(91, 114, 310, 20);
				contentPane.add(edadJText);
				edadJText.setColumns(10);
				//----------------------------------------------------------------//
				
				
				//----------------Etiqueta Desplegable Para G�NERO-------------------//
				generoJText = new JLabel("G\u00C9NERO");
				generoJText.setFont(new Font("Tahoma", Font.BOLD, 11));
				generoJText.setBounds(10, 142, 46, 14);
				contentPane.add(generoJText);
				
				comboBox = new JComboBox();
				//Action Listener en el ComoBox para poder seleccionar varias opciones dentro de la pesta�a//
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						comboBox.getSelectedItem().toString();
					}
				});
				comboBox.addItem(" HOMBRE ");
				comboBox.addItem(" MUJER ");
				comboBox.setBackground(new Color(204, 255, 255));
				comboBox.setBounds(91, 139, 310, 20);
				contentPane.add(comboBox);
				//-----------------------------------------------------------------//
				
				
				
				//----------------------Etiqueta ID---------------------------------//
				JLabel EtiquetaID = new JLabel("ID");
				EtiquetaID.setFont(new Font("Tahoma", Font.BOLD, 11));
				EtiquetaID.setBounds(10, 174, 71, 14);
				contentPane.add(EtiquetaID);
				//Texto para ID//
				idJText = new JTextField();
				idJText.setFont(new Font("Tahoma", Font.BOLD, 12));
				
				//KEYLISTENER QUE IMPIDE QUE SE PUEDA MODIFICAR EL TEXTO DE LA ETIQUETA ID//
				idJText.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent evt) {
						idJText.setEnabled(false);
					}
				});
				
				//ID se asgina por defecto al primer jugador//
				idJText.setText(" ");
				idJText.setBackground(new Color(204, 255, 255));
				idJText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						//Mediante la Clase Random Generamos el ID de Forma aleatoria
						//de 0 a 999 incluido y se muestra al presionar ENTER//
						Random aleatorio = new Random();
						int valor = aleatorio.nextInt(1000);
						idJText.setText(Integer.toString(valor));
						//Presionar ENTER y pasar al siguiente texto//
						evt.setSource((char)KeyEvent.VK_ENTER);
						boton1.requestFocus();
					}
				});
				idJText.setBounds(91, 171, 310, 20);
				contentPane.add(idJText);
				idJText.setColumns(10);
				//--------------------------------------------------------------------------//
				
				
				
				
				//------------------------------Boton JUGAR--------------------------------//  
				boton1 = new JButton("JUGAR >>>");
				boton1.setForeground(new Color(0, 0, 0));
				boton1.setFont(new Font("Myriad Web Pro Condensed", Font.BOLD, 14));
				boton1.addActionListener(new ActionListener() {
					
				public void actionPerformed(ActionEvent evt) {
					//Generar Nueva Variable v1 para referirnos a la Ventana Login//
					Login v1 = new Login();
					//Generar Nueva Variable v2 dentro del Bot�n JUGAR para pasar a la siguiente Ventana de Juego//
					Juego v2 = new Juego();
					
					//Action Listener para EDAD dentro del Boton JUGAR//
					if (jugador1.getEdad()== 99){
						//Muestra otra ventana con la opci�n JOptionPane donde se indica que la EDAD es incorrecta//
						JOptionPane.showMessageDialog(null, "La EDAD es incorrecta - Vu�lvala a escribir y pulse Intro");
						datosJugadorJText.setText("EDAD incorrecta");
						return;
					}
					
					
					//Action Listener cuando falta el NOMBRE  o existen espacios en BLANCO en los campos//	
					else if (jugador1.espaciosBlanco(jugador1.getNombre()))
					{
						//Muestra otra Ventana, con la opci�n JOptionPane donde se indica que falta el Nombre del jugador//
						JOptionPane.showMessageDialog(null, "Falta Nombre - Vu�lvalo a escribir y pulse Intro");
						datosJugadorJText.setText("Falta Nombre"); 
						return;
					}
					
					
					//Action Listener cuando falta el APELLIDO1  o existen espacios en BLANCO en los campos//
					else if (jugador1.espaciosBlanco(jugador1.getApellido1()))
					{
						//Muestra otra Ventana donde se indica que falta el Apellido1 del jugador//
						JOptionPane.showMessageDialog(null, "Falta Apellido1 - Vu�lvalo a escribir y pulse Intro");
						datosJugadorJText.setText("Falta Apellido 1"); 
						return;
					}
					//Action Listener cuando falta el APELLIDO2  o existen espacios en BLANCO en los campos//
					else if (jugador1.espaciosBlanco(jugador1.getApellido2()))
					{
						//Muestra otra Ventana donde se indica que falta el Apellido2 del jugador//
						JOptionPane.showMessageDialog(null, "Falta Apellido2 - Vu�lvalo a escribir y pulse Intro");
						datosJugadorJText.setText("Falta Apellido 2");
						return;
					}else{
					//Salida de Datos en Ventana Login//
					datosJugadorJText.setText("JUGADOR: "+jugador1.getNombre()+ " " +jugador1.getApellido1()+ " " +jugador1.getApellido2()+ " " +jugador1.getEdad()+ " " +comboBox.getSelectedItem()+ " " +jugador1.getId());
					}
					
					//Se introduce una excepci�n con Try para evitar errores al pasar a la ventana Juego//
						try{
						//Pasar a Ventana_Juego al presionar el bot�n JUGAR//
						v2.setVisible(true);
						//v2.setText(nombreJText.getText());// (Necesito conseguir el setText del v2 para pasar el nombre//
						}catch (Exception e){
							e.getMessage();
						}
				
					
					//Se introduce una excepci�n con Try para evitar errores al pasar el Nombre a la ventana Juego//
				    	try {
				    	//Pasar el Nombre de la Ventana LOGIN a la Ventana JUEGO mediante la creaci�n de una nueva variable llamada p1//
						Jugador p1 = new Jugador();
						p1.setNombre(nombreJText.getText());
				    	//Nombre del Jugador es enviado a la Ventana_Juego//
				    	v2.setJugador(p1);
				    	}catch (Exception e){
				    		e.getMessage();
				    	}
				    
				     
				     //Cierra la Ventana LOGIN cuando todos los campos est�n correctos//
				     //dispose();
					
					//Salida de Datos en Consola Java//
					System.out.println("Jugador: "+jugador1.getNombre()+ " " +jugador1.getApellido1()+ " " +jugador1.getApellido2()+ " " +jugador1.getEdad()+ " a�os " +comboBox.getSelectedItem()+ " " +jugador1.getId());
				 	}
				});
				boton1.setBounds(183, 202, 122, 29);
				contentPane.add(boton1);
				//------------------------------------Final C�digo Bot�n JUGAR-----------------------------------------------//
				
				
				
				//-------------------------------Recogida de DATOS-------------------------------------//
				datosJugadorJText = new JTextField();
				datosJugadorJText.setBackground(Color.ORANGE);
				datosJugadorJText.setBounds(91, 242, 310, 29);
				contentPane.add(datosJugadorJText);
				datosJugadorJText.setColumns(10);
				//-------------------------------------------------------------------------------------//
				
	}
	
}