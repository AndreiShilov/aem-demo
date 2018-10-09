package com.example.core.filters;

import static junit.framework.TestCase.assertNotNull;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.example.core.models.HelloWorldModel;

import io.wcm.testing.mock.aem.junit.AemContext;

public class LoggingFilterTest {

    @Rule
    public final AemContext context = new AemContext();

    @Before
    public void before(){
        context.addModelsForClasses(HelloWorldModel.class);
    }

    @Test
    public void test(){
        final HelloWorldModel helloWorldModel = context.request().adaptTo(HelloWorldModel.class);


        assertNotNull(helloWorldModel);
    }

}