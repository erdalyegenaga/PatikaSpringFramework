package com.erdalyegenaga.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class _02_Produces {

    @Produces // üretiyor
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("css3");
        list.add("javascript");
        list.add("react");
        return list;



    }
}
