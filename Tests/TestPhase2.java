import ardoise.*;
public class TestPhase2 {
	public static void main(String  []args) throws InterruptedException {
		Ardoise ardoise = new Ardoise();
		
		//créer les différentes formes qu'on veut rajouter à la forme composée (Le chapeau , Le toit  , La porte) pour créer "La Maison"

		//La Maison
		PointPlan  p10 ,p11 ,p12 ;
		Chapeau toit ;
		p10 = new PointPlan(80,140);
		p11 = new PointPlan(130,100);
		p12 = new PointPlan(180,140);
		toit = new Chapeau("Toit maison",p10 ,p11 ,p12);
		
		PointPlan d1 ,d2 ;
		d1 = new PointPlan(80,140);
		d2 = new PointPlan(180,198);
		Quadrilatere corps = new Quadrilatere("Corps Maison" ,d1 ,d2);
		
		PointPlan d3 ,d4 ;
		d3 = new PointPlan(120,170);
		d4 = new PointPlan(140,198);
		Quadrilatere porte = new Quadrilatere("Porte Maison" ,d3 ,d4);
		
		//créer la forme composée en l'appelant avec la méthode FormeComposee et en paramètre (le nom de la forme composée , toutes les formes qu'on va rajouter (une par une))
		//nb : on peut passer tant de formes qu'on veut 
		
		FormeComposee c1 ;
		c1 = new FormeComposee("maison" ,toit ,corps ,porte) ;
		
		
		//Les trois oiseaux
		//Oiseau 1

		PointPlan p1 ,p2 ,p3 ;
		Chapeau oiseau1  ;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		p3 = new PointPlan(128,13);
		oiseau1 = new Chapeau("oiseau1",p1 ,p2 ,p3);
		
		//Oiseau 2
		
		PointPlan p4 ,p5 ,p6 ;
		Chapeau oiseau2  ;
		p4 = new PointPlan(133,30);
		p5 = new PointPlan(136,32);
		p6 = new PointPlan(138,30);
		oiseau2 = new Chapeau("oiseau2",p4 ,p5 ,p6);
		
		//Oiseau 3
		
		PointPlan p7 ,p8 ,p9 ;
		Chapeau oiseau3 ;
		p7 = new PointPlan(142,14);
		p8 = new PointPlan(144,17);
		p9 = new PointPlan(146,14);
		oiseau3 = new Chapeau("oiseau3",p7 ,p8 ,p9);
		
		
		//Tour 
		PointPlan d5 ,d6 ;
		d5 = new PointPlan(9,100);
		d6 = new PointPlan(20,198);
		Quadrilatere tour = new Quadrilatere("Tour" ,d5 ,d6) ;
				
		
		
		//Etoile
		PointPlan a1 ,a2 ,a3 ,a4 ,a5 ,a6 ,a7 ,a8 ;
		Chapeau b1 ,b2 ,b3 ,b4 ;
		a1 = new PointPlan(170,52);
		a2 = new PointPlan(173,45);
		a3 = new PointPlan(177,52);
		a4 = new PointPlan(184,57);
		a5 = new PointPlan(177,60);
		a6 = new PointPlan(174,66);
		a7 = new PointPlan(170,60);
		a8 = new PointPlan(164,57);
		//Branche1
		b1 = new Chapeau("branche1",a1 ,a2 ,a3);
		//Branche2
		b2 = new Chapeau("branche2",a3 ,a4 ,a5);
		//Branche3
		b3 = new Chapeau("branche3",a5 ,a6 ,a7);
		//Branche4
		b4 = new Chapeau("branche4",a7 ,a8 ,a1);
		FormeComposee etoile ;
		etoile = new FormeComposee("etoile" ,b1 ,b2 ,b3, b4) ;
		
		
		
		//Montagne1
		PointPlan m1 , m2 ,m3 ;
		Triangle montagne1 ;
		m1 = new PointPlan(3,14);
		m2 = new PointPlan(43,3);
		m3 = new PointPlan(112,14);
		montagne1 = new Triangle("montagne1" ,m1 ,m2 ,m3) ;
		
		//Montagne2
		PointPlan m4 , m5 ,m6 ;
		Triangle montagne2 ;
		m4 = new PointPlan(152,7);
		m5 = new PointPlan(166,3);
		m6 = new PointPlan(172,7);
		montagne2 = new Triangle("montagne2" ,m4 ,m5 ,m6) ;
		
		  // ajouter toutes les formes  à l'ardoise
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(oiseau1);
		ardoise.ajouterForme(oiseau2);
		ardoise.ajouterForme(oiseau3);
		ardoise.ajouterForme(tour);
		ardoise.ajouterForme(etoile);
		ardoise.ajouterForme(c1);
			// dessiner l'ardoise
		ardoise.dessinerGraphique();
			//attendre 2 seconde avant de deplacer les oiseaux de 10 en abscisse et de 20 en ordonnée
		Thread.sleep(2000) ;
		ardoise.deplacer("C",10,20);
	}
}