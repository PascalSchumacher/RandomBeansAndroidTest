package com.example.redhawk.randombeansandroidtest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

/**
 * Created by Redhawk on 01.04.2016.
 */
@RunWith(AndroidJUnit4.class)
public class RandomBeansTest {

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRandomBeans(){
        EnhancedRandom enhancedRandom = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build();
        Date date = enhancedRandom.nextObject(Date.class);

        Assert.assertNotNull(date);
    }
}
