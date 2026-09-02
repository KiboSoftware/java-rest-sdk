

# RuleOperatorDto

Metadata for a rule field operator including display text and RSQL syntax

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | Operator code identifier |  |
|**display** | **String** | Human-readable operator display text for UI |  |
|**filterSyntax** | **String** | RSQL filter syntax token for query construction |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| EQ | &quot;eq&quot; |
| NE | &quot;ne&quot; |
| IN | &quot;in&quot; |
| LE | &quot;le&quot; |
| LT | &quot;lt&quot; |
| GE | &quot;ge&quot; |
| GT | &quot;gt&quot; |
| CONT | &quot;cont&quot; |
| SW | &quot;sw&quot; |


## Implemented Interfaces

* Serializable


