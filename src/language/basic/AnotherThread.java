package language.basic;

import static language.basic.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Hello from "+currentThread().getName());

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"I was Interrupted by another thread");
            return;

        }
        System.out.println(ANSI_BLUE+"Waking up after 10 seconds....");
    }
}
