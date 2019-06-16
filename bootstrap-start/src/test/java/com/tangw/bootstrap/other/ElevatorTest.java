package com.tangw.bootstrap.other;

import org.assertj.core.util.Lists;

import java.util.List;
import java.util.Scanner;

/**
 * 模拟电梯
 *
 * @author tangw
 * @date 2019/6/16
 **/
public class ElevatorTest {

    private static final Long EXIT_FLAG = -1L;
    private static final Long MAX_LOU = 32L;
    private static final Long MIN_LOU = 1L;
    private static final Long DEFAULT_LOU = 1L;
    private static volatile List<Long> runTargetList;
    private static boolean startFlag;
    private static Scanner scanner;


    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        startFlag = true;
        runTargetList = Lists.newArrayList();
        new ProducerThread().start();
        new ConsumerThread().start();

    }


    /**
     * 生产者线程
     */
    static class ProducerThread extends Thread {
        @Override
        public void run() {
            for (Long i = MIN_LOU; i < MAX_LOU; i++) {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                if (!startFlag) {
                    System.out.println("电梯停止运行！！！");
                    break;
                }
                if (runTargetList.contains(i)) {
                    System.out.println(i + "层，到了，该下电梯了！");
                }
            }
            super.run();
        }
    }

    /**
     * 消费者线程
     */
    static class ConsumerThread extends Thread {
        @Override
        public void run() {
            while (true) {
                long next = scanner.nextLong();
                System.out.println("接收到了目标："+next);
                if (EXIT_FLAG.equals(next)) {
                    startFlag = false;
                    break;
                }
                runTargetList.add(next);
                runTargetList.sort(Long::compareTo);
            }
        }
    }


}
