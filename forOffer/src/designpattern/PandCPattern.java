package designpattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * author:DingwenDeng
 * Date:2018/9/11 9:34
 */
public class PandCPattern {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}
