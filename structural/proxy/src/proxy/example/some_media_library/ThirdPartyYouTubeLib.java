package proxy.example.some_media_library;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
	HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
