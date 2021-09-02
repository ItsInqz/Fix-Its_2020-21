package org.firstinspires.ftc.teamcode.Zarchive.Bot_Kilowatt.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Zarchive.Bot_Kilowatt.DriveTrain.TwoMotorDrive;

public class Kilowatt_Bot extends TwoMotorDrive {

    //hardware variable
    public HardwareMap hwBot = null;
    public Servo flag=null;

    // Led Variables
    public RevBlinkinLedDriver ledLights;
    public RevBlinkinLedDriver.BlinkinPattern ledPattern;

    public Kilowatt_Bot (){

    }

    public void initKilowatt (HardwareMap hwMap) {

        hwBot = hwMap;

        rearLeftMotor = hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");

        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);

        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        flag= hwBot. get(Servo.class, "flag");
        flag.setDirection(Servo.Direction.FORWARD);

        ledLights = hwBot.get(RevBlinkinLedDriver.class, "led_strip");

        ledPattern = RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE;
        ledLights.setPattern(ledPattern);
    }


    public void raiseFlag(){
        flag.setPosition(0.9);
    }

    public void lowerFlag(){
        flag.setPosition(0.1);
    }

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName){
            ledLights.setPattern(patternName);
    }
}
