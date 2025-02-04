package com.example.quantrac.Program;

import com.example.quantrac.COD_BOD_Module.CodSensorData;
import com.example.quantrac.DIDOModule.DIData;
import com.example.quantrac.DIDOModule.DOData;
import com.example.quantrac.PHModule.PHData;

import java.util.Timer;
import java.util.TimerTask;

public class Globals {

    public static Integer idOld = 6;
    public static Integer idNew = 10;
    public static Boolean btnSetId = false;

    public static int delayPump = 30;

    //calibration
    public static Boolean pH1Zero = false;
    public static Boolean pH1SlopeLo = false;
    public static Boolean pH1SlopeHi = false;
    public static Boolean pH2Zero = false;
    public static Boolean pH2SlopeLo = false;
    public static Boolean pH2SlopeHi = false;



    public static Boolean codDefault = false;
    public static Boolean turnOnBrush = false;
    public static double X = 0.2;
    public static double Y = 151.2;
    public static Boolean codCalibration = false;


    // module di-do
    public static DIData dIData = new DIData(
            new boolean[8],
            new boolean[8],
            new boolean[8],
            0,
            0,
            0
    );
    public static DOData dOData = new DOData(
            new boolean[8],
            new boolean[8],
            new boolean[8],
            0,
            0,
            0
    );
    public static byte[] bufferAll = null;

    public static PHData getPH1Data = null;
    public static PHData getPH2Data = null;
    public static CodSensorData codSensorData = null;


    public static Timer timerReadDIDOData;
    public static TimerTask timerReadDIDODataTask;


    //data realtime
    public static Double pH1 = -0.01;
    public static Double temp1 = -0.01;
    public static Double pH2 = -0.01;
    public static Double temp2 = -0.01;
    public static Double cod = -0.01;
    public static Double bod = -0.01;
    public static Double tss = -0.01;


    //offset data
    public static Double offsetPH1 = 0.0;
    public static Double offsetPH2 = 0.0;
    public static Double offsetCOD = 0.0;


    //data setup from UI
    public static Double pHMinSet = 6.5;
    public static Double pHMaxSet = 8.5;
    public static Double codSet = 100.0;


    public static Double pHMid = 0.0;





}
