package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Base.Robot.FixItBot;

@TeleOp(name = "TeleOp - FixIt", group = "FixIt")
//@Disabled
public class FixItTeleOp extends OpMode {

    // Construct the Physical Bot based on the Robot Class
    public FixItBot Bot = new FixItBot();


    // TeleOp Initialize Method.  This is the Init Button on the Driver Station Phone
    @Override
    public void init()    {

        Bot.initRobot(hardwareMap);
    }

    // TeleOp Loop Method.  This start AFTER clicking the Play Button on the Driver Station Phone

    public void loop () {

        drive();

    }



    // The custom methods to control the Robot duing TeleOp

    public void drive() {

        if (gamepad1.left_stick_y > .1) {

           Bot.driveForward(gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_y < -.1) {

            Bot.driveBackward(gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_x > .1) {

            Bot.rotateLeft(gamepad1.left_stick_x);

        } else if (gamepad1.left_stick_x < -.1) {

            Bot.rotateRight(gamepad1.left_stick_x);

        } else {

            Bot.stopMotors();
        }
    }

    public void drive2() {
        if (gamepad1.dpad_up) {

            if (gamepad1.left_stick_y > .1) {

                Bot.driveForward(gamepad1.left_stick_y);

            } else if (gamepad1.left_stick_y < -.1) {

                Bot.driveBackward(gamepad1.left_stick_y);

            } else if (gamepad1.left_stick_x > .1) {

                Bot.rotateLeft(gamepad1.left_stick_x);

            } else if (gamepad1.left_stick_x < -.1) {

                Bot.rotateRight(gamepad1.left_stick_x);

            } else {

                Bot.stopMotors();
            }
        } else if (gamepad1.dpad_down) {
            if (gamepad1.left_stick_y > .1) {
                Bot.driveForward(gamepad1.left_stick_y);
            } else if (gamepad1.left_stick_y < -.1) {
                Bot.driveBackward(gamepad1.left_stick_y);
            } else if (gamepad1.left_stick_x > .1) {
                Bot.rotateLeft(gamepad1.left_stick_x);
            } else if (gamepad1.left_stick_x < -.1) {
                Bot.rotateRight(gamepad1.left_stick_x);
            } else {
                Bot.stopMotors();
            }
        }
    }







}
