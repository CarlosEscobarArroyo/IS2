/*
 * ¿Por qué funciona "Aplicacion app = new HojaCalculo();"?
 *
 * HojaCalculo es hija de Aplicacion, así que esto es polimorfismo:
 *  - La VARIABLE 'app' es de tipo Aplicacion (la referencia, el "molde"
 *    con el que se trata al objeto).
 *  - El OBJETO REAL en memoria es un HojaCalculo.
 *
 * Como toda HojaCalculo ES-UNA Aplicacion (por herencia), una referencia
 * del tipo padre puede apuntar perfectamente a un objeto hijo. Lo contrario
 * NO se podría: "HojaCalculo h = new Aplicacion();" daría error, porque no
 * toda Aplicacion es una HojaCalculo.
 *
 * ¿Por qué se hace así en el Factory Method?
 * Para que Main dependa de la ABSTRACCIÓN (Aplicacion), no de la clase
 * concreta. Cuando se llama a app.crear(), Java en tiempo de ejecución
 * busca el método crear() en el objeto real (HojaCalculo) y ejecuta esa
 * versión, devolviendo un Documento específico (una hoja de cálculo).
 *
 * Si mañana quisiéramos usar otra app, solo cambiaríamos la línea de
 * instanciación, por ejemplo:
 *     Aplicacion app = new ProcesadorTexto();
 * y el resto del código no cambia. Esa es la gracia del patrón: el código
 * cliente queda escrito contra el padre y sirve para cualquier hijo.
 */

public class Main {
    public static void main(String[] args) {
        FA_Aplicacion app = new FC_HojaCalculo(); // Hasta aquí hemos creado la fabrica concreta de Hoja de Calculo
        Documento file = app.crear(); // Aquí hemos utilizado esa fábrica para obtener un xls
        ejecutarFactoryMethod(file); // Aquí ejecutamos los metodos del documento
    }

    public static void ejecutarFactoryMethod(Documento doc) { // Se aplica polimorfismo por que no importa que tipo de documento sea, solo importa que sea Documento
        doc.abrir();
        doc.cerrar();
    }
}
