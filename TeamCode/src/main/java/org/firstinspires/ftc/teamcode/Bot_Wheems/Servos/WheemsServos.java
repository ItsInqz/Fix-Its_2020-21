package org.firstinspires.ftc.teamcode.Bot_Wheems.Servos;


import com.qualcomm.robotcore.hardware.Servo;

public class WheemsServos {

    public Servo mainServo;  //arm
    public Servo secondaryServo; //hand


    //methods or controls
        // main
    public void armStandard(boolean dpad_up) {
        mainServo.setPosition(.40);
    }
    public void armDown (boolean dpad_down) {
        mainServo.setPosition(.05);
    }

    //secondary
    public void handOpen (boolean dpad_right) {
        secondaryServo.setPosition(.40);
    }
    public void handClose (boolean dpad_left) {
        secondaryServo.setPosition(.10);
    }



}
