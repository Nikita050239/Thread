import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 1. Создать класс NewThread расширяющий Thread
        // 2. Переопределить метод run(). В цикле for вывести символ 100 раз.
        // 3. Создать экземпляр класса и запустить новый поток.
        Thread thread = new MyTread();
        thread.start();
        MyThread2 thread2 = new MyThread2();
        thread2.run();
    }
}
class MyTread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Simbol" + i);
        }
    }
}

//1. Создать класс, реализующий интерфейс Runnable.
//2. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0
//   до 100 делящиеся на 10 без остатка.
//3. Используем статический метод Thread.sleep(), чтобы сделать паузу.
//4. Создать три потока, выполняющих задачу распечатки значений.

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

