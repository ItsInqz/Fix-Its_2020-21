package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.DriveTrain;

import com.qualcomm.robotcore.hardware.DcMotor;

public class DualMotorDrive {

    //declaring variable
    public DcMotor frontLeftMotor;
    public DcMotor frontRightMotor;

    //defining method

    //stop command
    public void stop () {

        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);

    }
    //forward command
    public void driveForward (double power){
        double ABSpower = Math.abs(power);
        frontLeftMotor.setPower(power);
        frontRightMotor.setPower(power);
    }
    //left command
    public void turnLeft (double power){
        double ABSpower = Math.abs(power);
        frontLeftMotor.setPower(-power);
        frontRightMotor.setPower(power);

    }
    //right command
    public void turnRight(double power){
        double ABSpower = Math.abs(power);
        frontLeftMotor.setPower(power);
        frontRightMotor.setPower(-power);
    }
    //reverse command
    public void driveReverse(double power){
        double ABSpower = Math.abs(power);
        frontRightMotor.setPower(-power);
        frontLeftMotor.setPower(-power);
    }
}

