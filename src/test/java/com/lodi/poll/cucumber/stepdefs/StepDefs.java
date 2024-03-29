package com.lodi.poll.cucumber.stepdefs;

import com.lodi.poll.PolliticsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PolliticsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
