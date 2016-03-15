package demo.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}

//	public Point getPointA() {
//		return pointA;
//	}
//
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//
//	public Point getPointC() {
//		return pointC;
//	}
//
//
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
//
//
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
	private ApplicationContext context;

	public void draw() {
//		System.out.println("Point B: " + pointB.getX() + ":" + pointC.getX() );
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("bean name is :" + name);
		
	}
}
