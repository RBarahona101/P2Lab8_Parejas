package p2lab8_rigobertobarahona_luisrapalo;

public class Barbaro extends Personaje{
    private String arma;
    private int exp;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Barbaro(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String arma, int exp) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.arma = arma;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
        + "Raza: " + raza + "\n"
        + "Edad: " + edad + "\n"       
        + "Class: Barbaro" + "\n"        
        + "Sub-Class: " + Pclass + "\n"
        + "Ciudad: " + nacionalidad + "\n"
        + "Altura: " + height + "m" + "\n"  
        + "Peso: " + peso + "kg" + "\n"
        + "AC: " + AC + "\n"
        + "CS: " + CS + "\n"
        + "HP: " + HP + "\n"
        + "Arma: " + arma + "\n";  
    }
    
}
