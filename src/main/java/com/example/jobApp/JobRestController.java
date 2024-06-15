package com.example.jobApp;

import com.example.jobApp.service.JobService;
import com.example.jobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{jobid}")
    public JobPost getJobPost(@PathVariable int jobid) {
        return jobService.getJobPost(jobid);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public void updateJobPost(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
    }

    @DeleteMapping("jobPost/{jobId}")
    public void deleteJob(@PathVariable int jobId) {
        jobService.deleteJob(jobId);
    }

}
