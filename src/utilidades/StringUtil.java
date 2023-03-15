package utilidades;

public class StringUtil {
    //Esta función repite strings a partir de repetirlo un cierto numero de veces
    public static String repeat(String str, int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
