import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDB {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDB(String uri, String dbName) {
        MongoClientURI clientURI = new MongoClientURI(uri);
        this.mongoClient = new MongoClient(clientURI);
        this.database = mongoClient.getDatabase(dbName);
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}