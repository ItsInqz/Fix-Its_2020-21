package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Base.Robot.FixItBot;

@TeleOp(name = "TeleOp - 2WD", group = "FixIt")


public class TwoMotorDriveTeleOp extends OpMode {

    public FixItBot Bot = new FixItBot();

    public void init()    {

        Bot.initRobot(hardwareMap);
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

            Bot.rotateLeft(gamepad1.left_stick_x);

        } else if (gamepad1.left_stick_x < -.1) {

            Bot.rotateRight(gamepad1.left_stick_x);


        } else {

            Bot.stopMotors();
        }


    }








}
