package hw6;

public class Document {
    private long id;
    private String number;

    public Document(long id, String number) {
        this.id = id;
        this.number = number;
    }

    public String getDocNumber()
    {
        return this.number;
    }
}
