// Fernando Jose Garavito Ovando    18071
// Maria Jose Castro 181202
// Hoja de trabajo No. 3
// Main.java

//Importamos Random para generar los números enteros aleatorios
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //Ciclo para crear los números
        for (int i=0; i<3001; i++){
            //Imprime los 3000 números enteros aleatorios
            System.out.println(random.nextInt(3001));
        }

    }
}

