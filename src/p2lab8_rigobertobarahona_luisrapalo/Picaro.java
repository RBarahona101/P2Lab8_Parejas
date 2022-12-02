package p2lab8_rigobertobarahona_luisrapalo;

public class Picaro extends Personaje{
    private String instrumento;
    private int heists;

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getHeists() {
        return heists;
    }

    public void setHeists(int heists) {
        this.heists = heists;
    }

    public Picaro(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String instrumento, int heists) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.instrumento = instrumento;
        this.heists= heists;
        
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
        + "Raza: " + raza + "\n"
        + "Edad: " + edad + "\n"          
        + "Class: Picaro" + "\n"        
        + "Sub-Class: " + Pclass + "\n"
        + "Instrumento: " + instrumento + "\n"              
        + "Ciudad: " + nacionalidad + "\n"
        + "Heists Exitosos: " + heists + "\n"               
        + "Altura: " + height + "m" + "\n"  
        + "Peso: " + peso + "kg" + "\n"
        + "AC: " + AC + "\n"
        + "CS: " + CS + "\n"
        + "HP: " + HP + "\n";
    }
}
