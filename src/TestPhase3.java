

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ardoise.PointPlan;

public class TestPhase3 {

	@Test
	public void TriangleOK() {
		PointPlan p1 ,p2 ,p3 ;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		p3 = new PointPlan(128,13);
		Triangle t = new Triangle("testTriangel" ,p1 ,p2 ,p3) ;
		t.dessiner();
		t.deplacer(10, 10);
		System.out.println(t.toString()) ;
		System.out.println(t.getPoint1()) ;
		System.out.println(t.getPoint2()) ;
		System.out.println(t.getPoint3()) ;
		System.out.println(t.typeForme()) ;
		
	}
	@Test
	public void ChapeauOK() {
		PointPlan p1 ,p2 ,p3 ;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		p3 = new PointPlan(128,13);
		Chapeau t = new Chapeau("testChapeaul" ,p1 ,p2 ,p3) ;
		t.dessiner();
		t.deplacer(10, 10);
		System.out.println(t.toString()) ;
		System.out.println(t.getPoint1()) ;
		System.out.println(t.getPoint2()) ;
		System.out.println(t.getPoint3()) ;
		System.out.println(t.typeForme()) ;
		
	}	
	@Test
	public void QuadrilatereOK() {
		PointPlan p1 ,p2  ;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		Quadrilatere t = new Quadrilatere("testQuadrilatere" ,p1 ,p2) ;
		t.dessiner();
		t.deplacer(10, 10);
		System.out.println(t.toString()) ;
		System.out.println(t.getPoint1()) ;
		System.out.println(t.getPoint2()) ;
		System.out.println(t.typeForme()) ;
		
	}
	@Test
	public void FormeComposeeOK() {
		PointPlan p1 ,p2 ,p3 ,p4 , p5 , p6;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		p3 = new PointPlan(128,13);
		Triangle t1 = new Triangle("testTriangel" ,p1 ,p2 ,p3) ;

		p4 = new PointPlan(118,13);
		p5 = new PointPlan(123,20);
		p6 = new PointPlan(128,13);
		Chapeau t2 = new Chapeau("testChapeaul" ,p4 ,p5 ,p6) ;
		FormeComposee c  = new FormeComposee("maison" , t1 , t2) ;
		c.ajouterForme(t1) ;
		c.dessiner() ;
		c.deplacer(10, 10);
		System.out.println(c.getFormes()) ;
		System.out.println(c.typeForme()) ;
		
		
	}

	
	

}