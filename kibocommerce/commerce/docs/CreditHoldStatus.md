

# CreditHoldStatus

Header-level credit-hold state for a CallOffOrder. Replaces the per-item CreditHold + CreditHoldReason fields that lived on CallOffOrderItem prior to this change — credit-hold is a header concern (one decision per order) not a per-line concern.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**onHold** | **Boolean** | True when the order is on credit hold. |  [optional] |
|**reason** | [**CreditHoldReason**](CreditHoldReason.md) |  |  [optional] |


## Implemented Interfaces

* Serializable


