package com.kibocommerce.sdk.common;

import com.kibocommerce.sdk.common.ApiClientBuilder;
import com.kibocommerce.sdk.common.ApiCredentials;
import com.kibocommerce.sdk.common.ApiClient;
import com.kibocommerce.sdk.common.KiboHeaders;
import com.kibocommerce.sdk.common.constants.EnvironmentVars;
import com.kibocommerce.sdk.common.constants.Templates;
import java.util.Map;
import java.util.Properties;
import java.util.HashMap;
import java.net.URI;

public class KiboConfiguration {

    private Integer tenantId;
    private Integer siteId;
    private Integer masterCatalogId;
    private Integer catalogId;
    private String locale;
    private String currency;
    private String apiEnv;
    private String apiRegion;
    private String authHost;
    private String pciHost;
    private String tenantHost;
    private ApiCredentials credentials;
    private ApiClient apiClient;

    private KiboConfiguration(Builder builder) {
        this.tenantId = builder.tenantId;
        this.siteId = builder.siteId;
        this.masterCatalogId = builder.masterCatalogId;
        this.catalogId = builder.catalogId;
        this.locale = builder.locale;
        this.currency = builder.currency;
        this.credentials = builder.credentials;
        this.apiEnv = builder.apiEnv;
        this.apiRegion = builder.apiRegion;
        this.authHost = builder.authHost;
        this.pciHost = builder.pciHost;
        this.tenantHost = builder.tenantHost;
        this.apiClient = builder.apiClient;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<String, String>();
        if (this.locale != null) {
            headers.put(KiboHeaders.X_VOL_LOCALE, this.locale);
        }
        if (this.currency != null) {
            headers.put(KiboHeaders.X_VOL_CURRENCY, this.currency);
        }
        if (this.masterCatalogId != null) {
            headers.put(KiboHeaders.X_VOL_MASTER_CATALOG, this.masterCatalogId.toString());
        }
        if (this.catalogId != null) {
            headers.put(KiboHeaders.X_VOL_CATALOG, this.catalogId.toString());
        }
        if (this.tenantId != null) {
            headers.put(KiboHeaders.X_VOL_TENANT, this.tenantId.toString());
        }
        if (this.siteId != null) {
            headers.put(KiboHeaders.X_VOL_SITE, this.siteId.toString());
        }
        return headers;
    }

    public String getServerForTemplate(String template) {
        if (template == null) {
            return null;
        }
        if (template.contains(Templates.HOME_POD_PLACEHOLDER)) {
            return template.replace(Templates.HOME_POD_PLACEHOLDER, this.authHost);
        }
        if (template.contains(Templates.PCI_POD_PLACEHOLDER)) {
            return template.replace(Templates.PCI_POD_PLACEHOLDER, this.pciHost);
        }
        if (template.contains(Templates.TENANT_POD_PLACEHOLDER)) {
            return template.replace(Templates.TENANT_POD_PLACEHOLDER, this.tenantHost);
        }
        return null;
    }

    public static class Builder {
        private Integer tenantId = 0;
        private Integer siteId = 0;
        private Integer masterCatalogId = null;
        private Integer catalogId = null;
        private String locale = null;
        private String currency = null;
        private String apiEnv = null;
        private String apiRegion = null;
        private String authHost = "home.mozu.com";
        private String pciHost = null;
        private String tenantHost = null;
        private ApiClient apiClient = null;
        private ApiCredentials credentials = null;
        private ApiClientBuilder clientBuilder = null;
        private Boolean useSSL = true;
        private Boolean debugClient = false;

        public Builder() {
            clientBuilder = ApiClientBuilder.builder();
        }

