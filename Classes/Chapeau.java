import java.util.ArrayList;

import ardoise.* ;
public class Chapeau extends Forme {
	private String type ;
	private PointPlan point1;
	private PointPlan point2;
	private PointPlan point3;
	

	public Chapeau(String nom,PointPlan p1 ,PointPlan p2 ,PointPlan p3) {
		super(nom);
		this.point1 =p1 ;
		this.point2 =p2 ;
		this.point3 =p3 ;
		this.type = "C" ;	 
	 
	}
	
	public void deplacer(int arg0, int arg1) {
		this.getPoint1().setAbscisse(this.getPoint1().getAbscisse()+arg0);
		this.getPoint2().setAbscisse(this.getPoint2().getAbscisse()+arg0);
		this.getPoint3().setAbscisse(this.getPoint3().getAbscisse()+arg0);
		
		this.getPoint1().setOrdonnee(this.getPoint1().getOrdonnee()+arg1);
		this.getPoint2().setOrdonnee(this.getPoint2().getOrdonnee()+arg1);
		this.getPoint3().setOrdonnee(this.getPoint3().getOrdonnee()+arg1);
			
	}

	
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> s = new ArrayList<Segment>() ;
		Segment s1 = new Segment(this.getPoint1() ,this.getPoint2()) ;
		Segment s2 = new Segment(this.getPoint2() ,this.getPoint3()) ;
		s.add(s1);
		s.add(s2) ;
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
	public PointPlan getPoint3() {
		return this.point3 ;
	}
	public String toString() {
		return ("Forme de Type Châpeau, de type "+this.type) ;
	}
	
}