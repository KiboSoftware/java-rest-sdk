

# CallOffOrderChangeMessage

Audit trail entry for Call-Off Order lifecycle events.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | Human-readable description of what changed. |  [optional] |
|**callOffOrderId** | **String** | Identifier of the parent call-off order this message belongs to. |  [optional] |
|**createBy** | **String** | User who triggered the change. |  [optional] |
|**createDate** | **OffsetDateTime** | Timestamp when the change was recorded. |  [optional] |
|**id** | **String** | System-generated change message identifier. |  [optional] |
|**identifier** | **String** | Optional identifier of the specific sub-entity that changed (e.g. line id). |  [optional] |
|**newValue** | **String** | New value when the change represents a single-field mutation. |  [optional] |
|**oldValue** | **String** | Prior value when the change represents a single-field mutation. |  [optional] |
|**siteId** | **Integer** | Site identifier. |  [optional] |
|**subject** | **String** | Subject of the change (e.g. \&quot;status\&quot;, \&quot;line.status\&quot;). |  [optional] |
|**tenantId** | **Integer** | Tenant identifier. |  [optional] |


## Implemented Interfaces

* Serializable


