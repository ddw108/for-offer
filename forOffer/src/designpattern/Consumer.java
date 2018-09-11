package designpattern;

import java.util.concurrent.BlockingQueue;

/**
 * author:DingwenDeng
 * Date:2018/9/11 9:32
 */
public class Consumer implements Runnable {

    private final BlockingQueue queue;

    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
