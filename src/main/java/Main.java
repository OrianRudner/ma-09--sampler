public class Main {

    public static void main(String[] args) {

        ETLManager manager = new ETLManager();
        manager.MadaRecordsToJson("C:\\Users\\orian\\Desktop\\curseProject\\sampler\\src\\main\\resources\\MadaReports.csv",
                "C:\\Users\\orian\\Desktop\\curseProject\\sampler files\\mada_reports\\mada");

    }
}
