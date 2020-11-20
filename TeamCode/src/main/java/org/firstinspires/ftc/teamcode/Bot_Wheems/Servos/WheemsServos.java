package org.firstinspires.ftc.teamcode.Bot_Wheems.Servos;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Bot_Wheems.lightsW.Lights;

public class WheemsServos extends Lights {

    public Servo mainServo;  //arm
    public Servo secondaryServo; //hand

    public LinearOpMode linearOp = null;
    public void setLinearOp (LinearOpMode Op) {
        linearOp = Op;
    }
    //methods or controls
        // main
    public void armStandard() throws InterruptedException{
        mainServo.setPosition(.35);
        secondaryServo.setPosition(1.2);
        linearOp.sleep(500);
        mainServo.setPosition(.55);
        secondaryServo.setPosition(0.9);
    }
    public void armDown () throws InterruptedException{
        mainServo.setPosition(0.4);
        secondaryServo.setPosition(1.2);
        linearOp.sleep(500);
        mainServo.setPosition(0.2);
        secondaryServo.setPosition(1.5);
    }

    //secondary
    public void handOpen () {
        secondaryServo.setPosition(.40);
    }
    public void handClose () {
        secondaryServo.setPosition(.10);
    }



}
