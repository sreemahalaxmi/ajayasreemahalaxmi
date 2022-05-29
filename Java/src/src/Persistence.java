import java.util.Set;
import java.awt.Color;
import java.util.Date;
import java.util.HashSet;

public class Persistence {
    private Long id; // identifier

    private Date birthdate;
    private Color color;
    private char sex;
    private float weight;
    private int litterId;

    private Persistence mother;
    private Set<Persistence> kittens = new HashSet<Persistence>();

    public Long getId() {
        return id;
    }

    void setBirthdate(Date date) {
        birthdate = date;
    }
    public Date getBirthdate() {
        return birthdate;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
    void setColor(Color color) {
        this.color = color;
    }

    void setSex(char sex) {
        this.sex=sex;
    }
    public char getSex() {
        return sex;
    }

    void setLitterId(int id) {
        this.litterId = id;
    }
    public int getLitterId() {
        return litterId;
    }

    void setMother(Persistence mother) {
        this.mother = mother;
    }
    public Persistence getMother() {
        return mother;
    }
    void setKittens(Set<Persistence> kittens) {
        this.kittens = kittens;
    }
    public Set<Persistence> getKittens() {
        return kittens;
    }
    
    // addKitten not needed by Hibernate
    public void addKitten(Persistence kitten) {
    	kitten.setMother(this);
	kitten.setLitterId( kittens.size() ); 
        kittens.add(kitten);
    }
}