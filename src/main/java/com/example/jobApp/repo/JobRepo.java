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
    public JobPost getJobPost(int jobid) {
        for(JobPost jobPost : jobs) {
            if(jobPost.getJobId() == jobid) return jobPost;
        }
        System.out.println("No Job found with the specified jobid in the db");
        return null;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public void updateJob(JobPost jobPost) {
        int jobId = jobPost.getJobId();
        if(getJobPost(jobId) == null) {
            System.out.println("No job found with the given id");
            return;
        }
        for(JobPost job: jobs){
            if(job.getJobId() == jobPost.getJobId()) {
                job.setJobTitle(jobPost.getJobTitle());
                job.setJobDescription(jobPost.getJobDescription());
                job.setExperienceRequired(jobPost.getExperienceRequired());
                job.setTechStack(jobPost.getTechStack());
            }
        }
    }

    public void deleteJob(int jobId) {
        if(getJobPost(jobId) == null) {
            System.out.println("No job found with the given id");
            return;
        }
        jobs.remove(getJobPost(jobId));
    }


}
