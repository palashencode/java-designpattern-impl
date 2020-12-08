package com.java.app.facade;

import java.io.File;

public class Client {
    public void executeClientCode(){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
