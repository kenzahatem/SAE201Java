import java.util.ArrayList;

import ardoise.* ;
public class FormeComposee extends Forme{
	private String type ;
	private ArrayList<Forme> formes;
	
	
    public FormeComposee(String s ,Forme... formesComposees) {
        super(s);
        this.type = "GF" ;
        formes = new ArrayList<Forme>();
        
        for (Forme forme : formesComposees) {
            this.formes.add(forme);
        }
    }

    public void ajouterForme(Forme forme) {
        this.formes.add(forme);
    }

	public ArrayList<Forme> getFormes(){
		return this.formes ;
	}

	public String typeForme() {
		return this.type ;
	}


	public void deplacer(int arg0, int arg1) {
		int i  ;
		for (i=0 ;i<this.formes.size() ;i++) {
			this.formes.get(i).deplacer(arg0, arg1);;
		}
	}

	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> s = new ArrayList<Segment>() ;
		int i  ;
		for (i=0 ;i<this.formes.size() ;i++) {
			this.formes.get(i).dessiner();
			s.addAll(this.formes.get(i).dessiner()) ;
		}
		return s;
	}
}