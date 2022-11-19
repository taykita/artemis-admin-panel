package ru.kao.artemis.adminpanel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.Map;

@ConfigurationProperties(prefix = "ru.kao.artemis.admin")
public class AdminPanelProperties {

    private ConnectionFactoryProperties cfProps;

    public static class ConnectionFactoryProperties {
        private String url;
        private boolean sslEnabled;
        private Map<String, Object> otherProps;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isSslEnabled() {
            return sslEnabled;
        }

        public void setSslEnabled(boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
        }

        public Map<String, Object> getOtherProps() {
            return otherProps;
        }

        public void setOtherProps(Map<String, Object> otherProps) {
            this.otherProps = otherProps;
        }

        @Override
        public String toString() {
            return "ConnectionFactoryProperties{" +
                    "url='" + url + '\'' +
                    ", sslEnabled=" + sslEnabled +
                    ", otherProps=" + otherProps +
                    '}';
        }
    }

    public ConnectionFactoryProperties getCfProps() {
        return cfProps;
    }

    public void setCfProps(ConnectionFactoryProperties cfProps) {
        this.cfProps = cfProps;
    }
}
