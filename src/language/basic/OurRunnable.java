package language.basic;

import static language.basic.ThreadColor.ANSI_GREEN;

public class OurRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Hello from runnable"+ "implementation of run()");
    }
}
