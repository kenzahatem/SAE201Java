import ardoise.Ardoise;
import ardoise.PointPlan;
public class TestFormeComposee {
	public static void main(String  []args) throws InterruptedException {
		Ardoise ardoise = new Ardoise();
		
		//créer les différentes formes qu'on veut rajouter à la forme composée (Le chapeau , Le toit  , La porte) pour créer "La Maison"
		PointPlan  p10 ,p11 ,p12 ;
		Chapeau t1 ;
		p10 = new PointPlan(80,140);
		p11 = new PointPlan(130,100);
		p12 = new PointPlan(180,140);
		t1 = new Chapeau("Toit maison",p10 ,p11 ,p12);
		
		PointPlan d1 ,d2 ;
		d1 = new PointPlan(80,140);
		d2 = new PointPlan(180,198);
		Quadrilatere q1 = new Quadrilatere("Corps Maison" ,d1 ,d2);
		
		PointPlan d3 ,d4 ;
		d3 = new PointPlan(120,170);
		d4 = new PointPlan(140,198);
		Quadrilatere q2 = new Quadrilatere("Porte Maison" ,d3 ,d4);
		
		//créer la forme composée en l'appelant avec la méthode FormeComposee et en paramètre (le nom de la forme composée , toutes les formes qu'on va rajouter (une par une))
		//nb : on peut passer tant de formes qu'on veut 
		
		FormeComposee c1 ;
		c1 = new FormeComposee("maison" ,t1 ,q1 ,q2) ;
		ardoise.ajouterForme(c1);
		ardoise.dessinerGraphique();
		Thread.sleep(2000) ;
		ardoise.deplacer("GF", -50, -50);

		
	}
}