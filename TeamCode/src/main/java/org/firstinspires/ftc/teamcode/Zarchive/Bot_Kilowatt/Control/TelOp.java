package org.firstinspires.ftc.teamcode.Zarchive.Bot_Kilowatt.Control;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Zarchive.Bot_Kilowatt.Robot.Kilowatt_Bot;

//@TeleOp(name = "Kilowatt_Is_Best")
public class TelOp extends OpMode {

    public Kilowatt_Bot Bot = new Kilowatt_Bot();

    double speedMultiply = 1;

    public void init()  {

        Bot.initKilowatt(hardwareMap);
    }

    public void loop()  {

        drive();
        slowDrive();

        flagControl ();
    }

    public void stop()  {


    }
    public void slowDrive() {

        if (gamepad1.dpad_down) {
            speedMultiply = 0.5;
        }
        else if (gamepad1.dpad_up) {
            speedMultiply = 1;
        }
    }
    public void drive(){

        if (gamepad1.left_stick_y > .1) {

            Bot.driveForward( speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_y < -.1) {

            Bot.driveBackward(speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.right_stick_x > .1) {

            Bot.turnRight(speedMultiply * gamepad1.right_stick_x);
        }
        else if (gamepad1.right_stick_x < -.1) {

            Bot.turnLeft(speedMultiply * gamepad1.right_stick_x);
        }
        else {

            Bot.stopMotors();
        }
    }

    public void flagControl (){
        if (gamepad1.left_bumper){
            Bot.raiseFlag();
        }else if (gamepad1.right_bumper){
            Bot.lowerFlag();
        }
    }
}
