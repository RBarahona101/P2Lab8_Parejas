package p2lab8_rigobertobarahona_luisrapalo ;

public class Clerigo extends Personaje {
    private String deity;
    private String invocacion;

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public String getInvocacion() {
        return invocacion;
    }

    public void setInvocacion(String invocacion) {
        this.invocacion = invocacion;
    }

    public Clerigo(String deity, String invocacion) {
        this.deity = deity;
        this.invocacion = invocacion;
    }

    public Clerigo(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String deity, String invocacion) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.deity = deity;
        this.invocacion = invocacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
        + "Raza: " + raza + "\n"
        + "Edad: " + edad + "\n"  
        + "Class: Clerigo" + "\n"        
        + "Sub-Class: " + Pclass + "\n"
        + "Seguior de " + deity + "\n"        
        + "Ciudad: " + nacionalidad + "\n"
        + "Altura: " + height + "m" + "\n"  
        + "Peso: " + peso + "kg" + "\n"
        + "AC: " + AC + "\n"
        + "CS: " + CS + "\n"
        + "HP: " + HP + "\n"
        + "Invocacion: " + invocacion + "\n";  
    }
}
