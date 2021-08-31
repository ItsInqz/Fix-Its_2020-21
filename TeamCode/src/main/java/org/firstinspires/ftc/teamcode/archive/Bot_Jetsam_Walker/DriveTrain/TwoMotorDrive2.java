package org.firstinspires.ftc.teamcode.archive.Bot_Jetsam_Walker.DriveTrain;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDrive2 {

    //variables
    public DcMotor rearLeftMotor;
    public DcMotor rearRightMotor;

    //linear Op
    public LinearOpMode linearOp = null;

    public void setLinearOp(LinearOpMode LinearOp) {
        this.linearOp = linearOp;
    }

    //methods
    public void setMotorRunModes(DcMotor.RunMode mode) {

        rearLeftMotor.setMode(mode);
        rearRightMotor.setMode(mode);
    }

    public void stopMotors() {
        rearLeftMotor.setPower(0);
        rearRightMotor.setPower(0);
    }

    public void driveForward(double power) {
        double ABSPower = Math.abs(power);

        rearLeftMotor.setPower(ABSPower);
        rearRightMotor.setPower(ABSPower);

    }

    public void driveBackward(double power) {
        double ABSPower = Math.abs(power);

        rearLeftMotor.setPower(-ABSPower);
        rearRightMotor.setPower(-ABSPower);
    }

    public void rotateLeft(double power) {
        double ABSPower = Math.abs(power);

        rearLeftMotor.setPower(ABSPower);
        rearRightMotor.setPower(-ABSPower);
    }

    public void rotateRight(double power) {
        double ABSPower = Math.abs(power);

        rearLeftMotor.setPower(ABSPower);
        rearRightMotor.setPower(-ABSPower);
    }
}
