package com.sammyielModesterMw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Traffic {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> carCollection = new ArrayList<Integer>();
        Random rand = new Random();
        int num = rand.nextInt();
        for (int i = 1; i <= 100; i++) {
            carCollection.add(i);
        }

        while(carCollection.size() > 0) {

            class greenGo extends TimerTask {
                public void run() {
                    System.out.println("\n=====================\nGREEN\nGO!\n=====================\n");
                    for (int i = 1; i <= 100; i++) {
                        carCollection.remove(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            class yellowSlow extends TimerTask {
                public void run() {
                    System.out.println("\n=====================\nYELLOW\nGET READY TO STOP!\n=====================\n");
                    for (int i = 1; i <= 100; i++) {
                        carCollection.remove(i);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            class redStop extends TimerTask {
                public void run() {
                    System.out.println("\n=====================\nRED\nSTOP!\n=====================\n");
                    for (int i = 1; i <= 100; i++) {
                        carCollection.add(i);
                    }
                }
            }


            Timer timer1 = new Timer();
            TimerTask task1 = new greenGo();
            timer1.schedule(task1, 0);
            Thread.sleep(300);

            Timer timer2 = new Timer();
            TimerTask task2 = new yellowSlow();
            timer2.schedule(task2, 0);
            Thread.sleep(100);

            Timer timer3 = new Timer();
            TimerTask task3 = new redStop();
            timer3.schedule(task3, 0);
            Thread.sleep(200);

        }
    }
}

