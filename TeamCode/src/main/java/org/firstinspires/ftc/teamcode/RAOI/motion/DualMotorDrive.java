package org.firstinspires.ftc.teamcode.RAOI.motion;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class DualMotorDrive  {
        //values//

        public DcMotor BackLeftMotor;
        public DcMotor BackRightMotor;
        public DcMotor EleMotor;

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
        public void driveForward (double power){
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(ABSpower);
            BackRightMotor.setPower(ABSpower); }
        //spin left//
        public void spinLeft (double power){
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(-ABSpower);
            BackRightMotor.setPower(ABSpower); }
        //spin right//
        public void spinright (double power){
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(ABSpower);
            BackRightMotor.setPower(-ABSpower); }
        //reverse//
        public void reverse (double power) {
            double ABSpower = Math.abs(power);

            BackLeftMotor.setPower(-ABSpower);
            BackRightMotor.setPower(-ABSpower);

        }
        public void up () {

            EleMotor.setPower(1);

         }
        public void down (){

            EleMotor.setPower(1);

        }

}
