package com.endava.todolist.todolist.service;

import com.endava.todolist.todolist.model.Activity;
import com.endava.todolist.todolist.repo.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public void saveActivity(Activity activity) {
            activityRepository.save(activity);
        }

        public List<Activity> getAllActivities()
        {
            List<Activity> activities = new ArrayList<Activity>();
            activityRepository.findAll().forEach(activity1 -> activities.add(activity1));
            return activities;
        }

        public Activity getActivityById(long id)
        {
            return activityRepository.findById(id).get();
        }

        public void delete(long id)
        {
            activityRepository.deleteById(id);
        }

    public void updateActivity(Activity activity) {
        activityRepository.save(activity);
    }
}
