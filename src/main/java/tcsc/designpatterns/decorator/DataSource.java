package tcsc.designpatterns.decorator;

public interface DataSource {
    abstract void writeData(String data);
    String readData();
}

