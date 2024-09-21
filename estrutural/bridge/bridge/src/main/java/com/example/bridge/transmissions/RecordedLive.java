package com.example.bridge.transmissions;

import com.example.bridge.platforms.IPlatform;

public class RecordedLive extends Live{
  
  public RecordedLive(IPlatform platform){
    super(platform);
  }

  public void record(){
    System.out.println("Iniciando gravação");
  }
}
