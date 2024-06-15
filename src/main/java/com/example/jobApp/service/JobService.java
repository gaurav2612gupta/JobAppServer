package com.example.jobApp.service;

import com.example.jobApp.repo.JobRepo;
import com.example.jobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        System.out.println("get all jobs job service");
        return repo.getAllJobs();
    }

    public JobPost getJobPost(int jobid) {
        return repo.getJobPost(jobid);
    }
}
