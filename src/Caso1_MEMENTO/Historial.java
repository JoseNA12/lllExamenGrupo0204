package Caso1_MEMENTO;

import java.util.ArrayList;

public class Historial {
    private Calculadora calculadora;
    private ArrayList<Memento> historial;

    public Historial(Calculadora calculadora) {
        this.calculadora = calculadora;
        this.historial = new ArrayList<>();
        System.out.println("Registrando estado inicial de calculadora...");
        registrar("INIT");
    }

    public void deshacer(){
        if(this.historial.size() < 2){
            return;
        }

        MementoCalculadora ultimo_estado = (MementoCalculadora) this.historial.remove(this.historial.size() - 1);
        this.calculadora.restaurar(ultimo_estado);
        System.out.println("Historial: restaurado a " + ultimo_estado.toString() + "\n");
    }

    public void deshacer(Integer savepoint_id){
        int last = this.historial.size() - 1;
        MementoCalculadora ultimo_estado = (MementoCalculadora) this.historial.get(last);

        while(ultimo_estado.getId() >= savepoint_id){
            this.calculadora.restaurar(ultimo_estado);
            this.historial.remove(last);

            last = this.historial.size() - 1;
            if(last >= 0) {
                ultimo_estado = (MementoCalculadora) this.historial.get(last);
            }else {
                break;
            }
        }

        System.out.println("Historial: restaurado a " + ultimo_estado.toString() + "\n");
    }

    public void deshacerTodo(){
        deshacer(0); //Savepoint 0 es el estado inicial de la calculadora
    }

    public void registrar(String op){
        int id_nuevo = this.historial.size();
        this.historial.add(this.calculadora.guardar(id_nuevo, op));

        System.out.println("Historial: estado registrado.\n");
    }

    @Override
    public String toString() {
        String str = "";

        for(Memento reg : historial){
            str += reg.toString() + "\n";
        }

        return str;
    }
}
