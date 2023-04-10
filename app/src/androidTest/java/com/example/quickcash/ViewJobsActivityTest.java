package com.example.quickcash;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import android.content.Context;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

@RunWith(AndroidJUnit4.class)
public class ViewJobsActivityTest {




    @Rule
    public ActivityScenarioRule<EmployerPage> myRule = new ActivityScenarioRule<>(EmployerPage.class);
    public IntentsTestRule<EmployerPage> myIntentRule = new IntentsTestRule<>(EmployerPage.class);





    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.quickcash", appContext.getPackageName());
    }
    @Before
    public void setUp() {
    }
    @BeforeClass
    public static void setup() {
        Intents.init();
    }
    @AfterClass
    public static void tearDown() {
        System.gc();
    }
    @Test
    public void checkvisible() {
        onView(withId(R.id.checkPostedJob)).perform(click());
        intended(hasComponent(ViewJobsActivity.class.getName()));
        onView(withId(R.id.p3)).perform(click()).check(matches(withText("POSTED JOBS")));
        onView(withId(R.id.back2pro)).check(matches(withText("back to the profile page")));
    }
    @Test
    public void checkBack2profile() {
        onView(withId(R.id.checkPostedJob)).perform(click());
        //intended(hasComponent(ViewJobsActivity.class.getName()));
        onView(withId(R.id.back2pro)).perform(click());
    }





}