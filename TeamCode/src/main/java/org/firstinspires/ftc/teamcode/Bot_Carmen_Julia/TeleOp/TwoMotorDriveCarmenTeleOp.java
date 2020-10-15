package org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot_Carmen_Julia.Robot.CarmenBot;
@TeleOp(name = "Carmen:Julia:FirstDrive")
public class TwoMotorDriveCarmenTeleOp extends OpMode {
    public CarmenBot Bot = new CarmenBot();

    public void init() {

        Bot.initRobot(hardwareMap);
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
