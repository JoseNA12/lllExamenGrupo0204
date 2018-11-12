package Caso1_MEMENTO;

import java.util.HashMap;

public class MementoCalculadora implements Memento{
    private HashMap<String, Double> variables;
    private Integer savepoint_id;
    private String operacion;

    public MementoCalculadora(HashMap<String, Double> e, Integer id, String op) {
        this.variables = e;
        this.savepoint_id = id;
        this.operacion = op;
    }

    @Override
    public HashMap<String, Double> getEstado() {
        return this.variables;
    }

    public Integer getId(){
        return savepoint_id;
    }

    public String getOperacion() {
        return operacion;
    }

    @Override
    public String toString(){
        String str = "";

        str += "id: " + this.savepoint_id + " | ";
        str += "operacion: " + this.operacion + " | ";
        str += "Estado de variables: ";

        for(String var : this.variables.keySet()){
            str += var + " = " + this.variables.get(var) + " ";
        }

        return str;
    }
}
