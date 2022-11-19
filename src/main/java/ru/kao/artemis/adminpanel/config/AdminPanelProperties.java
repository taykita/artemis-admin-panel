package ru.kao.artemis.adminpanel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.Map;

@ConfigurationProperties(prefix = "ru.kao.artemis.admin")
public class AdminPanelProperties {

    public ConnectionFactoryProperties cfProps;
    public String url;

    public class ConnectionFactoryProperties {
        public String url;
        public boolean sslEnabled;
        public Map<String, Object> otherProps;

        @Override
        public String toString() {
            return "ConnectionFactoryProperties{" +
                    "url='" + url + '\'' +
                    ", sslEnabled=" + sslEnabled +
                    ", otherProps=" + otherProps +
                    '}';
        }
    }
}
