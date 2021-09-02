package org.firstinspires.ftc.teamcode.Zarchive.Bot_Wheems.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Zarchive.Bot_Wheems.movement_code.TwoMotorDriveWheems;

public class Robot extends TwoMotorDriveWheems {

    //hardware//
    public HardwareMap Wbot = null;
    //public LinearOpMode linearOp;
    public ElapsedTime lightTime;
    public double WaitLight = 1;
    //physical contructor
    public Robot() {

    }

    //custom robot

    public void initWbot (HardwareMap WMap) {
        Wbot = WMap;

        BackLeftMotor = Wbot.dcMotor.get("front_left_motor");
        BackRightMotor = Wbot.dcMotor.get("front_right_motor");

        //set direction
        BackLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        BackRightMotor.setDirection(DcMotor.Direction.FORWARD);

        //define mode
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //Define brake
        BackLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BackRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        //Servos
        mainServo = Wbot.get(Servo.class, "main_servo");
        mainServo.setDirection(Servo.Direction.REVERSE);

        secondaryServo = Wbot.get(Servo.class, "secondary_servo");
        secondaryServo.setDirection(Servo.Direction.FORWARD);

        //leds
        ledLightsW = Wbot.get(RevBlinkinLedDriver.class, "led_strip");

        ledPatternW = RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE;
        ledLightsW.setPattern(ledPatternW);

        //launcher


        //armmotor= Wbot.dcMotor.get("arm_motor");

        //armmotor.setDirection(DcMotor.Direction.FORWARD);

        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //armmotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }
    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {
        ledLightsW.setPattern(patternName);
    }

    public void christmas ()
    {
        setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_FOREST_PALETTE);
        lightTime.reset();
        if (lightTime.time() > WaitLight) {
            setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE);
    }
    }


}
