// Fernando Jose Garavito Ovando    18071
// Maria Jose Castro 181202
// Hoja de trabajo No. 3
// Hoja_3.java

//importo random para genrar los numeros
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //ciclo para crear los numeros
        for (int i=0; i<3001; i++){
            //imprime
            System.out.println(random.nextInt(3001));
        }

    }
}

