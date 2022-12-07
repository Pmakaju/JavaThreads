package language.basic;

import jdk.swing.interop.SwingInterOpUtils;

import static language.basic.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(ANSI_RED+"Hello from the main Thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("*Another Thread*");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_PURPLE+"Hello from anonymous Thread");
            }
        }.start();


        Thread ourRunnableThread = new Thread(new OurRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"Hello from anonymouus runnable of run()");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_CYAN+"Another thread got terminated and"+" current thread is running");
                }catch (InterruptedException e){
                    System.out.println(ANSI_CYAN+"I was interrupted");
                }
            }
        });
        ourRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_RED+"Hello again from main Thread.");
    }
}
