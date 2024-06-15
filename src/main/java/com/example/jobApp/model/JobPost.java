package com.example.jobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
    private int jobId;
    private String jobTitle;
    private String jobDescription;
    private int experienceRequired;
    private List<String> techStack;

}
