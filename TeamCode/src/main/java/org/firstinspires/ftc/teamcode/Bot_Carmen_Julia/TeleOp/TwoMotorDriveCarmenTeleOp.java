package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Robot.CarmenBot;

public class TwoMotorDriveCarmenTeleOp extends OpMode {
    public CarmenBot Bot = new CarmenBot();

    public void init() {

    }

    public void loop () {
        drive();
    }

    public void drive () {
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
