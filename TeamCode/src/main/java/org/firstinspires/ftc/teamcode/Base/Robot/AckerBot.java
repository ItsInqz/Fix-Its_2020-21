package org.firstinspires.ftc.teamcode.Base.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Base.Drivetrains.MecanumDrive;

import java.util.concurrent.TimeUnit;


public class AckerBot extends MecanumDrive {

    //Robot Hardware Constructors

    public HardwareMap hwBot  =  null;

    // Led Variables
    public RevBlinkinLedDriver ledLights;
    public RevBlinkinLedDriver.BlinkinPattern ledPattern;
    public RevBlinkinLedDriver.BlinkinPattern patternArray[] = {
            RevBlinkinLedDriver.BlinkinPattern.GREEN,                             //0 index
            RevBlinkinLedDriver.BlinkinPattern.RED,                               //1 index
            RevBlinkinLedDriver.BlinkinPattern.WHITE,                            //2 index
            RevBlinkinLedDriver.BlinkinPattern.HEARTBEAT_RED,                    //3 index
            RevBlinkinLedDriver.BlinkinPattern.LIGHT_CHASE_RED,                  //4 index
            RevBlinkinLedDriver.BlinkinPattern.TWINKLES_FOREST_PALETTE,          //5 index
            RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_PARTY_PALETTE,       //6 index
            RevBlinkinLedDriver.BlinkinPattern.RAINBOW_PARTY_PALETTE,           //7 index
            RevBlinkinLedDriver.BlinkinPattern.SINELON_FOREST_PALETTE,           //8 index

    };


    // Timer
    public ElapsedTime currentTime = new ElapsedTime();
    public int ledTimer;
    public int ledTimerIncrementer  = 4;
    public int ledCounter = 0;

    //AckerBot specific hardware
    public DcMotor launcher;
    public Servo trapDoor;

    //FTC SDK Requirement
    public LinearOpMode linearOp = null;
    public void setLinearOp (LinearOpMode Op) {
        linearOp = Op;
    }

    //LabBot Constructor

    public AckerBot() {

    }


    public void initRobot(HardwareMap hwMap) {

        hwBot = hwMap;

        // Define Motors for Robot
        frontLeftMotor = hwBot.dcMotor.get("front_left_motor");
        frontRightMotor = hwBot.dcMotor.get("front_right_motor");
        rearLeftMotor = hwBot.dcMotor.get("rear_left_motor");
        rearRightMotor = hwBot.dcMotor.get("rear_right_motor");


        frontLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        rearLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        frontRightMotor.setDirection(DcMotor.Direction.REVERSE);
        rearRightMotor.setDirection(DcMotor.Direction.REVERSE);


        //Initialize Motor Run Mode for Robot
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Other Motors
        launcher = hwBot.dcMotor.get("launcher");
        launcher.setDirection(DcMotor.Direction.REVERSE);
        launcher.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        //Servos
        trapDoor = hwBot.get(Servo.class, "trap_door");
        trapDoor.setDirection(Servo.Direction.REVERSE);
        closeTrapDoor();

        //Define & Initialize LEDTester Lights
        ledLights = hwBot.get(RevBlinkinLedDriver.class, "led_strip");
        ledPattern = RevBlinkinLedDriver.BlinkinPattern.RAINBOW_PARTY_PALETTE;   //https://www.revrobotics.com/content/docs/REV-11-1105-UM.pdf
        ledLights.setPattern(ledPattern);


        //Timer Reset
        currentTime.reset();

        //
        ledCounter = 0 ;



    }

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {

        ledLights.setPattern(patternName);

    }

    public void stopLauncher () {
        launcher.setPower(0);
        launcher.setPower(0);

    }

    public void runLauncher (double power) {
        double ABSpower = Math.abs(power);
        launcher.setPower(ABSpower);
        launcher.setPower(ABSpower);

    }

    public void openTrapDoor () {
        trapDoor.setPosition(.4);

    }

    public void closeTrapDoor () {
        trapDoor.setPosition(.7);
    }




}
