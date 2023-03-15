package utilidades;

public class StringUtilTest {
    //Clase de test para probar la clase StringUtil

    //Creo un programa con la función de main. Llamo a la función que he creado y espero que result
    //me lo devuelva 3 veces hola *holaholahola*
    //shortcat: fori


    public static void main(String[] args) {

        String result = StringUtil.repeat("hola", 3);
        System.out.println(result);
        String result2 = StringUtil.repeat("hola", 1);
        System.out.println(result2);
        /*
        //le doy a play y lo pruebo. Pero si quiesiera hacerdiferents pruebas de mi programa. Por ejemplo
        //que pasa si repito una sola vez? pero esto es muy manual, quizas una manera mas automatica seria
        //escribir un codigo que me compruebe si el resultado es el esperado


        String result = StringUtil.repeat("hola", 3);
        if (result.equals("holaholahola")){
            System.out.println("OK");
        }
        String result2 = StringUtil.repeat("hola", 1);
        if (result.equals("hola")){
            System.out.println("OK");
        }

        //Esto me indica que la fucnion anda correctamente pero no es muy util tampoco. Imagina
        //que tenemos 100 o 10000 test por correr y hay que mirar 1 a 1 si todos dan OK
        //Otra manera podria ser verificar si NO se da el resultado correcto, y si es así tirar ERROR

        String result = StringUtil.repeat("hola", 3);
        if (!result.equals("holaholahola")){
            System.out.println("ERROR");
        }
        String result2 = StringUtil.repeat("hola", 1);
        if (!result.equals("hola")){
            System.out.println("ERROR");
        }
         */

        //ASí solo veria los que lanzan un error, el resto no porque no entran en IF
        //Por otro lado, estos test me lanzan info muy básico, solo si hay error, muchas veces
        //necesito más información para entender el error

        //Vamos ahora a mostrar una excepción que es otra opcine en caso que haya un error, lanza
        //remos una excpeción
        //Shortcut: escribiendo thr + tab
        /*
        String result = StringUtil.repeat("hola", 3);
        //POR ULTIMO LO DE ABAJO
        assertEquals(result, "holaholahola"); //luego me posicion en assert y hago tab + enter
        //para crear un método de ese nombre
        if (!result.equals("holaholahola")){
            throw new RuntimeException("ERROR");
        }
        String result2 = StringUtil.repeat("hola", 1);
        if (result.equals("hola")){
            throw new RuntimeException("ERROR");
        }
         */
        //Ahora si ocurre un problema nos lanza una excepción
        //Nos indica exactamente la linea en la que falló
        //assertEquals

    }

    private static void assertEquals(String actual, String expected) {
        //acá quiero comprobar si el resultado actual es igual al esperado
        //y si no es así lanzo un mensaje más claro
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " no es igual a "+expected);
        }
    }
}
