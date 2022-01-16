package Extract;

public abstract class ExtractDataFromFile {

    private String path;

    public ExtractDataFromFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
