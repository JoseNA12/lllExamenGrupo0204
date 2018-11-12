package Caso1_MEMENTO;

public class DemoMemento {

    public static void main(String[] args)
    {
        System.out.println("Inicializando calculadora e historial...");
        Calculadora calculadora = new Calculadora();
        Historial historial = new Historial(calculadora);

        //Ejemplos de operaciones
        //Asignaciones
        System.out.println("=Ejemplos de asignaciones=");
        //Aqui ya esta registrado un estado inicial entonces no es necesario guardar
        calculadora.asignar("a", 7.0);

        historial.registrar("ASIG");
        calculadora.asignar("b", 3.0);

        historial.registrar("ASIG");
        calculadora.asignar("c", 5.0);

        System.out.println("Historial:\n" + historial.toString());

        //Aritmeticas
        System.out.println("=Ejemplos de operaciones aritmeticas=");
        historial.registrar("SUMA");
        calculadora.operar("a", 7.0, "+");

        historial.registrar("MULT");
        calculadora.operar("b", "c", "*");

        historial.registrar("DIV");
        calculadora.operar("c", 2.5, "/");

        System.out.println("Historial:\n" + historial.toString());

        //Deshacer la ultima operacion
        System.out.println("=Deshacer la ultima operacion=");
        historial.deshacer();
        System.out.println(calculadora.variablesToString());
        System.out.println("Historial:\n" + historial.toString());

        //Deshacer hasta savepoint especifico
        System.out.println("=Deshacer hasta savepoint 2=");
        historial.deshacer(2);
        System.out.println(calculadora.variablesToString());
        System.out.println("Historial:\n" + historial.toString());

        //Deshacer todo
        System.out.println("=Deshacer todo=");
        historial.deshacerTodo();
        System.out.println(calculadora.variablesToString());
        System.out.println("Historial:\n" + historial.toString());
    }
}
