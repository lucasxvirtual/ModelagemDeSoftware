package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import controller.Clock;
import controller.Controller;
import interfaces.Observed;
import interfaces.Observed.Get;
import interfaces.Observer;

public class AnalogPanel extends JPanel implements Observer{
	
	private Graphics2D g2d;
	private int diameter;
	private BufferedImage bufferedImage;
	private Controller controller;
	
	public AnalogPanel(){
		controller = Controller.getInstance();
		controller.add(this);
		
		try{
			bufferedImage = ImageIO.read(getClass().getResource("/images/analogico.jpg"));
		} catch (Exception e){
			System.out.println("Erro ao abrir imagem: " + e.getMessage());
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.drawImage(bufferedImage, 0, 0, null);
		g2d = (Graphics2D)g;
		
		paintPointers();
		
	}
	
	public void paintPointers(){
		diameter = 450;
		
		int handMax = 200;
		g2d.setColor(Color.BLUE);
		double seconds = controller.get(Get.Second)/60.0;
		drawRadius(seconds, -diameter/16, handMax);
		
		handMax = 150;
		Stroke strokeMinute = new BasicStroke(2f);
		g2d.setStroke(strokeMinute);
		g2d.setColor(Color.RED);
		
		double minutes = (controller.get(Get.Minute)+seconds)/60.0;
		drawRadius(minutes, 0, handMax);
		
		handMax = 120;
		Stroke strokeHour = new BasicStroke(4f);
		g2d.setStroke(strokeHour);
		g2d.setColor(Color.BLACK);
		
		double hours = (controller.get(Get.Hour)+minutes)/12.0;
		drawRadius(hours, 0, handMax);
	}
	
	public void drawRadius(double percent, int minRadius, int maxRadius){
		double radians = (0.5 - percent) * (2.0*Math.PI);
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		
		double dxMin = (diameter/2) + (minRadius * sine);
		double dyMin = (diameter/2) + (minRadius * cosine);
		
		double dxMax = (diameter/2) + (maxRadius * sine);
		double dyMax = (diameter/2) + (maxRadius * cosine);
		
		g2d.draw(new Line2D.Double(dxMin, dyMin, dxMax, dyMax));
	}

	@Override
	public void notify(Observed o) {
		repaint();
	}
	
}
