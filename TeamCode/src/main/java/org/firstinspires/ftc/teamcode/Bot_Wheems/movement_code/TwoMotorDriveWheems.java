package org.firstinspires.ftc.teamcode.Bot_Wheems.movement_code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDriveWheems {
    //values//

        public DcMotor BackLeftMotor;  //backLeftMotor
        public DcMotor BackRightMotor;

        //linear op//

        public LinearOpMode LinearOp = null;
        public void setLinearOp(LinearOpMode linearOp) {
            this.LinearOp = linearOp;
        }
    //commands//
    //turn//
        public void stopMotors () {


            BackLeftMotor.setPower(0);
            BackRightMotor.setPower(0);
    }
        //mode//
        public void setMotorRunModes (DcMotor.RunMode mode) {
            BackLeftMotor.setMode(mode);
            BackRightMotor.setMode(mode);
        }

        //forward//
        public void driveForward (double power) {
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(ABSpower);
            BackRightMotor.setPower(ABSpower);
        }

        //backward//
        public void driveBackward (double power) {
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(-ABSpower);
            BackRightMotor.setPower(-ABSpower);
        }
        //right//
        //spin//
        public void turnleft (double power) {
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(ABSpower);
            BackRightMotor.setPower(-ABSpower);
        }
        //turn//
        public void turnright (double power) {
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(-ABSpower);
            BackRightMotor.setPower(ABSpower);
        }

}
