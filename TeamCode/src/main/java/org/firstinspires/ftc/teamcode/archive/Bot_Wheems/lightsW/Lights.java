package org.firstinspires.ftc.teamcode.archive.Bot_Wheems.lightsW;

import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import org.firstinspires.ftc.teamcode.archive.Bot_Wheems.launcherw.laucher;

public class Lights extends laucher{

    public RevBlinkinLedDriver ledLightsW;
    public RevBlinkinLedDriver.BlinkinPattern ledPatternW;

    public void setLedPattern (RevBlinkinLedDriver.BlinkinPattern patternName) {
        ledLightsW.setPattern(patternName);

    }



}
