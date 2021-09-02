package org.firstinspires.ftc.teamcode.Zarchive.Bot_Carmen_Julia.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Zarchive.Bot_Carmen_Julia.Drivetrains.TwoMotorDrive;


public class CarmenBot extends TwoMotorDrive {// Custom Robot Initiazition Method

    public HardwareMap hwBot = null;
    public Servo arm = null;

    public RevBlinkinLedDriver ledLights;
    public RevBlinkinLedDriver.BlinkinPattern ledPattern;


    public DcMotor leftLaucnher = null;
    public DcMotor rightLaucnher = null;
    public CarmenBot(){

    }

    public void initRobot (HardwareMap hwMap) {

        hwBot = hwMap;

        leftLaucnher = hwBot.dcMotor.get("left_launcher");
        rightLaucnher = hwBot.dcMotor.get("right_launcher");

        leftLaucnher.setDirection(DcMotor.Direction.REVERSE);
        rightLaucnher.setDirection(DcMotor.Direction.REVERSE);

        leftLaucnher.setDirection(DcMotor.Direction.FORWARD);
        rightLaucnher.setDirection(DcMotor.Direction.FORWARD);

        rearLeftMotor =  hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");



        //Sets the direction of the robot's motors
        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);

        //Define this robot run modes
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define this robot's braking modes
        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        arm = hwBot.get(Servo.class, "arm");
        arm.setDirection(Servo.Direction.FORWARD);

        ledLights = hwBot.get(RevBlinkinLedDriver.class, "led_strip");

        ledPattern = RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_OCEAN_PALETTE;
        ledLights.setPattern(ledPattern);


    }

    public void raiseArm(){

        arm.setPosition(0.6);
    }
    public void lowerArm() {

        arm.setPosition(0);

    }
    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName){
        ledLights.setPattern((patternName));
    }

   public void launchCandy() {
        leftLaucnher.setPower(1);
        rightLaucnher.setPower(-1);
    }

    public void stopLauncher() {
        leftLaucnher.setPower(0);
        rightLaucnher.setPower(0);
    }
}

