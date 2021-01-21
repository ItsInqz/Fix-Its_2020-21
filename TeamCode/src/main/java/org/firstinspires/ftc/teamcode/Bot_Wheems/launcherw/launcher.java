package org.firstinspires.ftc.teamcode.Bot_Wheems.launcherw;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class launcher {

    public DcMotor launcher1;
    public DcMotor launcher2;
    public Servo dropper;
    public ElapsedTime WaitTime;
    public double WaitTime2 = 1;


    public void stoplauncher () {
        launcher1.setPower(0);
        launcher2.setPower(0);

    }

    public void startlauncher (double power) {
        double ABSpower = Math.abs(power);
        launcher1.setPower(ABSpower);
        launcher2.setPower(ABSpower);

    }
    public void drop_ball_and_reset () {
        WaitTime.reset();
        while (WaitTime.time() < WaitTime2);{
            dropper.setPosition(0.5);
        }
        while (WaitTime.time() > WaitTime2){
            dropper.setPosition(0);
        }
    }
    //this is all theoretical//
}
