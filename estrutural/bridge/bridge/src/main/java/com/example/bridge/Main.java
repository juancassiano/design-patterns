package com.example.bridge;

import com.example.bridge.platforms.DisneyPlus;
import com.example.bridge.platforms.Facebook;
import com.example.bridge.platforms.IPlatform;
import com.example.bridge.platforms.TwitchTV;
import com.example.bridge.platforms.Youtube;
import com.example.bridge.transmissions.AdvancedLive;
import com.example.bridge.transmissions.Live;
import com.example.bridge.transmissions.RecordedLive;

public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform){
        System.out.println("Aguarde");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        System.out.println("Transmissão avançada. Aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

        System.out.println("Transmissão gravada. Aguarde");
        RecordedLive recordedLive = new RecordedLive(platform);
        recordedLive.broadcasting();
        recordedLive.record();
        recordedLive.result();
    
    }
}