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

    public HardwareMap hwBot = null;

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
    boolean shoulderMove = false;

    public Arm_Bot() {
    }

    public void initArmBot(HardwareMap hwMap) {

        hwBot = hwMap;

        pinkyF = hwBot.get(Servo.class, "pinkyF");
        pinkyF.setDirection(Servo.Direction.FORWARD);

        middleF = hwBot.get(Servo.class, "middleF");
        middleF.setDirection(Servo.Direction.FORWARD);

        indexF = hwBot.get(Servo.class, "indexF");
        indexF.setDirection(Servo.Direction.FORWARD);

        thumbF = hwBot.get(Servo.class, "thumbF");
        thumbF.setDirection(Servo.Direction.REVERSE);

        ringF = hwBot.get(Servo.class, "ringF");
        ringF.setDirection(Servo.Direction.FORWARD);


        shoulderJ = hwBot.get(Servo.class, "shoulderJ");
        shoulderJ.setDirection(Servo.Direction.FORWARD);

        elbowJ = hwBot.get(Servo.class, "elbowJ");
        elbowJ.setDirection(Servo.Direction.FORWARD);

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

    public void moveElbowOpen() {
        elbowJ.setPosition(elbowJ.getPosition()+elbowIncrements);


    }

    public void moveElbowClose() {
        elbowJ.setPosition(elbowJ.getPosition()-elbowIncrements);


    }

}
