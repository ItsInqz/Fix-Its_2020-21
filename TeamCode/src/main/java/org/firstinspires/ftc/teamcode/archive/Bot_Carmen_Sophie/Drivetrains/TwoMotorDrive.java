package org.firstinspires.ftc.teamcode.archive.Bot_Carmen_Sophie.Drivetrains;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDrive {

    //variables

    public DcMotor rearLeftMotor;
    public DcMotor rearRightMotor;

    //liner Op
    public LinearOpMode linearOp = null;

    public void setLinearOp(LinearOpMode linearOp) {
                this.linearOp =linearOp;
    }

    //methods

    public void setMotorRunModes (DcMotor. RunMode mode) {
        rearLeftMotor. setMode(mode);
        rearRightMotor. setMode(mode);
    }

    public void stopMotors () {
        rearLeftMotor.setPower(0);
        rearRightMotor.setPower(0);
    }


    public void driveForward (double power) {
        double ABSpower=Math.abs(power);

        rearLeftMotor. setPower (ABSpower);
        rearRightMotor. setPower (ABSpower);
    }

    public void drivebackward (double power) {
        double ABSpower=Math.abs(power);

        rearLeftMotor. setPower(-ABSpower) ;
        rearRightMotor. setPower(-ABSpower);
    }

    public void rotateLeft (double power){
        double ABSpower = Math.abs(power);

        rearLeftMotor.setPower(-ABSpower);
        rearRightMotor.setPower(ABSpower);
    }
    public void rotateright (double power) {
        double ABSpower = Math.abs(power);

        rearLeftMotor.setPower(ABSpower);
        rearRightMotor.setPower(-ABSpower);
    }





}