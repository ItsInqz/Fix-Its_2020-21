package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm_Bot {

    public Servo pinkyF = null;
    public Servo middleF = null;
    public Servo indexF = null;
    public Servo thumbF = null;
    public Servo ringF = null;

    public HardwareMap hwBot = null;


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
        thumbF.setDirection(Servo.Direction.FORWARD);

        ringF = hwBot.get(Servo.class, "ringF");
        ringF.setDirection(Servo.Direction.FORWARD);

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

}
