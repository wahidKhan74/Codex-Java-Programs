package oops.abstraction;
// Since Java 8, we can have method body in interface via default keyword
interface MediaFile {
  void open();
  void close();

  default void play() {
    System.out.println("Media player default method.");
  }
}

class AudioFile implements  MediaFile {

  @Override
  public void open() {
    System.out.println("Open audio file");
  }

  @Override
  public void close() {
    System.out.println("Close audio file");
  }
}

class VideoFile implements MediaFile {

  @Override
  public void open() {
    System.out.println("Open video file");
  }

  @Override
  public void close() {
    System.out.println("Close video file");
  }

  @Override
  public void play() {
    System.out.println("Play video file....");
  }
}

public class DefaultMethod {
  public static void main(String[] args) {
    // audio file
    AudioFile audioFile = new AudioFile();
    audioFile.open();
    audioFile.play();
    audioFile.close();

    // video file
    VideoFile videoFile = new VideoFile();
    videoFile.open();
    videoFile.play();
    videoFile.close();
  }
}
