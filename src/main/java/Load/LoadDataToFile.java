package Load;

public abstract class LoadDataToFile {
    private String path;

    public LoadDataToFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
