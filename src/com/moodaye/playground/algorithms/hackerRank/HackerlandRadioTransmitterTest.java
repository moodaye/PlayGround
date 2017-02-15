package com.moodaye.playground.algorithms.hackerRank;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class HackerlandRadioTransmitterTest {

	@Test
	public void numberOfTransmittersTest() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1); ts.add(2);ts.add(3);ts.add(4);ts.add(5);
		assertEquals(2, HackerlandRadioTransmitter.numberOfTransmitters(ts,  1));
		assertEquals(1, HackerlandRadioTransmitter.numberOfTransmitters(ts,  1000));

		ts = new TreeSet<>();
		ts.add(1); ts.add(1);ts.add(1);ts.add(1);ts.add(1);
		assertEquals(1, HackerlandRadioTransmitter.numberOfTransmitters(ts,  1));
		assertEquals(1, HackerlandRadioTransmitter.numberOfTransmitters(ts,  1000));

		ts = new TreeSet<>();
		ts.add(7); ts.add(2);ts.add(4);ts.add(6);ts.add(5);ts.add(9);ts.add(12);
		ts.add(11);
		assertEquals(3, HackerlandRadioTransmitter.numberOfTransmitters(ts,2));

		ts = new TreeSet<>();
		ts.add(1); ts.add(2);ts.add(4);ts.add(3);
		assertEquals(1, HackerlandRadioTransmitter.numberOfTransmitters(ts,2));

		
		ts = new TreeSet<>();
		ts.add(1); ts.add(2);ts.add(4);
		assertEquals(1, HackerlandRadioTransmitter.numberOfTransmitters(ts,2));
	}
	
	

}
