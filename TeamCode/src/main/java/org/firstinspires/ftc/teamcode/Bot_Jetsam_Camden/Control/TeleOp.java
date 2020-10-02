package org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot_Jetsam_Camden.Robot.Jetsam_Bot_Camden;

//@TeleOp(name = "Jetsam:Camden:FirstDrive")
public class TeleOp     extends OpMode  {

    public Jetsam_Bot_Camden Bot = new Jetsam_Bot_Camden();

    public void init()  {

        Bot.initJetsam(hardwareMap);
    }

    public void loop()  {

    }

    public void stop()  {


    }
    public void drive(){

        if (gamepad1.left_stick_y > .1) {

            Bot.driveForward(gamepad1.left_stick_y);
        }
    }
}
