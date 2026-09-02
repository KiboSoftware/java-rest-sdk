

# CatalogAdminsFacet

The definition of a Facet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditInfo** | [**AdminUserAuditInfo**](AdminUserAuditInfo.md) |  |  [optional] |
|**categoryCode** | **String** | The category that the facet is being configured at |  [optional] |
|**categoryId** | **Integer** | The category that the facet is being configured at |  [optional] |
|**facetId** | **Integer** | The unique identifier for the facet definition |  [optional] |
|**facetType** | **String** | The type of facet. Allowable values are: Value, RangeQuery  Must be a valid value for DataType defined in FacetTypeConst. |  [optional] |
|**isHidden** | **Boolean** | Indicates whether the facet is hidden for the given category |  [optional] |
|**order** | **Integer** | Used to order the display of the facets within a section |  [optional] |
|**overrideFacetId** | **Integer** | The ID of a parent category&#39;s facet being overriden |  [optional] |
|**rangeQueries** | [**List&lt;FacetRangeQuery&gt;**](FacetRangeQuery.md) | List of ranges if the Facet is of type Range |  [optional] |
|**source** | [**FacetSource**](FacetSource.md) |  |  [optional] |
|**validity** | [**FacetValidity**](FacetValidity.md) |  |  [optional] |
|**valueSortType** | **String** | Determines how the facet values will be sorted in the store.  Must be a valid value for DataType defined in FacetValueSortTypeConst.  Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending, AttributeDefinition, AttributeDefinitionDescending. The default if no value is specified will be CountDescending. |  [optional] |


## Implemented Interfaces

* Serializable


