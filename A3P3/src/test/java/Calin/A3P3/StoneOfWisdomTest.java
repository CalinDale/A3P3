package Calin.A3P3;

import junit.framework.TestCase;

public class StoneOfWisdomTest extends TestCase {

	StoneOfWisdom obj;
	
	protected void setUp() throws Exception {
		super.setUp();
		obj = new StoneOfWisdom();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		obj = null;
	}

	public void testSetName() {
		String testName = "dave";
		obj.setName(testName);
		assertEquals(testName,(obj.name));
	}
	
	public void testSetWord() {
		String testWord = "life";
		obj.setWord(testWord);
		assertEquals(testWord,(obj.word));
	}
	
	public void testSelectAnswer() {
		String[] testAnswers = {"The stone is silent, like ",
		                      "The stone whispers to quitely to hear, mysterious, much like ",
		                      "You hear a voice in your head that sounds like your own, it is reading out this sentence. That's the stone's voice, it knows you, just like ",
		                      "The stone speaks through the wind around you, it says: 'woosh'. It is truely connected with all things, much like "};
		obj.answers = testAnswers;
		String answer = obj.selectAnswer();
		boolean contains = false;
		
		for (String s : testAnswers) {
			if (s.equals(answer)) {
				contains = contains || true;
			}
		};
		
		assertTrue(contains);
	}
	
	public void testReply() {
		String testAnswer = "The stone is silent, like ";
		obj.answer = testAnswer;
		String testWord = "life";
		obj.word = testWord;
		String expectedAnswer = testAnswer + testWord + ".";
		
		assertTrue(obj.reply().equals(expectedAnswer));
	}
}
