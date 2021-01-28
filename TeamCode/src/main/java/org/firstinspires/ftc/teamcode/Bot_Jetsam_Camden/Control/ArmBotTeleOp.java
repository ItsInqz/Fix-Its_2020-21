package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Arm_Bot;

@TeleOp(name = "ArmBotTeleOp")

public class ArmBotTeleOp extends OpMode {

    public Arm_Bot Bot = new Arm_Bot();

    public void init() {
        Bot.initArmBot(hardwareMap);

    }

    public void loop() {

        handControl();

    }

    public void handControl() {
        if (gamepad1.a) {
            Bot.point();
        }

        else if (gamepad1.b) {
            Bot.openHand();
        }

        else {
            Bot.closeHand();
        }
    }





}
