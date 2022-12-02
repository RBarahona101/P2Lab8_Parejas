package p2lab8_rigobertobarahona_luisrapalo;

public class Mago extends Personaje {
    private String magia;

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public Mago(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String magia) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.magia = magia;
        
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
        + "Raza: " + raza + "\n"
        + "Edad: " + edad + "\n"  
        + "Class: Mago" + "\n"        
        + "Sub-Class: " + Pclass + "\n"  
        + "Tipo de Magia: " + magia + "\n"        
        + "Ciudad: " + nacionalidad + "\n"
        + "Altura: " + height + "cm" + "\n"  
        + "Peso: " + peso + "kg" + "\n"
        + "AC: " + AC + "\n"
        + "CS: " + CS + "\n"
        + "HP: " + HP + "\n";
    }
    
}
