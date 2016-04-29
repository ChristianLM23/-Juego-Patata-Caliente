import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AppPatata extends JFrame {

	private JPanel contentPane;
	private JLabel titulotema;
	private JLabel tema;
	private JButton centro;
	int random;
	private JLabel label;
	private JLabel frase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppPatata frame = new AppPatata();
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
	public AppPatata() {
		setTitle("Patata Caliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		titulotema = new JLabel("");
		titulotema.setHorizontalAlignment(SwingConstants.CENTER);
		titulotema.setFont(new Font("Tahoma", Font.PLAIN, 11));
		titulotema.setBounds(121, 11, 100, 14);
		contentPane.add(titulotema);

		tema = new JLabel("");
		tema.setFont(new Font("Tahoma", Font.BOLD, 20));
		tema.setHorizontalAlignment(SwingConstants.CENTER);
		tema.setBounds(10, 36, 331, 41);
		contentPane.add(tema);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(252, 419, 89, 23);
		contentPane.add(btnSalir);

		JButton empezar = new JButton("Empezar");
		empezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				titulotema.setText("Tema");
				frase.setText("Piensa, piensa...");
				random = (int) (Math.random() * 28);
				centro.setIcon(new ImageIcon("./imagenes/" + "patata.jpg"));

				switch (random) {
				case 0:
					tema.setText("Jugadores de fútbol");
					break;
				case 1:
					tema.setText("Jugadores de baloncesto");
					break;
				case 2:
					tema.setText("Marcas");
					break;
				case 3:
					tema.setText("Colores");
					break;
				case 4:
					tema.setText("Jugadores de tenis");
					break;
				case 5:
					tema.setText("Videojuegos");
					break;
				case 6:
					tema.setText("Deportes de balón");
					break;
				case 7:
					tema.setText("Deportes de raqueta");
					break;
				case 8:
					tema.setText("Carreras universitarias");
					break;
				case 9:
					tema.setText("Actores");
					break;
				case 10:
					tema.setText("Películas con un Oscar (al menos)");
					break;
				case 11:
					tema.setText("Emisoras de radio");
					break;
				case 12:
					tema.setText("Enfermedades mortales");
					break;
				case 13:
					tema.setText("Ciudades españolas");
					break;
				case 14:
					tema.setText("Ciudades inglesas");
					break;
				case 15:
					tema.setText("Estados norteamericanos");
					break;
				case 16:
					tema.setText("Equipos de fútbol");
					break;
				case 17:
					tema.setText("Equipos de la NBA");
					break;
				case 18:
					tema.setText("Deportistas de nacionalidad española");
					break;
				case 19:
					tema.setText("Deportes individuales");
					break;
				case 20:
					tema.setText("Deportes grupales");
					break;
				case 21:
					tema.setText("Canciones de Eurovisión");
					break;
				case 22:
					tema.setText("Estadios de fútbol");
					break;
				case 23:
					tema.setText("Periódicos");
					break;
				case 24:
					tema.setText("Marcas de móviles");
					break;
				case 25:
					tema.setText("Presidentes");
					break;
				case 26:
					tema.setText("Juegos de mesa");
					break;
				case 27:
					tema.setText("Cantantes");
					break;
				}

				HiloP h1 = new HiloP(label, centro,frase);
				h1.start();
				

			}

		});
		empezar.setBounds(10, 419, 89, 23);
		contentPane.add(empezar);

		centro = new JButton("");
		centro.setBounds(44, 125, 256, 237);
		contentPane.add(centro);

		label = new JLabel("");
		label.setEnabled(false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(121, 423, 100, 14);
		contentPane.add(label);
		
		frase = new JLabel("");
		frase.setFont(new Font("Tahoma", Font.ITALIC, 14));
		frase.setHorizontalAlignment(SwingConstants.CENTER);
		frase.setBounds(52, 88, 248, 14);
		contentPane.add(frase);

	}
}