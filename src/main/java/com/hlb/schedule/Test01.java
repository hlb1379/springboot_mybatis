package com.hlb.schedule;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Fly on 2019/3/28.
 */
public class Test01 {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器schedule---"+new Random().nextInt(999));
            }
        },5000,1000);
    }
}