package testHands;
import static org.junit.Assert.*;
import poker.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;
/*
 * To DO:
 * create unit tests for the following:
 * deck with jokers
 * each kind o hand(royal flush, straight flush,...)
 * test the new hands from part 1
 * test all versions of each hand (four of a kind, test 22223 and 33332)
 */
public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}


}
