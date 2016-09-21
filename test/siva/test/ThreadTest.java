package siva.test;

/**
 * MyThread : subclass of Thread.<br>
 * <br>
 * Quand un objet MonThread est cr�� puis d�marr�, le thread correspondant
 * ex�cute la m�thode run() red�finie par MonThread. Son impl�mentation effectue
 * max it�rations et affiche 20 messages de progression. Chaque message indique
 * le nom du thread ex�cutant le code, et la valeur courante de i.
 *
 * @author Jean-Michel Busca
 *
 */
class MyThread extends Thread {

  private final int max;

  public MyThread(String name, int max, SharedVariable s) {
    super(name);
    this.max = max;
  }

  @Override
  public void run() {
    for (int i = 0; i < max; i++) {

      if (i % (max / 20) == 0) {
        System.out.println("current thread = "
                + Thread.currentThread().getName() + ", i = " + i);
      }

    }
  }
}

/**
 * MYFunction : class that implements the Runnable interface, which declare the
 * run() method. <br>
 * <br>
 * Un objet MaFonction peut �tre pass� en param�tre du constructeur de la classe
 * Thread. Quand l'objet thread ainsi cr�� est d�marr�, c'est la m�thode run()
 * de l'objet MaFonction qui est ex�cut�e. Son impl�mentation est la m�me que
 * pour MonThread.
 *
 * @author Jean-Michel Busca
 *
 */
class MyFunction implements Runnable {

  private final int max;

  public MyFunction(int max) {
    this.max = max;
  }
  
 

  @Override
  public void run() {
    for (int i = 0; i < max; i++) {

      if (i % (max / 20) == 0) {
        System.out.println("current thread = "
                + Thread.currentThread().getName() + ", i = " + i);
      }

    }
  }

}

/**
 * Tests thread execution. <br>
 * <br>
 * Dans sa version initiale, cr�e deux threads, selon les deux m�thodes vues
 * ci-dessus, et les d�marre.
 *
 * @author Jean-Michel Busca
 *
 */
public class ThreadTest {

  public static void main(String[] args) throws InterruptedException {

    System.out.println("main: starting");
    
   SharedVariable s = new SharedVariable();
    Thread t1 = new MyThread("thread #1", 1000 * 1000 * 1000, s);
    t1.setDaemon(true);    
    t1.start();
    t1.join();

    Thread t2 = new Thread(new MyFunction(1000 * 1000 * 1000), "thread #2");
    t2.setDaemon(true);
    t2.start();
    t2.join();
    
    Thread t3 = new Thread(new MyFunction(1000000000), "thread #3");
    t3.setDaemon(true);
    t3.start();
    t3.join();
   

    System.out.println("main: ending");
  }
}


class SharedVariable {

  int count = 0;

}

/*
Ex1:

The Runnable object is the more flexible.

We can count 3 threads at the beginning of the execution.

We can't know when the threads actually start executing. 
We shouldn't make any assumption on when the threads will or will not execute.


Using the setDaemon(boolean) method, we notice the JVM doesn't execute the threads
because all the threads running are daemon threads.
This method must be invoked before the thread is started.

Output:
run:
main: starting
current thread = thread #1, i = 0
main: ending
current thread = thread #2, i = 0
BUILD SUCCESSFUL (total time: 0 seconds)


You'd need 3 MyFunction objects in total in the main function.


Ex2 :

Ex3 :
1. put "synchronized" in the assign, withdraw and check functions
2. create a synchronizedlist
ex: private List<Vehicle> vehicles = synchronizedList(new ArrayList<Vehicle>());




*/