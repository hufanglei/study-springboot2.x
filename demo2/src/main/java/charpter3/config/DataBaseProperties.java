package charpter3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("database")
public class DataBaseProperties {
    private String driverName = null;
    private String url = null;
    private String username = null;
    private String password = null;



    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}