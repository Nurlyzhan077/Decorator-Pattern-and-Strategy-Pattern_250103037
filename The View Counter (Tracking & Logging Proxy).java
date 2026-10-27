public class ProxyVideo {
    private String videoName;
    private RealVideo realVideo;
    private int viewCount = 0;

    public ProxyVideo(String videoName) {
        this.videoName = videoName;
    }

    public void play() {
        viewCount++;
        System.out.println("--> [AUDIT] Video has been played " + viewCount + " time(s).");
        if (realVideo == null) {
            realVideo = new RealVideo(videoName);
        }
        realVideo.play();
    }
}