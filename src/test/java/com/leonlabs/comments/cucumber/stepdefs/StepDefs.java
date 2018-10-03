package com.leonlabs.comments.cucumber.stepdefs;

import com.leonlabs.comments.CommentserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CommentserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
