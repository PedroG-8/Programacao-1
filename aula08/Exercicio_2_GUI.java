package aula08;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_2_GUI 
{

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Point2D point = new Point2D();
		Point2D furthestPoint = new Point2D();
		double distanceSum = 0;
		int numOfPoints = 0;
		while(true)
		{
			point = readPoint();
			if(point.x == 0 && point.y == 0)
			{
				break;
			}
			else
			{
				numOfPoints++;
				distanceSum = distanceSum + distanceToZero(point);
				if(distanceToZero(point) > distanceToZero(furthestPoint))
				{
					furthestPoint = point;
				}
				
			}
		}
		String s = String.format("A soma das distâncias dos %d pontos à origem é %3.1f\n", numOfPoints, distanceSum);
		String v = String.format("O ponto mais afastado da origem foi: %s", pointFormat(furthestPoint));
		JOptionPane.showMessageDialog(null, s + v, "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static Point2D readPoint() 
	{
		Point2D ler = new Point2D();
		ler.x = Double.parseDouble(JOptionPane.showInputDialog(null, "Coordenada x: ", "Introduza um ponto", JOptionPane.PLAIN_MESSAGE));
		ler.y = Double.parseDouble(JOptionPane.showInputDialog(null, "Coordenada y: ", "Introduza um ponto", JOptionPane.PLAIN_MESSAGE));
		return ler;
	}
	
	public static String pointFormat(Point2D point)
	{
		return String.format("(%2.1f,%2.1f)\n", point.x, point.y);
	}
	
	public static double distanceTwoPoint(Point2D point1, Point2D point2) 
	{
		return Math.sqrt(Math.pow(Math.abs(point1.x - point2.x), 2) + Math.pow(Math.abs(point1.y - point2.y), 2));
	}
	
	public static double distanceToZero(Point2D point) 
	{
		return Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2));
	}
}