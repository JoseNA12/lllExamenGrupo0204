package Caso2_COMMAND.Invocador;

import Caso2_COMMAND.Trabajo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {
    protected Boolean corriendo;
    protected List<Trabajo> colaTrabajos;
    private Integer max_subprocesos = 10;
    private Hilo[] subprocesos;

    public Sistema(){
        corriendo = true;
        colaTrabajos = Collections.synchronizedList(new ArrayList<>());
        subprocesos = new Hilo[max_subprocesos]; //Max. 10 subprocesos simultaneos

        for(int i = 0; i < max_subprocesos; i++){
            Hilo hilo = new Hilo(this);

            subprocesos[i] = hilo;
            new Thread(hilo).start();
        }
    }

    public void encolarTrabajo(Trabajo t){
        colaTrabajos.add(t);
    }
}
