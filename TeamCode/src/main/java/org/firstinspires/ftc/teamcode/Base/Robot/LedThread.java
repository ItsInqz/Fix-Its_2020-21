package org.firstinspires.ftc.teamcode.Base.Robot;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.util.ElapsedTime;

public class LedThread extends Thread {


    //Threading Variables & Constructor
    //

    public LedThread() { }


    // Robot Constructor
    public AckerBot Bot = new AckerBot();


    @Override
    public void run() {
        try {
            int i;
            while (!isInterrupted()) {

                Bot.ledLights.setPattern(Bot.patternArray[0]);
                sleep(2000);
                Bot.ledLights.setPattern(Bot.patternArray[1]);
                sleep(2000);
                Bot.ledLights.setPattern(Bot.patternArray[2]);
                sleep(2000);
            }
        }
        catch (Exception e) {}

    }


}
