package hw6;

public class ReportService {
    public String createReport(Document document, String reportType)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Номер документа: ").append(document.getDocNumber()).append(" | ");

        switch (reportType) {
            case "pdf-1":
                sb.append(generatePDF1(document));
                break;
            case "json":
                sb.append(generateJSON(document));
                break;
            case "xml":
                sb.append(generateXML(document));
                break;
            default:
                return "Данный тип файла не поддерживается!";
        }

        return sb.toString();
    }

    private String generatePDF1(Document document)
    {
        return "Report save in PDF-1";
    }

    private String generateJSON(Document document)
    {
        return "Report save in JSON";
    }

    private String generateXML(Document document)
    {
        return "Report save in XML";
    }
}
