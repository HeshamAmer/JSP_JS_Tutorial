package main;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class DatabaseHandler implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6870220150306885827L;

	private String mongoIP;
	private int mongoPort;
	private String res;

	public DatabaseHandler(String mongoIP, int mongoPort) {
		this.mongoIP = mongoIP;
		this.mongoPort = mongoPort;
	}

	public DatabaseHandler() {
	}

	public String getRes() {
		try {
			this.res = InsertIntoMongoDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getMongoIP() {
		return mongoIP;
	}

	public void setMongoIP(String mongoIP) {
		this.mongoIP = mongoIP;
	}

	public int getMongoPort() {
		return mongoPort;
	}

	public void setMongoPort(int mongoPort) {
		this.mongoPort = mongoPort;
	}

	public String InsertIntoMongoDB() throws Exception {

		MongoClient mongoClient = new MongoClient(getMongoIP(), getMongoPort());
		MongoDatabase db = mongoClient.getDatabase("test");

		// String name=(String) document.get(0);
		// fillDBTest(db);

		FindIterable<Document> S = db.getCollection("Names").find();
		// SummonerName.toLowerCase()));
		String res = "";
		for (Document d : S) {
			res += d;
			System.out.println(d);

		}
		mongoClient.close();

		return res;
	}

}