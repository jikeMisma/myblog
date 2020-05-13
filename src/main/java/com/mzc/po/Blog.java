package com.mzc.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mazhicheng
 * @date 2020/5/7 - 18:38
 */
@Entity
@Table(name="t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 60,name = "title")
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatment;
    private boolean commentabled;
    private boolean pbulished;
    private boolean recommened;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @ManyToOne
    private Type type;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tages= new ArrayList<>();

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<comment> comments = new ArrayList<>();

    public Blog() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isAppreciation() {
        return appreciation;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    public boolean isShareStatment() {
        return shareStatment;
    }

    public void setShareStatment(boolean shareStatment) {
        this.shareStatment = shareStatment;
    }

    public boolean isCommentabled() {
        return commentabled;
    }

    public void setCommentabled(boolean commentabled) {
        this.commentabled = commentabled;
    }

    public boolean isPbulished() {
        return pbulished;
    }

    public void setPbulished(boolean pbulished) {
        this.pbulished = pbulished;
    }

    public boolean isRecommened() {
        return recommened;
    }

    public void setRecommened(boolean recommened) {
        this.recommened = recommened;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Tag> getTages() {
        return tages;
    }

    public void setTages(List<Tag> tages) {
        this.tages = tages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<comment> getComments() {
        return comments;
    }

    public void setComments(List<comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciation=" + appreciation +
                ", shareStatment=" + shareStatment +
                ", commentabled=" + commentabled +
                ", pbulished=" + pbulished +
                ", recommened=" + recommened +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
