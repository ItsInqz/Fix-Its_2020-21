package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;


import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
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
        Bot.lowerFlag();
    }

    // TeleOp Loop Method.  This start AFTER clicking the Play Button on the Driver Station Phone

    public void loop () {

        drive();
        flagControl();
        ledControl();

    }





    // The custom methods to control the Robot duing TeleOp

    public void drive() {
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


    //Methods to control the flag

    public void flagControl () {

        if (gamepad1.a) {
            Bot.raiseFlag();
        }
        else if (gamepad1.b)  {
            Bot.lowerFlag();
        }

    }

    public void ledControl () {

        if (gamepad1.left_trigger > 0.1) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE);
        } else if (gamepad1.right_trigger > 0.1) {
            Bot.setLedPattern(RevBlinkinLedDriver.BlinkinPattern.COLOR_WAVES_LAVA_PALETTE);
        }
    }

//SHORT_RED
//SHORT_BLUE
//SHORT_WHITE

//COLOR_WAVES_LAVA_PALETTE
//COLOR_WAVES_OCEAN_PALETTE

//STROBE_RED
//STROBE_BLUE
//STROBE_WHITE







    }
