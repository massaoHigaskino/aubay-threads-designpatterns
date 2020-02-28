package threads.priority;


/*
    Objetivo: Reescreva o código e atribua prioridades, e observe o comportamento.
*/

public class ExemploPrioridade {
    public static void main(String[] args) {
        Paciente gestante = new Paciente("gestante");
        Paciente idoso = new Paciente("idoso");
        Paciente crianca = new Paciente("crianca");
        Paciente voce = new Paciente("voce");

        Thread tGestante = new Thread(gestante);
        Thread tIdoso = new Thread(idoso);
        Thread tCrianca = new Thread(crianca);
        Thread tVoce = new Thread(voce);

        tGestante.start();
        tIdoso.start();
        tCrianca.start();
        tVoce.start();
    }
}

class Paciente implements Runnable {

    private String tipo;

    public Paciente(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            
        }
        System.out.println("Tipo de paciente: "+tipo);
    }
}