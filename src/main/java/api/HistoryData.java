package api;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class HistoryData {
    private @Id @GeneratedValue Long id;

    @Column(length = Integer.MAX_VALUE)
    private String username;

    @ManyToMany(targetEntity=HistoryDataDetails.class, fetch= FetchType.EAGER, cascade= CascadeType.ALL)
    private List<HistoryDataDetails> data;

    public HistoryData() {
    }

    public HistoryData(String username, List<HistoryDataDetails> historyDataDetails) {
        this.username = username;
        this.data = historyDataDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<HistoryDataDetails> getData() {
        return data;
    }

    public void setData(List<HistoryDataDetails> data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.username.hashCode();
        for(HistoryDataDetails dataDetails : data) {
            hash = 31 * hash + dataDetails.hashCode();
        }
        return hash;
    }
}
