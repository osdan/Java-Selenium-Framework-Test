package tools;
import java.util.Random;

public class GenerarCadenaAleatoria {
	private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static int LONGITUD;

	public String generarCadenaAleatoria(int l) {
		LONGITUD = l;
        Random random = new Random();
        StringBuilder sb = new StringBuilder(LONGITUD);
        for (int i = 0; i < LONGITUD; i++) {
            int indice = random.nextInt(CARACTERES.length());
            sb.append(CARACTERES.charAt(indice));
        }
        return sb.toString();
    }
}
