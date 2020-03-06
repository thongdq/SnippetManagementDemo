package thong.dq.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SNIPPET", schema = "snippetmanagement.public")
public class Snippet {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "creating_date", nullable = false)
    private Date creatingDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "modifying_date")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private Date modifyingDate;

    @Column(name = "description")
    private String description;

    @Column(name = "detail")
    private String detail;

    @Column(name = "language")
    private String language;

    @Column(name = "type")
    private String type;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "USER_ID")
    private User user;

    public Snippet() {
    }

    public Snippet(int id, String name, Date creatingDate, Date modifyingDate, String description, String detail, String language, String type) {
        super();
        this.id = id;
        this.name = name;
        this.creatingDate = creatingDate;
        this.modifyingDate = modifyingDate;
        this.description = description;
        this.detail = detail;
        this.language = language;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getModifyingDate() {
        return modifyingDate;
    }

    public void setModifyingDate(Date modifyingDate) {
        this.modifyingDate = modifyingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snippet snippet = (Snippet) o;
        return id == snippet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
