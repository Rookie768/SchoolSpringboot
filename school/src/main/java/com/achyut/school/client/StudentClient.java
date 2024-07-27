package com.achyut.school.client;

import com.achyut.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// to establish communication between our parties
@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    public List<Student> findAllSchoolsByStudent(@PathVariable("school-id") Integer schoolId);

}
