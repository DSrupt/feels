package feels;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class GetTweet {
	
	private long tweetid = 0L;
	private TwitterFactory tf;
	private Twitter twitter;
	private Status status;
	public GetTweet() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("SILZwaTxQ2vmG0OVve2U0qcko");
		cb.setOAuthConsumerSecret("haT5lwgnhffSF8w0r3ko4QaySu53pSEkUNMowdv3KHyoaYiba7");
		cb.setOAuthAccessToken("3138262490-oNLCpi1hEu3oAXxSku3Ii0XaQ3cOUIXVhVRgU8V");
		cb.setOAuthAccessTokenSecret("pYAvBtCR9tnDE2Ru3t8fRIIso6HzU3ywOfl29dJWkYZG1");
		tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
	}
	
	public GetTweet(long id) {
		tweetid = id;
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("SILZwaTxQ2vmG0OVve2U0qcko");
		cb.setOAuthConsumerSecret("haT5lwgnhffSF8w0r3ko4QaySu53pSEkUNMowdv3KHyoaYiba7");
		cb.setOAuthAccessToken("3138262490-oNLCpi1hEu3oAXxSku3Ii0XaQ3cOUIXVhVRgU8V");
		cb.setOAuthAccessTokenSecret("pYAvBtCR9tnDE2Ru3t8fRIIso6HzU3ywOfl29dJWkYZG1");
		tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
		status = twitter.showStatus(tweetid);
	}
	
	public long getID() {
		return tweetid;
	}
	
	public void setID(long id) {
		tweetid = id;
	}
	
	public String returnTweetMessage() {
		return status.getText();
	}
	
	public String getGeo() {
		return "" + status.getGeoLocation();
	}
	
}
