package org.firstinspires.ftc.teamcode.archive.Bot_Wheems.control;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.archive.Bot_Wheems.Robot.Robot;

//@TeleOp(name = "TeleOp Wheems", group = "Bot_Wheems")

public class TwoMotorDriveTeleOpW extends OpMode {

    public Robot Bot = new Robot();

    double speedMultiply = 1;
    double launcherPower = 5;

    public void init() {

        Bot.initWbot(hardwareMap);
    }

    public void loop() {
        speed();
        drive();
        arm();
        //try {
            //shoot();
        //} catch (InterruptedException e) {
           // e.printStackTrace();
        //}
        ledControlW();
    }

    public void speed()  {
        if (gamepad1.left_stick_button){
            speedMultiply = 0.5;

        } else if (gamepad1.right_stick_button){
            speedMultiply = 1;

        }

    }


    public void drive() {

        if (gamepad1.left_stick_y > .1) {

            Bot.driveBackward(speedMultiply*gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_y < -.1) {

            Bot.driveForward(speedMultiply*gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_x > .1) {

            Bot.turnleft(speedMultiply*gamepad1.left_stick_x);

        } else if (gamepad1.left_stick_x < -.1) {

            Bot.turnright(speedMultiply*gamepad1.left_stick_x);

        } else {

            Bot.stopMotors();
        }
    }

    public void arm() {
        if (gamepad1.y) {

            Bot.armStandard();

        } else if (gamepad1.a) {

            Bot.armDown();

        } else if (gamepad1.b) {

            Bot.handOpen();

        } else if (gamepad1.x) {

            Bot.handClose();

        }

    }
    public void ledControlW () {
        if (gamepad1.left_bumper) {

            Bot.christmas();

        }
        if (gamepad1.right_bumper) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_OCEAN_PALETTE);
        }
    }
    //public void shoot () throws InterruptedException {
        //if(gamepad1.start) {
            //Bot.startlauncher(launcherPower);

        //}else if(gamepad1.left_bumper) {
            //Bot.drop_ball_and_reset();

        //}else if(gamepad1.right_bumper) {
            //Bot.stoplauncher();

        //}

    //}












}

