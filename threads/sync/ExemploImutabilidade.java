package threads.sync;

/*
    Objetivo: Reescreva o código para que fique seguro.
*/

public class ExemploImutabilidade {

    public static void main(String[] args) {
        ImmutableValue iv = new ImmutableValue(1);

        Thread t1 = new Thread(new TaskImmutable(iv));
        Thread t2 = new Thread(new TaskImmutable(iv));
        Thread t3 = new Thread(new TaskImmutable(iv));
        Thread t4 = new Thread(new TaskImmutable(iv));
        Thread t5 = new Thread(new TaskImmutable(iv));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class TaskImmutable implements Runnable {

    private ImmutableValue immutableValue;

    public TaskImmutable(ImmutableValue immutableValue) {
        this.immutableValue = immutableValue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            immutableValue = immutableValue.add(i);
        }
        System.out.println(immutableValue.getValue());
    }

}

class ImmutableValue {

    private int value = 0; // TODO mudar para AtomicInteger

    public ImmutableValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public ImmutableValue add(int valueToAdd) {
        return new ImmutableValue(value + valueToAdd);
    }

}