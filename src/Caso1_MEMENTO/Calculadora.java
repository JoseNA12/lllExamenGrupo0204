package Caso1_MEMENTO;

import java.util.HashMap;

public class Calculadora {
    private HashMap<String, Double> variables;

    public Calculadora() {
        variables = new HashMap<>();
    }

    //Operaciones de la calculadora
    public void asignar(String var, double valor){
        variables.put(var, valor);
    }

    public void operar(String var, double literal, String operador){
        double operando = variables.get(var);
        double resultado = ejecutarOperacion(operando, literal, operador);

        asignar(var, resultado);
        System.out.println(variablesToString());
    }

    public void operar(String var1, String var2, String operador){
        double operando1 = variables.get(var1);
        double operando2 = variables.get(var2);
        double resultado = ejecutarOperacion(operando1, operando2, operador);

        asignar(var1, resultado); //Deja el resultado en la primera variable
        System.out.println(variablesToString());
    }

    private double ejecutarOperacion(double op1, double op2, String operador){

        switch (operador){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                if(op2 != 0)
                    return op1 / op2;
                break;
            case "^":
                return Math.pow(op1, op2);
            case "sqrt":
                return Math.sqrt(op1);
        }
        return 0;
    }

    //Metodos de patron Memento
    public MementoCalculadora guardar(Integer id, String op){
        return new MementoCalculadora(new HashMap<>(this.variables), id, op);
    }

    public void restaurar(MementoCalculadora e){
        this.variables = e.getEstado();
    }

    public String variablesToString(){
        String str = "Variables actuales:\n";

        for(String var : this.variables.keySet()){
            str += var + " = " + this.variables.get(var) + " ";
        }

        return str;
    }
}
