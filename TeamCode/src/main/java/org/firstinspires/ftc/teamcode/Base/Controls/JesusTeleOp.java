package org.firstinspires.ftc.teamcode.Base.Controls;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Base.Robot.JesusBot;

@TeleOp(name = "Jesus Outreach Tele Op", group = "Outreach")
//@Disabled


//


public class JesusTeleOp extends OpMode {

    public JesusBot Bot = new JesusBot();

    public void init(){
        Bot.initRobot(hardwareMap);
    }

    public void loop () {
        drive();
        if (gamepad1.right_trigger > 0.5 || gamepad1.left_trigger > 0.5) {
            Bot.runLift(gamepad1.right_trigger);
            Bot.runLift(-gamepad1.left_trigger);
        }
        else if (gamepad2.right_trigger > 0.5 || gamepad2.left_trigger > 0.5) {
            Bot.runLift(gamepad2.right_trigger);
            Bot.runLift(-gamepad2.left_trigger);
        }
        else {
            Bot.runLift(0);
        }
        if (gamepad1.y || gamepad2.y) {
            Bot.JesusLauncher.setPower(1);
        }
        else {
            Bot.JesusLauncher.setPower(0);
        }
    }

    public void drive() {
//            if(gamepad1.dpad_up) {      // code that works
/*  Same code duplicated!??
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

        */

//            }
//            else if (gamepad1.dpad_down) {              // experimental code
        if (gamepad1.left_stick_y > .1) {                                      //------------------------------------Drive FORWARD
            Bot.driveForward(gamepad1.left_stick_y);                          //------------------------------------Drive FORWARD
        } else if (gamepad1.left_stick_y < -.1) {                            //------------------------------------Drive BACKWARD
            Bot.driveBackward(gamepad1.left_stick_y);                       //------------------------------------Drive BACKWARD
        } else if (gamepad1.left_stick_x > .1) {                           //------------------------------------Rotate LEFT
            Bot.rotateLeft(gamepad1.left_stick_x);                        //------------------------------------Rotate LEFT
        } else if (gamepad1.left_stick_x < -.1) {                        //------------------------------------Rotate RIGHT
            Bot.rotateRight(gamepad1.left_stick_x);                     //------------------------------------Rotate RIGHT
        } else {
            Bot.stopMotors();
        }
    }
}
