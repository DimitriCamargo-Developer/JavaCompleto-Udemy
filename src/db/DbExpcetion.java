package db;

public class DbExpcetion extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbExpcetion(String msg){
        super(msg);
    }
}
