package facade.example;

import java.io.File;

import facade.example.complex_media_library.VideoConversionFacade;

public class Demo {
	public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("Result (great :l):" + mp4Video.toString());
        // ...
    }
}
