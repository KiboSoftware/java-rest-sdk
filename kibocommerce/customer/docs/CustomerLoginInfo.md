

# CustomerLoginInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authTicketTtlMinutes** | **Integer** | Optional requested duration for the authentication ticket in minutes. Must not exceed tenant configuration or platform hard caps. Requires &#39;customer-auth:configure-token-durations&#39; behavior. |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**externalPassword** | **String** |  |  [optional] |
|**fingerprint** | **String** | Specifies the fingerprint of the user for two-factor authentication. |  [optional] |
|**isImport** | **Boolean** |  |  [optional] |
|**password** | **String** |  |  [optional] |
|**refreshTokenTtlMinutes** | **Integer** | Optional requested duration for the refresh token in minutes. Must not exceed tenant configuration or platform hard caps. Requires &#39;customer-auth:configure-token-durations&#39; behavior. |  [optional] |
|**region** | **String** | Specifies the region of the user for two-factor authentication. |  [optional] |
|**username** | **String** |  |  [optional] |


## Implemented Interfaces

* Serializable


