package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm_Bot {

    public Servo pinkyF = null;
    public Servo middleF = null;
    public Servo indexF = null;
    public Servo thumbF = null;
    public Servo ringF = null;

    public Servo shoulderJ = null;
    public Servo elbowJ = null;

    public Servo wristJ = null;

    public HardwareMap hwBot = null;

    /*
    public double elbowOpen = 1.0;
    public double elbowClose = 0;
    double elbowDelta = Math.abs(elbowClose-elbowOpen);
    double elbowIncrements = 10;
    double elbowIncrementAmt = elbowDelta / elbowIncrements;

    double shoulderOpen = 1.0;
    double shoulderClose = 0;
    double shoulderDelta = Math.abs(shoulderClose-shoulderOpen);
    double shoulderIncrements = 10;
    double shoulderIncrementAmt = shoulderDelta / shoulderIncrements;
    */

    public Arm_Bot() {
    }

    public void initArmBot(HardwareMap hwMap) {

        hwBot = hwMap;

        pinkyF = hwBot.get(Servo.class, "pinkyF");      // port 1
        pinkyF.setDirection(Servo.Direction.FORWARD);

        middleF = hwBot.get(Servo.class, "middleF");    // port 3
        middleF.setDirection(Servo.Direction.FORWARD);

        indexF = hwBot.get(Servo.class, "indexF");      // port 4
        indexF.setDirection(Servo.Direction.FORWARD);                          // all extension hub

        thumbF = hwBot.get(Servo.class, "thumbF");      // port 5
        thumbF.setDirection(Servo.Direction.REVERSE);

        ringF = hwBot.get(Servo.class, "ringF");        // port 2
        ringF.setDirection(Servo.Direction.FORWARD);


       // shoulderJ = hwBot.get(Servo.class, "shoulderJ");    //port 1
    //    shoulderJ.setDirection(Servo.Direction.FORWARD);

       // elbowJ = hwBot.get(Servo.class, "elbowJ");  //port 2        control hub
    //    elbowJ.setDirection(Servo.Direction.FORWARD);

    //    wristJ = hwBot.get(Servo.class, "wristJ");  //port 3
        //wristJ.setDirection(Servo.Direction.FORWARD);

    }

    public void closeWrist() {
        wristJ.setPosition(0);
    }

    public void openWrist() {
        wristJ.setPosition(1);
    }

    public void point() {
        thumbF.setPosition(0);
        indexF.setPosition(1);
        middleF.setPosition(0);
        ringF.setPosition(0);
        pinkyF.setPosition(0);

    }

    public void closeHand() {
        thumbF.setPosition(0);
        indexF.setPosition(0);
        middleF.setPosition(0);
        ringF.setPosition(0);
        pinkyF.setPosition(0);

    }

    public void openHand() {
        thumbF.setPosition(1);
        indexF.setPosition(1);
        middleF.setPosition(1);
        ringF.setPosition(1);
        pinkyF.setPosition(1);

    }

    public void thumbsUp() {
        thumbF.setPosition(1);
        indexF.setPosition(0);
        middleF.setPosition(0);
        ringF.setPosition(0);
        pinkyF.setPosition(0);

    }

    public void solute() {
        thumbF.setPosition(0);
        indexF.setPosition(0);
        middleF.setPosition(1);
        ringF.setPosition(0);
        pinkyF.setPosition(0);

    }

    public void surferWave() {
        thumbF.setPosition(0);
        indexF.setPosition(1);
        middleF.setPosition(0);
        ringF.setPosition(0);
        pinkyF.setPosition(1);

    }

    public void flatElbow() {
        elbowJ.setPosition(-0.1);
    }

    public void raiseElbow() {
        elbowJ.setPosition(-0.25);
    }



    public void raiseShoulder() {
        shoulderJ.setPosition(-0.22);
    }


    public void flatShoulder() {
        shoulderJ.setPosition(-0.12);
    }


   /* public void moveElbowOpen() {
        elbowJ.setPosition(elbowJ.getPosition()+elbowIncremvents);


    }

    public void moveElbowClose() {
        elbowJ.setPosition(elbowJ.getPosition()-elbowIncrements);


    }   */

}
