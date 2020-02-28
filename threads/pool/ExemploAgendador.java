package threads.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
    Reescreva o código para que realize tarefas agendadas
*/

public class ExemploAgendador {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        
        scheduledExecutorService.shutdown();
    }
}