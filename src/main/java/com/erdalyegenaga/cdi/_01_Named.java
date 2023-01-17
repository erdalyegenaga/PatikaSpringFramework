package com.erdalyegenaga.cdi;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Scope;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


// cdi ==> bean
@Named
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData = "Hello Named Cdi Bean";

    }

