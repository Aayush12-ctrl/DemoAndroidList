package sg.edu.rp.c346.id20007386.demoandroidlist;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AndroidVersion {
    String name;
    String version;
    ArrayAdapter<String> aaAndroidVersions;

    AndroidVersion(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String toString(){
        return name + ": "  + version;
    }
}
