package hw6;

public class Homework {
    public static void main(String[] args) {
        Document doc = new Document(1, "ИСХ-01-2023");

        String[] reportType = {"pdf-1", "xml"};

        ReportService rs = new ReportService();

        for (String type : reportType) {
            System.out.println(rs.createReport(doc, type));   
        }
    }
}
