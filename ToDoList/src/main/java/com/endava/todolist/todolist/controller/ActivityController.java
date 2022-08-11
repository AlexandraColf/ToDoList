package com.endava.todolist.todolist.controller;

import com.endava.todolist.todolist.model.Activity;
import com.endava.todolist.todolist.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @GetMapping("/activity")
    private List<Activity> getAllRequests()
    {
        return activityService.getAllActivities();
    }

    @GetMapping("/activity/{activityid}")
    private Activity getActivity(@PathVariable("activityid") int activityId)
    {
        return activityService.getActivityById(activityId);
    }

    @DeleteMapping("/activity/{activityid}")
    private void deleteActivity(@PathVariable("activityid") int activityId)
    {
        activityService.delete(activityId);
    }

    @PostMapping(path="/activities")
    public void postActivities(@RequestBody Activity activity) {
        activityService.saveActivity(activity);
    }

    @PutMapping(path = "/activity/{id}")
    public void updateActivity(@PathVariable int id, @RequestBody Activity activity) {
        Activity activity1 = activityService.getActivityById(id);
        activity1.setActivity(activity.getActivity());
        activity1.setDate(activity.getDate());
        activityService.updateActivity(activity1);
    }

    /*@PutMapping(path = "/activity/{id}/{date}")
    public void updateActivity(@PathVariable int id, @PathVariable LocalDate date) {
        Activity activity = activityService.getActivityById(id);
        activity.setDate(date);
        activityService.updateTranslation(activity);
    }*/
}
