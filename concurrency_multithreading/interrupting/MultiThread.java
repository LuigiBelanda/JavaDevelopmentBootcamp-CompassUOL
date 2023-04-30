package concurrency_multithreading.interrupting;

public class MultiThread {
    public static void main(String[] args) {

        // Criando uma thread
        Thread thread2 = new Thread(() -> longTask());

        // Verificando o estado da Thread
        System.out.println(thread2.getState());

        // Executando uma thread
        thread2.start();

        // Interrompendo a Thread
        System.out.println("\nOh no, a big error in the main thread, stop other thread\n");
        thread2.interrupt();

        System.out.println(thread2.getState());

        System.out.println("Doing other work on main thread");

        System.out.println(thread2.getState());
    }

    public static void longTask() {
        try {
            // Podemos deixar a thread esperando um tempo
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("\nThread sleeping\n");
        }

        long t = System.currentTimeMillis();
        long end = t + 3000;

        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("\nFinished long task\n");
                break;
            } else if (Thread.currentThread().isInterrupted() == true) {
                System.out.println("\nTask interrupted\n");
                break;
            }
        }
    }

}