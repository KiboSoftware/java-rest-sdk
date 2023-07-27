package com.kibocommerce.sdk.common;

import com.kibocommerce.sdk.common.ApiCredentials;
import com.kibocommerce.sdk.common.ApiClient;

public class ApiClientBuilder {
    private String homePodBaseUrl;
    private ApiCredentials credentials;
    private static ApiClient defaultApiClient = new ApiClient();
    private boolean debugging = false;

    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }

    public ApiClientBuilder withHomePodBaseUrl(String homePodBaseUrl) {
        this.homePodBaseUrl = homePodBaseUrl;
        return this;
    }

    public ApiClientBuilder withCredentials(ApiCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public ApiClient build() {
        if (homePodBaseUrl == null) {
            throw new IllegalStateException("Missing required properties: HomeHost");
        }
        if (credentials == null) {
            throw new IllegalStateException("Missing required properties: ApiCredentials");
        }
        // Create an instance of the generic ApiClient type
        ApiClient apiClient = new ApiClient(homePodBaseUrl, credentials.getClientId(), credentials.getClientSecret(),
                null);
        if(debugging == true) {
            apiClient.setDebugging(true);
        }
        return apiClient;
    }

    public static ApiClientBuilder builder() {
        return new ApiClientBuilder();
    }
}
