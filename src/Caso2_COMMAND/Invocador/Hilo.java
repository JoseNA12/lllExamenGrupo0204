package Caso2_COMMAND.Invocador;

import Caso2_COMMAND.Trabajo;

public class Hilo implements Runnable{
    private Sistema sistema;

    public Hilo(Sistema s) {
        this.sistema = s;
    }

    public void run(){
        while (sistema.corriendo){
            if(sistema.colaTrabajos.size() > 0) {
                try{
                    Trabajo trabajo = sistema.colaTrabajos.remove(0); //Obtiene el primero de la cola
                    System.out.println(
                            "Hilo #" + Thread.currentThread().getId() +
                            " ejecutando " + trabajo.getClass().getSimpleName()
                    );
                    trabajo.ejecutar();

                    Thread.sleep(1000);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Cola de procesos vacia.");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
