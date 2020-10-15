package org.firstinspires.ftc.teamcode.Bot_Wheems.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Wheems.Robot.Robot;

@TeleOp(name = "TeleOp Wheems", group = "Bot_Wheems")

public class TwoMotorDriveTeleOpW extends OpMode {

    public Robot Bot = new Robot();

    public void init(){

        Bot.initWbot(hardwareMap);
    }

    public void loop () {

        drive();

    }

    public void drive() {

        if (gamepad1.left_stick_y > .1) {

            Bot.driveForward(gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_y < -.1) {

            Bot.driveBackward(gamepad1.left_stick_y);

        } else if (gamepad1.left_stick_x > .1) {

            Bot.turnleft(gamepad1.left_stick_x);

        } else if (gamepad1.left_stick_x < -.1) {

            Bot.turnright(gamepad1.left_stick_x);

        } else {

            Bot.stopMotors();
        }
    }






}
