package com.kibocommerce.sdk.common;

public class ApiCredentials {
    private String clientId;
    private String clientSecret;

    private ApiCredentials(Builder builder) {
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public static class Builder {
        private String clientId;
        private String clientSecret;

        public Builder setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public ApiCredentials build() {
            if(clientId == null || clientSecret == null) {
                throw new IllegalStateException("Missing required properties creating ApiCredentials: CliendId or ClientSecret");
            }
            return new ApiCredentials(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
