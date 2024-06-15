package com.example.jobApp.repo;

import com.example.jobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(101, "Software Engineer", "Develop and maintain software applications.", 2, List.of("Java", "Spring Boot", "MySQL")),
            new JobPost(102, "Frontend Developer", "Create stunning user interfaces.", 3, List.of("Java", "Spring Boot", "MySQL")),
            new JobPost(103, "Data Scientist", "Analyze data to extract insights.", 4, List.of("Java", "Spring Boot", "MySQL")),
            new JobPost(104, "DevOps Engineer", "Ensure continuous integration and delivery.", 5, List.of("Java", "Spring Boot", "MySQL"))
    ));

    public List<JobPost> getAllJobs() {
        System.out.println("Get all jobs job repo");
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }

}
