package org.firstinspires.ftc.teamcode.Bot_Wheems.movement_code;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TwoMotorDrive2 {
    //values//

    public DcMotor BackLeftMotor;
    public DcMotor BackRightMotor;

    //linear op//

    public LinearOpMode LinearOp = null;
    public void setLinearOp(LinearOpMode linearOp) {
        this.LinearOp = linearOp;
    }
    //commands//

    //stop//
    public void stop (double power) {
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(0);
        BackRightMotor.setPower(0);}
    //slow //
    public void driveForwardslow (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(ABSpower/2);
        BackRightMotor.setPower(ABSpower/2); }
    //forward//
    public void driveForward (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(ABSpower);
        BackRightMotor.setPower(ABSpower); }
    //fast //
    public void driveForwardfast (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(ABSpower*2);
        BackRightMotor.setPower(ABSpower*2); }
    //spin left//
    public void spinLeft (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(-ABSpower);
        BackRightMotor.setPower(0); }
    //turn right//
    public void turnRight(double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(ABSpower);
        BackRightMotor.setPower(ABSpower+(ABSpower/2)); }
    //turn left//
    public void turnLeft (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(ABSpower+(ABSpower/2));
        BackRightMotor.setPower(ABSpower); }
    //spin right//
    public void spinright (double power){
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(0);
        BackRightMotor.setPower(-ABSpower); }
    //reverse//

    //reverse right command//
    public void driveReverseRight (double power) {
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower(-ABSpower);
        BackRightMotor.setPower((-ABSpower+(-ABSpower/2)));
    }
    //reverse left command//
    public void driveReverseLeft (double power) {
        double ABSpower = Math.abs(power);

        BackLeftMotor.setPower((-ABSpower+(-ABSpower/2)));
        BackRightMotor.setPower(-ABSpower);
    }
}
