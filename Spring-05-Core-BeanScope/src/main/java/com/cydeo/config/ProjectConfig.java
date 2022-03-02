package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.cydeo")  this will take all that are under com.cydeo and the one below is if we want one by one
@ComponentScan(basePackages={"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})
public class ProjectConfig {
}
