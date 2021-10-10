class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "New wave");
        System.out.println("Дочерний поток: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i --) {
                System.out.println("Дочерний поток: " +i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Прерывание");
            System.out.println("Прерывание2");
        }
        class ThreadDemo {
            void main(String[] args) {
                new NewThread();
                try {
                    int i = 0;
                    for(int i = 5, i > 0, i--) {
                        System.out.println("Главный поток: " + i*1000);
                        Thread.sleep(1000);
                    }
                }
                catch (InterruptedException e) {
                    System.out.println("Прерывание");
                    System.out.println("Завершение");
                }
            }
        }
    }
}