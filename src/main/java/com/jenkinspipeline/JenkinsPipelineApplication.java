package com.jenkinspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*g
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/IshanRout/Ci-CD-Pipeline.git
        git push -u origin main*/
@SpringBootApplication
public class JenkinsPipelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPipelineApplication.class, args);
    }

}
