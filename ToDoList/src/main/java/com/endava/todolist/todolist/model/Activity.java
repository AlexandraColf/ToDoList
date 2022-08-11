package com.endava.todolist.todolist.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="activity_table")
public class Activity {
    @Id
    @SequenceGenerator(
            name = "activity_sequence",
            sequenceName = "activity_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "activity_sequence"
    )
    private long id;
    String activity;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "date")
    private LocalDate date;
    boolean done;

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Activity() {

    }

    public Activity(String activity, LocalDate date) {
        this.activity = activity;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getActivity() {
        return activity;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }
}
