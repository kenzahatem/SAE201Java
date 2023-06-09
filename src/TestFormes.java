import org.junit.Before;
import ardoise.Ardoise;
import ardoise.PointPlan;
public class TestFormes {
	@Before
	public static void main(String  []args) throws InterruptedException {
		Ardoise ardoise = new Ardoise();

		//Oiseau 1
		
		PointPlan p1 ,p2 ,p3 ;
		Chapeau c1  ;
		p1 = new PointPlan(118,13);
		p2 = new PointPlan(123,20);
		p3 = new PointPlan(128,13);
		c1 = new Chapeau("oiseau1",p1 ,p2 ,p3);
		
		//Oiseau 2
		
		PointPlan p4 ,p5 ,p6 ;
		Chapeau c2  ;
		p4 = new PointPlan(133,30);
		p5 = new PointPlan(136,32);
		p6 = new PointPlan(138,30);
		c2 = new Chapeau("oiseau2",p4 ,p5 ,p6);
		
		//Oiseau 3
		
		PointPlan p7 ,p8 ,p9 ;
		Chapeau c3 ;
		p7 = new PointPlan(142,14);
		p8 = new PointPlan(144,17);
		p9 = new PointPlan(146,14);
		c3 = new Chapeau("oiseau3",p7 ,p8 ,p9);
		
		//ToitMaison
		
		PointPlan  p10 ,p11 ,p12 ;
		Chapeau t1 ;
		p10 = new PointPlan(80,140);
		p11 = new PointPlan(130,100);
		p12 = new PointPlan(180,140);
		t1 = new Chapeau("Toit maison",p10 ,p11 ,p12);
		
		// Corps Maison 
		
		PointPlan d1 ,d2 ;
		d1 = new PointPlan(80,140);
		d2 = new PointPlan(180,198);
		Quadrilatere q1 = new Quadrilatere("Corps Maison" ,d1 ,d2) ;
		
		//Porte Maison 
		PointPlan d3 ,d4 ;
		d3 = new PointPlan(120,170);
		d4 = new PointPlan(140,198);
		Quadrilatere q2 = new Quadrilatere("Porte Maison" ,d3 ,d4) ;
		
		//Tour 
		PointPlan d5 ,d6 ;
		d5 = new PointPlan(9,100);
		d6 = new PointPlan(20,198);
		Quadrilatere q3 = new Quadrilatere("Porte Maison" ,d5 ,d6) ;
		
		
		
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
	
		//Ajouter toutes les formes 
		ardoise.ajouterForme(c1);
		ardoise.ajouterForme(c2);
		ardoise.ajouterForme(c3);
		ardoise.ajouterForme(t1);
		ardoise.ajouterForme(b1);
		ardoise.ajouterForme(b2);
		ardoise.ajouterForme(b3);
		ardoise.ajouterForme(b4);
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(q1);
		ardoise.ajouterForme(q2);
		ardoise.ajouterForme(q3);
		ardoise.dessinerGraphique();
		
		//Attendre une seconde
        Thread.sleep(1000) ;
        //Deplacer les oiseaux de 10 en abscisse et 20 en ordonnée
        c1.deplacer(10, 20);
        c2.deplacer(10, 20);
        c3.deplacer(10, 20);
        ardoise.dessinerGraphique();

	}
	
	}
