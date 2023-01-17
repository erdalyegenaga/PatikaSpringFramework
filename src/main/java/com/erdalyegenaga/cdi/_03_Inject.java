package com.erdalyegenaga.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ApplicationScoped
public class _03_Inject {
    @Inject
    List<String> inject;
    public List<String> getInject() {
        return inject;
    }
}
