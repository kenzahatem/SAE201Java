import java.util.ArrayList;

import ardoise.* ;
public class Quadrilatere extends Forme {
	private String type ;
	private PointPlan point1;
	private PointPlan point2;
	
	public Quadrilatere(String nom,PointPlan p1 ,PointPlan p2) {
		super(nom);
		this.point1 =p1 ;
		this.point2 =p2 ;
		this.type = "Q" ;	 
	 
	}
	
	public void deplacer(int arg0, int arg1) {
		this.getPoint1().setAbscisse(this.getPoint1().getAbscisse()+arg0);
		this.getPoint2().setAbscisse(this.getPoint2().getAbscisse()+arg0);

		
		this.getPoint1().setOrdonnee(this.getPoint1().getOrdonnee()+arg1);
		this.getPoint2().setOrdonnee(this.getPoint2().getOrdonnee()+arg1);
		
	}

	
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> s = new ArrayList<Segment>();
		PointPlan p1 , p2 ;
		p1 = new PointPlan(this.getPoint1().getAbscisse() ,this.getPoint2().getOrdonnee());
		p2 = new PointPlan(this.getPoint2().getAbscisse(),this.getPoint1().getOrdonnee() );
		Segment s1 = new Segment(this.getPoint1() ,p1) ;
		Segment s2 = new Segment(this.getPoint1() ,p2) ;
		Segment s3 = new Segment(this.getPoint2() ,p1) ;
		Segment s4 = new Segment(this.getPoint2() ,p2) ;
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		return s ;
	}

	
	public String typeForme() {
		return this.type ;
	}
	public PointPlan getPoint1() {
		return this.point1 ;
	}
	public PointPlan getPoint2() {
		return this.point2 ;
	}
	public String toString() {
		return ("Forme de Type Quadrilatere, de type "+this.type) ;
	}
	
	
}