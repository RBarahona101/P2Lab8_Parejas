package p2lab8_rigobertobarahona_luisrapalo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPersonaje {

    public class administrarPersonaje {

        private ArrayList<Personaje> personajes = new ArrayList();
        private File archivo = new File("");

        public ArrayList<Personaje> getPersonajes() {
            return personajes;
        }

        public void setPersonajes(ArrayList<Personaje> personajes) {
            this.personajes = personajes;
        }                
        
        public administrarPersonaje(String path) {
            archivo = new File(path);
        }

        public administrarPersonaje() {
        }

        public File getArchivo() {
            return archivo;
        }

        public void setArchivo(File archivo) {
            this.archivo = archivo;
        }

        public void setPersonaje(Personaje p) {
            personajes.add(p);
        }

        public void cargarArchivo() {
            try {
                personajes = new ArrayList();
                Personaje temp;
                if (archivo.exists()) {
                    FileInputStream entrada
                            = new FileInputStream(archivo);
                    ObjectInputStream objeto
                            = new ObjectInputStream(entrada);
                    try {
                        while ( (temp = (Personaje) objeto.readObject() ) != null) {
                            personajes.add(temp);
                        }
                    } catch (EOFException e) {
                    }
                    objeto.close();
                    entrada.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void escribirArchivo() {
            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            try {
                fw = new FileOutputStream(archivo);
                bw = new ObjectOutputStream(fw);
                for (Personaje t : personajes) {
                    bw.writeObject(t);
                }
                bw.flush();
            } catch (Exception ex) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception ex) {
                }
            }
        }

    }
}
