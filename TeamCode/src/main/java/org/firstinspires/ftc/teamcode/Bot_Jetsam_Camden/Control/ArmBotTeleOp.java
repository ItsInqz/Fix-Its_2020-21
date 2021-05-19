package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Arm_Bot;

@TeleOp(name = "ArmBotTeleOp")

public class ArmBotTeleOp extends OpMode {

    //  boolean elbowMove = false;
    //  boolean shoulderMove = false;

    public Arm_Bot Bot = new Arm_Bot();

    public void init() {

        Bot.initArmBot(hardwareMap);
        Bot.elbowCurrPos = Bot.elbowJ.getPosition();
        Bot.shoulderCurrPos = Bot.shoulderJ.getPosition();

    }

    public void loop() {

        handControl();
       // armControl();
        wristControl();
        elbowControl();
    }

    public void handControl() {

        if (gamepad1.a) {
            Bot.point();
        } else if (gamepad1.b) {
            Bot.openHand();
        } else if (gamepad1.y) {
            Bot.peace();
        } else if (gamepad1.left_bumper) {
            Bot.solute();
        } else if (gamepad1.x) {
            Bot.thumbsUp();
        } else {
            Bot.closeHand();
        }
    }


    public void armControl() {
        if (gamepad1.dpad_right) {
            Bot.raiseElbow();
        } else if (gamepad1.dpad_left) {
            Bot.flatElbow();
        } else if (gamepad1.dpad_up) {
            Bot.raiseShoulder();
        } else if (gamepad1.dpad_down) {
            Bot.flatShoulder();
        }
    }


    public void elbowControl() {

        if (gamepad1.dpad_up  && Bot.elbowCurrPos < Bot.elbowMaxPos)
        {
            Bot.elbowCurrPos = Bot.elbowCurrPos + Bot.elbowIncrements;
            Bot.elbowJ.setPosition(Bot.elbowCurrPos);

        }

        if (gamepad1.dpad_down  && Bot.elbowCurrPos > Bot.elbowMinPOs)
        {
            Bot.elbowCurrPos = Bot.elbowCurrPos - Bot.elbowIncrements;
            Bot.elbowJ.setPosition(Bot.elbowCurrPos);
        }

        Bot.elbowJ.setPosition(Bot.elbowCurrPos);
    }


    public void wristControl() {
        if (gamepad1.left_trigger > 0.1) {

            Bot.openWrist();
        }
        else {

            Bot.closeWrist();

        }

    }

}
