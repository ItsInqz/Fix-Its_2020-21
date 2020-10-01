
package org.firstinspires.ftc.teamcode.Bot_Wheems.movement_code;

import com.qualcomm.robotcore.hardware.DcMotor;

public class DualMotorDrive {

    //values//
    public DcMotor Left;
    public DcMotor Right;


    //commands//

    //stop//
    public void stop () {
        Left.setPower(0);
        Right.setPower(0);}
    //slow forward//
    public void driveForwardslow (double power){
        Left.setPower(power/2);
        Right.setPower(power/2); }
    //forward//
    public void driveForward (double power){
        Left.setPower(power);
        Right.setPower(power); }
    //fast forward//
    public void driveForwardfast (double power){
        Left.setPower(power*2);
        Right.setPower(power*2); }
    //spin left//
    public void spinLeft (double power){
        Left.setPower(-power);
        Right.setPower(0); }
    //turn right//
    public void turnRight(double power){
        Left.setPower(power);
        Right.setPower(power+(power/2)); }
    //turn left//
    public void turnLeft (double power){
        Left.setPower(power+(power/2));
        Right.setPower(power); }
    //spin right//
    public void spinright (double power){
        Left.setPower(0);
        Right.setPower(-power); }
    //reverse//

    //reverse right command//
    public void driveReverseRight (double power) {
        Left.setPower(-power);
        Right.setPower((-power+(-power/2)));
    }
    //reverse left command//
    public void driveReverseLeft (double power) {
        Left.setPower((-power+(-power/2)));
        Right.setPower(-power);
    }
}
