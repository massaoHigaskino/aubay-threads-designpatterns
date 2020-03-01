package threads.errors;


/*
    Reesceva o código para manipular erros.
*/

public class ExampleErrorsSendMail {
    public static void main(String[] args) {

        TaskSendMail task = new TaskSendMail("clark.kaant@gmail.com", "tem certeza kaant?");

        Thread t1 = new Thread(task);
        
        t1.setUncaughtExceptionHandler(new Handler());

        t1.start();
    }
}
class Handler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("Thread " + t.currentThread().getName() + " Com erro");
    }
}
class TaskSendMail implements Runnable {

    private String email;
    private String content;

    public TaskSendMail(String email, String content) {
        this.email = email;
        this.content = content;
    }

    private SendMailGeneric sendMailService;

    @Override
    public void run() {
        sendMailService = new SendMailGeneric();
        sendMailService.sendEmail(email, content);
    }

}

class SendMailGeneric {
    public void sendEmail(String email, String content) {
        System.out.println("Send email....");
        // send happy email
        throw new NullPointerException();
    }
}