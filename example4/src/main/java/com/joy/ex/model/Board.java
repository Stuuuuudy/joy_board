package com.joy.ex.model;

/**
 * Created by heesun on 2017. 7. 1..
 */
public class Board {
    private long id;
    private long parent_id;
    private String title;
    private String contents;
    private long hits;
    private boolean deleted;
    private String created_at;
    private String writer;

    public Board() {
    }

    public Board(long id, long parent_id, String title, String contents, long hits, boolean deleted, String created_at, String writer) {
        this.id = id;
        this.parent_id = parent_id;
        this.title = title;
        this.contents = contents;
        this.hits = hits;
        this.deleted = deleted;
        this.created_at = created_at;
        this.writer = writer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParent_id() {
        return parent_id;
    }

    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
