package thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * author:DingwenDeng
 * Date:2018/9/9 16:59
 */
public class Callable5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> t1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        };
        Callable<Integer> t2 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        };
        Callable<Integer> t3 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        };
        Callable<Integer> t4 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        };
        Callable<Integer> t5 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        };
        ArrayList<Integer> result = new ArrayList<>();
        FutureTask<Integer> res1 = new FutureTask<Integer>(t1);
        new Thread(res1).start();
        FutureTask<Integer> res2 = new FutureTask<Integer>(t2);
        new Thread(res2).start();
        FutureTask<Integer> res3 = new FutureTask<Integer>(t3);
        new Thread(res3).start();
        FutureTask<Integer> res4 = new FutureTask<Integer>(t4);
        new Thread(res4).start();
        FutureTask<Integer> res5 = new FutureTask<Integer>(t5);
        new Thread(res5).start();
        Thread.sleep(1000);
        if(res1.isDone()){
            result.add(res1.get());
        }
        if(res2.isDone()){
            result.add(res2.get());
        }
        if(res3.isDone()){
            result.add(res3.get());
        }
        if(res4.isDone()){
            result.add(res4.get());
        }
        if(res5.isDone()){
            result.add(res5.get());
        }
        return;
    }
}
