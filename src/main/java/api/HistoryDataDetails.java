package api;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HistoryDataDetails {
    private @Id @GeneratedValue Long id;

    private int identicator;

    @Column(length = Integer.MAX_VALUE)
    private String title;

    private int visit_count;

    @Column(length = Integer.MAX_VALUE)
    private String url;
    private String last_visited;

    public HistoryDataDetails() {
    }

    public HistoryDataDetails(int id, String title, int visitCount, String url, String lastVisitTime) {
        this.identicator = id;
        this.title = title;
        this.visit_count = visitCount;
        this.url = url;
        this.last_visited = lastVisitTime;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdenticator() {
        return identicator;
    }

    public void setIdenticator(int identicator) {
        this.identicator = identicator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVisit_count() {
        return visit_count;
    }

    public void setVisit_count(int visit_count) {
        this.visit_count = visit_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLast_visited() {
        return last_visited;
    }

    public void setLast_visited(String last_visited) {
        this.last_visited = last_visited;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.identicator, this.last_visited, this.title, this.url, this.visit_count);
    }
}
