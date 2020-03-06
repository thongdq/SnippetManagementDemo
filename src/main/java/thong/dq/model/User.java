package thong.dq.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "USER", schema = "snippetmanagement.public")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "JOINING_DATE", nullable = false)
    private Date joiningDate;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private Set<Snippet> snippets;

    public User() {
    }

    public User(int id, String name, Date joiningDate) {
        super();
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public Set<Snippet> getSnippets() {
        return snippets;
    }

    public void setSnippets(Set<Snippet> snippets) {
        this.snippets = snippets;
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

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", joiningDate="
                + joiningDate + "]";
    }
}
