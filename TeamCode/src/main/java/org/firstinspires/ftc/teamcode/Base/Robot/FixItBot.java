package org.firstinspires.ftc.teamcode.Base.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Base.Drivetrains.TwoWheelDrive;

public class FixItBot extends TwoWheelDrive {

    public HardwareMap hwBot = null;

    public Servo fixItServo = null;

    public DcMotor launcherLSpinner;
    public DcMotor launcherRSpinner;


    public FixItBot() {

    }

    public void initRobot (HardwareMap hwMap) {

        hwBot = hwMap;

        frontLeftMotor =  hwBot.dcMotor.get("front_left_motor");
        frontRightMotor = hwBot.dcMotor.get("front_right_motor");

        //direction set
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);

        //runmodes

        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //brakes (init)
        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //launching mechanism

        launcherRSpinner = hwBot.dcMotor.get("launcher_right_spinner");
        launcherRSpinner.setDirection(DcMotor.Direction.REVERSE);
        launcherRSpinner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        launcherLSpinner = hwBot.dcMotor.get("launcher_left_spinner");
        launcherLSpinner.setDirection(DcMotor.Direction.FORWARD);
        launcherLSpinner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        fixItServo = hwBot.servo.get("fixit_servo");
        fixItServo.setPosition(0);


    }

    public void launcherSpinInward () {

        launcherLSpinner.setPower(-1);
        launcherRSpinner.setPower(-1);
    }
    public void launcherSpinOutward () {

        launcherLSpinner.setPower(1);
        launcherRSpinner.setPower(1);
    }
    public void launcherSpinOff () {

        launcherLSpinner.setPower(0);
        launcherRSpinner.setPower(0);
    }

    //Servos


    public void rightWindup () {

        fixItServo.setPosition(.2);            // servo between 0 and 1
    }

    public void leftWindup () {

        fixItServo.setPosition(0.8);
    }

    public void WindupOff () {

        fixItServo.setPosition(0);
    }


}





