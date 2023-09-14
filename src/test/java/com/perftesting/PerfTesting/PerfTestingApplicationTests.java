package com.perftesting.PerfTesting;

import com.perftesting.PerfTesting.bean.Subject;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

class PerfTestingApplicationTests {

    @Test
    /**
     * getSubjectAPI
     * Verify get subject api
     */
    public void getSubjectAPI()
    {

        String getURI = "http://localhost:9111/Subjects";
        HttpHeaders headers = new HttpHeaders();

        //GET Method to get Subjects
        RestTemplate restTemplate = new RestTemplate();
        Subject subject=restTemplate.getForObject(getURI,Subject.class);

        //Assert id & name of subjects from subject api
        Assert.assertEquals(subject.getId(),"1033");
        Assert.assertEquals(subject.getName(),"Spring boot framework");
    }

}
