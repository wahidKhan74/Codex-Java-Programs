package serialization.TvSerialMng;

import java.io.Serializable;

public class TvSerial implements Serializable {

  private int id;
  private String title;
  private String genre;
  private int episodes;

  public TvSerial(int id, String title, String genre, int episodes) {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.episodes = episodes;
  }

  public int getId() { return id; }
  public String getTitle() { return title; }
  public String getGenre() { return genre; }
  public int getEpisodes() { return episodes; }

  public void setTitle(String title) { this.title = title; }
  public void setGenre(String genre) { this.genre = genre; }
  public void setEpisodes(int episodes) { this.episodes = episodes; }

  @Override
  public String toString() {
    return "TvSerial{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", genre='" + genre + '\'' +
      ", episodes=" + episodes +
      '}';
  }
}
