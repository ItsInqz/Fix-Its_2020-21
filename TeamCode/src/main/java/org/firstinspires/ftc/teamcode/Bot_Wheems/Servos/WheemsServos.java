package org.firstinspires.ftc.teamcode.Bot_Wheems.Servos;


import com.qualcomm.robotcore.hardware.Servo;

public class WheemsServos {

    public Servo mainServo;  //arm
    public Servo secondaryServo; //hand


    //methods or controls
        // main
    public void armStandard() {
        mainServo.setPosition(.40);
    }
    public void armDown () {
        mainServo.setPosition(0.05);
    }

    //secondary
    public void handOpen () {
        secondaryServo.setPosition(.40);
    }
    public void handClose () {
        secondaryServo.setPosition(.10);
    }



}
