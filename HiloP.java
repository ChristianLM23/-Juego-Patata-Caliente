import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class HiloP extends Thread {
	
	JLabel label;
	JButton centro;
	JLabel frase;
	
	HiloP (JLabel label, JButton centro, JLabel frase){
		this.label=label;
		this.centro = centro;
		this.frase=frase;
	}
	
	public void run(){
		for(int i=15;i>=0;i--){
			label.setText(String.valueOf(i));
			if(label.getText().equals("10")){
				centro.setIcon(new ImageIcon("./imagenes/" + "images.jpg"));
				
			}
			
			else if(label.getText().equals("5")){
				centro.setIcon(new ImageIcon("./imagenes/" + "logo.png"));
				
			}
			
			else if(label.getText().equals("0")){
				
				centro.setIcon(new ImageIcon("./imagenes/" + "boom.jpg"));
				frase.setText("¡SE ACABÓ!");
			}
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Problema con el reloj");
			}
			}
		}
}
