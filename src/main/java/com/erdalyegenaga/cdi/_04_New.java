package com.erdalyegenaga.cdi;

import com.erdalyegenaga.StudentDTO;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class _04_New {
    @Produces
    // üretilen data
    public String produceData( @New StudentDTO studentDTO){
        studentDTO = StudentDTO.builder().studentId(0L).studentName("Erdal").build();
        return studentDTO.getStudentName();
    }
    @Getter
    @Inject
    private String injectData;


}
