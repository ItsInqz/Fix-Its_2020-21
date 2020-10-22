package org.firstinspires.ftc.teamcode.Bot_Wheems.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Bot_Wheems.movement_code.TwoMotorDriveWheems;

public class Robot extends TwoMotorDriveWheems {

    //hardware//
    public HardwareMap Wbot = null;



    //physical contructor
    public Robot() {

    }

    //custom robot

    public void initWbot (HardwareMap WMap) {
        Wbot = WMap;

        BackLeftMotor = Wbot.dcMotor.get("front_left_motor");
        BackRightMotor = Wbot.dcMotor.get("front_right_motor");

        //set direction
        BackLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        BackRightMotor.setDirection(DcMotor.Direction.REVERSE);

        //define mode
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //Define brake
        BackLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        //Servos
        mainServo = Wbot.get(Servo.class, "main_servo");
        mainServo.setDirection(Servo.Direction.FORWARD);

        secondaryServo = Wbot.get(Servo.class, "main_servo");
        secondaryServo.setDirection(Servo.Direction.FORWARD);

        //leds
        ledLightsW = Wbot.get(RevBlinkinLedDriver.class, "led_strip");

        ledPatternW = RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE;
        ledLightsW.setPattern(ledPatternW);

    }
    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {
        ledLightsW.setPattern(patternName);
    }





}