        public Builder withTenantId(Integer tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder withSiteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder withMasterCatalogId(Integer masterCatalogId) {
            this.masterCatalogId = masterCatalogId;
            return this;
        }

        public Builder withCatalogId(Integer catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder withApiEnv(String apiEnv) {
            this.apiEnv = apiEnv;
            return this;
        }

        public Builder withApiRegion(String apiRegion) {
            this.apiRegion = apiRegion;
            return this;
        }

        public Builder withHomeHost(String authHost) {
            this.authHost = authHost;
            return this;
        }

        public Builder withPciHost(String pciHost) {
            this.pciHost = pciHost;
            return this;
        }

        public Builder withCredentials(ApiCredentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder withTenantHost(String tenantHost) {
            this.tenantHost = tenantHost;
            return this;
        }

        public Builder withSsl(boolean useSSL) {
            this.useSSL = useSSL;
            return this;
        }

        public Builder withDebugClient(boolean debugClient) {
            this.debugClient = debugClient;
            return this;
        }

        private static Object getPropertyValue(Properties props, String name, Class<?> type) {
            String value = props.getProperty(name);
            if (value == null || value.isEmpty())
                return null;
            if (type == String.class)
                return value;
            if (type == boolean.class)
                return Boolean.parseBoolean(value);
            if (type == int.class)
                return Integer.parseInt(value);
            if (type == float.class)
                return Float.parseFloat(value);
            throw new IllegalArgumentException("Unknown configuration value type: " + type.getName());
        }

        public Builder fromSystemProperties() {
            Properties properties = System.getProperties();
            this.tenantId = (Integer) getPropertyValue(properties, EnvironmentVars.KIBO_TENANT, int.class);
            this.siteId = (Integer) getPropertyValue(properties, EnvironmentVars.KIBO_SITE, int.class);
            this.masterCatalogId = (Integer) getPropertyValue(properties, EnvironmentVars.KIBO_MASTER_CATALOG,
                    int.class);
            this.catalogId = (Integer) getPropertyValue(properties, EnvironmentVars.KIBO_CATALOG, int.class);
            this.locale = (String) getPropertyValue(properties, EnvironmentVars.KIBO_LOCALE, String.class);
            this.currency = (String) getPropertyValue(properties, EnvironmentVars.KIBO_CURRENCY, String.class);

            this.apiEnv = (String) getPropertyValue(properties, EnvironmentVars.KIBO_API_ENV, String.class);
            this.apiRegion = (String) getPropertyValue(properties, EnvironmentVars.KIBO_API_REGION, String.class);
            this.pciHost = (String) getPropertyValue(properties, EnvironmentVars.KIBO_PCI_HOST, String.class);

            String clientId = (String) getPropertyValue(properties, EnvironmentVars.KIBO_CLIENT_ID, String.class);
            String sharedSecret = (String) getPropertyValue(properties, EnvironmentVars.KIBO_CLIENT_SECRET,
                    String.class);
            if (clientId != null && !clientId.isEmpty() && sharedSecret != null && !sharedSecret.isEmpty()) {
                this.credentials = ApiCredentials.builder()
                        .setClientId(clientId)
                        .setClientSecret(sharedSecret)
                        .build();
            }
            this.tenantHost = (String) getPropertyValue(properties, EnvironmentVars.KIBO_TENANT_HOST, String.class);
            this.debugClient = (Boolean) getPropertyValue(properties, EnvironmentVars.KIBO_DEBUG_CLIENT, boolean.class);
            String authHost = (String) getPropertyValue(properties, EnvironmentVars.KIBO_AUTH_HOST, String.class);
            String homeHost = (String) getPropertyValue(properties, EnvironmentVars.KIBO_HOME_HOST, String.class);
            if (authHost != null && !authHost.isEmpty())
                this.authHost = authHost;
            else if (homeHost != null && !homeHost.isEmpty())
                this.authHost = homeHost;

            // Load other properties from environment variables
            return this;
        }

        public ApiClient buildClient() {
            String homePodUrl = this.authHost;
            if (!URI.create(homePodUrl).isAbsolute()) {
                homePodUrl = (useSSL ? "https" : "http") + "://" + homePodUrl;
            }
            return clientBuilder.withCredentials(this.credentials)
                    .withHomePodBaseUrl(homePodUrl)
                    .build();
        }

        public KiboConfiguration build() {
            this.apiClient = this.buildClient();
            return new KiboConfiguration(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public ApiClient getClient() {
        return apiClient;
    }
}