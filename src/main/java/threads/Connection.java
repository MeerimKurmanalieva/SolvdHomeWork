package threads;

public class Connection {
    private int id;

    public Connection(int id) {
        this.id = id;
    }

    public void executeQuery(String query) {
        System.out.println("Connection " + id + " executing query: " + query);
        // Perform the query execution logic
    }

    public int getId() {
        return id;
    }
}

