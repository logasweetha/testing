package com.demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\logasweetha.e\\workspace\\project1\\src\\test\\java\\com\\demo\\define\\fill.feature"
,glue="com.demo.stepdef")
public class Runner {

}
