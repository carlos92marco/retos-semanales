package desafios0_9;
/*
 * Reto #1
 * �ES UN ANAGRAMA?
 * Fecha publicaci�n enunciado: 03/01/22
 * Fecha publicaci�n resoluci�n: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una funci�n que reciba dos palabras (String) y retorne verdadero o falso (Boolean) seg�n sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Informaci�n adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu soluci�n aportada.
 * - Revisar� el ejercicio en directo desde Twitch el lunes siguiente al de su publicaci�n.
 * - Subir� una posible soluci�n al ejercicio el lunes siguiente al de su publicaci�n.
 *
 */
public class Reto1 {
	public static void main(String[] args) {
		String palabra1 = "amor";
		String palabra2  = "roma";
		
		System.out.println(compruebaAnagrama(palabra1, palabra2));
	}

	public static boolean compruebaAnagrama(String palabra1, String palabra2) {
		if(palabra1.toLowerCase().equals(palabra2.toLowerCase())) {
			return false;
		}
		return true;
	}
}
