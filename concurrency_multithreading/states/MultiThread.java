package concurrency_multithreading.states;

public class MultiThread {
    public static void main(String[] args) {

        // Criando uma thread
        Thread thread2 = new Thread(() -> longTask());

        // Verificando o estado da Thread
        System.out.println(thread2.getState());

        // Executando uma thread
        thread2.start();

        System.out.println(thread2.getState());

        System.out.println("Doing other work on main thread");

        System.out.println(thread2.getState());
    }

    public static void longTask() {
        long t = System.currentTimeMillis();
        long end = t + 3000;

        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }

}