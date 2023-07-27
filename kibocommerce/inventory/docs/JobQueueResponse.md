

# JobQueueResponse

Response for getting a job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobID** | **Integer** | Internal identifier that uniquely identifies a single job |  [optional] |
|**tenantID** | **Integer** | Unique internal identifier of the tenant that owns the job |  [optional] |
|**locationCode** | **String** | Unique internal Identifier of the owning location |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Purpose of the job |  [optional] |
|**added** | **String** | Time and date the job was added to the queue in ISO8601 format in UTC |  [optional] |
|**started** | **String** | Time and date the job was started in ISO8601 format in UTC |  [optional] |
|**finished** | **String** | Time and date the job was finished in ISO8601 format in UTC |  [optional] |
|**originalFilename** | **String** | The full name of the file that was picked up at the secure droppoint server before being split up by location. Applies only to refresh and adjust jobs created via file fetch process |  [optional] |
|**hasData** | **Boolean** | True if the job was not created from a fetched file |  [optional] |
|**itemCount** | **Integer** | The number of items processed, only for job types REFRESH and ADJUST |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of job completion |  [optional] |
|**success** | **Boolean** | Flag for success |  [optional] |
|**messages** | **List&lt;String&gt;** | List of messages |  [optional] |
|**numResults** | **Integer** | Number of results |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REFRESH | &quot;REFRESH&quot; |
| ADJUST | &quot;ADJUST&quot; |
| RELEASE_SHIPMENTS | &quot;RELEASE_SHIPMENTS&quot; |
| CREATE_PICK_WAVE | &quot;CREATE_PICK_WAVE&quot; |
| CLOSE_PICK_WAVE | &quot;CLOSE_PICK_WAVE&quot; |
| PUT_AWAY_FILE | &quot;PUT_AWAY_FILE&quot; |
| SHORT_PICK_ERROR | &quot;SHORT_PICK_ERROR&quot; |
| BIN_AUDIT_START | &quot;BIN_AUDIT_START&quot; |
| BIN_AUDIT_COMPLETION | &quot;BIN_AUDIT_COMPLETION&quot; |
| CREATE_BIN_AUDIT | &quot;CREATE_BIN_AUDIT&quot; |
| RELEASE_PENDING_ITEMS | &quot;RELEASE_PENDING_ITEMS&quot; |
| ALLOCATE | &quot;ALLOCATE&quot; |
| DEALLOCATE | &quot;DEALLOCATE&quot; |
| FULFILL | &quot;FULFILL&quot; |
| DELETE | &quot;DELETE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| WORKING | &quot;WORKING&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |


## Implemented Interfaces

* Serializable


