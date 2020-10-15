package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Drivetrains;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDrive {

    public DcMotor rearRightMotor;
    public DcMotor rearLeftMotor;


    public LinearOpMode linearOp = null;
    public void setLinearOp(LinearOpMode linearOp) {
        this.linearOp = linearOp;
    }

    public void setMotorRunModes (DcMotor.RunMode mode){

        rearLeftMotor.setMode(mode);
        rearRightMotor.setMode(mode);
    }

    //Stop Motor with a decimal of zero
    public void stopMotors ()   {

        rearRightMotor.setPower(0);
        rearLeftMotor.setPower(0);
    }

    public void driveForward (double power){
        double ABSpower = Math.abs(power);

        rearRightMotor.setPower(ABSpower);
        rearLeftMotor.setPower(ABSpower);
    }

    public void driveBackward (double power) {
        double ABSpower = Math.abs(power);

        rearRightMotor.setPower(-ABSpower);
        rearLeftMotor.setPower(-ABSpower);

    }
    public void rotateLeft (double power) {
        double ABSpower = Math.abs(power);

        rearRightMotor.setPower(-ABSpower);
        rearLeftMotor.setPower(ABSpower);
    }

    // Reusuable Method to Turn Right (aka Rotate)

    public void rotateRight (double power) {
        double ABSpower = Math.abs(power);

        rearRightMotor.setPower(ABSpower);
        rearLeftMotor.setPower(-ABSpower);

    }
}
