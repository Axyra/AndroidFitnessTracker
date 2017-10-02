package stud.ft.dal;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class HeartRateEntry {

    @Id
    private Long id;
    private int rate;
    private Date timestamp;

    @Generated(hash = 50094524)
    public HeartRateEntry(Long id, int rate, Date timestamp) {
        this.id = id;
        this.rate = rate;
        this.timestamp = timestamp;
    }

    @Generated(hash = 1940800484)
    public HeartRateEntry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
