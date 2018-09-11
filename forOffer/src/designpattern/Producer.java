package designpattern;

import java.util.concurrent.BlockingQueue;

/**
 * author:DingwenDeng
 * Date:2018/9/11 9:29
 */
public class Producer implements Runnable {

    private final BlockingQueue queue;

    public Producer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                queue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
