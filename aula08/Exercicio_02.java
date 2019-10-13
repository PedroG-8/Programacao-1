package aula08;
import java.util.Scanner;

public class Exercicio_02 
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
		System.out.printf("A soma das distâncias dos %d pontos à origem é %3.1f\n", numOfPoints, distanceSum);
		System.out.print("O ponto mais afastado da origem foi: ");
		pointFormat(furthestPoint);
	}
	
	public static Point2D readPoint() 
	{
		Point2D ler = new Point2D();
		System.out.println("Introduza um ponto:");
		System.out.print("Coordenada x: ");
		ler.x = kb.nextDouble();
		System.out.print("Coordenada y: ");
		ler.y = kb.nextDouble();
		return ler;
	}
	
	public static void pointFormat(Point2D point)
	{
		System.out.printf("(%2.1f,%2.1f)\n", point.x, point.y);
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

class Point2D
{
	double x, y;
}
