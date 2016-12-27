package com.tiy.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/27/2016.
 */
public class PhoneCallTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIfAllisFalse(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(false, false, false);

            assertEquals(true, holder);
    }

    @Test
    public void testIfAsleep(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(false, false, true);
        assertEquals(false, holder);
    }

    @Test
    public void testIfAsleepButMomIsCalling(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(false,true,true);
            assertEquals(false, holder);

    }

    @Test
    public void testIfMomCallsAndYourNotAsleep(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(false,true,false);
        assertEquals(true, holder);

    }

    @Test
    public void testIfAllTrue(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(true,true,true);
        assertEquals(false, holder);
    }

    @Test
    public void testIfMorningButAwake(){
        PhoneCall phoneCall = new PhoneCall();
        boolean holder = phoneCall.answerPhone(true,false,false);
        assertEquals(false, holder);
    }

}