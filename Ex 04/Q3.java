/*3. You have been assigned the task of designing and implementing an interface 
in Java for a multimedia player application. The application should support various 
types of multimedia files, such as audio and video files, and provide common 
functionalities like play, pause, stop, and seek. */

public class Q3 {
    interface MultimediaPlayer {
        public void play();
        public void pause();
        public void stop();
        public void seek();
    }

    static class AudioPlayer implements MultimediaPlayer {
        public void play() {
            System.out.println("Playing audio file...");
        }

        public void pause() {
            System.out.println("Pausing audio file...");
        }

        public void stop() {
            System.out.println("Stopping audio file...");
        }

        public void seek() {
            System.out.println("Seeking audio file...");
        }
    }

    static class VideoPlayer implements MultimediaPlayer {

        public void play() {
            System.out.println("Playing video file...");
        }
        public void pause() {
            System.out.println("Pausing video file...");
        }
        public void stop() {
            System.out.println("Stopping video file...");
        }
        public void seek() {
            System.out.println("Seeking video file...");
        }
    }
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();
        audioPlayer.seek();

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        videoPlayer.seek();
    }
}
