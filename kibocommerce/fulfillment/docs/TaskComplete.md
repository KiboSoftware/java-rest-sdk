

# TaskComplete


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailTemplateName** | **String** | Caller-supplied email template name; required when triggerEmail is true |  [optional] |
|**handleOption** | [**HandleOption**](HandleOption.md) |  |  [optional] |
|**recipientType** | **String** | Recipient audience (Shopper, Fulfiller, Recipient, AlternateContact); required when triggerEmail is true |  [optional] |
|**taskBody** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**triggerEmail** | **Boolean** | When true, publishes a SendWorkflowTaskCompletedEmail after the task completes |  [optional] |


## Implemented Interfaces

* Serializable


